package cn.ixan.elec.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElecCommonmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecCommonmsgExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(String value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(String value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(String value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(String value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(String value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(String value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLike(String value) {
            addCriterion("com_id like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotLike(String value) {
            addCriterion("com_id not like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<String> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<String> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(String value1, String value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(String value1, String value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andStationRunIsNull() {
            addCriterion("station_run is null");
            return (Criteria) this;
        }

        public Criteria andStationRunIsNotNull() {
            addCriterion("station_run is not null");
            return (Criteria) this;
        }

        public Criteria andStationRunEqualTo(String value) {
            addCriterion("station_run =", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunNotEqualTo(String value) {
            addCriterion("station_run <>", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunGreaterThan(String value) {
            addCriterion("station_run >", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunGreaterThanOrEqualTo(String value) {
            addCriterion("station_run >=", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunLessThan(String value) {
            addCriterion("station_run <", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunLessThanOrEqualTo(String value) {
            addCriterion("station_run <=", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunLike(String value) {
            addCriterion("station_run like", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunNotLike(String value) {
            addCriterion("station_run not like", value, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunIn(List<String> values) {
            addCriterion("station_run in", values, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunNotIn(List<String> values) {
            addCriterion("station_run not in", values, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunBetween(String value1, String value2) {
            addCriterion("station_run between", value1, value2, "stationRun");
            return (Criteria) this;
        }

        public Criteria andStationRunNotBetween(String value1, String value2) {
            addCriterion("station_run not between", value1, value2, "stationRun");
            return (Criteria) this;
        }

        public Criteria andDevRunIsNull() {
            addCriterion("dev_run is null");
            return (Criteria) this;
        }

        public Criteria andDevRunIsNotNull() {
            addCriterion("dev_run is not null");
            return (Criteria) this;
        }

        public Criteria andDevRunEqualTo(String value) {
            addCriterion("dev_run =", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunNotEqualTo(String value) {
            addCriterion("dev_run <>", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunGreaterThan(String value) {
            addCriterion("dev_run >", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunGreaterThanOrEqualTo(String value) {
            addCriterion("dev_run >=", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunLessThan(String value) {
            addCriterion("dev_run <", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunLessThanOrEqualTo(String value) {
            addCriterion("dev_run <=", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunLike(String value) {
            addCriterion("dev_run like", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunNotLike(String value) {
            addCriterion("dev_run not like", value, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunIn(List<String> values) {
            addCriterion("dev_run in", values, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunNotIn(List<String> values) {
            addCriterion("dev_run not in", values, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunBetween(String value1, String value2) {
            addCriterion("dev_run between", value1, value2, "devRun");
            return (Criteria) this;
        }

        public Criteria andDevRunNotBetween(String value1, String value2) {
            addCriterion("dev_run not between", value1, value2, "devRun");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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