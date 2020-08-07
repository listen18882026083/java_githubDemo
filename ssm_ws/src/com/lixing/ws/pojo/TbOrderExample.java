package com.lixing.ws.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
	protected Integer page;
	protected Integer limit;
    public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("orderStatus like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("orderStatus not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNull() {
            addCriterion("productCount is null");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNotNull() {
            addCriterion("productCount is not null");
            return (Criteria) this;
        }

        public Criteria andProductcountEqualTo(Integer value) {
            addCriterion("productCount =", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotEqualTo(Integer value) {
            addCriterion("productCount <>", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThan(Integer value) {
            addCriterion("productCount >", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("productCount >=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThan(Integer value) {
            addCriterion("productCount <", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThanOrEqualTo(Integer value) {
            addCriterion("productCount <=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountIn(List<Integer> values) {
            addCriterion("productCount in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotIn(List<Integer> values) {
            addCriterion("productCount not in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountBetween(Integer value1, Integer value2) {
            addCriterion("productCount between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotBetween(Integer value1, Integer value2) {
            addCriterion("productCount not between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalIsNull() {
            addCriterion("productAmountTotal is null");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalIsNotNull() {
            addCriterion("productAmountTotal is not null");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalEqualTo(BigDecimal value) {
            addCriterion("productAmountTotal =", value, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalNotEqualTo(BigDecimal value) {
            addCriterion("productAmountTotal <>", value, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalGreaterThan(BigDecimal value) {
            addCriterion("productAmountTotal >", value, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productAmountTotal >=", value, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalLessThan(BigDecimal value) {
            addCriterion("productAmountTotal <", value, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productAmountTotal <=", value, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalIn(List<BigDecimal> values) {
            addCriterion("productAmountTotal in", values, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalNotIn(List<BigDecimal> values) {
            addCriterion("productAmountTotal not in", values, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productAmountTotal between", value1, value2, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andProductamounttotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productAmountTotal not between", value1, value2, "productamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalIsNull() {
            addCriterion("orderAmountTotal is null");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalIsNotNull() {
            addCriterion("orderAmountTotal is not null");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalEqualTo(BigDecimal value) {
            addCriterion("orderAmountTotal =", value, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalNotEqualTo(BigDecimal value) {
            addCriterion("orderAmountTotal <>", value, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalGreaterThan(BigDecimal value) {
            addCriterion("orderAmountTotal >", value, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderAmountTotal >=", value, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalLessThan(BigDecimal value) {
            addCriterion("orderAmountTotal <", value, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderAmountTotal <=", value, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalIn(List<BigDecimal> values) {
            addCriterion("orderAmountTotal in", values, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalNotIn(List<BigDecimal> values) {
            addCriterion("orderAmountTotal not in", values, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderAmountTotal between", value1, value2, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andOrderamounttotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderAmountTotal not between", value1, value2, "orderamounttotal");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeIsNull() {
            addCriterion("logisticsFee is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeIsNotNull() {
            addCriterion("logisticsFee is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeEqualTo(BigDecimal value) {
            addCriterion("logisticsFee =", value, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeNotEqualTo(BigDecimal value) {
            addCriterion("logisticsFee <>", value, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeGreaterThan(BigDecimal value) {
            addCriterion("logisticsFee >", value, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logisticsFee >=", value, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeLessThan(BigDecimal value) {
            addCriterion("logisticsFee <", value, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logisticsFee <=", value, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeIn(List<BigDecimal> values) {
            addCriterion("logisticsFee in", values, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeNotIn(List<BigDecimal> values) {
            addCriterion("logisticsFee not in", values, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logisticsFee between", value1, value2, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andLogisticsfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logisticsFee not between", value1, value2, "logisticsfee");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidIsNull() {
            addCriterion("orderlogisticsId is null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidIsNotNull() {
            addCriterion("orderlogisticsId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidEqualTo(String value) {
            addCriterion("orderlogisticsId =", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidNotEqualTo(String value) {
            addCriterion("orderlogisticsId <>", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidGreaterThan(String value) {
            addCriterion("orderlogisticsId >", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidGreaterThanOrEqualTo(String value) {
            addCriterion("orderlogisticsId >=", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidLessThan(String value) {
            addCriterion("orderlogisticsId <", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidLessThanOrEqualTo(String value) {
            addCriterion("orderlogisticsId <=", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidLike(String value) {
            addCriterion("orderlogisticsId like", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidNotLike(String value) {
            addCriterion("orderlogisticsId not like", value, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidIn(List<String> values) {
            addCriterion("orderlogisticsId in", values, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidNotIn(List<String> values) {
            addCriterion("orderlogisticsId not in", values, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidBetween(String value1, String value2) {
            addCriterion("orderlogisticsId between", value1, value2, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsidNotBetween(String value1, String value2) {
            addCriterion("orderlogisticsId not between", value1, value2, "orderlogisticsid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andPaymentpicIsNull() {
            addCriterion("paymentPic is null");
            return (Criteria) this;
        }

        public Criteria andPaymentpicIsNotNull() {
            addCriterion("paymentPic is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentpicEqualTo(String value) {
            addCriterion("paymentPic =", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicNotEqualTo(String value) {
            addCriterion("paymentPic <>", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicGreaterThan(String value) {
            addCriterion("paymentPic >", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicGreaterThanOrEqualTo(String value) {
            addCriterion("paymentPic >=", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicLessThan(String value) {
            addCriterion("paymentPic <", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicLessThanOrEqualTo(String value) {
            addCriterion("paymentPic <=", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicLike(String value) {
            addCriterion("paymentPic like", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicNotLike(String value) {
            addCriterion("paymentPic not like", value, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicIn(List<String> values) {
            addCriterion("paymentPic in", values, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicNotIn(List<String> values) {
            addCriterion("paymentPic not in", values, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicBetween(String value1, String value2) {
            addCriterion("paymentPic between", value1, value2, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPaymentpicNotBetween(String value1, String value2) {
            addCriterion("paymentPic not between", value1, value2, "paymentpic");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIsNull() {
            addCriterion("orderRemark is null");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIsNotNull() {
            addCriterion("orderRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderremarkEqualTo(String value) {
            addCriterion("orderRemark =", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotEqualTo(String value) {
            addCriterion("orderRemark <>", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkGreaterThan(String value) {
            addCriterion("orderRemark >", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkGreaterThanOrEqualTo(String value) {
            addCriterion("orderRemark >=", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLessThan(String value) {
            addCriterion("orderRemark <", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLessThanOrEqualTo(String value) {
            addCriterion("orderRemark <=", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLike(String value) {
            addCriterion("orderRemark like", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotLike(String value) {
            addCriterion("orderRemark not like", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIn(List<String> values) {
            addCriterion("orderRemark in", values, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotIn(List<String> values) {
            addCriterion("orderRemark not in", values, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkBetween(String value1, String value2) {
            addCriterion("orderRemark between", value1, value2, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotBetween(String value1, String value2) {
            addCriterion("orderRemark not between", value1, value2, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeIsNull() {
            addCriterion("orderConsignee is null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeIsNotNull() {
            addCriterion("orderConsignee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeEqualTo(String value) {
            addCriterion("orderConsignee =", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeNotEqualTo(String value) {
            addCriterion("orderConsignee <>", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeGreaterThan(String value) {
            addCriterion("orderConsignee >", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("orderConsignee >=", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeLessThan(String value) {
            addCriterion("orderConsignee <", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeLessThanOrEqualTo(String value) {
            addCriterion("orderConsignee <=", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeLike(String value) {
            addCriterion("orderConsignee like", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeNotLike(String value) {
            addCriterion("orderConsignee not like", value, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeIn(List<String> values) {
            addCriterion("orderConsignee in", values, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeNotIn(List<String> values) {
            addCriterion("orderConsignee not in", values, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeBetween(String value1, String value2) {
            addCriterion("orderConsignee between", value1, value2, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andOrderconsigneeNotBetween(String value1, String value2) {
            addCriterion("orderConsignee not between", value1, value2, "orderconsignee");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNull() {
            addCriterion("newDate is null");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNotNull() {
            addCriterion("newDate is not null");
            return (Criteria) this;
        }

        public Criteria andNewdateEqualTo(Date value) {
            addCriterion("newDate =", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotEqualTo(Date value) {
            addCriterion("newDate <>", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThan(Date value) {
            addCriterion("newDate >", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("newDate >=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThan(Date value) {
            addCriterion("newDate <", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThanOrEqualTo(Date value) {
            addCriterion("newDate <=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateIn(List<Date> values) {
            addCriterion("newDate in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotIn(List<Date> values) {
            addCriterion("newDate not in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateBetween(Date value1, Date value2) {
            addCriterion("newDate between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotBetween(Date value1, Date value2) {
            addCriterion("newDate not between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNull() {
            addCriterion("paymentTime is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNotNull() {
            addCriterion("paymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeEqualTo(Date value) {
            addCriterion("paymentTime =", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotEqualTo(Date value) {
            addCriterion("paymentTime <>", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThan(Date value) {
            addCriterion("paymentTime >", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paymentTime >=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThan(Date value) {
            addCriterion("paymentTime <", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThanOrEqualTo(Date value) {
            addCriterion("paymentTime <=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIn(List<Date> values) {
            addCriterion("paymentTime in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotIn(List<Date> values) {
            addCriterion("paymentTime not in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeBetween(Date value1, Date value2) {
            addCriterion("paymentTime between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotBetween(Date value1, Date value2) {
            addCriterion("paymentTime not between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("deliveryTime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("deliveryTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Date value) {
            addCriterion("deliveryTime =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Date value) {
            addCriterion("deliveryTime <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Date value) {
            addCriterion("deliveryTime >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryTime >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Date value) {
            addCriterion("deliveryTime <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Date value) {
            addCriterion("deliveryTime <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Date> values) {
            addCriterion("deliveryTime in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Date> values) {
            addCriterion("deliveryTime not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Date value1, Date value2) {
            addCriterion("deliveryTime between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Date value1, Date value2) {
            addCriterion("deliveryTime not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("paymentMethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("paymentMethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("paymentMethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("paymentMethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("paymentMethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("paymentMethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("paymentMethod like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("paymentMethod not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("paymentMethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("paymentMethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("paymentMethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("paymentMethod not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}