/*
Navicat MySQL Data Transfer

Source Server         : local_ljj
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : db2019

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2020-06-27 15:06:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_manufacturer_para`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_manufacturer_para`;
CREATE TABLE `tbl_manufacturer_para` (
  `MANUFACTURER_NM` varchar(256) DEFAULT NULL COMMENT '厂商名称',
  `MANUFACTURER_CODE` varchar(36) NOT NULL COMMENT '厂商简码',
  `MANUFACTURER_TEL` varchar(15) DEFAULT NULL COMMENT '厂商电话',
  `TRANSPORTATION_EXPENSE` decimal(16,2) DEFAULT NULL COMMENT '运输单价',
  `UPDATE_DT` varchar(8) DEFAULT NULL COMMENT '更新日期',
  `TRANS_DT` varchar(8) DEFAULT NULL COMMENT '交易日期',
  `TRANS_TM` varchar(6) DEFAULT NULL COMMENT '交易时间',
  `VERSION` int(12) DEFAULT NULL COMMENT '版本号',
  `TRANS_CD` varchar(12) DEFAULT NULL,
  `EXTFLD1` varchar(36) DEFAULT NULL,
  `EXTFLD2` varchar(128) DEFAULT NULL,
  `EXTFLD3` varchar(256) DEFAULT NULL,
  `EXTFLD4` varchar(256) DEFAULT NULL,
  `EXTFLD5` varchar(256) DEFAULT NULL,
  `EXTFLD6` varchar(256) DEFAULT NULL,
  `EXTFLD7` varchar(256) DEFAULT NULL,
  `EXTFLD8` varchar(256) DEFAULT NULL,
  `EXTFLD9` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`MANUFACTURER_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_manufacturer_para
-- ----------------------------
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '-1095523304585815535', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '-2073463989124250754', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '-2322252756449425689', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '-2848452451824184762', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '-5152492594052196390', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('jjj', '12', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('厂商2', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('厂商2', '124', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('jjj', '133', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('厂商3', '143', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '1591662128442209770', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '3839657764586562888', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '5261651553665966454', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '5859870697151298631', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '610334972436005956', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '8538218612304093334', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '8917248010795532537', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', 'dflasjf', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `tbl_manufacturer_para` VALUES ('厂商1', 'sd', '18751901370', '450.00', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
