package com.atmatrix.wechat.infrastructure.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatMemberExample() {
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

        public Criteria andMemberAvatarIsNull() {
            addCriterion("member_avatar is null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIsNotNull() {
            addCriterion("member_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarEqualTo(String value) {
            addCriterion("member_avatar =", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotEqualTo(String value) {
            addCriterion("member_avatar <>", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarGreaterThan(String value) {
            addCriterion("member_avatar >", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("member_avatar >=", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLessThan(String value) {
            addCriterion("member_avatar <", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLessThanOrEqualTo(String value) {
            addCriterion("member_avatar <=", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarLike(String value) {
            addCriterion("member_avatar like", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotLike(String value) {
            addCriterion("member_avatar not like", value, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarIn(List<String> values) {
            addCriterion("member_avatar in", values, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotIn(List<String> values) {
            addCriterion("member_avatar not in", values, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarBetween(String value1, String value2) {
            addCriterion("member_avatar between", value1, value2, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberAvatarNotBetween(String value1, String value2) {
            addCriterion("member_avatar not between", value1, value2, "memberAvatar");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(Integer value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(Integer value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(Integer value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(Integer value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(Integer value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<Integer> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<Integer> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(Integer value1, Integer value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(Integer value1, Integer value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceIsNull() {
            addCriterion("member_province is null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceIsNotNull() {
            addCriterion("member_province is not null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceEqualTo(String value) {
            addCriterion("member_province =", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNotEqualTo(String value) {
            addCriterion("member_province <>", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceGreaterThan(String value) {
            addCriterion("member_province >", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("member_province >=", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceLessThan(String value) {
            addCriterion("member_province <", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceLessThanOrEqualTo(String value) {
            addCriterion("member_province <=", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceLike(String value) {
            addCriterion("member_province like", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNotLike(String value) {
            addCriterion("member_province not like", value, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceIn(List<String> values) {
            addCriterion("member_province in", values, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNotIn(List<String> values) {
            addCriterion("member_province not in", values, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceBetween(String value1, String value2) {
            addCriterion("member_province between", value1, value2, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNotBetween(String value1, String value2) {
            addCriterion("member_province not between", value1, value2, "memberProvince");
            return (Criteria) this;
        }

        public Criteria andMemberCityIsNull() {
            addCriterion("member_city is null");
            return (Criteria) this;
        }

        public Criteria andMemberCityIsNotNull() {
            addCriterion("member_city is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCityEqualTo(String value) {
            addCriterion("member_city =", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityNotEqualTo(String value) {
            addCriterion("member_city <>", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityGreaterThan(String value) {
            addCriterion("member_city >", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityGreaterThanOrEqualTo(String value) {
            addCriterion("member_city >=", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityLessThan(String value) {
            addCriterion("member_city <", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityLessThanOrEqualTo(String value) {
            addCriterion("member_city <=", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityLike(String value) {
            addCriterion("member_city like", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityNotLike(String value) {
            addCriterion("member_city not like", value, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityIn(List<String> values) {
            addCriterion("member_city in", values, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityNotIn(List<String> values) {
            addCriterion("member_city not in", values, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityBetween(String value1, String value2) {
            addCriterion("member_city between", value1, value2, "memberCity");
            return (Criteria) this;
        }

        public Criteria andMemberCityNotBetween(String value1, String value2) {
            addCriterion("member_city not between", value1, value2, "memberCity");
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

        public Criteria andGroupKeyIsNull() {
            addCriterion("group_key is null");
            return (Criteria) this;
        }

        public Criteria andGroupKeyIsNotNull() {
            addCriterion("group_key is not null");
            return (Criteria) this;
        }

        public Criteria andGroupKeyEqualTo(Long value) {
            addCriterion("group_key =", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotEqualTo(Long value) {
            addCriterion("group_key <>", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyGreaterThan(Long value) {
            addCriterion("group_key >", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyGreaterThanOrEqualTo(Long value) {
            addCriterion("group_key >=", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyLessThan(Long value) {
            addCriterion("group_key <", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyLessThanOrEqualTo(Long value) {
            addCriterion("group_key <=", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyIn(List<Long> values) {
            addCriterion("group_key in", values, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotIn(List<Long> values) {
            addCriterion("group_key not in", values, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyBetween(Long value1, Long value2) {
            addCriterion("group_key between", value1, value2, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotBetween(Long value1, Long value2) {
            addCriterion("group_key not between", value1, value2, "groupKey");
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

        public Criteria andIsOwnerIsNull() {
            addCriterion("is_owner is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnerIsNotNull() {
            addCriterion("is_owner is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnerEqualTo(Boolean value) {
            addCriterion("is_owner =", value, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerNotEqualTo(Boolean value) {
            addCriterion("is_owner <>", value, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerGreaterThan(Boolean value) {
            addCriterion("is_owner >", value, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_owner >=", value, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerLessThan(Boolean value) {
            addCriterion("is_owner <", value, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerLessThanOrEqualTo(Boolean value) {
            addCriterion("is_owner <=", value, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerIn(List<Boolean> values) {
            addCriterion("is_owner in", values, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerNotIn(List<Boolean> values) {
            addCriterion("is_owner not in", values, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerBetween(Boolean value1, Boolean value2) {
            addCriterion("is_owner between", value1, value2, "isOwner");
            return (Criteria) this;
        }

        public Criteria andIsOwnerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_owner not between", value1, value2, "isOwner");
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

        public Criteria andSpiderWxidIsNull() {
            addCriterion("spider_wxid is null");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidIsNotNull() {
            addCriterion("spider_wxid is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidEqualTo(String value) {
            addCriterion("spider_wxid =", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidNotEqualTo(String value) {
            addCriterion("spider_wxid <>", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidGreaterThan(String value) {
            addCriterion("spider_wxid >", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidGreaterThanOrEqualTo(String value) {
            addCriterion("spider_wxid >=", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidLessThan(String value) {
            addCriterion("spider_wxid <", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidLessThanOrEqualTo(String value) {
            addCriterion("spider_wxid <=", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidLike(String value) {
            addCriterion("spider_wxid like", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidNotLike(String value) {
            addCriterion("spider_wxid not like", value, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidIn(List<String> values) {
            addCriterion("spider_wxid in", values, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidNotIn(List<String> values) {
            addCriterion("spider_wxid not in", values, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidBetween(String value1, String value2) {
            addCriterion("spider_wxid between", value1, value2, "spiderWxid");
            return (Criteria) this;
        }

        public Criteria andSpiderWxidNotBetween(String value1, String value2) {
            addCriterion("spider_wxid not between", value1, value2, "spiderWxid");
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