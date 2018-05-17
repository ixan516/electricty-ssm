package cn.ixan.elec.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ElecRunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecRunExample() {
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

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(String value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(String value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(String value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(String value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(String value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLike(String value) {
            addCriterion("station_id like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotLike(String value) {
            addCriterion("station_id not like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<String> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<String> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(String value1, String value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(String value1, String value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andBugTypeIsNull() {
            addCriterion("bug_type is null");
            return (Criteria) this;
        }

        public Criteria andBugTypeIsNotNull() {
            addCriterion("bug_type is not null");
            return (Criteria) this;
        }

        public Criteria andBugTypeEqualTo(String value) {
            addCriterion("bug_type =", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotEqualTo(String value) {
            addCriterion("bug_type <>", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeGreaterThan(String value) {
            addCriterion("bug_type >", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bug_type >=", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeLessThan(String value) {
            addCriterion("bug_type <", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeLessThanOrEqualTo(String value) {
            addCriterion("bug_type <=", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeLike(String value) {
            addCriterion("bug_type like", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotLike(String value) {
            addCriterion("bug_type not like", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeIn(List<String> values) {
            addCriterion("bug_type in", values, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotIn(List<String> values) {
            addCriterion("bug_type not in", values, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeBetween(String value1, String value2) {
            addCriterion("bug_type between", value1, value2, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotBetween(String value1, String value2) {
            addCriterion("bug_type not between", value1, value2, "bugType");
            return (Criteria) this;
        }

        public Criteria andOccurDateIsNull() {
            addCriterion("occur_date is null");
            return (Criteria) this;
        }

        public Criteria andOccurDateIsNotNull() {
            addCriterion("occur_date is not null");
            return (Criteria) this;
        }

        public Criteria andOccurDateEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date =", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date <>", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateGreaterThan(Date value) {
            addCriterionForJDBCDate("occur_date >", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date >=", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateLessThan(Date value) {
            addCriterionForJDBCDate("occur_date <", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("occur_date <=", value, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateIn(List<Date> values) {
            addCriterionForJDBCDate("occur_date in", values, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("occur_date not in", values, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("occur_date between", value1, value2, "occurDate");
            return (Criteria) this;
        }

        public Criteria andOccurDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("occur_date not between", value1, value2, "occurDate");
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

        public Criteria andBugDescIsNull() {
            addCriterion("bug_desc is null");
            return (Criteria) this;
        }

        public Criteria andBugDescIsNotNull() {
            addCriterion("bug_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBugDescEqualTo(String value) {
            addCriterion("bug_desc =", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotEqualTo(String value) {
            addCriterion("bug_desc <>", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescGreaterThan(String value) {
            addCriterion("bug_desc >", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescGreaterThanOrEqualTo(String value) {
            addCriterion("bug_desc >=", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescLessThan(String value) {
            addCriterion("bug_desc <", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescLessThanOrEqualTo(String value) {
            addCriterion("bug_desc <=", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescLike(String value) {
            addCriterion("bug_desc like", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotLike(String value) {
            addCriterion("bug_desc not like", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescIn(List<String> values) {
            addCriterion("bug_desc in", values, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotIn(List<String> values) {
            addCriterion("bug_desc not in", values, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescBetween(String value1, String value2) {
            addCriterion("bug_desc between", value1, value2, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotBetween(String value1, String value2) {
            addCriterion("bug_desc not between", value1, value2, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andResolveDateIsNull() {
            addCriterion("resolve_date is null");
            return (Criteria) this;
        }

        public Criteria andResolveDateIsNotNull() {
            addCriterion("resolve_date is not null");
            return (Criteria) this;
        }

        public Criteria andResolveDateEqualTo(Date value) {
            addCriterionForJDBCDate("resolve_date =", value, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("resolve_date <>", value, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("resolve_date >", value, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resolve_date >=", value, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateLessThan(Date value) {
            addCriterionForJDBCDate("resolve_date <", value, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resolve_date <=", value, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateIn(List<Date> values) {
            addCriterionForJDBCDate("resolve_date in", values, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("resolve_date not in", values, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resolve_date between", value1, value2, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resolve_date not between", value1, value2, "resolveDate");
            return (Criteria) this;
        }

        public Criteria andResolveMethodIsNull() {
            addCriterion("resolve_method is null");
            return (Criteria) this;
        }

        public Criteria andResolveMethodIsNotNull() {
            addCriterion("resolve_method is not null");
            return (Criteria) this;
        }

        public Criteria andResolveMethodEqualTo(String value) {
            addCriterion("resolve_method =", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodNotEqualTo(String value) {
            addCriterion("resolve_method <>", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodGreaterThan(String value) {
            addCriterion("resolve_method >", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodGreaterThanOrEqualTo(String value) {
            addCriterion("resolve_method >=", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodLessThan(String value) {
            addCriterion("resolve_method <", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodLessThanOrEqualTo(String value) {
            addCriterion("resolve_method <=", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodLike(String value) {
            addCriterion("resolve_method like", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodNotLike(String value) {
            addCriterion("resolve_method not like", value, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodIn(List<String> values) {
            addCriterion("resolve_method in", values, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodNotIn(List<String> values) {
            addCriterion("resolve_method not in", values, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodBetween(String value1, String value2) {
            addCriterion("resolve_method between", value1, value2, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andResolveMethodNotBetween(String value1, String value2) {
            addCriterion("resolve_method not between", value1, value2, "resolveMethod");
            return (Criteria) this;
        }

        public Criteria andBugReasonIsNull() {
            addCriterion("bug_reason is null");
            return (Criteria) this;
        }

        public Criteria andBugReasonIsNotNull() {
            addCriterion("bug_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBugReasonEqualTo(String value) {
            addCriterion("bug_reason =", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotEqualTo(String value) {
            addCriterion("bug_reason <>", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonGreaterThan(String value) {
            addCriterion("bug_reason >", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonGreaterThanOrEqualTo(String value) {
            addCriterion("bug_reason >=", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonLessThan(String value) {
            addCriterion("bug_reason <", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonLessThanOrEqualTo(String value) {
            addCriterion("bug_reason <=", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonLike(String value) {
            addCriterion("bug_reason like", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotLike(String value) {
            addCriterion("bug_reason not like", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonIn(List<String> values) {
            addCriterion("bug_reason in", values, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotIn(List<String> values) {
            addCriterion("bug_reason not in", values, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonBetween(String value1, String value2) {
            addCriterion("bug_reason between", value1, value2, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotBetween(String value1, String value2) {
            addCriterion("bug_reason not between", value1, value2, "bugReason");
            return (Criteria) this;
        }

        public Criteria andSbMonthIsNull() {
            addCriterion("sb_month is null");
            return (Criteria) this;
        }

        public Criteria andSbMonthIsNotNull() {
            addCriterion("sb_month is not null");
            return (Criteria) this;
        }

        public Criteria andSbMonthEqualTo(String value) {
            addCriterion("sb_month =", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthNotEqualTo(String value) {
            addCriterion("sb_month <>", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthGreaterThan(String value) {
            addCriterion("sb_month >", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthGreaterThanOrEqualTo(String value) {
            addCriterion("sb_month >=", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthLessThan(String value) {
            addCriterion("sb_month <", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthLessThanOrEqualTo(String value) {
            addCriterion("sb_month <=", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthLike(String value) {
            addCriterion("sb_month like", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthNotLike(String value) {
            addCriterion("sb_month not like", value, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthIn(List<String> values) {
            addCriterion("sb_month in", values, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthNotIn(List<String> values) {
            addCriterion("sb_month not in", values, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthBetween(String value1, String value2) {
            addCriterion("sb_month between", value1, value2, "sbMonth");
            return (Criteria) this;
        }

        public Criteria andSbMonthNotBetween(String value1, String value2) {
            addCriterion("sb_month not between", value1, value2, "sbMonth");
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