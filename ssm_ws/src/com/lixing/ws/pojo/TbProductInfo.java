package com.lixing.ws.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TbProductInfo {
    private Integer id;

    private Integer typeid;

    private String infonumber;

    private String infoname;

    private BigDecimal infocost;

    private BigDecimal infoprice;

    private BigDecimal infodiscount;

    private String infopic;

    private String infospec;

    private String infoorigin;

    private String infobrand;

    private String infoheat;

    private String intendedfor;

    private Integer infostock;

    private BigDecimal infopostage;

    private Date updatetime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getInfonumber() {
        return infonumber;
    }

    public void setInfonumber(String infonumber) {
        this.infonumber = infonumber == null ? null : infonumber.trim();
    }

    public String getInfoname() {
        return infoname;
    }

    public void setInfoname(String infoname) {
        this.infoname = infoname == null ? null : infoname.trim();
    }

    public BigDecimal getInfocost() {
        return infocost;
    }

    public void setInfocost(BigDecimal infocost) {
        this.infocost = infocost;
    }

    public BigDecimal getInfoprice() {
        return infoprice;
    }

    public void setInfoprice(BigDecimal infoprice) {
        this.infoprice = infoprice;
    }

    public BigDecimal getInfodiscount() {
        return infodiscount;
    }

    public void setInfodiscount(BigDecimal infodiscount) {
        this.infodiscount = infodiscount;
    }

    public String getInfopic() {
        return infopic;
    }

    public void setInfopic(String infopic) {
        this.infopic = infopic == null ? null : infopic.trim();
    }

    public String getInfospec() {
        return infospec;
    }

    public void setInfospec(String infospec) {
        this.infospec = infospec == null ? null : infospec.trim();
    }

    public String getInfoorigin() {
        return infoorigin;
    }

    public void setInfoorigin(String infoorigin) {
        this.infoorigin = infoorigin == null ? null : infoorigin.trim();
    }

    public String getInfobrand() {
        return infobrand;
    }

    public void setInfobrand(String infobrand) {
        this.infobrand = infobrand == null ? null : infobrand.trim();
    }

    public String getInfoheat() {
        return infoheat;
    }

    public void setInfoheat(String infoheat) {
        this.infoheat = infoheat == null ? null : infoheat.trim();
    }

    public String getIntendedfor() {
        return intendedfor;
    }

    public void setIntendedfor(String intendedfor) {
        this.intendedfor = intendedfor == null ? null : intendedfor.trim();
    }

    public Integer getInfostock() {
        return infostock;
    }

    public void setInfostock(Integer infostock) {
        this.infostock = infostock;
    }

    public BigDecimal getInfopostage() {
        return infopostage;
    }

    public void setInfopostage(BigDecimal infopostage) {
        this.infopostage = infopostage;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}