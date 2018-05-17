package cn.ixan.elec.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ElecBuildExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecBuildExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andBuildNameIsNull() {
            addCriterion("build_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildNameIsNotNull() {
            addCriterion("build_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildNameEqualTo(String value) {
            addCriterion("build_name =", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotEqualTo(String value) {
            addCriterion("build_name <>", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameGreaterThan(String value) {
            addCriterion("build_name >", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameGreaterThanOrEqualTo(String value) {
            addCriterion("build_name >=", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameLessThan(String value) {
            addCriterion("build_name <", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameLessThanOrEqualTo(String value) {
            addCriterion("build_name <=", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameLike(String value) {
            addCriterion("build_name like", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotLike(String value) {
            addCriterion("build_name not like", value, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameIn(List<String> values) {
            addCriterion("build_name in", values, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotIn(List<String> values) {
            addCriterion("build_name not in", values, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameBetween(String value1, String value2) {
            addCriterion("build_name between", value1, value2, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildNameNotBetween(String value1, String value2) {
            addCriterion("build_name not between", value1, value2, "buildName");
            return (Criteria) this;
        }

        public Criteria andBuildTypeIsNull() {
            addCriterion("build_type is null");
            return (Criteria) this;
        }

        public Criteria andBuildTypeIsNotNull() {
            addCriterion("build_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTypeEqualTo(String value) {
            addCriterion("build_type =", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeNotEqualTo(String value) {
            addCriterion("build_type <>", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeGreaterThan(String value) {
            addCriterion("build_type >", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeGreaterThanOrEqualTo(String value) {
            addCriterion("build_type >=", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeLessThan(String value) {
            addCriterion("build_type <", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeLessThanOrEqualTo(String value) {
            addCriterion("build_type <=", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeLike(String value) {
            addCriterion("build_type like", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeNotLike(String value) {
            addCriterion("build_type not like", value, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeIn(List<String> values) {
            addCriterion("build_type in", values, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeNotIn(List<String> values) {
            addCriterion("build_type not in", values, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeBetween(String value1, String value2) {
            addCriterion("build_type between", value1, value2, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildTypeNotBetween(String value1, String value2) {
            addCriterion("build_type not between", value1, value2, "buildType");
            return (Criteria) this;
        }

        public Criteria andBuildLayerIsNull() {
            addCriterion("build_layer is null");
            return (Criteria) this;
        }

        public Criteria andBuildLayerIsNotNull() {
            addCriterion("build_layer is not null");
            return (Criteria) this;
        }

        public Criteria andBuildLayerEqualTo(Integer value) {
            addCriterion("build_layer =", value, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerNotEqualTo(Integer value) {
            addCriterion("build_layer <>", value, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerGreaterThan(Integer value) {
            addCriterion("build_layer >", value, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_layer >=", value, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerLessThan(Integer value) {
            addCriterion("build_layer <", value, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerLessThanOrEqualTo(Integer value) {
            addCriterion("build_layer <=", value, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerIn(List<Integer> values) {
            addCriterion("build_layer in", values, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerNotIn(List<Integer> values) {
            addCriterion("build_layer not in", values, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerBetween(Integer value1, Integer value2) {
            addCriterion("build_layer between", value1, value2, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("build_layer not between", value1, value2, "buildLayer");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNull() {
            addCriterion("build_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNotNull() {
            addCriterion("build_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaEqualTo(Double value) {
            addCriterion("build_area =", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotEqualTo(Double value) {
            addCriterion("build_area <>", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThan(Double value) {
            addCriterion("build_area >", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("build_area >=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThan(Double value) {
            addCriterion("build_area <", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThanOrEqualTo(Double value) {
            addCriterion("build_area <=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIn(List<Double> values) {
            addCriterion("build_area in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotIn(List<Double> values) {
            addCriterion("build_area not in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaBetween(Double value1, Double value2) {
            addCriterion("build_area between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotBetween(Double value1, Double value2) {
            addCriterion("build_area not between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateIsNull() {
            addCriterion("build_start_date is null");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateIsNotNull() {
            addCriterion("build_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("build_start_date =", value, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("build_start_date <>", value, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("build_start_date >", value, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_start_date >=", value, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateLessThan(Date value) {
            addCriterionForJDBCDate("build_start_date <", value, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_start_date <=", value, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("build_start_date in", values, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("build_start_date not in", values, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_start_date between", value1, value2, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andBuildStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_start_date not between", value1, value2, "buildStartDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateIsNull() {
            addCriterion("extend_build_date is null");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateIsNotNull() {
            addCriterion("extend_build_date is not null");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateEqualTo(Date value) {
            addCriterionForJDBCDate("extend_build_date =", value, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("extend_build_date <>", value, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateGreaterThan(Date value) {
            addCriterionForJDBCDate("extend_build_date >", value, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("extend_build_date >=", value, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateLessThan(Date value) {
            addCriterionForJDBCDate("extend_build_date <", value, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("extend_build_date <=", value, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateIn(List<Date> values) {
            addCriterionForJDBCDate("extend_build_date in", values, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("extend_build_date not in", values, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("extend_build_date between", value1, value2, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("extend_build_date not between", value1, value2, "extendBuildDate");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaIsNull() {
            addCriterion("extend_build_area is null");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaIsNotNull() {
            addCriterion("extend_build_area is not null");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaEqualTo(Double value) {
            addCriterion("extend_build_area =", value, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaNotEqualTo(Double value) {
            addCriterion("extend_build_area <>", value, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaGreaterThan(Double value) {
            addCriterion("extend_build_area >", value, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("extend_build_area >=", value, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaLessThan(Double value) {
            addCriterion("extend_build_area <", value, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaLessThanOrEqualTo(Double value) {
            addCriterion("extend_build_area <=", value, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaIn(List<Double> values) {
            addCriterion("extend_build_area in", values, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaNotIn(List<Double> values) {
            addCriterion("extend_build_area not in", values, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaBetween(Double value1, Double value2) {
            addCriterion("extend_build_area between", value1, value2, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andExtendBuildAreaNotBetween(Double value1, Double value2) {
            addCriterion("extend_build_area not between", value1, value2, "extendBuildArea");
            return (Criteria) this;
        }

        public Criteria andDxDateIsNull() {
            addCriterion("dx_date is null");
            return (Criteria) this;
        }

        public Criteria andDxDateIsNotNull() {
            addCriterion("dx_date is not null");
            return (Criteria) this;
        }

        public Criteria andDxDateEqualTo(Date value) {
            addCriterionForJDBCDate("dx_date =", value, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dx_date <>", value, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateGreaterThan(Date value) {
            addCriterionForJDBCDate("dx_date >", value, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dx_date >=", value, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateLessThan(Date value) {
            addCriterionForJDBCDate("dx_date <", value, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dx_date <=", value, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateIn(List<Date> values) {
            addCriterionForJDBCDate("dx_date in", values, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dx_date not in", values, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dx_date between", value1, value2, "dxDate");
            return (Criteria) this;
        }

        public Criteria andDxDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dx_date not between", value1, value2, "dxDate");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseIsNull() {
            addCriterion("build_expense is null");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseIsNotNull() {
            addCriterion("build_expense is not null");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseEqualTo(Double value) {
            addCriterion("build_expense =", value, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseNotEqualTo(Double value) {
            addCriterion("build_expense <>", value, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseGreaterThan(Double value) {
            addCriterion("build_expense >", value, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseGreaterThanOrEqualTo(Double value) {
            addCriterion("build_expense >=", value, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseLessThan(Double value) {
            addCriterion("build_expense <", value, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseLessThanOrEqualTo(Double value) {
            addCriterion("build_expense <=", value, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseIn(List<Double> values) {
            addCriterion("build_expense in", values, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseNotIn(List<Double> values) {
            addCriterion("build_expense not in", values, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseBetween(Double value1, Double value2) {
            addCriterion("build_expense between", value1, value2, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andBuildExpenseNotBetween(Double value1, Double value2) {
            addCriterion("build_expense not between", value1, value2, "buildExpense");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("use_date is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("use_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(Date value) {
            addCriterionForJDBCDate("use_date =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("use_date <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("use_date >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_date >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(Date value) {
            addCriterionForJDBCDate("use_date <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_date <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<Date> values) {
            addCriterionForJDBCDate("use_date in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("use_date not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_date between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_date not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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