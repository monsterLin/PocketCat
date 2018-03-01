/*
Navicat MySQL Data Transfer

Source Server         : 139.199.190.208
Source Server Version : 50638
Source Host           : 139.199.190.208:3306
Source Database       : dpocketcat

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-03-01 16:27:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pc_admin
-- ----------------------------
DROP TABLE IF EXISTS `pc_admin`;
CREATE TABLE `pc_admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `activated` bigint(255) NOT NULL,
  `created` bigint(255) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_admin
-- ----------------------------
INSERT INTO `pc_admin` VALUES ('1', 'monsterlin', 'dfd709dbeac7508e4e6f728e1c71a42a', '2ibv1pc5e6', 'monsterlin@monsterlin.com', '1513257192000', '1513257192000');
INSERT INTO `pc_admin` VALUES ('2', 'test', '20f3f1cabd242ff7c56dc4c825de00f2', '22qny61aqb', 'monsterlin@monsterlin.com', '1519613685000', '1519613685000');

-- ----------------------------
-- Table structure for pc_campus_jobs
-- ----------------------------
DROP TABLE IF EXISTS `pc_campus_jobs`;
CREATE TABLE `pc_campus_jobs` (
  `jid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) DEFAULT '' COMMENT '标题',
  `content` varchar(255) DEFAULT '' COMMENT '内容',
  `price` varchar(10) DEFAULT NULL COMMENT '价格',
  `place` varchar(255) DEFAULT '' COMMENT '地点',
  `author` varchar(255) DEFAULT NULL COMMENT '发布人',
  `state` int(11) DEFAULT NULL COMMENT '是否进入小黑屋（0:进入 1: 不进入）',
  `beginTime` bigint(20) DEFAULT NULL COMMENT '开始时间',
  `endTime` bigint(20) DEFAULT NULL COMMENT '结束时间',
  `createTime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `updateTime` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_campus_jobs
-- ----------------------------
INSERT INTO `pc_campus_jobs` VALUES ('1', '大学生勤工俭学岗位征集', '负责处理餐厅的日常事务', '15元/小时', '济南', '学生处就业指导中心', '1', '1519625133', '1519625199', '1519625133', '1519696979');
INSERT INTO `pc_campus_jobs` VALUES ('4', '小黑屋数据', '我被关进了小黑屋', '15元/小时', '济南', '小黑屋', '0', '1519625133', '1519625199', '1519625133', '1519625199');
INSERT INTO `pc_campus_jobs` VALUES ('5', '大学生勤工俭学岗位征集', '负责处理餐厅的日常事务', '15元/小时', '济南', '学生处就业指导中心', '1', '1519674076000', '1519674076000', '1519674076000', '1519674076000');

-- ----------------------------
-- Table structure for pc_notice
-- ----------------------------
DROP TABLE IF EXISTS `pc_notice`;
CREATE TABLE `pc_notice` (
  `nid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `author` varchar(255) DEFAULT NULL COMMENT '作者',
  `createTime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `updateTime` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_notice
-- ----------------------------
INSERT INTO `pc_notice` VALUES ('1', '公告', '校园兼职1.0开发完成﻿ε≡٩(๑>₃<)۶ 一心向学', 'monsterlin', '1514791147000', '1514791147000');

-- ----------------------------
-- Table structure for pc_social_jobs
-- ----------------------------
DROP TABLE IF EXISTS `pc_social_jobs`;
CREATE TABLE `pc_social_jobs` (
  `jid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `place` varchar(255) NOT NULL COMMENT '工作地点',
  `time` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL COMMENT '薪资',
  `source` varchar(255) NOT NULL COMMENT '来源',
  `detailUrl` varchar(255) NOT NULL COMMENT '原网址',
  `state` int(1) NOT NULL COMMENT '是否进入小黑屋（0:进入 1: 不进入）',
  `created` bigint(22) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=226 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_social_jobs
-- ----------------------------
INSERT INTO `pc_social_jobs` VALUES ('178', '邀约试听课140+', '济南槐荫区 个人-董庆强', '昨天发布 | 有效期:2018-02-28~2018-04-30', '140元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=12&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2F2e1bb7ed-0006-4e18-a31c-4632a835a41e.html%3Futm_source%3Dbaiduopen', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('179', '招聘传单派发', '济南天桥区 山东帅浩通讯科技有限公司', '昨天发布 | 有效期:2018-02-28~2018-05-27', '100元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=13&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F4012330%3Fcity%3Djn%26ca_platform%3D1', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('180', '活动宣传+拉访（建材市场站牌）', '济南天桥区 建材类装饰类', '2018-03-03发布 | 有效期:2018-03-03~2018-03-04', '80元/天+提成', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=14&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1763595.html%3Fsource%3Dbaidu', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('181', '教育机构诚招发单人员', '济南历下区 个人-俞老师', '今天发布 | 有效期:2018-03-01~2018-04-30', '160元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=15&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2Fa47f01e2-9bd1-4676-8fac-9c65e44e0818.html%3Futm_source%3Dbaiduopen', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('182', '燕山银座瓦特机器人招幼教', '济南天桥区 济南瓦特机器人教育咨询有限公司', '昨天发布 | 有效期:2018-02-28~2018-03-31', '100元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=16&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F4008956%3Fcity%3Djn%26ca_platform%3D1', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('183', '收集信息人员（友谊苑小区站牌）', '济南历下区 培训类', '2018-03-03发布 | 有效期:2018-03-03~2018-03-03', '100元/天+提成', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=17&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1763627.html%3Fsource%3Dbaidu', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('184', '美术高考老师', '济南长清区 北京视点灵动教育科技有限公司', '昨天发布 | 有效期:2018-02-28~2018-04-01', '267元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=18&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F4008968%3Fcity%3Djn%26ca_platform%3D1', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('185', '活动宣传人员（华山珑城华阳郡站牌）', '济南历城区 培训类', '2018-03-07发布 | 有效期:2018-03-07~2018-03-08', '80-100元/天+提成', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=19&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1763635.html%3Fsource%3Dbaidu', '1', '1519873960000');
INSERT INTO `pc_social_jobs` VALUES ('186', '诚聘优秀兼职老师', '济南历城区 济南海途教育咨询有限公司', '昨天发布 | 有效期:2018-02-28~2018-03-19', '116元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=0&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F4008967%3Fcity%3Djn%26ca_platform%3D1', '1', '1519873975000');
INSERT INTO `pc_social_jobs` VALUES ('187', '监考协助人员（会展中心站牌）', '济南市中区 培训类1', '2018-03-04发布 | 有效期:2018-03-04~2018-03-11', '100元/天+中餐', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=1&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1763573.html%3Fsource%3Dbaidu', '1', '1519873975000');
INSERT INTO `pc_social_jobs` VALUES ('188', '问卷调查', '济南历下区 百思玛国际英语', '昨天发布 | 有效期:2018-02-28~2018-05-28', '100元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=2&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2F608b7927-8d6c-42bc-a334-a4bc962f5bfa.html%3Futm_source%3Dbaiduopen', '1', '1519873975000');
INSERT INTO `pc_social_jobs` VALUES ('189', '教育机构诚招发单人员', '济南历下区 山东省小海豚教育科技有限公司', '昨天发布 | 有效期:2018-02-28~2018-04-30', '160.0元/天', '口袋兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=3&city=济南&id=http%3A%2F%2Fm.kdjz.com%2Fjob%2Fdetail%3Fid%3DB6wDPMkrKBd2gA2LnEyg%26city%3DR1naJgBdwpnG9oqQy2Vr', '1', '1519873975000');
