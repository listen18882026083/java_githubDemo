package com.lixing.ws.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderDetailVo {
	 
	 private Integer productId;
	 private String orderCode;
	 private String orderName;
	 private String orderAddress;
	 private String  orderPhone;
	 private String producname;
	 private BigDecimal productprice;
	 private BigDecimal infodiscount;
	 private Integer customerid;
	 private String orderlogisticsId;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date deliveryTime;
	 private String paymentMethod;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date paymentTime;
	 private String orderRemark;
	 
	public String getOrderlogisticsId() {
		return orderlogisticsId;
	}
	public void setOrderlogisticsId(String orderlogisticsId) {
		this.orderlogisticsId = orderlogisticsId;
	}
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getOrderRemark() {
		return orderRemark;
	}
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}
	public String getProducname() {
		return producname;
	}
	public void setProducname(String producname) {
		this.producname = producname;
	}
	public BigDecimal getProductprice() {
		return productprice;
	}
	public void setProductprice(BigDecimal productprice) {
		this.productprice = productprice;
	}
	
	public BigDecimal getInfodiscount() {
		return infodiscount;
	}
	public void setInfodiscount(BigDecimal infodiscount) {
		this.infodiscount = infodiscount;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	 
}
