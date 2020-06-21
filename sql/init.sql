/*
Navicat MySQL Data Transfer

Source Server         : local_ljj
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : db2019

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2020-06-21 21:51:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `payment`
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
`id`  int(16) NOT NULL ,
`serial`  varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci

;

-- ----------------------------
-- Records of payment
-- ----------------------------
BEGIN;
INSERT INTO `payment` VALUES ('1', '1234578');
COMMIT;

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
INSERT INTO `tbl_manufacturer_para` VALUES ('jjj', '12', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商2', '123', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商2', '124', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('jjj', '133', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商3', '143', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), ('厂商1', 'sd', '18751901370', '450.00', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
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
`ORDER_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL ,
`PRODUCT_NM`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PRODUCT_KIND`  varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PRODUCT_THICKNESS`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PRODUCT_LENGTH`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`SUPPLIER_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`SUPPLIER_CD`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`SALE_PRICE`  decimal(16,2) NULL DEFAULT NULL ,
`SALE_TON_PRICE`  decimal(16,2) NULL DEFAULT NULL ,
`SALE_NUM`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`SALE_WEIGHT`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`TRANS_NO`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`VERSION`  int(12) NULL DEFAULT NULL ,
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
-- Records of tbl_order_record_out
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `tbl_prod_inventory`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_prod_inventory`;
CREATE TABLE `tbl_prod_inventory` (
`PRODUCT_NM`  varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PRODUCT_KIND`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PRODUCT_THICKNESS`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`PRODUCT_LENGTH`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`CARR_PRICE`  decimal(16,2) NULL DEFAULT NULL ,
`IN_STORAGE_WEIGHT`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`IN_STORAGE_NUM`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`INVENTORY_NUM`  varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`IN_STORAGE_PRICE`  decimal(16,2) NULL DEFAULT NULL ,
`UPDATE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`CREATE_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`TRANS_TM`  varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`TRANS_DT`  varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`VERSION`  int(12) NULL DEFAULT NULL 
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
INSERT INTO `tbl_trans_log` VALUES ('20200522', '161443', '2020052216144358910380470', 'log', null, null, null, null), ('20200522', '161554', '2020052216155426374791801', 'log', null, null, null, null), ('20200522', '161555', '2020052216155513937894092', 'log', null, null, null, null), ('20200522', '162434', '2020052216243448817021463', 'log', null, null, null, null), ('20200522', '162443', '2020052216244317354746504', 'log', null, null, null, null), ('20200522', '162443', '2020052216244383403231505', 'log', null, null, null, null), ('20200522', '162446', '2020052216244638661785496', 'log', null, null, null, null), ('20200522', '162447', '2020052216244721994041088', 'log', null, null, null, null), ('20200522', '162447', '2020052216244734753224367', 'log', null, null, null, null), ('20200522', '162448', '2020052216244865164494589', 'log', null, null, null, null), ('20200522', '162449', '2020052216244903882016960', 'log', null, null, null, null), ('20200522', '163046', '2020052216304648902886540', 'log', null, null, '兰晶晶', null), ('20200522', '163151', '2020052216315157193075851', 'log', null, null, '兰晶晶', '1234'), ('20200522', '164022', '2020052216402221218940830', 'init', null, null, '江天明', '2234'), ('20200522', '164145', '2020052216414553582770180', 'after', null, null, '石业辉', '2234'), ('20200522', '174731', '2020052217473145405362950', 'after', null, null, '张三', '2234'), ('20200522', '174908', '2020052217490820657624961', 'after', null, null, '张三', '2234'), ('20200528', '161450', '2020052816144928314373860', 'after', null, null, '张三', '2234'), ('20200612', '160246', '2020061216024603275194750', 'after', null, null, '张三', '2234'), ('20200612', '161946', '2020061216194693742151830', 'after', null, null, '张三', '2234'), ('20200612', '162915', '2020061216291542557744900', 'after', null, null, '张三', '2234'), ('20200612', '164921', '2020061216492174142604150', 'after', null, null, '张三', '2234'), ('20200612', '165244', '2020061216524463030964280', 'after', null, null, '张三', '2234'), ('20200612', '170533', '2020061217053318821054890', 'after', null, null, '张三', '2234'), ('20200612', '170559', '2020061217055964428542911', 'after', null, null, '张三', '2234'), ('20200619', '171239', '2020061917123815527474530', 'after', null, null, '张三', '2234'), ('20200619', '173441', '2020061917344079690247400', 'after', null, null, '张三', '2234'), ('20200619', '174821', '2020061917482156112904340', 'after', null, null, '张三', '2234');
COMMIT;
