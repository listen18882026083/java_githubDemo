package com.lixing.ws.pojo;

import java.math.BigDecimal;

public class TbOrderDetail {
    private Integer id;

    private Integer productid;

    private Integer orderid;

    private String producname;

    private BigDecimal productprice;

    private BigDecimal discountrate;

    private Integer orderdetailnumber;

    private BigDecimal subtotal;

    private String productmarque;

    private String returnnumber;

    private String exchangenumber;

    private String orderlogisticsnumberv;

    private String replacementreason;

    private String detailstatus;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getProducname() {
        return producname;
    }

    public void setProducname(String producname) {
        this.producname = producname == null ? null : producname.trim();
    }

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    public BigDecimal getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(BigDecimal discountrate) {
        this.discountrate = discountrate;
    }

    public Integer getOrderdetailnumber() {
        return orderdetailnumber;
    }

    public void setOrderdetailnumber(Integer orderdetailnumber) {
        this.orderdetailnumber = orderdetailnumber;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public String getProductmarque() {
        return productmarque;
    }

    public void setProductmarque(String productmarque) {
        this.productmarque = productmarque == null ? null : productmarque.trim();
    }

    public String getReturnnumber() {
        return returnnumber;
    }

    public void setReturnnumber(String returnnumber) {
        this.returnnumber = returnnumber == null ? null : returnnumber.trim();
    }

    public String getExchangenumber() {
        return exchangenumber;
    }

    public void setExchangenumber(String exchangenumber) {
        this.exchangenumber = exchangenumber == null ? null : exchangenumber.trim();
    }

    public String getOrderlogisticsnumberv() {
        return orderlogisticsnumberv;
    }

    public void setOrderlogisticsnumberv(String orderlogisticsnumberv) {
        this.orderlogisticsnumberv = orderlogisticsnumberv == null ? null : orderlogisticsnumberv.trim();
    }

    public String getReplacementreason() {
        return replacementreason;
    }

    public void setReplacementreason(String replacementreason) {
        this.replacementreason = replacementreason == null ? null : replacementreason.trim();
    }

    public String getDetailstatus() {
        return detailstatus;
    }

    public void setDetailstatus(String detailstatus) {
        this.detailstatus = detailstatus == null ? null : detailstatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}