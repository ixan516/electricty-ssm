package cn.ixan.elec.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ElecDevplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecDevplanExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDevTypeIsNull() {
            addCriterion("dev_type is null");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNotNull() {
            addCriterion("dev_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevTypeEqualTo(String value) {
            addCriterion("dev_type =", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotEqualTo(String value) {
            addCriterion("dev_type <>", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThan(String value) {
            addCriterion("dev_type >", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_type >=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThan(String value) {
            addCriterion("dev_type <", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThanOrEqualTo(String value) {
            addCriterion("dev_type <=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLike(String value) {
            addCriterion("dev_type like", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotLike(String value) {
            addCriterion("dev_type not like", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeIn(List<String> values) {
            addCriterion("dev_type in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotIn(List<String> values) {
            addCriterion("dev_type not in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeBetween(String value1, String value2) {
            addCriterion("dev_type between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotBetween(String value1, String value2) {
            addCriterion("dev_type not between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNull() {
            addCriterion("dev_name is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("dev_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("dev_name =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("dev_name <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("dev_name >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_name >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("dev_name <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("dev_name <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("dev_name like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("dev_name not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("dev_name in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("dev_name not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("dev_name between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("dev_name not between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andTradeMarkIsNull() {
            addCriterion("trade_mark is null");
            return (Criteria) this;
        }

        public Criteria andTradeMarkIsNotNull() {
            addCriterion("trade_mark is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMarkEqualTo(String value) {
            addCriterion("trade_mark =", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkNotEqualTo(String value) {
            addCriterion("trade_mark <>", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkGreaterThan(String value) {
            addCriterion("trade_mark >", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkGreaterThanOrEqualTo(String value) {
            addCriterion("trade_mark >=", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkLessThan(String value) {
            addCriterion("trade_mark <", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkLessThanOrEqualTo(String value) {
            addCriterion("trade_mark <=", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkLike(String value) {
            addCriterion("trade_mark like", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkNotLike(String value) {
            addCriterion("trade_mark not like", value, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkIn(List<String> values) {
            addCriterion("trade_mark in", values, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkNotIn(List<String> values) {
            addCriterion("trade_mark not in", values, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkBetween(String value1, String value2) {
            addCriterion("trade_mark between", value1, value2, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andTradeMarkNotBetween(String value1, String value2) {
            addCriterion("trade_mark not between", value1, value2, "tradeMark");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIsNull() {
            addCriterion("spec_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIsNotNull() {
            addCriterion("spec_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeEqualTo(String value) {
            addCriterion("spec_type =", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotEqualTo(String value) {
            addCriterion("spec_type <>", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeGreaterThan(String value) {
            addCriterion("spec_type >", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spec_type >=", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLessThan(String value) {
            addCriterion("spec_type <", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLessThanOrEqualTo(String value) {
            addCriterion("spec_type <=", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLike(String value) {
            addCriterion("spec_type like", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotLike(String value) {
            addCriterion("spec_type not like", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIn(List<String> values) {
            addCriterion("spec_type in", values, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotIn(List<String> values) {
            addCriterion("spec_type not in", values, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeBetween(String value1, String value2) {
            addCriterion("spec_type between", value1, value2, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotBetween(String value1, String value2) {
            addCriterion("spec_type not between", value1, value2, "specType");
            return (Criteria) this;
        }

        public Criteria andProduceHomeIsNull() {
            addCriterion("produce_home is null");
            return (Criteria) this;
        }

        public Criteria andProduceHomeIsNotNull() {
            addCriterion("produce_home is not null");
            return (Criteria) this;
        }

        public Criteria andProduceHomeEqualTo(String value) {
            addCriterion("produce_home =", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeNotEqualTo(String value) {
            addCriterion("produce_home <>", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeGreaterThan(String value) {
            addCriterion("produce_home >", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeGreaterThanOrEqualTo(String value) {
            addCriterion("produce_home >=", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeLessThan(String value) {
            addCriterion("produce_home <", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeLessThanOrEqualTo(String value) {
            addCriterion("produce_home <=", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeLike(String value) {
            addCriterion("produce_home like", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeNotLike(String value) {
            addCriterion("produce_home not like", value, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeIn(List<String> values) {
            addCriterion("produce_home in", values, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeNotIn(List<String> values) {
            addCriterion("produce_home not in", values, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeBetween(String value1, String value2) {
            addCriterion("produce_home between", value1, value2, "produceHome");
            return (Criteria) this;
        }

        public Criteria andProduceHomeNotBetween(String value1, String value2) {
            addCriterion("produce_home not between", value1, value2, "produceHome");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(Integer value) {
            addCriterion("quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(Integer value) {
            addCriterion("quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(Integer value) {
            addCriterion("quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(Integer value) {
            addCriterion("quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(Integer value) {
            addCriterion("quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<Integer> values) {
            addCriterion("quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<Integer> values) {
            addCriterion("quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(Integer value1, Integer value2) {
            addCriterion("quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQunitIsNull() {
            addCriterion("qunit is null");
            return (Criteria) this;
        }

        public Criteria andQunitIsNotNull() {
            addCriterion("qunit is not null");
            return (Criteria) this;
        }

        public Criteria andQunitEqualTo(String value) {
            addCriterion("qunit =", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitNotEqualTo(String value) {
            addCriterion("qunit <>", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitGreaterThan(String value) {
            addCriterion("qunit >", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitGreaterThanOrEqualTo(String value) {
            addCriterion("qunit >=", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitLessThan(String value) {
            addCriterion("qunit <", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitLessThanOrEqualTo(String value) {
            addCriterion("qunit <=", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitLike(String value) {
            addCriterion("qunit like", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitNotLike(String value) {
            addCriterion("qunit not like", value, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitIn(List<String> values) {
            addCriterion("qunit in", values, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitNotIn(List<String> values) {
            addCriterion("qunit not in", values, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitBetween(String value1, String value2) {
            addCriterion("qunit between", value1, value2, "qunit");
            return (Criteria) this;
        }

        public Criteria andQunitNotBetween(String value1, String value2) {
            addCriterion("qunit not between", value1, value2, "qunit");
            return (Criteria) this;
        }

        public Criteria andUsenessIsNull() {
            addCriterion("useness is null");
            return (Criteria) this;
        }

        public Criteria andUsenessIsNotNull() {
            addCriterion("useness is not null");
            return (Criteria) this;
        }

        public Criteria andUsenessEqualTo(String value) {
            addCriterion("useness =", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessNotEqualTo(String value) {
            addCriterion("useness <>", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessGreaterThan(String value) {
            addCriterion("useness >", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessGreaterThanOrEqualTo(String value) {
            addCriterion("useness >=", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessLessThan(String value) {
            addCriterion("useness <", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessLessThanOrEqualTo(String value) {
            addCriterion("useness <=", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessLike(String value) {
            addCriterion("useness like", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessNotLike(String value) {
            addCriterion("useness not like", value, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessIn(List<String> values) {
            addCriterion("useness in", values, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessNotIn(List<String> values) {
            addCriterion("useness not in", values, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessBetween(String value1, String value2) {
            addCriterion("useness between", value1, value2, "useness");
            return (Criteria) this;
        }

        public Criteria andUsenessNotBetween(String value1, String value2) {
            addCriterion("useness not between", value1, value2, "useness");
            return (Criteria) this;
        }

        public Criteria andProduceAreaIsNull() {
            addCriterion("produce_area is null");
            return (Criteria) this;
        }

        public Criteria andProduceAreaIsNotNull() {
            addCriterion("produce_area is not null");
            return (Criteria) this;
        }

        public Criteria andProduceAreaEqualTo(String value) {
            addCriterion("produce_area =", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaNotEqualTo(String value) {
            addCriterion("produce_area <>", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaGreaterThan(String value) {
            addCriterion("produce_area >", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("produce_area >=", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaLessThan(String value) {
            addCriterion("produce_area <", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaLessThanOrEqualTo(String value) {
            addCriterion("produce_area <=", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaLike(String value) {
            addCriterion("produce_area like", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaNotLike(String value) {
            addCriterion("produce_area not like", value, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaIn(List<String> values) {
            addCriterion("produce_area in", values, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaNotIn(List<String> values) {
            addCriterion("produce_area not in", values, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaBetween(String value1, String value2) {
            addCriterion("produce_area between", value1, value2, "produceArea");
            return (Criteria) this;
        }

        public Criteria andProduceAreaNotBetween(String value1, String value2) {
            addCriterion("produce_area not between", value1, value2, "produceArea");
            return (Criteria) this;
        }

        public Criteria andDevExpenseIsNull() {
            addCriterion("dev_expense is null");
            return (Criteria) this;
        }

        public Criteria andDevExpenseIsNotNull() {
            addCriterion("dev_expense is not null");
            return (Criteria) this;
        }

        public Criteria andDevExpenseEqualTo(Double value) {
            addCriterion("dev_expense =", value, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseNotEqualTo(Double value) {
            addCriterion("dev_expense <>", value, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseGreaterThan(Double value) {
            addCriterion("dev_expense >", value, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseGreaterThanOrEqualTo(Double value) {
            addCriterion("dev_expense >=", value, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseLessThan(Double value) {
            addCriterion("dev_expense <", value, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseLessThanOrEqualTo(Double value) {
            addCriterion("dev_expense <=", value, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseIn(List<Double> values) {
            addCriterion("dev_expense in", values, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseNotIn(List<Double> values) {
            addCriterion("dev_expense not in", values, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseBetween(Double value1, Double value2) {
            addCriterion("dev_expense between", value1, value2, "devExpense");
            return (Criteria) this;
        }

        public Criteria andDevExpenseNotBetween(Double value1, Double value2) {
            addCriterion("dev_expense not between", value1, value2, "devExpense");
            return (Criteria) this;
        }

        public Criteria andUseUnitIsNull() {
            addCriterion("use_unit is null");
            return (Criteria) this;
        }

        public Criteria andUseUnitIsNotNull() {
            addCriterion("use_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUseUnitEqualTo(String value) {
            addCriterion("use_unit =", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotEqualTo(String value) {
            addCriterion("use_unit <>", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitGreaterThan(String value) {
            addCriterion("use_unit >", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("use_unit >=", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitLessThan(String value) {
            addCriterion("use_unit <", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitLessThanOrEqualTo(String value) {
            addCriterion("use_unit <=", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitLike(String value) {
            addCriterion("use_unit like", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotLike(String value) {
            addCriterion("use_unit not like", value, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitIn(List<String> values) {
            addCriterion("use_unit in", values, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotIn(List<String> values) {
            addCriterion("use_unit not in", values, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitBetween(String value1, String value2) {
            addCriterion("use_unit between", value1, value2, "useUnit");
            return (Criteria) this;
        }

        public Criteria andUseUnitNotBetween(String value1, String value2) {
            addCriterion("use_unit not between", value1, value2, "useUnit");
            return (Criteria) this;
        }

        public Criteria andJctIdIsNull() {
            addCriterion("jct_id is null");
            return (Criteria) this;
        }

        public Criteria andJctIdIsNotNull() {
            addCriterion("jct_id is not null");
            return (Criteria) this;
        }

        public Criteria andJctIdEqualTo(String value) {
            addCriterion("jct_id =", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdNotEqualTo(String value) {
            addCriterion("jct_id <>", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdGreaterThan(String value) {
            addCriterion("jct_id >", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdGreaterThanOrEqualTo(String value) {
            addCriterion("jct_id >=", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdLessThan(String value) {
            addCriterion("jct_id <", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdLessThanOrEqualTo(String value) {
            addCriterion("jct_id <=", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdLike(String value) {
            addCriterion("jct_id like", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdNotLike(String value) {
            addCriterion("jct_id not like", value, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdIn(List<String> values) {
            addCriterion("jct_id in", values, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdNotIn(List<String> values) {
            addCriterion("jct_id not in", values, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdBetween(String value1, String value2) {
            addCriterion("jct_id between", value1, value2, "jctId");
            return (Criteria) this;
        }

        public Criteria andJctIdNotBetween(String value1, String value2) {
            addCriterion("jct_id not between", value1, value2, "jctId");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterionForJDBCDate("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodIsNull() {
            addCriterion("adjust_period is null");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodIsNotNull() {
            addCriterion("adjust_period is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodEqualTo(String value) {
            addCriterion("adjust_period =", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodNotEqualTo(String value) {
            addCriterion("adjust_period <>", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodGreaterThan(String value) {
            addCriterion("adjust_period >", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_period >=", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodLessThan(String value) {
            addCriterion("adjust_period <", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodLessThanOrEqualTo(String value) {
            addCriterion("adjust_period <=", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodLike(String value) {
            addCriterion("adjust_period like", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodNotLike(String value) {
            addCriterion("adjust_period not like", value, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodIn(List<String> values) {
            addCriterion("adjust_period in", values, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodNotIn(List<String> values) {
            addCriterion("adjust_period not in", values, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodBetween(String value1, String value2) {
            addCriterion("adjust_period between", value1, value2, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andAdjustPeriodNotBetween(String value1, String value2) {
            addCriterion("adjust_period not between", value1, value2, "adjustPeriod");
            return (Criteria) this;
        }

        public Criteria andApUnitIsNull() {
            addCriterion("ap_unit is null");
            return (Criteria) this;
        }

        public Criteria andApUnitIsNotNull() {
            addCriterion("ap_unit is not null");
            return (Criteria) this;
        }

        public Criteria andApUnitEqualTo(String value) {
            addCriterion("ap_unit =", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitNotEqualTo(String value) {
            addCriterion("ap_unit <>", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitGreaterThan(String value) {
            addCriterion("ap_unit >", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ap_unit >=", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitLessThan(String value) {
            addCriterion("ap_unit <", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitLessThanOrEqualTo(String value) {
            addCriterion("ap_unit <=", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitLike(String value) {
            addCriterion("ap_unit like", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitNotLike(String value) {
            addCriterion("ap_unit not like", value, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitIn(List<String> values) {
            addCriterion("ap_unit in", values, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitNotIn(List<String> values) {
            addCriterion("ap_unit not in", values, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitBetween(String value1, String value2) {
            addCriterion("ap_unit between", value1, value2, "apUnit");
            return (Criteria) this;
        }

        public Criteria andApUnitNotBetween(String value1, String value2) {
            addCriterion("ap_unit not between", value1, value2, "apUnit");
            return (Criteria) this;
        }

        public Criteria andRepairCycleIsNull() {
            addCriterion("repair_cycle is null");
            return (Criteria) this;
        }

        public Criteria andRepairCycleIsNotNull() {
            addCriterion("repair_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCycleEqualTo(String value) {
            addCriterion("repair_cycle =", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleNotEqualTo(String value) {
            addCriterion("repair_cycle <>", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleGreaterThan(String value) {
            addCriterion("repair_cycle >", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleGreaterThanOrEqualTo(String value) {
            addCriterion("repair_cycle >=", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleLessThan(String value) {
            addCriterion("repair_cycle <", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleLessThanOrEqualTo(String value) {
            addCriterion("repair_cycle <=", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleLike(String value) {
            addCriterion("repair_cycle like", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleNotLike(String value) {
            addCriterion("repair_cycle not like", value, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleIn(List<String> values) {
            addCriterion("repair_cycle in", values, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleNotIn(List<String> values) {
            addCriterion("repair_cycle not in", values, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleBetween(String value1, String value2) {
            addCriterion("repair_cycle between", value1, value2, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andRepairCycleNotBetween(String value1, String value2) {
            addCriterion("repair_cycle not between", value1, value2, "repairCycle");
            return (Criteria) this;
        }

        public Criteria andOpUnitIsNull() {
            addCriterion("op_unit is null");
            return (Criteria) this;
        }

        public Criteria andOpUnitIsNotNull() {
            addCriterion("op_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOpUnitEqualTo(String value) {
            addCriterion("op_unit =", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitNotEqualTo(String value) {
            addCriterion("op_unit <>", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitGreaterThan(String value) {
            addCriterion("op_unit >", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitGreaterThanOrEqualTo(String value) {
            addCriterion("op_unit >=", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitLessThan(String value) {
            addCriterion("op_unit <", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitLessThanOrEqualTo(String value) {
            addCriterion("op_unit <=", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitLike(String value) {
            addCriterion("op_unit like", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitNotLike(String value) {
            addCriterion("op_unit not like", value, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitIn(List<String> values) {
            addCriterion("op_unit in", values, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitNotIn(List<String> values) {
            addCriterion("op_unit not in", values, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitBetween(String value1, String value2) {
            addCriterion("op_unit between", value1, value2, "opUnit");
            return (Criteria) this;
        }

        public Criteria andOpUnitNotBetween(String value1, String value2) {
            addCriterion("op_unit not between", value1, value2, "opUnit");
            return (Criteria) this;
        }

        public Criteria andConfigureIsNull() {
            addCriterion("configure is null");
            return (Criteria) this;
        }

        public Criteria andConfigureIsNotNull() {
            addCriterion("configure is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureEqualTo(String value) {
            addCriterion("configure =", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotEqualTo(String value) {
            addCriterion("configure <>", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureGreaterThan(String value) {
            addCriterion("configure >", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureGreaterThanOrEqualTo(String value) {
            addCriterion("configure >=", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureLessThan(String value) {
            addCriterion("configure <", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureLessThanOrEqualTo(String value) {
            addCriterion("configure <=", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureLike(String value) {
            addCriterion("configure like", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotLike(String value) {
            addCriterion("configure not like", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureIn(List<String> values) {
            addCriterion("configure in", values, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotIn(List<String> values) {
            addCriterion("configure not in", values, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureBetween(String value1, String value2) {
            addCriterion("configure between", value1, value2, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotBetween(String value1, String value2) {
            addCriterion("configure not between", value1, value2, "configure");
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