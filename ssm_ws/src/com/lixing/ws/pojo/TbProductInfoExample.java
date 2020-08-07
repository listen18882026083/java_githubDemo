package com.lixing.ws.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductInfoExample {
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

    public TbProductInfoExample() {
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andInfonumberIsNull() {
            addCriterion("infoNumber is null");
            return (Criteria) this;
        }

        public Criteria andInfonumberIsNotNull() {
            addCriterion("infoNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInfonumberEqualTo(String value) {
            addCriterion("infoNumber =", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberNotEqualTo(String value) {
            addCriterion("infoNumber <>", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberGreaterThan(String value) {
            addCriterion("infoNumber >", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberGreaterThanOrEqualTo(String value) {
            addCriterion("infoNumber >=", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberLessThan(String value) {
            addCriterion("infoNumber <", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberLessThanOrEqualTo(String value) {
            addCriterion("infoNumber <=", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberLike(String value) {
            addCriterion("infoNumber like", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberNotLike(String value) {
            addCriterion("infoNumber not like", value, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberIn(List<String> values) {
            addCriterion("infoNumber in", values, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberNotIn(List<String> values) {
            addCriterion("infoNumber not in", values, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberBetween(String value1, String value2) {
            addCriterion("infoNumber between", value1, value2, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonumberNotBetween(String value1, String value2) {
            addCriterion("infoNumber not between", value1, value2, "infonumber");
            return (Criteria) this;
        }

        public Criteria andInfonameIsNull() {
            addCriterion("infoName is null");
            return (Criteria) this;
        }

        public Criteria andInfonameIsNotNull() {
            addCriterion("infoName is not null");
            return (Criteria) this;
        }

        public Criteria andInfonameEqualTo(String value) {
            addCriterion("infoName =", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotEqualTo(String value) {
            addCriterion("infoName <>", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameGreaterThan(String value) {
            addCriterion("infoName >", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameGreaterThanOrEqualTo(String value) {
            addCriterion("infoName >=", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLessThan(String value) {
            addCriterion("infoName <", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLessThanOrEqualTo(String value) {
            addCriterion("infoName <=", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLike(String value) {
            addCriterion("infoName like", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotLike(String value) {
            addCriterion("infoName not like", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameIn(List<String> values) {
            addCriterion("infoName in", values, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotIn(List<String> values) {
            addCriterion("infoName not in", values, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameBetween(String value1, String value2) {
            addCriterion("infoName between", value1, value2, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotBetween(String value1, String value2) {
            addCriterion("infoName not between", value1, value2, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfocostIsNull() {
            addCriterion("infoCost is null");
            return (Criteria) this;
        }

        public Criteria andInfocostIsNotNull() {
            addCriterion("infoCost is not null");
            return (Criteria) this;
        }

        public Criteria andInfocostEqualTo(BigDecimal value) {
            addCriterion("infoCost =", value, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostNotEqualTo(BigDecimal value) {
            addCriterion("infoCost <>", value, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostGreaterThan(BigDecimal value) {
            addCriterion("infoCost >", value, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("infoCost >=", value, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostLessThan(BigDecimal value) {
            addCriterion("infoCost <", value, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("infoCost <=", value, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostIn(List<BigDecimal> values) {
            addCriterion("infoCost in", values, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostNotIn(List<BigDecimal> values) {
            addCriterion("infoCost not in", values, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoCost between", value1, value2, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfocostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoCost not between", value1, value2, "infocost");
            return (Criteria) this;
        }

        public Criteria andInfopriceIsNull() {
            addCriterion("infoPrice is null");
            return (Criteria) this;
        }

        public Criteria andInfopriceIsNotNull() {
            addCriterion("infoPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInfopriceEqualTo(BigDecimal value) {
            addCriterion("infoPrice =", value, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceNotEqualTo(BigDecimal value) {
            addCriterion("infoPrice <>", value, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceGreaterThan(BigDecimal value) {
            addCriterion("infoPrice >", value, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("infoPrice >=", value, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceLessThan(BigDecimal value) {
            addCriterion("infoPrice <", value, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("infoPrice <=", value, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceIn(List<BigDecimal> values) {
            addCriterion("infoPrice in", values, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceNotIn(List<BigDecimal> values) {
            addCriterion("infoPrice not in", values, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoPrice between", value1, value2, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfopriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoPrice not between", value1, value2, "infoprice");
            return (Criteria) this;
        }

        public Criteria andInfodiscountIsNull() {
            addCriterion("infoDiscount is null");
            return (Criteria) this;
        }

        public Criteria andInfodiscountIsNotNull() {
            addCriterion("infoDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andInfodiscountEqualTo(BigDecimal value) {
            addCriterion("infoDiscount =", value, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountNotEqualTo(BigDecimal value) {
            addCriterion("infoDiscount <>", value, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountGreaterThan(BigDecimal value) {
            addCriterion("infoDiscount >", value, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("infoDiscount >=", value, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountLessThan(BigDecimal value) {
            addCriterion("infoDiscount <", value, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("infoDiscount <=", value, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountIn(List<BigDecimal> values) {
            addCriterion("infoDiscount in", values, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountNotIn(List<BigDecimal> values) {
            addCriterion("infoDiscount not in", values, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoDiscount between", value1, value2, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfodiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoDiscount not between", value1, value2, "infodiscount");
            return (Criteria) this;
        }

        public Criteria andInfopicIsNull() {
            addCriterion("infoPic is null");
            return (Criteria) this;
        }

        public Criteria andInfopicIsNotNull() {
            addCriterion("infoPic is not null");
            return (Criteria) this;
        }

        public Criteria andInfopicEqualTo(String value) {
            addCriterion("infoPic =", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicNotEqualTo(String value) {
            addCriterion("infoPic <>", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicGreaterThan(String value) {
            addCriterion("infoPic >", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicGreaterThanOrEqualTo(String value) {
            addCriterion("infoPic >=", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicLessThan(String value) {
            addCriterion("infoPic <", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicLessThanOrEqualTo(String value) {
            addCriterion("infoPic <=", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicLike(String value) {
            addCriterion("infoPic like", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicNotLike(String value) {
            addCriterion("infoPic not like", value, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicIn(List<String> values) {
            addCriterion("infoPic in", values, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicNotIn(List<String> values) {
            addCriterion("infoPic not in", values, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicBetween(String value1, String value2) {
            addCriterion("infoPic between", value1, value2, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfopicNotBetween(String value1, String value2) {
            addCriterion("infoPic not between", value1, value2, "infopic");
            return (Criteria) this;
        }

        public Criteria andInfospecIsNull() {
            addCriterion("infoSpec is null");
            return (Criteria) this;
        }

        public Criteria andInfospecIsNotNull() {
            addCriterion("infoSpec is not null");
            return (Criteria) this;
        }

        public Criteria andInfospecEqualTo(String value) {
            addCriterion("infoSpec =", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecNotEqualTo(String value) {
            addCriterion("infoSpec <>", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecGreaterThan(String value) {
            addCriterion("infoSpec >", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecGreaterThanOrEqualTo(String value) {
            addCriterion("infoSpec >=", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecLessThan(String value) {
            addCriterion("infoSpec <", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecLessThanOrEqualTo(String value) {
            addCriterion("infoSpec <=", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecLike(String value) {
            addCriterion("infoSpec like", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecNotLike(String value) {
            addCriterion("infoSpec not like", value, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecIn(List<String> values) {
            addCriterion("infoSpec in", values, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecNotIn(List<String> values) {
            addCriterion("infoSpec not in", values, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecBetween(String value1, String value2) {
            addCriterion("infoSpec between", value1, value2, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfospecNotBetween(String value1, String value2) {
            addCriterion("infoSpec not between", value1, value2, "infospec");
            return (Criteria) this;
        }

        public Criteria andInfooriginIsNull() {
            addCriterion("infoOrigin is null");
            return (Criteria) this;
        }

        public Criteria andInfooriginIsNotNull() {
            addCriterion("infoOrigin is not null");
            return (Criteria) this;
        }

        public Criteria andInfooriginEqualTo(String value) {
            addCriterion("infoOrigin =", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginNotEqualTo(String value) {
            addCriterion("infoOrigin <>", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginGreaterThan(String value) {
            addCriterion("infoOrigin >", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginGreaterThanOrEqualTo(String value) {
            addCriterion("infoOrigin >=", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginLessThan(String value) {
            addCriterion("infoOrigin <", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginLessThanOrEqualTo(String value) {
            addCriterion("infoOrigin <=", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginLike(String value) {
            addCriterion("infoOrigin like", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginNotLike(String value) {
            addCriterion("infoOrigin not like", value, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginIn(List<String> values) {
            addCriterion("infoOrigin in", values, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginNotIn(List<String> values) {
            addCriterion("infoOrigin not in", values, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginBetween(String value1, String value2) {
            addCriterion("infoOrigin between", value1, value2, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfooriginNotBetween(String value1, String value2) {
            addCriterion("infoOrigin not between", value1, value2, "infoorigin");
            return (Criteria) this;
        }

        public Criteria andInfobrandIsNull() {
            addCriterion("infoBrand is null");
            return (Criteria) this;
        }

        public Criteria andInfobrandIsNotNull() {
            addCriterion("infoBrand is not null");
            return (Criteria) this;
        }

        public Criteria andInfobrandEqualTo(String value) {
            addCriterion("infoBrand =", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandNotEqualTo(String value) {
            addCriterion("infoBrand <>", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandGreaterThan(String value) {
            addCriterion("infoBrand >", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandGreaterThanOrEqualTo(String value) {
            addCriterion("infoBrand >=", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandLessThan(String value) {
            addCriterion("infoBrand <", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandLessThanOrEqualTo(String value) {
            addCriterion("infoBrand <=", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandLike(String value) {
            addCriterion("infoBrand like", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandNotLike(String value) {
            addCriterion("infoBrand not like", value, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandIn(List<String> values) {
            addCriterion("infoBrand in", values, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandNotIn(List<String> values) {
            addCriterion("infoBrand not in", values, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandBetween(String value1, String value2) {
            addCriterion("infoBrand between", value1, value2, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfobrandNotBetween(String value1, String value2) {
            addCriterion("infoBrand not between", value1, value2, "infobrand");
            return (Criteria) this;
        }

        public Criteria andInfoheatIsNull() {
            addCriterion("infoHeat is null");
            return (Criteria) this;
        }

        public Criteria andInfoheatIsNotNull() {
            addCriterion("infoHeat is not null");
            return (Criteria) this;
        }

        public Criteria andInfoheatEqualTo(String value) {
            addCriterion("infoHeat =", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatNotEqualTo(String value) {
            addCriterion("infoHeat <>", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatGreaterThan(String value) {
            addCriterion("infoHeat >", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatGreaterThanOrEqualTo(String value) {
            addCriterion("infoHeat >=", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatLessThan(String value) {
            addCriterion("infoHeat <", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatLessThanOrEqualTo(String value) {
            addCriterion("infoHeat <=", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatLike(String value) {
            addCriterion("infoHeat like", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatNotLike(String value) {
            addCriterion("infoHeat not like", value, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatIn(List<String> values) {
            addCriterion("infoHeat in", values, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatNotIn(List<String> values) {
            addCriterion("infoHeat not in", values, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatBetween(String value1, String value2) {
            addCriterion("infoHeat between", value1, value2, "infoheat");
            return (Criteria) this;
        }

        public Criteria andInfoheatNotBetween(String value1, String value2) {
            addCriterion("infoHeat not between", value1, value2, "infoheat");
            return (Criteria) this;
        }

        public Criteria andIntendedforIsNull() {
            addCriterion("intendedFor is null");
            return (Criteria) this;
        }

        public Criteria andIntendedforIsNotNull() {
            addCriterion("intendedFor is not null");
            return (Criteria) this;
        }

        public Criteria andIntendedforEqualTo(String value) {
            addCriterion("intendedFor =", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforNotEqualTo(String value) {
            addCriterion("intendedFor <>", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforGreaterThan(String value) {
            addCriterion("intendedFor >", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforGreaterThanOrEqualTo(String value) {
            addCriterion("intendedFor >=", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforLessThan(String value) {
            addCriterion("intendedFor <", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforLessThanOrEqualTo(String value) {
            addCriterion("intendedFor <=", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforLike(String value) {
            addCriterion("intendedFor like", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforNotLike(String value) {
            addCriterion("intendedFor not like", value, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforIn(List<String> values) {
            addCriterion("intendedFor in", values, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforNotIn(List<String> values) {
            addCriterion("intendedFor not in", values, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforBetween(String value1, String value2) {
            addCriterion("intendedFor between", value1, value2, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andIntendedforNotBetween(String value1, String value2) {
            addCriterion("intendedFor not between", value1, value2, "intendedfor");
            return (Criteria) this;
        }

        public Criteria andInfostockIsNull() {
            addCriterion("infoStock is null");
            return (Criteria) this;
        }

        public Criteria andInfostockIsNotNull() {
            addCriterion("infoStock is not null");
            return (Criteria) this;
        }

        public Criteria andInfostockEqualTo(Integer value) {
            addCriterion("infoStock =", value, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockNotEqualTo(Integer value) {
            addCriterion("infoStock <>", value, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockGreaterThan(Integer value) {
            addCriterion("infoStock >", value, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockGreaterThanOrEqualTo(Integer value) {
            addCriterion("infoStock >=", value, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockLessThan(Integer value) {
            addCriterion("infoStock <", value, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockLessThanOrEqualTo(Integer value) {
            addCriterion("infoStock <=", value, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockIn(List<Integer> values) {
            addCriterion("infoStock in", values, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockNotIn(List<Integer> values) {
            addCriterion("infoStock not in", values, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockBetween(Integer value1, Integer value2) {
            addCriterion("infoStock between", value1, value2, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfostockNotBetween(Integer value1, Integer value2) {
            addCriterion("infoStock not between", value1, value2, "infostock");
            return (Criteria) this;
        }

        public Criteria andInfopostageIsNull() {
            addCriterion("infoPostage is null");
            return (Criteria) this;
        }

        public Criteria andInfopostageIsNotNull() {
            addCriterion("infoPostage is not null");
            return (Criteria) this;
        }

        public Criteria andInfopostageEqualTo(BigDecimal value) {
            addCriterion("infoPostage =", value, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageNotEqualTo(BigDecimal value) {
            addCriterion("infoPostage <>", value, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageGreaterThan(BigDecimal value) {
            addCriterion("infoPostage >", value, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("infoPostage >=", value, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageLessThan(BigDecimal value) {
            addCriterion("infoPostage <", value, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("infoPostage <=", value, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageIn(List<BigDecimal> values) {
            addCriterion("infoPostage in", values, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageNotIn(List<BigDecimal> values) {
            addCriterion("infoPostage not in", values, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoPostage between", value1, value2, "infopostage");
            return (Criteria) this;
        }

        public Criteria andInfopostageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoPostage not between", value1, value2, "infopostage");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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