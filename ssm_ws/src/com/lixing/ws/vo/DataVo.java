package com.lixing.ws.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class DataVo {

	private BigDecimal dayMoney;
	private BigDecimal weekMoney;
	private BigDecimal monthMoney;
	private BigDecimal quarterMoney;
	private List<Map<String,Object>> monthCustomerStar;
	private List<Map<String,Object>> quarterCustomerStar;
	private List<Map<String,Object>> yearCustomerStar;
	
	private List<Map<String,Object>> monthProductStar;
	private List<Map<String,Object>> quarterProductStar;
	private List<Map<String,Object>> yearProductStar;
	
	public BigDecimal getDayMoney() {
		return dayMoney;
	}
	public void setDayMoney(BigDecimal dayMoney) {
		this.dayMoney = dayMoney;
	}
	public BigDecimal getWeekMoney() {
		return weekMoney;
	}
	public void setWeekMoney(BigDecimal weekMoney) {
		this.weekMoney = weekMoney;
	}
	public BigDecimal getMonthMoney() {
		return monthMoney;
	}
	public void setMonthMoney(BigDecimal monthMoney) {
		this.monthMoney = monthMoney;
	}
	public BigDecimal getQuarterMoney() {
		return quarterMoney;
	}
	public void setQuarterMoney(BigDecimal quarterMoney) {
		this.quarterMoney = quarterMoney;
	}
	public List<Map<String, Object>> getMonthCustomerStar() {
		return monthCustomerStar;
	}
	public void setMonthCustomerStar(List<Map<String, Object>> monthCustomerStar) {
		this.monthCustomerStar = monthCustomerStar;
	}
	public List<Map<String, Object>> getQuarterCustomerStar() {
		return quarterCustomerStar;
	}
	public void setQuarterCustomerStar(List<Map<String, Object>> quarterCustomerStar) {
		this.quarterCustomerStar = quarterCustomerStar;
	}
	public List<Map<String, Object>> getYearCustomerStar() {
		return yearCustomerStar;
	}
	public void setYearCustomerStar(List<Map<String, Object>> yearCustomerStar) {
		this.yearCustomerStar = yearCustomerStar;
	}
	public List<Map<String, Object>> getMonthProductStar() {
		return monthProductStar;
	}
	public void setMonthProductStar(List<Map<String, Object>> monthProductStar) {
		this.monthProductStar = monthProductStar;
	}
	public List<Map<String, Object>> getQuarterProductStar() {
		return quarterProductStar;
	}
	public void setQuarterProductStar(List<Map<String, Object>> quarterProductStar) {
		this.quarterProductStar = quarterProductStar;
	}
	public List<Map<String, Object>> getYearProductStar() {
		return yearProductStar;
	}
	public void setYearProductStar(List<Map<String, Object>> yearProductStar) {
		this.yearProductStar = yearProductStar;
	}
	
	
	
}
