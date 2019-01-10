/*
 Navicat Premium Data Transfer

 Source Server         : local_wechat_msg
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : wechat_msg

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 10/01/2019 20:19:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Test
-- ----------------------------
DROP TABLE IF EXISTS `Test`;
CREATE TABLE `Test` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for wechat_duplicate
-- ----------------------------
DROP TABLE IF EXISTS `wechat_duplicate`;
CREATE TABLE `wechat_duplicate` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `message_id` bigint(18) NOT NULL COMMENT '消息源主键ID',
  `message_text` text COLLATE utf8mb4_unicode_ci COMMENT '发送消息内容',
  `message_type` int(4) NOT NULL COMMENT '消息类型: 1:文本，3:图片',
  `message_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '微信消息的唯一标识',
  `group_owner_wxid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组拥有者wxid',
  `is_delete` tinyint(1) DEFAULT NULL COMMENT '是否删除：0:未删除 ，1:删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for wechat_group
-- ----------------------------
DROP TABLE IF EXISTS `wechat_group`;
CREATE TABLE `wechat_group` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `group_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组唯一标识',
  `group_nickname` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组显示昵名称',
  `group_count` int(4) NOT NULL COMMENT '群组群成员数量',
  `group_owner_wxid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组拥有者wxid',
  `is_delete` tinyint(1) DEFAULT NULL COMMENT '是否删除：0:未删除 ，1:删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for wechat_member
-- ----------------------------
DROP TABLE IF EXISTS `wechat_member`;
CREATE TABLE `wechat_member` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `member_wxid` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '微信号',
  `member_nickname` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '群名称',
  `member_avatar` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像链接',
  `member_sex` int(4) NOT NULL COMMENT '性别类型: 0:未知，1:男，2:女',
  `member_province` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '省份',
  `member_city` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '城市',
  `memeber_signature` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '签名',
  `memeber_phones` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '电话（多个 以'',''隔开）',
  `group_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组唯一标识',
  `group_nickname` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组显示的昵名称',
  `is_owner` tinyint(1) DEFAULT NULL COMMENT '是否是群主：0:不是，1:是',
  `is_delete` tinyint(1) DEFAULT NULL COMMENT '是否删除：0:未删除 ，1:删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for wechat_message
-- ----------------------------
DROP TABLE IF EXISTS `wechat_message`;
CREATE TABLE `wechat_message` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `msg_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '微信消息的唯一标识',
  `msg_text` text COLLATE utf8mb4_unicode_ci COMMENT '发送消息内容',
  `msg_type` int(4) NOT NULL COMMENT '消息类型: 1:文本，3:图片',
  `msg_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '发送消息若为文件，存入文件的url',
  `member_wxid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '发送者头像链接',
  `member_nickname` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '群名称',
  `group_id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '该条消息发送者唯一标识',
  `group_nickname` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '发送者微信群名称',
  `is_delete` tinyint(1) DEFAULT NULL COMMENT '是否删除：0:未删除 ，1:删除',
  `is_distinct` tinyint(1) DEFAULT NULL COMMENT '是否去重复：0:未去重复 ，1:已去重复',
  `kafka_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'kafka发送时间',
  `send_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发送消息的时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

SET FOREIGN_KEY_CHECKS = 1;
