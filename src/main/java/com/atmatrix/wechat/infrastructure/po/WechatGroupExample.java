package com.atmatrix.wechat.infrastructure.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatGroupExample() {
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

        public Criteria andGroupCountIsNull() {
            addCriterion("group_count is null");
            return (Criteria) this;
        }

        public Criteria andGroupCountIsNotNull() {
            addCriterion("group_count is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCountEqualTo(Integer value) {
            addCriterion("group_count =", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountNotEqualTo(Integer value) {
            addCriterion("group_count <>", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountGreaterThan(Integer value) {
            addCriterion("group_count >", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_count >=", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountLessThan(Integer value) {
            addCriterion("group_count <", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountLessThanOrEqualTo(Integer value) {
            addCriterion("group_count <=", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountIn(List<Integer> values) {
            addCriterion("group_count in", values, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountNotIn(List<Integer> values) {
            addCriterion("group_count not in", values, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountBetween(Integer value1, Integer value2) {
            addCriterion("group_count between", value1, value2, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountNotBetween(Integer value1, Integer value2) {
            addCriterion("group_count not between", value1, value2, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidIsNull() {
            addCriterion("group_owner_wxid is null");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidIsNotNull() {
            addCriterion("group_owner_wxid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidEqualTo(String value) {
            addCriterion("group_owner_wxid =", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidNotEqualTo(String value) {
            addCriterion("group_owner_wxid <>", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidGreaterThan(String value) {
            addCriterion("group_owner_wxid >", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidGreaterThanOrEqualTo(String value) {
            addCriterion("group_owner_wxid >=", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidLessThan(String value) {
            addCriterion("group_owner_wxid <", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidLessThanOrEqualTo(String value) {
            addCriterion("group_owner_wxid <=", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidLike(String value) {
            addCriterion("group_owner_wxid like", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidNotLike(String value) {
            addCriterion("group_owner_wxid not like", value, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidIn(List<String> values) {
            addCriterion("group_owner_wxid in", values, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidNotIn(List<String> values) {
            addCriterion("group_owner_wxid not in", values, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidBetween(String value1, String value2) {
            addCriterion("group_owner_wxid between", value1, value2, "groupOwnerWxid");
            return (Criteria) this;
        }

        public Criteria andGroupOwnerWxidNotBetween(String value1, String value2) {
            addCriterion("group_owner_wxid not between", value1, value2, "groupOwnerWxid");
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