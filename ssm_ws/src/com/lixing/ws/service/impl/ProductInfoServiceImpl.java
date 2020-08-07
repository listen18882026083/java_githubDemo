package com.lixing.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbProductInfoMapper;
import com.lixing.ws.pojo.TbProductInfo;
import com.lixing.ws.pojo.TbProductInfoExample;
import com.lixing.ws.pojo.TbProductInfoExample.Criteria;
import com.lixing.ws.service.ProductInfoService;
import com.lixing.ws.tool.FileTool;
import com.lixing.ws.tool.PageData;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	private TbProductInfoMapper infoMapper;

	public PageData queryList(int page, int limit, TbProductInfo proInfo) {
			PageData pData=new PageData();
			
			TbProductInfoExample te=new TbProductInfoExample();
			page=(page-1)*10; //mysql分页第一页是0开始
			te.setPage(page);
			te.setLimit(limit);
			Criteria cr=te.createCriteria();
			if(proInfo.getInfoname()!=null && !proInfo.getInfoname().equals("")){
			
				cr.andInfonameLike("%"+proInfo.getInfoname()+"%");
			}
			if(proInfo.getTypeid()!=null && !proInfo.getTypeid().equals("")){
				
				cr.andTypeidEqualTo(proInfo.getTypeid());
			}
			List<TbProductInfo> list=infoMapper.queryList(te);
			
			pData.setData(list);
			pData.setCount(infoMapper.countByExample(te)+"");
			return pData;
		}

	public int saveProductInfo(TbProductInfo ti) {
		return infoMapper.insertSelective(ti);
	}

	public int delete(Integer[] ids) {
		int count=0;
		TbProductInfo info=null;
		String strPic="";
		
		for(int i=0;i<ids.length;i++){
			System.out.println(ids[i]);
			info=infoMapper.selectByPrimaryKey(ids[i]);
			infoMapper.deleteByPrimaryKey(ids[i]);//先删除数据，再去删除图片
		
			strPic=info.getInfopic();
			
			if(strPic!=null && !strPic.equals("")){
				if(strPic.indexOf(";")!=-1){
					String[] array=strPic.split(";");
					for(int j=0;j<array.length;j++){
						FileTool.deleteFile(array[j]);
					}
				}else{
					FileTool.deleteFile(strPic);
				}
			}
			
			count++;
		}
		return count;
	}

	public TbProductInfo queryById(Integer id) {
		
		return infoMapper.selectByPrimaryKey(id);
	}

	public int updateProductInfo(TbProductInfo info) {
		return infoMapper.updateByPrimaryKeySelective(info);
	}
	
	
	

}
	


