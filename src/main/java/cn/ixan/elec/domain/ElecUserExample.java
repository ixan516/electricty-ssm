package cn.ixan.elec.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ElecUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElecUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLogonNameIsNull() {
            addCriterion("logon_name is null");
            return (Criteria) this;
        }

        public Criteria andLogonNameIsNotNull() {
            addCriterion("logon_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogonNameEqualTo(String value) {
            addCriterion("logon_name =", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameNotEqualTo(String value) {
            addCriterion("logon_name <>", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameGreaterThan(String value) {
            addCriterion("logon_name >", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameGreaterThanOrEqualTo(String value) {
            addCriterion("logon_name >=", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameLessThan(String value) {
            addCriterion("logon_name <", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameLessThanOrEqualTo(String value) {
            addCriterion("logon_name <=", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameLike(String value) {
            addCriterion("logon_name like", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameNotLike(String value) {
            addCriterion("logon_name not like", value, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameIn(List<String> values) {
            addCriterion("logon_name in", values, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameNotIn(List<String> values) {
            addCriterion("logon_name not in", values, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameBetween(String value1, String value2) {
            addCriterion("logon_name between", value1, value2, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonNameNotBetween(String value1, String value2) {
            addCriterion("logon_name not between", value1, value2, "logonName");
            return (Criteria) this;
        }

        public Criteria andLogonPwdIsNull() {
            addCriterion("logon_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLogonPwdIsNotNull() {
            addCriterion("logon_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLogonPwdEqualTo(String value) {
            addCriterion("logon_pwd =", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdNotEqualTo(String value) {
            addCriterion("logon_pwd <>", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdGreaterThan(String value) {
            addCriterion("logon_pwd >", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdGreaterThanOrEqualTo(String value) {
            addCriterion("logon_pwd >=", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdLessThan(String value) {
            addCriterion("logon_pwd <", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdLessThanOrEqualTo(String value) {
            addCriterion("logon_pwd <=", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdLike(String value) {
            addCriterion("logon_pwd like", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdNotLike(String value) {
            addCriterion("logon_pwd not like", value, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdIn(List<String> values) {
            addCriterion("logon_pwd in", values, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdNotIn(List<String> values) {
            addCriterion("logon_pwd not in", values, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdBetween(String value1, String value2) {
            addCriterion("logon_pwd between", value1, value2, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andLogonPwdNotBetween(String value1, String value2) {
            addCriterion("logon_pwd not between", value1, value2, "logonPwd");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNull() {
            addCriterion("sex_id is null");
            return (Criteria) this;
        }

        public Criteria andSexIdIsNotNull() {
            addCriterion("sex_id is not null");
            return (Criteria) this;
        }

        public Criteria andSexIdEqualTo(String value) {
            addCriterion("sex_id =", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotEqualTo(String value) {
            addCriterion("sex_id <>", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThan(String value) {
            addCriterion("sex_id >", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdGreaterThanOrEqualTo(String value) {
            addCriterion("sex_id >=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThan(String value) {
            addCriterion("sex_id <", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLessThanOrEqualTo(String value) {
            addCriterion("sex_id <=", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdLike(String value) {
            addCriterion("sex_id like", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotLike(String value) {
            addCriterion("sex_id not like", value, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdIn(List<String> values) {
            addCriterion("sex_id in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotIn(List<String> values) {
            addCriterion("sex_id not in", values, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdBetween(String value1, String value2) {
            addCriterion("sex_id between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andSexIdNotBetween(String value1, String value2) {
            addCriterion("sex_id not between", value1, value2, "sexId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
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

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andIsDutyIsNull() {
            addCriterion("is_duty is null");
            return (Criteria) this;
        }

        public Criteria andIsDutyIsNotNull() {
            addCriterion("is_duty is not null");
            return (Criteria) this;
        }

        public Criteria andIsDutyEqualTo(String value) {
            addCriterion("is_duty =", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyNotEqualTo(String value) {
            addCriterion("is_duty <>", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyGreaterThan(String value) {
            addCriterion("is_duty >", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyGreaterThanOrEqualTo(String value) {
            addCriterion("is_duty >=", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyLessThan(String value) {
            addCriterion("is_duty <", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyLessThanOrEqualTo(String value) {
            addCriterion("is_duty <=", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyLike(String value) {
            addCriterion("is_duty like", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyNotLike(String value) {
            addCriterion("is_duty not like", value, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyIn(List<String> values) {
            addCriterion("is_duty in", values, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyNotIn(List<String> values) {
            addCriterion("is_duty not in", values, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyBetween(String value1, String value2) {
            addCriterion("is_duty between", value1, value2, "isDuty");
            return (Criteria) this;
        }

        public Criteria andIsDutyNotBetween(String value1, String value2) {
            addCriterion("is_duty not between", value1, value2, "isDuty");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("post_id like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("post_id not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateIsNull() {
            addCriterion("on_duty_date is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateIsNotNull() {
            addCriterion("on_duty_date is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateEqualTo(Date value) {
            addCriterionForJDBCDate("on_duty_date =", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("on_duty_date <>", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("on_duty_date >", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("on_duty_date >=", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateLessThan(Date value) {
            addCriterionForJDBCDate("on_duty_date <", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("on_duty_date <=", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateIn(List<Date> values) {
            addCriterionForJDBCDate("on_duty_date in", values, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("on_duty_date not in", values, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("on_duty_date between", value1, value2, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("on_duty_date not between", value1, value2, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateIsNull() {
            addCriterion("off_duty_date is null");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateIsNotNull() {
            addCriterion("off_duty_date is not null");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateEqualTo(Date value) {
            addCriterionForJDBCDate("off_duty_date =", value, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("off_duty_date <>", value, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("off_duty_date >", value, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("off_duty_date >=", value, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateLessThan(Date value) {
            addCriterionForJDBCDate("off_duty_date <", value, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("off_duty_date <=", value, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateIn(List<Date> values) {
            addCriterionForJDBCDate("off_duty_date in", values, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("off_duty_date not in", values, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("off_duty_date between", value1, value2, "offDutyDate");
            return (Criteria) this;
        }

        public Criteria andOffDutyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("off_duty_date not between", value1, value2, "offDutyDate");
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