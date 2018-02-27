/*
Navicat MySQL Data Transfer

Source Server         : 139.199.190.208
Source Server Version : 50638
Source Host           : 139.199.190.208:3306
Source Database       : dpocketcat

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-02-27 14:54:25
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_campus_jobs
-- ----------------------------
INSERT INTO `pc_campus_jobs` VALUES ('1', '大学生勤工俭学岗位征集', '负责处理餐厅的日常事务', '15元/小时', '济南', '学生处就业指导中心', '1', '1519625133', '1519625199', '1519625133', '1519696979');
INSERT INTO `pc_campus_jobs` VALUES ('2', '测试数据', '我的名字好长呀，你该怎么办呢”，那老衲不就狂急了，我的名字好长呀，你该怎么办呢”，那老衲不就狂急了~~~~', '15元/小时', '济南', '学生处就业指导中心', '1', '1519625133', '1519625199', '1519625133', '1519625199');
INSERT INTO `pc_campus_jobs` VALUES ('3', '小黑屋数据', '我被关进了小黑屋', '15元/小时', '济南', '小黑屋', '0', '1519625133', '1519625199', '1519625133', '1519625199');
INSERT INTO `pc_campus_jobs` VALUES ('4', '小黑屋数据', '我被关进了小黑屋', '15元/小时', '济南', '小黑屋', '0', '1519625133', '1519625199', '1519625133', '1519625199');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pc_social_jobs
-- ----------------------------
INSERT INTO `pc_social_jobs` VALUES ('7', '接待人员①（长途汽车总站）', '济南天桥区 培训类', '2017-12-17发布 | 有效期:2017-12-17~2017-12-17', '80元/天', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=1&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1746960.html%3Fsource%3Dbaidu', '0', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('8', '济南户外广告拍摄', '济南济南 南京闲侠信息科技有限公司', '昨天发布 | 有效期:2017-12-12~2018-03-11', '100元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=2&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2F7e0b1aba-37ec-42dd-a3e1-ede5481e3653.html%3Futm_source%3Dbaiduopen', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('9', '山东书城小孩调查问卷', '济南市中区 济南趣学教育科技有限公司', '2017-12-10发布 | 有效期:2017-12-10~2017-12-17', '200元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=3&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3776896%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('10', '宣传人员（会展东路站牌）', '济南历下区 培训类4', '2017-12-14发布 | 有效期:2017-12-14~2017-12-14', '40元/半天（自带双肩背包）', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=4&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1747308.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('11', '济南市科技馆科普星玩具商城', '济南历下区 个人-周桂兰', '2017-12-16发布 | 有效期:2017-12-16~2017-12-30', '80元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=5&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2F0482c395-1c03-4fb2-b561-800e7ac61b97.html%3Futm_source%3Dbaiduopen', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('12', '在家可做，微信兼职推广', '济南湖里区 厦门坤谦商贸有限公司', '2017-09-06发布 | 有效期:2017-09-06~2017-12-31', '300元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=6&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3320936%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('13', '做计算机试卷人员（会展中心站牌）', '济南市中区 培训类', '2017-12-19发布 | 有效期:2017-12-19~2017-12-19', '60元/1.5小时左右', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=7&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1746993.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('14', '长期招聘周末超市促销', '济南槐荫区 济南忠桥营销策划有限公司', '2017-12-16发布 | 有效期:2017-12-16~2018-01-30', '100元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=8&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2Fa547819e-fe33-44c2-b346-48e59c2ee410.html%3Futm_source%3Dbaiduopen', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('15', '在家可做，微信兼职推广', '济南湖里区 厦门坤谦商贸有限公司', '2017-08-15发布 | 有效期:2017-08-15~2017-12-31', '300元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=9&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3225999%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('16', '做英语试卷人员（山大路文化东路站牌）', '济南历下区 培训类', '2017-12-16发布 | 有效期:2017-12-16~2017-12-16', '60元/1.5小时左右', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=10&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1746984.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('17', '在家可做，微信兼职推广', '济南湖里区 厦门坤谦商贸有限公司', '2017-08-25发布 | 有效期:2017-08-25~2017-12-31', '300元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=11&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3270394%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('18', '做英语试卷人员（会展中心站牌）', '济南市中区 培训类', '2017-12-18发布 | 有效期:2017-12-18~2017-12-18', '60元/1.5小时左右', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=12&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1746991.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('19', '招聘人事面试员，长期工，女', '济南历城区 山东睿智商务服务有限公司', '昨天发布 | 有效期:2017-12-12~2018-07-20', '180元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=13&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3769759%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('20', '星级酒店服务生（大观园站牌）', '济南市中区 知名餐饮公司', '2017-12-16发布 | 有效期:2017-12-16~2017-12-17', '75元/天+三餐+住宿', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=14&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1746998.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('21', '招聘地推拉访', '济南历城区 济南灿星教育咨询有限公司', '2017-12-21发布 | 有效期:2017-12-21~2018-01-12', '100元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=15&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3781955%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('22', '做计算机试卷人员（山大路文化东路站牌）', '济南历下区 培训类', '2017-12-16发布 | 有效期:2017-12-16~2017-12-16', '60元/1.5小时左右', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=16&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1746986.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('23', '肯德基解放路餐厅长期招聘服务员', '济南历下区 青岛肯德基有限公司济南解放路餐厅', '2017-11-20发布 | 有效期:2017-11-20~2018-02-28', '11元/小时', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=17&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F2804598%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('24', '活动宣传人员（世纪大道凤凰路站牌）', '济南历下区 培训类', '2017-12-15发布 | 有效期:2017-12-15~2017-12-15', '85元/天（自带双肩背包）', '蚂蚁兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=18&city=济南&id=http%3A%2F%2Fjn.school51.com%2Fparttime%2F1747116.html%3Fsource%3Dbaidu', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('25', '济南各大超市招募佳宝周末促销员', '济南 济南忠桥市场营销策划有限公司', '今天发布 | 有效期:2017-12-13~2018-08-02', '100元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=19&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F2399336%3Fcity%3Djn%26ca_platform%3D1', '1', '1513170404000');
INSERT INTO `pc_social_jobs` VALUES ('26', '天猫试衣模特无需经验日结', '济南历下区 济南众垚文化传播有限公司', '2017-11-21发布 | 有效期:2017-11-21~2018-01-31', '480元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=0&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3733503%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('27', '招聘话务人员数名', '济南历下区 个人-周经理', '昨天发布 | 有效期:2017-12-17~2017-12-30', '70元/天', '兼客兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=1&city=济南&id=http%3A%2F%2Fjn.jianke.cc%2Fjob%2F5f8ec06c-c86d-48a2-ba15-e4d5d0273ce1.html%3Futm_source%3Dbaiduopen', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('28', '名人婚庆招普工技工只招长期', '济南历下区 济南哲远文化传媒有限公司', '2017-08-05发布 | 有效期:2017-08-05~2018-12-31', '150元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=2&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3193199%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('29', '直招周末兼职淘宝平面网拍模特', '济南历下区 济南魅丽文化传媒有限公司', '2017-11-30发布 | 有效期:2017-11-30~2018-01-31', '500元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=3&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3755888%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('30', '婚礼庆典会场协助人员', '济南历下区 济南哲远文化传媒有限公司', '2017-05-26发布 | 有效期:2017-05-26~2017-12-31', '120元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=4&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F2780979%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('31', '诚招信息采集体验卡发放人员', '济南天桥区 山东省小海豚教育科技有限公司', '2017-06-30发布 | 有效期:2017-06-30~2017-12-30', '120元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=5&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3011355%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('32', '招长期话务专员，补助1000', '济南历下区 济南融雪房地产经纪有限公司', '2017-12-01发布 | 有效期:2017-12-01~2018-10-31', '150元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=6&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3758488%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('33', '短期实习酒店餐饮服务员+包吃住', '济南历下区 历下区香都海鲜饭店', '2017-09-19发布 | 有效期:2017-09-19~2018-01-19', '90元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=7&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3388911%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('34', '香格里拉酒店服务员120一天', '济南历下区 郑州鼎达企业管理咨询有限公司', '2017-12-16发布 | 有效期:2017-12-16~2018-02-16', '120元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=8&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3791112%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('35', '火车站站前街肯德基餐厅招服务员', '济南天桥区 青岛肯德基有限公司济南工业南路餐厅', '2017-10-10发布 | 有效期:2017-10-10~2018-01-31', '11元/小时', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=9&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3558344%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('36', '山东精子库5500元招男志愿者', '济南历下区 河北省计划生育科学技术研究院', '今天发布 | 有效期:2017-12-18~2018-02-25', '600元/小时', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=10&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F2548409%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('37', '招聘送餐员', '济南历下区 北京必胜客比萨饼有限公司济南美联广场餐厅', '2017-12-02发布 | 有效期:2017-12-02~2018-01-02', '7元/', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=11&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3759744%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('38', '在线完成调研问卷每份5-50元', '济南市中区 艾斯艾国际市场调查咨询（北京）有限公司', '2017-07-10发布 | 有效期:2017-07-10~2018-03-31', '50元/小时', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=12&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3724120%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('39', '薪资次日结招募派单兼职', '济南历下区 广州依时货拉拉科技有限公司青岛分公司', '2017-12-14发布 | 有效期:2017-12-14~2018-05-31', '100元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=13&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3788706%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('40', '微商兼职 在家可做', '济南天桥区 李大为', '2017-12-12发布 | 有效期:2017-12-12~2017-12-30', '300元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=14&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3782038%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('41', '淘宝网拍婚纱试衣可新人微胖日结', '济南历下区 济南众垚文化传播有限公司', '2017-11-21发布 | 有效期:2017-11-21~2018-01-31', '560元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=15&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F3734303%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
INSERT INTO `pc_social_jobs` VALUES ('42', '杨梅红艺术学校诚招信息收集员', '济南历下区 济南博季教育信息咨询有限公司', '今天发布 | 有效期:2017-12-18~2019-02-14', '150元/天', '斗米兼职', 'http://zhaopin.baidu.com//jzzw?detailidx=16&city=济南&id=http%3A%2F%2Fwww.doumi.com%2Fauth%2Fbaidu%2Fjumpdetail%2F1149409%3Fcity%3Djn%26ca_platform%3D1', '1', '1513562335000');
