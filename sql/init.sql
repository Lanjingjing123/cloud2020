/*
Navicat MySQL Data Transfer

Source Server         : local_ljj
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : db2019

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2020-06-27 15:14:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_manufacturer_para`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_manufacturer_para`;
CREATE TABLE `tbl_manufacturer_para` (
`MANUFACTURER_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '厂商名称' ,
`MANUFACTURER_CODE`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '厂商简码' ,
`MANUFACTURER_TEL`  varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '厂商电话' ,
`TRANSPORTATION_EXPENSE`  decimal(16,2) NULL DEFAULT NULL COMMENT '运输单价' ,
`UPDATE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新日期' ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易日期' ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易时间' ,
`VERSION`  int(12) NULL DEFAULT NULL COMMENT '版本号' ,
`TRANS_CD`  varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD1`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD2`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD3`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD4`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD5`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD6`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD7`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD8`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD9`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`MANUFACTURER_CODE`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of tbl_manufacturer_para
-- ----------------------------
BEGIN;
INSERT INTO `tbl_manufacturer_para` VALUES ('方管测试', '-1095523304585815535', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '-2073463989124250754', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '-2322252756449425689', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '-2848452451824184762', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '-5152492594052196390', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('jjj', '12', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商2', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商2', '124', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('jjj', '133', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商3', '143', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '1591662128442209770', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '3839657764586562888', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '5261651553665966454', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '5859870697151298631', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '610334972436005956', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '8538218612304093334', null, null, null, '20200624', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', '8917248010795532537', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null), ('方管测试', 'dflasjf', null, null, null, '20200623', null, null, null, null, null, null, null, null, null, null, null, null), ('厂商1', 'sd', '18751901370', '450.00', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
COMMIT;

-- ----------------------------
-- Table structure for `tbl_order_record_in`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order_record_in`;
CREATE TABLE `tbl_order_record_in` (
`ORDER_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单编号' ,
`PRODUCT_NM`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品名称' ,
`PRODUCT_KIND`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品型号' ,
`PRODUCT_THICKNESS`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品厚度' ,
`PRODUCT_LENGTH`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品长度' ,
`PURCHASE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '进货日期' ,
`TRANS_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流水号' ,
`SUPPLIER_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '供货商名称' ,
`SUPPLIER_CD`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '供货商简码' ,
`TRANSPORTATION_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '运输单价' ,
`PRODUCT_OUT_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '产品出厂单价' ,
`PRODUCT_OUT_AMOUNT`  decimal(16,2) NULL DEFAULT NULL COMMENT '产品出厂总金额' ,
`CARRY_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '搬运单价' ,
`IN_STORAGE_WEIGHT`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '入库重量(吨)' ,
`IN_STORAGE_NUM`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '入库数量' ,
`INVENTORY_NUM`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '库存支数' ,
`PIECE_COUNT`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单件支数' ,
`COUNT`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '件数' ,
`IN_STORAGE_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '入库成本单价' ,
`UPDATE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新日期' ,
`CREAT_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建日期' ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易日期' ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易时间' ,
`VERSION`  int(12) NULL DEFAULT NULL COMMENT '版本号' ,
`TRANS_CD`  varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD1`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD2`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD3`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`ORDER_NO`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of tbl_order_record_in
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `tbl_order_record_out`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order_record_out`;
CREATE TABLE `tbl_order_record_out` (
`ORDER_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单编号' ,
`PRODUCT_NM`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品名称' ,
`PRODUCT_KIND`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品型号' ,
`PRODUCT_THICKNESS`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品厚度' ,
`PRODUCT_LENGTH`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品长度' ,
`SUPPLIER_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '供货商名称' ,
`SUPPLIER_CD`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '供货商简码' ,
`SALE_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '出售单价' ,
`SALE_TON_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '出售吨位价' ,
`SALE_NUM`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '出售支数' ,
`SALE_WEIGHT`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '出售重量' ,
`TRANS_JNNO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流水号' ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易日期' ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易时间' ,
`VERSION`  int(12) NULL DEFAULT NULL COMMENT '版本号' ,
`TRANS_CD`  varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易码' ,
`EXTFLD1`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD2`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD3`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`ORDER_NO`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of tbl_order_record_out
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `tbl_prod_inventory`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_prod_inventory`;
CREATE TABLE `tbl_prod_inventory` (
`PRODUCT_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品名称' ,
`PRODUCT_KIND`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '产品型号' ,
`PRODUCT_THICKNESS`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品厚度' ,
`PRODUCT_LENGTH`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品长度' ,
`CARR_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '搬运单价' ,
`IN_STORAGE_WEIGHT`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '入库重量(吨)' ,
`IN_STORAGE_NUM`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '入库数量()' ,
`INVENTORY_NUM`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '库存支数' ,
`IN_STORAGE_PRICE`  decimal(16,2) NULL DEFAULT NULL COMMENT '进货成本单价' ,
`UPDATE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新日期' ,
`CREATE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建日期' ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易时间' ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易日期' ,
`VERSION`  int(12) NULL DEFAULT NULL COMMENT '版本号' ,
PRIMARY KEY (`PRODUCT_KIND`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of tbl_prod_inventory
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `tbl_prod_name_para`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_prod_name_para`;
CREATE TABLE `tbl_prod_name_para` (
`PRODUCT_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '产品编号' ,
`PRODUCT_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品名称' ,
`PRODUCT_KIND`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品型号' ,
`PRODUCT_THICKNESS`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品厚度' ,
`PRODUCT_LENGTH`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品长度' ,
`PRODUCT_THEORY_WEIGHT`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品理论重量' ,
`PRODUCT_ACTUL_WEIGHT`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品实际平均重量' ,
`CREAT_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建日期' ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易日期' ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易时间' ,
`VERSION`  int(12) NULL DEFAULT NULL COMMENT '版本号' ,
`EXTFLD1`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD2`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`EXTFLD3`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`PRODUCT_NO`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of tbl_prod_name_para
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `tbl_trans_log`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_trans_log`;
CREATE TABLE `tbl_trans_log` (
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易日期' ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易时间' ,
`TRANS_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '流水号' ,
`EVENT`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '事件' ,
`ORDER_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单编号' ,
`TRANS_CD`  varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PROD_CD`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '产品号' ,
`OPERATOR_NM`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人' ,
`OPERATOR_ID`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人ID' ,
PRIMARY KEY (`TRANS_NO`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of tbl_trans_log
-- ----------------------------
BEGIN;
INSERT INTO `tbl_trans_log` VALUES ('20200624', '171345', '2020062417134467320083990', 'after', null, '40204', null, '张三', '2234'), ('20200624', '175726', '2020062417572610539502690', 'after', null, '40204', null, '张三', '2234');
COMMIT;
