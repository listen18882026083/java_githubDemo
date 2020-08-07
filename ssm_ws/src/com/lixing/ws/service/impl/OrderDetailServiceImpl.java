package com.lixing.ws.service.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lixing.ws.mapper.TbOrderDetailMapper;
import com.lixing.ws.mapper.TbOrderMapper;
import com.lixing.ws.mapper.TbProductInfoMapper;
import com.lixing.ws.pojo.TbOrder;
import com.lixing.ws.pojo.TbOrderDetail;
import com.lixing.ws.pojo.TbOrderDetailExample;
import com.lixing.ws.pojo.TbOrderExample;
import com.lixing.ws.service.OrderDetailService;
import com.lixing.ws.tool.PageData;
import com.lixing.ws.vo.OrderDetailVo;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	@Autowired
	private TbOrderDetailMapper detailMapper;
	
	@Autowired
	private TbProductInfoMapper infoMapper;
	
	@Autowired
	private TbOrderMapper orderMapper;
	
	public PageData queryOrderDetailList(Integer page,Integer limit,TbOrderDetail d) {
		PageData pageData=new PageData();
		page=(page-1)*10; //mysql分页第一页是0开始

		TbOrderDetailExample t=new TbOrderDetailExample();
		t.setPage(page);
		t.setLimit(limit);
		if(d.getOrderid()!=null && !d.getOrderid().equals("")){
			t.createCriteria().andOrderidEqualTo(d.getOrderid());
			List<TbOrderDetail> list=detailMapper.queryOrderDetailList(t);
			pageData.setCount(detailMapper.countByExample(t)+"");
			pageData.setData(list);
		}else{
			
			pageData.setCount("0");
			pageData.setData(null);
		}
		
		return pageData;
	}

	public int queryOrderDetailCount(TbOrderDetailExample te) {
		
		return detailMapper.countByExample(te);
	}

	public PageData saveOrderDetail(OrderDetailVo vo) {
		int count=0;
		//先根据code查询，是否存在订单信息
		TbOrderExample example=new TbOrderExample();
		example.createCriteria().andOrdernumberEqualTo(vo.getOrderCode());
		List<TbOrder> list=orderMapper.selectByExample(example);
		PageData p=new PageData();
		//当订单不存在的时候，我们就去创建订单
		if(list.size()<=0){
			//第一次创建订单，创建完订单信息
			TbOrder order=new TbOrder();
			order.setOrdernumber(vo.getOrderCode()); //订单号
			order.setOrderstatus("未付款");//状态
			order.setProductcount(1);//商品数量
			order.setAddress(vo.getOrderAddress());//订单地址
			order.setCustomerid(vo.getCustomerid());//客户ID
			order.setPhone(vo.getOrderPhone());//订单联系电话
			order.setOrderconsignee(vo.getOrderName());//收货人
			
			order.setProductamounttotal(vo.getProductprice());//第一次创建那我就直接插入商品的销售价格
			order.setOrderamounttotal(vo.getProductprice()); //那实际付款金额也插入商品的销售价格
			order.setOrderlogisticsid(vo.getOrderlogisticsId());//订单编号
			order.setDeliverytime(vo.getDeliveryTime());//发货时间
			order.setPaymentmethod(vo.getPaymentMethod());//付款方式
			order.setPaymenttime(vo.getPaymentTime());//付款时间
			int orderNumber=orderMapper.insertSelective(order);
			if(orderNumber>0){//插入订单信息成功后
				//那第一次保存商品的详细信息那就不去修改我们订单的付款金额，和实际付款金额
				count=saveTbOrderDetail(vo,order.getId());
				if(count>0){
					p.setData(order);
					p.setCount("2");
				}
			}
			
		}else{
			//代表订单存在，那也存在商品了，那此次差保存信息就需要修改订单的付款金额和数量
			TbOrder queryOrder=list.get(0);
			
			//此判断代表我们订单已经存在,那我们保存产品信息，在保存信息的时候我们这时候应该去判断下，产品是否存在，存在了那就我们直接修改此产品信息的条数
			TbOrderDetailExample detailExample=new TbOrderDetailExample();
			detailExample.createCriteria().andProductidEqualTo(vo.getProductId()).andOrderidEqualTo(queryOrder.getId());
			List<TbOrderDetail> OrderDetailList=detailMapper.selectByExample(detailExample);
			if(OrderDetailList.size()<=0){//代表此产品不存在直接保存
				
				count=saveTbOrderDetail(vo,queryOrder.getId());
				//详细商品保存后，我们去修改订单的价格，直接让付款金额和实际付款金额加上我们的商品销售价格即可
				if(count>0){
					TbOrder updataOrder=new TbOrder();
					updataOrder.setId(queryOrder.getId());
					updataOrder.setProductamounttotal(queryOrder.getProductamounttotal().add(vo.getProductprice()));
					updataOrder.setOrderamounttotal(queryOrder.getOrderamounttotal().add(vo.getProductprice()));
					updataOrder.setProductcount(queryOrder.getProductcount()+1);
					count=orderMapper.updateByPrimaryKeySelective(updataOrder);
					if(count>0){
						
						p.setData(updataOrder);
						p.setCount("2");
					}
				
				}

			}else{//代表此订单中的此商品已经存在了，我们直接去修改这个商品的数量和小计金额
				TbOrderDetail ysod=OrderDetailList.get(0);
				TbOrderDetail od=new TbOrderDetail();
				od.setId(ysod.getId());
				od.setOrderdetailnumber(ysod.getOrderdetailnumber()+1);
				od.setSubtotal(ysod.getSubtotal().add(vo.getProductprice()));
				count=detailMapper.updateByPrimaryKeySelective(od);
				if(count>0){
					TbOrder updataOrder=new TbOrder();
					updataOrder.setId(queryOrder.getId());
					updataOrder.setProductamounttotal(queryOrder.getProductamounttotal().add(vo.getProductprice()));
					updataOrder.setOrderamounttotal(queryOrder.getOrderamounttotal().add(vo.getProductprice()));
					updataOrder.setProductcount(queryOrder.getProductcount()+1);
					count=orderMapper.updateByPrimaryKeySelective(updataOrder);
					if(count>0){
						p.setData(updataOrder);
						p.setCount("2");
					}
				}

			}
			
		}
		
		return p;
	}
	
	
	//提取共有方法，第一次保存详细商品信息
	public int saveTbOrderDetail(OrderDetailVo vo,Integer orderId){
		TbOrderDetail od=new TbOrderDetail();
		od.setProductid(vo.getProductId());
		od.setOrderid(orderId);
		od.setProducname(vo.getProducname());
		od.setProductprice(vo.getProductprice());
		od.setSubtotal(vo.getProductprice());
		od.setOrderdetailnumber(1);
		od.setDiscountrate(vo.getInfodiscount());
		od.setDetailstatus("已下单");
		return detailMapper.insertSelective(od);
	}

	public PageData updateOrderDetailById(TbOrderDetail od) {
		System.out.println("=============="+od.getId());
		// TODO Auto-generated method stub
		//先去修改商品的信息
		PageData p=new PageData();
		p.setCode("2");
		int count=0;
		//如果是修改商品数量的话，我们必须先根据商品的ID查询出原始的数量和小计价格，详细商品的ID
		TbOrderDetail ysOrderDetail=null;
		
		BigDecimal money=null;
		System.out.println(od.getOrderdetailnumber()+"========");
		if(od.getOrderdetailnumber()!=null){//修改商品的数量
			ysOrderDetail=detailMapper.selectByPrimaryKey(od.getId()); //先查询出改产品的原始信息
			
			BigDecimal a=new BigDecimal(od.getOrderdetailnumber());
			 money=od.getProductprice().multiply(a);
			od.setSubtotal(money);
		}
		count=detailMapper.updateByPrimaryKeySelective(od);
		if(od.getOrderdetailnumber()!=null && count>0){//修改数据成功之后，需要修改我们的订单额总价格和实际付款
			/**
			 * 订单详细产品表
				 * 1.必须先把原有的的商品总金额查询出来      3件    60元  // 根据商品ID查询
				 * 2、再去修改这个产品的总金额			5件   100元
				订单表
				3、先获取实际付款额和小计金额       查询出原始数据：10件    2000
				4、先用实际付款金额和小计金额减去第一步中查询出来的金额   还有数量     10-3    2000-60
				5、再用实际付款金额和小计金额加上我们第二步中的修改的金额 还有数量   10-3+5     2000-60+100
			 * 
			 * */
			//根据订单ID查询出订单详细信息
			TbOrder ysOrder=orderMapper.selectByPrimaryKey(od.getOrderid());
			ysOrder.setProductcount(ysOrder.getProductcount()-ysOrderDetail.getOrderdetailnumber()+od.getOrderdetailnumber());
			ysOrder.setProductamounttotal((ysOrder.getProductamounttotal().subtract(ysOrderDetail.getSubtotal())).add(money));
			ysOrder.setOrderamounttotal((ysOrder.getOrderamounttotal().subtract(ysOrderDetail.getSubtotal())).add(money));
			orderMapper.updateByPrimaryKeySelective(ysOrder);
			p.setData(ysOrder);
		}
		return p;
	}

}
