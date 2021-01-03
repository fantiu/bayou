package com.bayou.service.vango.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PayListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PayListExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andUserUidIsNull() {
            addCriterion("user_uid is null");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNotNull() {
            addCriterion("user_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUidEqualTo(Long value) {
            addCriterion("user_uid =", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotEqualTo(Long value) {
            addCriterion("user_uid <>", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThan(Long value) {
            addCriterion("user_uid >", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThanOrEqualTo(Long value) {
            addCriterion("user_uid >=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThan(Long value) {
            addCriterion("user_uid <", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThanOrEqualTo(Long value) {
            addCriterion("user_uid <=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidIn(List<Long> values) {
            addCriterion("user_uid in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotIn(List<Long> values) {
            addCriterion("user_uid not in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidBetween(Long value1, Long value2) {
            addCriterion("user_uid between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotBetween(Long value1, Long value2) {
            addCriterion("user_uid not between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(Long value) {
            addCriterion("pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(Long value) {
            addCriterion("pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(Long value) {
            addCriterion("pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(Long value) {
            addCriterion("pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(Long value) {
            addCriterion("pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<Long> values) {
            addCriterion("pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<Long> values) {
            addCriterion("pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(Long value1, Long value2) {
            addCriterion("pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(Long value1, Long value2) {
            addCriterion("pay_no not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Short value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Short value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Short value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Short value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Short value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Short> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Short> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Short value1, Short value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Short value1, Short value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderUidIsNull() {
            addCriterion("order_uid is null");
            return (Criteria) this;
        }

        public Criteria andOrderUidIsNotNull() {
            addCriterion("order_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUidEqualTo(Long value) {
            addCriterion("order_uid =", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotEqualTo(Long value) {
            addCriterion("order_uid <>", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidGreaterThan(Long value) {
            addCriterion("order_uid >", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidGreaterThanOrEqualTo(Long value) {
            addCriterion("order_uid >=", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidLessThan(Long value) {
            addCriterion("order_uid <", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidLessThanOrEqualTo(Long value) {
            addCriterion("order_uid <=", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidIn(List<Long> values) {
            addCriterion("order_uid in", values, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotIn(List<Long> values) {
            addCriterion("order_uid not in", values, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidBetween(Long value1, Long value2) {
            addCriterion("order_uid between", value1, value2, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotBetween(Long value1, Long value2) {
            addCriterion("order_uid not between", value1, value2, "orderUid");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Byte value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Byte value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Byte value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Byte value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Byte value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Byte> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Byte> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Byte value1, Byte value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Short value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Short value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Short value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Short value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Short value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Short value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Short> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Short> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Short value1, Short value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Short value1, Short value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(Short value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(Short value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(Short value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(Short value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(Short value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<Short> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<Short> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(Short value1, Short value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(Short value1, Short value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNull() {
            addCriterion("return_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("return_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(Short value) {
            addCriterion("return_status =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(Short value) {
            addCriterion("return_status <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(Short value) {
            addCriterion("return_status >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("return_status >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(Short value) {
            addCriterion("return_status <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(Short value) {
            addCriterion("return_status <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<Short> values) {
            addCriterion("return_status in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<Short> values) {
            addCriterion("return_status not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(Short value1, Short value2) {
            addCriterion("return_status between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(Short value1, Short value2) {
            addCriterion("return_status not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(BigDecimal value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(BigDecimal value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<BigDecimal> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNull() {
            addCriterion("result_code is null");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNotNull() {
            addCriterion("result_code is not null");
            return (Criteria) this;
        }

        public Criteria andResultCodeEqualTo(String value) {
            addCriterion("result_code =", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotEqualTo(String value) {
            addCriterion("result_code <>", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThan(String value) {
            addCriterion("result_code >", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("result_code >=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThan(String value) {
            addCriterion("result_code <", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThanOrEqualTo(String value) {
            addCriterion("result_code <=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLike(String value) {
            addCriterion("result_code like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotLike(String value) {
            addCriterion("result_code not like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeIn(List<String> values) {
            addCriterion("result_code in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotIn(List<String> values) {
            addCriterion("result_code not in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeBetween(String value1, String value2) {
            addCriterion("result_code between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotBetween(String value1, String value2) {
            addCriterion("result_code not between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrIsNull() {
            addCriterion("err_code_str is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrIsNotNull() {
            addCriterion("err_code_str is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrEqualTo(String value) {
            addCriterion("err_code_str =", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrNotEqualTo(String value) {
            addCriterion("err_code_str <>", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrGreaterThan(String value) {
            addCriterion("err_code_str >", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrGreaterThanOrEqualTo(String value) {
            addCriterion("err_code_str >=", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrLessThan(String value) {
            addCriterion("err_code_str <", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrLessThanOrEqualTo(String value) {
            addCriterion("err_code_str <=", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrLike(String value) {
            addCriterion("err_code_str like", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrNotLike(String value) {
            addCriterion("err_code_str not like", value, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrIn(List<String> values) {
            addCriterion("err_code_str in", values, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrNotIn(List<String> values) {
            addCriterion("err_code_str not in", values, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrBetween(String value1, String value2) {
            addCriterion("err_code_str between", value1, value2, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andErrCodeStrNotBetween(String value1, String value2) {
            addCriterion("err_code_str not between", value1, value2, "errCodeStr");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andIp2longIsNull() {
            addCriterion("ip2long is null");
            return (Criteria) this;
        }

        public Criteria andIp2longIsNotNull() {
            addCriterion("ip2long is not null");
            return (Criteria) this;
        }

        public Criteria andIp2longEqualTo(Integer value) {
            addCriterion("ip2long =", value, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longNotEqualTo(Integer value) {
            addCriterion("ip2long <>", value, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longGreaterThan(Integer value) {
            addCriterion("ip2long >", value, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longGreaterThanOrEqualTo(Integer value) {
            addCriterion("ip2long >=", value, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longLessThan(Integer value) {
            addCriterion("ip2long <", value, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longLessThanOrEqualTo(Integer value) {
            addCriterion("ip2long <=", value, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longIn(List<Integer> values) {
            addCriterion("ip2long in", values, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longNotIn(List<Integer> values) {
            addCriterion("ip2long not in", values, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longBetween(Integer value1, Integer value2) {
            addCriterion("ip2long between", value1, value2, "ip2long");
            return (Criteria) this;
        }

        public Criteria andIp2longNotBetween(Integer value1, Integer value2) {
            addCriterion("ip2long not between", value1, value2, "ip2long");
            return (Criteria) this;
        }

        public Criteria andPostJsonIsNull() {
            addCriterion("post_json is null");
            return (Criteria) this;
        }

        public Criteria andPostJsonIsNotNull() {
            addCriterion("post_json is not null");
            return (Criteria) this;
        }

        public Criteria andPostJsonEqualTo(String value) {
            addCriterion("post_json =", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonNotEqualTo(String value) {
            addCriterion("post_json <>", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonGreaterThan(String value) {
            addCriterion("post_json >", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonGreaterThanOrEqualTo(String value) {
            addCriterion("post_json >=", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonLessThan(String value) {
            addCriterion("post_json <", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonLessThanOrEqualTo(String value) {
            addCriterion("post_json <=", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonLike(String value) {
            addCriterion("post_json like", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonNotLike(String value) {
            addCriterion("post_json not like", value, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonIn(List<String> values) {
            addCriterion("post_json in", values, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonNotIn(List<String> values) {
            addCriterion("post_json not in", values, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonBetween(String value1, String value2) {
            addCriterion("post_json between", value1, value2, "postJson");
            return (Criteria) this;
        }

        public Criteria andPostJsonNotBetween(String value1, String value2) {
            addCriterion("post_json not between", value1, value2, "postJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonIsNull() {
            addCriterion("return_json is null");
            return (Criteria) this;
        }

        public Criteria andReturnJsonIsNotNull() {
            addCriterion("return_json is not null");
            return (Criteria) this;
        }

        public Criteria andReturnJsonEqualTo(String value) {
            addCriterion("return_json =", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonNotEqualTo(String value) {
            addCriterion("return_json <>", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonGreaterThan(String value) {
            addCriterion("return_json >", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonGreaterThanOrEqualTo(String value) {
            addCriterion("return_json >=", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonLessThan(String value) {
            addCriterion("return_json <", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonLessThanOrEqualTo(String value) {
            addCriterion("return_json <=", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonLike(String value) {
            addCriterion("return_json like", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonNotLike(String value) {
            addCriterion("return_json not like", value, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonIn(List<String> values) {
            addCriterion("return_json in", values, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonNotIn(List<String> values) {
            addCriterion("return_json not in", values, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonBetween(String value1, String value2) {
            addCriterion("return_json between", value1, value2, "returnJson");
            return (Criteria) this;
        }

        public Criteria andReturnJsonNotBetween(String value1, String value2) {
            addCriterion("return_json not between", value1, value2, "returnJson");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Integer value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Integer value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Integer value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Integer value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Integer value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Integer> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Integer> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Integer value1, Integer value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andSuccessAtIsNull() {
            addCriterion("success_at is null");
            return (Criteria) this;
        }

        public Criteria andSuccessAtIsNotNull() {
            addCriterion("success_at is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessAtEqualTo(Integer value) {
            addCriterion("success_at =", value, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtNotEqualTo(Integer value) {
            addCriterion("success_at <>", value, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtGreaterThan(Integer value) {
            addCriterion("success_at >", value, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_at >=", value, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtLessThan(Integer value) {
            addCriterion("success_at <", value, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtLessThanOrEqualTo(Integer value) {
            addCriterion("success_at <=", value, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtIn(List<Integer> values) {
            addCriterion("success_at in", values, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtNotIn(List<Integer> values) {
            addCriterion("success_at not in", values, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtBetween(Integer value1, Integer value2) {
            addCriterion("success_at between", value1, value2, "successAt");
            return (Criteria) this;
        }

        public Criteria andSuccessAtNotBetween(Integer value1, Integer value2) {
            addCriterion("success_at not between", value1, value2, "successAt");
            return (Criteria) this;
        }

        public Criteria andProcedureKbIsNull() {
            addCriterion("procedure_kb is null");
            return (Criteria) this;
        }

        public Criteria andProcedureKbIsNotNull() {
            addCriterion("procedure_kb is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureKbEqualTo(Integer value) {
            addCriterion("procedure_kb =", value, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbNotEqualTo(Integer value) {
            addCriterion("procedure_kb <>", value, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbGreaterThan(Integer value) {
            addCriterion("procedure_kb >", value, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbGreaterThanOrEqualTo(Integer value) {
            addCriterion("procedure_kb >=", value, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbLessThan(Integer value) {
            addCriterion("procedure_kb <", value, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbLessThanOrEqualTo(Integer value) {
            addCriterion("procedure_kb <=", value, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbIn(List<Integer> values) {
            addCriterion("procedure_kb in", values, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbNotIn(List<Integer> values) {
            addCriterion("procedure_kb not in", values, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbBetween(Integer value1, Integer value2) {
            addCriterion("procedure_kb between", value1, value2, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureKbNotBetween(Integer value1, Integer value2) {
            addCriterion("procedure_kb not between", value1, value2, "procedureKb");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeIsNull() {
            addCriterion("procedure_fee is null");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeIsNotNull() {
            addCriterion("procedure_fee is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeEqualTo(BigDecimal value) {
            addCriterion("procedure_fee =", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeNotEqualTo(BigDecimal value) {
            addCriterion("procedure_fee <>", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeGreaterThan(BigDecimal value) {
            addCriterion("procedure_fee >", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_fee >=", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeLessThan(BigDecimal value) {
            addCriterion("procedure_fee <", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("procedure_fee <=", value, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeIn(List<BigDecimal> values) {
            addCriterion("procedure_fee in", values, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeNotIn(List<BigDecimal> values) {
            addCriterion("procedure_fee not in", values, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_fee between", value1, value2, "procedureFee");
            return (Criteria) this;
        }

        public Criteria andProcedureFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("procedure_fee not between", value1, value2, "procedureFee");
            return (Criteria) this;
        }
    }

    /**
     */
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