package com.order.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class PrstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrstateExample() {
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

        public Criteria andPtotalIsNull() {
            addCriterion("ptotal is null");
            return (Criteria) this;
        }

        public Criteria andPtotalIsNotNull() {
            addCriterion("ptotal is not null");
            return (Criteria) this;
        }

        public Criteria andPtotalEqualTo(Integer value) {
            addCriterion("ptotal =", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotEqualTo(Integer value) {
            addCriterion("ptotal <>", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalGreaterThan(Integer value) {
            addCriterion("ptotal >", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptotal >=", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalLessThan(Integer value) {
            addCriterion("ptotal <", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalLessThanOrEqualTo(Integer value) {
            addCriterion("ptotal <=", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalIn(List<Integer> values) {
            addCriterion("ptotal in", values, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotIn(List<Integer> values) {
            addCriterion("ptotal not in", values, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalBetween(Integer value1, Integer value2) {
            addCriterion("ptotal between", value1, value2, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotBetween(Integer value1, Integer value2) {
            addCriterion("ptotal not between", value1, value2, "ptotal");
            return (Criteria) this;
        }

        public Criteria andXiaohaoIsNull() {
            addCriterion("xiaohao is null");
            return (Criteria) this;
        }

        public Criteria andXiaohaoIsNotNull() {
            addCriterion("xiaohao is not null");
            return (Criteria) this;
        }

        public Criteria andXiaohaoEqualTo(Double value) {
            addCriterion("xiaohao =", value, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoNotEqualTo(Double value) {
            addCriterion("xiaohao <>", value, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoGreaterThan(Double value) {
            addCriterion("xiaohao >", value, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoGreaterThanOrEqualTo(Double value) {
            addCriterion("xiaohao >=", value, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoLessThan(Double value) {
            addCriterion("xiaohao <", value, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoLessThanOrEqualTo(Double value) {
            addCriterion("xiaohao <=", value, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoIn(List<Double> values) {
            addCriterion("xiaohao in", values, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoNotIn(List<Double> values) {
            addCriterion("xiaohao not in", values, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoBetween(Double value1, Double value2) {
            addCriterion("xiaohao between", value1, value2, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andXiaohaoNotBetween(Double value1, Double value2) {
            addCriterion("xiaohao not between", value1, value2, "xiaohao");
            return (Criteria) this;
        }

        public Criteria andKhnameIsNull() {
            addCriterion("khname is null");
            return (Criteria) this;
        }

        public Criteria andKhnameIsNotNull() {
            addCriterion("khname is not null");
            return (Criteria) this;
        }

        public Criteria andKhnameEqualTo(String value) {
            addCriterion("khname =", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotEqualTo(String value) {
            addCriterion("khname <>", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameGreaterThan(String value) {
            addCriterion("khname >", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameGreaterThanOrEqualTo(String value) {
            addCriterion("khname >=", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLessThan(String value) {
            addCriterion("khname <", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLessThanOrEqualTo(String value) {
            addCriterion("khname <=", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLike(String value) {
            addCriterion("khname like", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotLike(String value) {
            addCriterion("khname not like", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameIn(List<String> values) {
            addCriterion("khname in", values, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotIn(List<String> values) {
            addCriterion("khname not in", values, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameBetween(String value1, String value2) {
            addCriterion("khname between", value1, value2, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotBetween(String value1, String value2) {
            addCriterion("khname not between", value1, value2, "khname");
            return (Criteria) this;
        }

        public Criteria andKhstateIsNull() {
            addCriterion("khstate is null");
            return (Criteria) this;
        }

        public Criteria andKhstateIsNotNull() {
            addCriterion("khstate is not null");
            return (Criteria) this;
        }

        public Criteria andKhstateEqualTo(String value) {
            addCriterion("khstate =", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateNotEqualTo(String value) {
            addCriterion("khstate <>", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateGreaterThan(String value) {
            addCriterion("khstate >", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateGreaterThanOrEqualTo(String value) {
            addCriterion("khstate >=", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateLessThan(String value) {
            addCriterion("khstate <", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateLessThanOrEqualTo(String value) {
            addCriterion("khstate <=", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateLike(String value) {
            addCriterion("khstate like", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateNotLike(String value) {
            addCriterion("khstate not like", value, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateIn(List<String> values) {
            addCriterion("khstate in", values, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateNotIn(List<String> values) {
            addCriterion("khstate not in", values, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateBetween(String value1, String value2) {
            addCriterion("khstate between", value1, value2, "khstate");
            return (Criteria) this;
        }

        public Criteria andKhstateNotBetween(String value1, String value2) {
            addCriterion("khstate not between", value1, value2, "khstate");
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