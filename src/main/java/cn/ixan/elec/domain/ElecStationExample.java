package cn.ixan.elec.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ElecStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecStationExample() {
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

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationCodeIsNull() {
            addCriterion("station_code is null");
            return (Criteria) this;
        }

        public Criteria andStationCodeIsNotNull() {
            addCriterion("station_code is not null");
            return (Criteria) this;
        }

        public Criteria andStationCodeEqualTo(String value) {
            addCriterion("station_code =", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotEqualTo(String value) {
            addCriterion("station_code <>", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeGreaterThan(String value) {
            addCriterion("station_code >", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("station_code >=", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeLessThan(String value) {
            addCriterion("station_code <", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeLessThanOrEqualTo(String value) {
            addCriterion("station_code <=", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeLike(String value) {
            addCriterion("station_code like", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotLike(String value) {
            addCriterion("station_code not like", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeIn(List<String> values) {
            addCriterion("station_code in", values, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotIn(List<String> values) {
            addCriterion("station_code not in", values, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeBetween(String value1, String value2) {
            addCriterion("station_code between", value1, value2, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotBetween(String value1, String value2) {
            addCriterion("station_code not between", value1, value2, "stationCode");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIsNull() {
            addCriterion("use_start_date is null");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIsNotNull() {
            addCriterion("use_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date =", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date <>", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("use_start_date >", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date >=", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateLessThan(Date value) {
            addCriterionForJDBCDate("use_start_date <", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_start_date <=", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("use_start_date in", values, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("use_start_date not in", values, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_start_date between", value1, value2, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_start_date not between", value1, value2, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andInstallAddressIsNull() {
            addCriterion("install_address is null");
            return (Criteria) this;
        }

        public Criteria andInstallAddressIsNotNull() {
            addCriterion("install_address is not null");
            return (Criteria) this;
        }

        public Criteria andInstallAddressEqualTo(String value) {
            addCriterion("install_address =", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressNotEqualTo(String value) {
            addCriterion("install_address <>", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressGreaterThan(String value) {
            addCriterion("install_address >", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressGreaterThanOrEqualTo(String value) {
            addCriterion("install_address >=", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressLessThan(String value) {
            addCriterion("install_address <", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressLessThanOrEqualTo(String value) {
            addCriterion("install_address <=", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressLike(String value) {
            addCriterion("install_address like", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressNotLike(String value) {
            addCriterion("install_address not like", value, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressIn(List<String> values) {
            addCriterion("install_address in", values, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressNotIn(List<String> values) {
            addCriterion("install_address not in", values, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressBetween(String value1, String value2) {
            addCriterion("install_address between", value1, value2, "installAddress");
            return (Criteria) this;
        }

        public Criteria andInstallAddressNotBetween(String value1, String value2) {
            addCriterion("install_address not between", value1, value2, "installAddress");
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

        public Criteria andContactTypeIsNull() {
            addCriterion("contact_type is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("contact_type is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("contact_type =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(String value) {
            addCriterion("contact_type <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(String value) {
            addCriterion("contact_type >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contact_type >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(String value) {
            addCriterion("contact_type <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(String value) {
            addCriterion("contact_type <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLike(String value) {
            addCriterion("contact_type like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotLike(String value) {
            addCriterion("contact_type not like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<String> values) {
            addCriterion("contact_type in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<String> values) {
            addCriterion("contact_type not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(String value1, String value2) {
            addCriterion("contact_type between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(String value1, String value2) {
            addCriterion("contact_type not between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNull() {
            addCriterion("station_type is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNotNull() {
            addCriterion("station_type is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeEqualTo(String value) {
            addCriterion("station_type =", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotEqualTo(String value) {
            addCriterion("station_type <>", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThan(String value) {
            addCriterion("station_type >", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("station_type >=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThan(String value) {
            addCriterion("station_type <", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThanOrEqualTo(String value) {
            addCriterion("station_type <=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLike(String value) {
            addCriterion("station_type like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotLike(String value) {
            addCriterion("station_type not like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIn(List<String> values) {
            addCriterion("station_type in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotIn(List<String> values) {
            addCriterion("station_type not in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeBetween(String value1, String value2) {
            addCriterion("station_type between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotBetween(String value1, String value2) {
            addCriterion("station_type not between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundIsNull() {
            addCriterion("attribute_ground is null");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundIsNotNull() {
            addCriterion("attribute_ground is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundEqualTo(String value) {
            addCriterion("attribute_ground =", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundNotEqualTo(String value) {
            addCriterion("attribute_ground <>", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundGreaterThan(String value) {
            addCriterion("attribute_ground >", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_ground >=", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundLessThan(String value) {
            addCriterion("attribute_ground <", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundLessThanOrEqualTo(String value) {
            addCriterion("attribute_ground <=", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundLike(String value) {
            addCriterion("attribute_ground like", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundNotLike(String value) {
            addCriterion("attribute_ground not like", value, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundIn(List<String> values) {
            addCriterion("attribute_ground in", values, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundNotIn(List<String> values) {
            addCriterion("attribute_ground not in", values, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundBetween(String value1, String value2) {
            addCriterion("attribute_ground between", value1, value2, "attributeGround");
            return (Criteria) this;
        }

        public Criteria andAttributeGroundNotBetween(String value1, String value2) {
            addCriterion("attribute_ground not between", value1, value2, "attributeGround");
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