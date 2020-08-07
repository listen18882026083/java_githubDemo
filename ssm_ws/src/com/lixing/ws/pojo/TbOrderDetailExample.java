package com.lixing.ws.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbOrderDetailExample {
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

    public TbOrderDetailExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProducnameIsNull() {
            addCriterion("producName is null");
            return (Criteria) this;
        }

        public Criteria andProducnameIsNotNull() {
            addCriterion("producName is not null");
            return (Criteria) this;
        }

        public Criteria andProducnameEqualTo(String value) {
            addCriterion("producName =", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameNotEqualTo(String value) {
            addCriterion("producName <>", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameGreaterThan(String value) {
            addCriterion("producName >", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameGreaterThanOrEqualTo(String value) {
            addCriterion("producName >=", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameLessThan(String value) {
            addCriterion("producName <", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameLessThanOrEqualTo(String value) {
            addCriterion("producName <=", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameLike(String value) {
            addCriterion("producName like", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameNotLike(String value) {
            addCriterion("producName not like", value, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameIn(List<String> values) {
            addCriterion("producName in", values, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameNotIn(List<String> values) {
            addCriterion("producName not in", values, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameBetween(String value1, String value2) {
            addCriterion("producName between", value1, value2, "producname");
            return (Criteria) this;
        }

        public Criteria andProducnameNotBetween(String value1, String value2) {
            addCriterion("producName not between", value1, value2, "producname");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("productPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("productPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("productPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("productPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("productPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("productPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIsNull() {
            addCriterion("discountRate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIsNotNull() {
            addCriterion("discountRate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountrateEqualTo(BigDecimal value) {
            addCriterion("discountRate =", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotEqualTo(BigDecimal value) {
            addCriterion("discountRate <>", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateGreaterThan(BigDecimal value) {
            addCriterion("discountRate >", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discountRate >=", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateLessThan(BigDecimal value) {
            addCriterion("discountRate <", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discountRate <=", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIn(List<BigDecimal> values) {
            addCriterion("discountRate in", values, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotIn(List<BigDecimal> values) {
            addCriterion("discountRate not in", values, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discountRate between", value1, value2, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discountRate not between", value1, value2, "discountrate");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberIsNull() {
            addCriterion("OrderDetailNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberIsNotNull() {
            addCriterion("OrderDetailNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberEqualTo(Integer value) {
            addCriterion("OrderDetailNumber =", value, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberNotEqualTo(Integer value) {
            addCriterion("OrderDetailNumber <>", value, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberGreaterThan(Integer value) {
            addCriterion("OrderDetailNumber >", value, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderDetailNumber >=", value, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberLessThan(Integer value) {
            addCriterion("OrderDetailNumber <", value, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberLessThanOrEqualTo(Integer value) {
            addCriterion("OrderDetailNumber <=", value, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberIn(List<Integer> values) {
            addCriterion("OrderDetailNumber in", values, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberNotIn(List<Integer> values) {
            addCriterion("OrderDetailNumber not in", values, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberBetween(Integer value1, Integer value2) {
            addCriterion("OrderDetailNumber between", value1, value2, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andOrderdetailnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderDetailNumber not between", value1, value2, "orderdetailnumber");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(BigDecimal value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(BigDecimal value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(BigDecimal value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<BigDecimal> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andProductmarqueIsNull() {
            addCriterion("productMarque is null");
            return (Criteria) this;
        }

        public Criteria andProductmarqueIsNotNull() {
            addCriterion("productMarque is not null");
            return (Criteria) this;
        }

        public Criteria andProductmarqueEqualTo(String value) {
            addCriterion("productMarque =", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueNotEqualTo(String value) {
            addCriterion("productMarque <>", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueGreaterThan(String value) {
            addCriterion("productMarque >", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueGreaterThanOrEqualTo(String value) {
            addCriterion("productMarque >=", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueLessThan(String value) {
            addCriterion("productMarque <", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueLessThanOrEqualTo(String value) {
            addCriterion("productMarque <=", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueLike(String value) {
            addCriterion("productMarque like", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueNotLike(String value) {
            addCriterion("productMarque not like", value, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueIn(List<String> values) {
            addCriterion("productMarque in", values, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueNotIn(List<String> values) {
            addCriterion("productMarque not in", values, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueBetween(String value1, String value2) {
            addCriterion("productMarque between", value1, value2, "productmarque");
            return (Criteria) this;
        }

        public Criteria andProductmarqueNotBetween(String value1, String value2) {
            addCriterion("productMarque not between", value1, value2, "productmarque");
            return (Criteria) this;
        }

        public Criteria andReturnnumberIsNull() {
            addCriterion("returnNumber is null");
            return (Criteria) this;
        }

        public Criteria andReturnnumberIsNotNull() {
            addCriterion("returnNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnumberEqualTo(String value) {
            addCriterion("returnNumber =", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberNotEqualTo(String value) {
            addCriterion("returnNumber <>", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberGreaterThan(String value) {
            addCriterion("returnNumber >", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberGreaterThanOrEqualTo(String value) {
            addCriterion("returnNumber >=", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberLessThan(String value) {
            addCriterion("returnNumber <", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberLessThanOrEqualTo(String value) {
            addCriterion("returnNumber <=", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberLike(String value) {
            addCriterion("returnNumber like", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberNotLike(String value) {
            addCriterion("returnNumber not like", value, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberIn(List<String> values) {
            addCriterion("returnNumber in", values, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberNotIn(List<String> values) {
            addCriterion("returnNumber not in", values, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberBetween(String value1, String value2) {
            addCriterion("returnNumber between", value1, value2, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andReturnnumberNotBetween(String value1, String value2) {
            addCriterion("returnNumber not between", value1, value2, "returnnumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberIsNull() {
            addCriterion("exchangeNumber is null");
            return (Criteria) this;
        }

        public Criteria andExchangenumberIsNotNull() {
            addCriterion("exchangeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andExchangenumberEqualTo(String value) {
            addCriterion("exchangeNumber =", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberNotEqualTo(String value) {
            addCriterion("exchangeNumber <>", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberGreaterThan(String value) {
            addCriterion("exchangeNumber >", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberGreaterThanOrEqualTo(String value) {
            addCriterion("exchangeNumber >=", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberLessThan(String value) {
            addCriterion("exchangeNumber <", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberLessThanOrEqualTo(String value) {
            addCriterion("exchangeNumber <=", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberLike(String value) {
            addCriterion("exchangeNumber like", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberNotLike(String value) {
            addCriterion("exchangeNumber not like", value, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberIn(List<String> values) {
            addCriterion("exchangeNumber in", values, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberNotIn(List<String> values) {
            addCriterion("exchangeNumber not in", values, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberBetween(String value1, String value2) {
            addCriterion("exchangeNumber between", value1, value2, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andExchangenumberNotBetween(String value1, String value2) {
            addCriterion("exchangeNumber not between", value1, value2, "exchangenumber");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervIsNull() {
            addCriterion("orderlogisticsNumberv is null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervIsNotNull() {
            addCriterion("orderlogisticsNumberv is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervEqualTo(String value) {
            addCriterion("orderlogisticsNumberv =", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervNotEqualTo(String value) {
            addCriterion("orderlogisticsNumberv <>", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervGreaterThan(String value) {
            addCriterion("orderlogisticsNumberv >", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervGreaterThanOrEqualTo(String value) {
            addCriterion("orderlogisticsNumberv >=", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervLessThan(String value) {
            addCriterion("orderlogisticsNumberv <", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervLessThanOrEqualTo(String value) {
            addCriterion("orderlogisticsNumberv <=", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervLike(String value) {
            addCriterion("orderlogisticsNumberv like", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervNotLike(String value) {
            addCriterion("orderlogisticsNumberv not like", value, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervIn(List<String> values) {
            addCriterion("orderlogisticsNumberv in", values, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervNotIn(List<String> values) {
            addCriterion("orderlogisticsNumberv not in", values, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervBetween(String value1, String value2) {
            addCriterion("orderlogisticsNumberv between", value1, value2, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andOrderlogisticsnumbervNotBetween(String value1, String value2) {
            addCriterion("orderlogisticsNumberv not between", value1, value2, "orderlogisticsnumberv");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonIsNull() {
            addCriterion("replacementReason is null");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonIsNotNull() {
            addCriterion("replacementReason is not null");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonEqualTo(String value) {
            addCriterion("replacementReason =", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonNotEqualTo(String value) {
            addCriterion("replacementReason <>", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonGreaterThan(String value) {
            addCriterion("replacementReason >", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonGreaterThanOrEqualTo(String value) {
            addCriterion("replacementReason >=", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonLessThan(String value) {
            addCriterion("replacementReason <", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonLessThanOrEqualTo(String value) {
            addCriterion("replacementReason <=", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonLike(String value) {
            addCriterion("replacementReason like", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonNotLike(String value) {
            addCriterion("replacementReason not like", value, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonIn(List<String> values) {
            addCriterion("replacementReason in", values, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonNotIn(List<String> values) {
            addCriterion("replacementReason not in", values, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonBetween(String value1, String value2) {
            addCriterion("replacementReason between", value1, value2, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andReplacementreasonNotBetween(String value1, String value2) {
            addCriterion("replacementReason not between", value1, value2, "replacementreason");
            return (Criteria) this;
        }

        public Criteria andDetailstatusIsNull() {
            addCriterion("detailStatus is null");
            return (Criteria) this;
        }

        public Criteria andDetailstatusIsNotNull() {
            addCriterion("detailStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDetailstatusEqualTo(String value) {
            addCriterion("detailStatus =", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusNotEqualTo(String value) {
            addCriterion("detailStatus <>", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusGreaterThan(String value) {
            addCriterion("detailStatus >", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusGreaterThanOrEqualTo(String value) {
            addCriterion("detailStatus >=", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusLessThan(String value) {
            addCriterion("detailStatus <", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusLessThanOrEqualTo(String value) {
            addCriterion("detailStatus <=", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusLike(String value) {
            addCriterion("detailStatus like", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusNotLike(String value) {
            addCriterion("detailStatus not like", value, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusIn(List<String> values) {
            addCriterion("detailStatus in", values, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusNotIn(List<String> values) {
            addCriterion("detailStatus not in", values, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusBetween(String value1, String value2) {
            addCriterion("detailStatus between", value1, value2, "detailstatus");
            return (Criteria) this;
        }

        public Criteria andDetailstatusNotBetween(String value1, String value2) {
            addCriterion("detailStatus not between", value1, value2, "detailstatus");
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