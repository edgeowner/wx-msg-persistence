package com.atmatrix.wechat.infrastructure.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatMessageExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(String value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(String value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(String value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(String value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(String value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLike(String value) {
            addCriterion("msg_id like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotLike(String value) {
            addCriterion("msg_id not like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<String> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<String> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(String value1, String value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(String value1, String value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidIsNull() {
            addCriterion("msg_fwxid is null");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidIsNotNull() {
            addCriterion("msg_fwxid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidEqualTo(String value) {
            addCriterion("msg_fwxid =", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidNotEqualTo(String value) {
            addCriterion("msg_fwxid <>", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidGreaterThan(String value) {
            addCriterion("msg_fwxid >", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidGreaterThanOrEqualTo(String value) {
            addCriterion("msg_fwxid >=", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidLessThan(String value) {
            addCriterion("msg_fwxid <", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidLessThanOrEqualTo(String value) {
            addCriterion("msg_fwxid <=", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidLike(String value) {
            addCriterion("msg_fwxid like", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidNotLike(String value) {
            addCriterion("msg_fwxid not like", value, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidIn(List<String> values) {
            addCriterion("msg_fwxid in", values, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidNotIn(List<String> values) {
            addCriterion("msg_fwxid not in", values, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidBetween(String value1, String value2) {
            addCriterion("msg_fwxid between", value1, value2, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgFwxidNotBetween(String value1, String value2) {
            addCriterion("msg_fwxid not between", value1, value2, "msgFwxid");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(Integer value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(Integer value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(Integer value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(Integer value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<Integer> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<Integer> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(Integer value1, Integer value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgUrlIsNull() {
            addCriterion("msg_url is null");
            return (Criteria) this;
        }

        public Criteria andMsgUrlIsNotNull() {
            addCriterion("msg_url is not null");
            return (Criteria) this;
        }

        public Criteria andMsgUrlEqualTo(String value) {
            addCriterion("msg_url =", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlNotEqualTo(String value) {
            addCriterion("msg_url <>", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlGreaterThan(String value) {
            addCriterion("msg_url >", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("msg_url >=", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlLessThan(String value) {
            addCriterion("msg_url <", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlLessThanOrEqualTo(String value) {
            addCriterion("msg_url <=", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlLike(String value) {
            addCriterion("msg_url like", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlNotLike(String value) {
            addCriterion("msg_url not like", value, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlIn(List<String> values) {
            addCriterion("msg_url in", values, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlNotIn(List<String> values) {
            addCriterion("msg_url not in", values, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlBetween(String value1, String value2) {
            addCriterion("msg_url between", value1, value2, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMsgUrlNotBetween(String value1, String value2) {
            addCriterion("msg_url not between", value1, value2, "msgUrl");
            return (Criteria) this;
        }

        public Criteria andMemberWxidIsNull() {
            addCriterion("member_wxid is null");
            return (Criteria) this;
        }

        public Criteria andMemberWxidIsNotNull() {
            addCriterion("member_wxid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWxidEqualTo(String value) {
            addCriterion("member_wxid =", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidNotEqualTo(String value) {
            addCriterion("member_wxid <>", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidGreaterThan(String value) {
            addCriterion("member_wxid >", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidGreaterThanOrEqualTo(String value) {
            addCriterion("member_wxid >=", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidLessThan(String value) {
            addCriterion("member_wxid <", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidLessThanOrEqualTo(String value) {
            addCriterion("member_wxid <=", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidLike(String value) {
            addCriterion("member_wxid like", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidNotLike(String value) {
            addCriterion("member_wxid not like", value, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidIn(List<String> values) {
            addCriterion("member_wxid in", values, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidNotIn(List<String> values) {
            addCriterion("member_wxid not in", values, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidBetween(String value1, String value2) {
            addCriterion("member_wxid between", value1, value2, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberWxidNotBetween(String value1, String value2) {
            addCriterion("member_wxid not between", value1, value2, "memberWxid");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesIsNull() {
            addCriterion("member_phones is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesIsNotNull() {
            addCriterion("member_phones is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesEqualTo(String value) {
            addCriterion("member_phones =", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesNotEqualTo(String value) {
            addCriterion("member_phones <>", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesGreaterThan(String value) {
            addCriterion("member_phones >", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesGreaterThanOrEqualTo(String value) {
            addCriterion("member_phones >=", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesLessThan(String value) {
            addCriterion("member_phones <", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesLessThanOrEqualTo(String value) {
            addCriterion("member_phones <=", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesLike(String value) {
            addCriterion("member_phones like", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesNotLike(String value) {
            addCriterion("member_phones not like", value, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesIn(List<String> values) {
            addCriterion("member_phones in", values, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesNotIn(List<String> values) {
            addCriterion("member_phones not in", values, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesBetween(String value1, String value2) {
            addCriterion("member_phones between", value1, value2, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberPhonesNotBetween(String value1, String value2) {
            addCriterion("member_phones not between", value1, value2, "memberPhones");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameIsNull() {
            addCriterion("member_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameIsNotNull() {
            addCriterion("member_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameEqualTo(String value) {
            addCriterion("member_nickname =", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotEqualTo(String value) {
            addCriterion("member_nickname <>", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameGreaterThan(String value) {
            addCriterion("member_nickname >", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nickname >=", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameLessThan(String value) {
            addCriterion("member_nickname <", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameLessThanOrEqualTo(String value) {
            addCriterion("member_nickname <=", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameLike(String value) {
            addCriterion("member_nickname like", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotLike(String value) {
            addCriterion("member_nickname not like", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameIn(List<String> values) {
            addCriterion("member_nickname in", values, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotIn(List<String> values) {
            addCriterion("member_nickname not in", values, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameBetween(String value1, String value2) {
            addCriterion("member_nickname between", value1, value2, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotBetween(String value1, String value2) {
            addCriterion("member_nickname not between", value1, value2, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureIsNull() {
            addCriterion("member_signature is null");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureIsNotNull() {
            addCriterion("member_signature is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureEqualTo(String value) {
            addCriterion("member_signature =", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureNotEqualTo(String value) {
            addCriterion("member_signature <>", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureGreaterThan(String value) {
            addCriterion("member_signature >", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("member_signature >=", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureLessThan(String value) {
            addCriterion("member_signature <", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureLessThanOrEqualTo(String value) {
            addCriterion("member_signature <=", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureLike(String value) {
            addCriterion("member_signature like", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureNotLike(String value) {
            addCriterion("member_signature not like", value, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureIn(List<String> values) {
            addCriterion("member_signature in", values, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureNotIn(List<String> values) {
            addCriterion("member_signature not in", values, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureBetween(String value1, String value2) {
            addCriterion("member_signature between", value1, value2, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andMemberSignatureNotBetween(String value1, String value2) {
            addCriterion("member_signature not between", value1, value2, "memberSignature");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameIsNull() {
            addCriterion("group_nickname is null");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameIsNotNull() {
            addCriterion("group_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameEqualTo(String value) {
            addCriterion("group_nickname =", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameNotEqualTo(String value) {
            addCriterion("group_nickname <>", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameGreaterThan(String value) {
            addCriterion("group_nickname >", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("group_nickname >=", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameLessThan(String value) {
            addCriterion("group_nickname <", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameLessThanOrEqualTo(String value) {
            addCriterion("group_nickname <=", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameLike(String value) {
            addCriterion("group_nickname like", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameNotLike(String value) {
            addCriterion("group_nickname not like", value, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameIn(List<String> values) {
            addCriterion("group_nickname in", values, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameNotIn(List<String> values) {
            addCriterion("group_nickname not in", values, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameBetween(String value1, String value2) {
            addCriterion("group_nickname between", value1, value2, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andGroupNicknameNotBetween(String value1, String value2) {
            addCriterion("group_nickname not between", value1, value2, "groupNickname");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDistinctIsNull() {
            addCriterion("is_distinct is null");
            return (Criteria) this;
        }

        public Criteria andIsDistinctIsNotNull() {
            addCriterion("is_distinct is not null");
            return (Criteria) this;
        }

        public Criteria andIsDistinctEqualTo(Boolean value) {
            addCriterion("is_distinct =", value, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctNotEqualTo(Boolean value) {
            addCriterion("is_distinct <>", value, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctGreaterThan(Boolean value) {
            addCriterion("is_distinct >", value, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_distinct >=", value, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctLessThan(Boolean value) {
            addCriterion("is_distinct <", value, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctLessThanOrEqualTo(Boolean value) {
            addCriterion("is_distinct <=", value, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctIn(List<Boolean> values) {
            addCriterion("is_distinct in", values, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctNotIn(List<Boolean> values) {
            addCriterion("is_distinct not in", values, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctBetween(Boolean value1, Boolean value2) {
            addCriterion("is_distinct between", value1, value2, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andIsDistinctNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_distinct not between", value1, value2, "isDistinct");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeIsNull() {
            addCriterion("kafka_time is null");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeIsNotNull() {
            addCriterion("kafka_time is not null");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeEqualTo(Date value) {
            addCriterion("kafka_time =", value, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeNotEqualTo(Date value) {
            addCriterion("kafka_time <>", value, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeGreaterThan(Date value) {
            addCriterion("kafka_time >", value, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kafka_time >=", value, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeLessThan(Date value) {
            addCriterion("kafka_time <", value, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeLessThanOrEqualTo(Date value) {
            addCriterion("kafka_time <=", value, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeIn(List<Date> values) {
            addCriterion("kafka_time in", values, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeNotIn(List<Date> values) {
            addCriterion("kafka_time not in", values, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeBetween(Date value1, Date value2) {
            addCriterion("kafka_time between", value1, value2, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andKafkaTimeNotBetween(Date value1, Date value2) {
            addCriterion("kafka_time not between", value1, value2, "kafkaTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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