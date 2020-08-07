package com.lixing.ws.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrder {
    private Integer id;

    private String ordernumber;

    private String orderstatus;

    private Integer productcount;

    private BigDecimal productamounttotal;

    private BigDecimal orderamounttotal;

    private BigDecimal logisticsfee;

    private String address;

    private String orderlogisticsid;

    private Integer customerid;

    private String paymentpic;

    private String phone;

    private String remark;

    private String orderremark;

    private String orderconsignee;

    private Date newdate;

    private Date paymenttime;

    private Date deliverytime;

    private String paymentmethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public BigDecimal getProductamounttotal() {
        return productamounttotal;
    }

    public void setProductamounttotal(BigDecimal productamounttotal) {
        this.productamounttotal = productamounttotal;
    }

    public BigDecimal getOrderamounttotal() {
        return orderamounttotal;
    }

    public void setOrderamounttotal(BigDecimal orderamounttotal) {
        this.orderamounttotal = orderamounttotal;
    }

    public BigDecimal getLogisticsfee() {
        return logisticsfee;
    }

    public void setLogisticsfee(BigDecimal logisticsfee) {
        this.logisticsfee = logisticsfee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOrderlogisticsid() {
        return orderlogisticsid;
    }

    public void setOrderlogisticsid(String orderlogisticsid) {
        this.orderlogisticsid = orderlogisticsid == null ? null : orderlogisticsid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getPaymentpic() {
        return paymentpic;
    }

    public void setPaymentpic(String paymentpic) {
        this.paymentpic = paymentpic == null ? null : paymentpic.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrderremark() {
        return orderremark;
    }

    public void setOrderremark(String orderremark) {
        this.orderremark = orderremark == null ? null : orderremark.trim();
    }

    public String getOrderconsignee() {
        return orderconsignee;
    }

    public void setOrderconsignee(String orderconsignee) {
        this.orderconsignee = orderconsignee == null ? null : orderconsignee.trim();
    }

    public Date getNewdate() {
        return newdate;
    }

    public void setNewdate(Date newdate) {
        this.newdate = newdate;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod == null ? null : paymentmethod.trim();
    }
}