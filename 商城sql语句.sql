/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : studay

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2016-08-10 18:48:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admininfo`
-- ----------------------------
DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `AdminID` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `AdminName` varchar(20) NOT NULL,
  `IdentityID` varchar(19) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `ProductEdit` enum('1','0') DEFAULT '0',
  `UserEdit` enum('1','0') DEFAULT '0',
  `OrderEdit` enum('1','0') DEFAULT '0',
  `AddAdmin` enum('1','0') DEFAULT '0',
  PRIMARY KEY (`AdminID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admininfo
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `fathercategoryid` int(11) NOT NULL,
  `name` varchar(128) NOT NULL,
  `description` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '0', '小说', '顶级分类');
INSERT INTO `category` VALUES ('2', '0', '文学', '顶级分类');
INSERT INTO `category` VALUES ('3', '0', '商业', '顶级分类');
INSERT INTO `category` VALUES ('4', '0', '艺术', '顶级分类');
INSERT INTO `category` VALUES ('5', '1', '当代小说', '当代小说');
INSERT INTO `category` VALUES ('6', '1', '当代小说', '当代小说');

-- ----------------------------
-- Table structure for `orderline`
-- ----------------------------
DROP TABLE IF EXISTS `orderline`;
CREATE TABLE `orderline` (
  `orderline_id` int(11) NOT NULL AUTO_INCREMENT,
  `orders_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `amount` decimal(20,2) NOT NULL,
  PRIMARY KEY (`orderline_id`),
  KEY `orderline_orders_id_fk` (`orders_id`),
  KEY `orderline_product_id_fk` (`product_id`),
  CONSTRAINT `orderline_product_id_fk` FOREIGN KEY (`product_id`) REFERENCES `product` (`product _id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `orderline_orders_id_fk` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`orders_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderline
-- ----------------------------

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `payway_id` int(11) DEFAULT NULL,
  `orderstatus_id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `cost` decimal(15,3) NOT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `orders_orderstatus_fk` (`orderstatus_id`),
  KEY `orders_payway_fk` (`payway_id`),
  KEY `orders_username_fk` (`username`),
  CONSTRAINT `orders_username_fk` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orders_orderstatus_fk` FOREIGN KEY (`orderstatus_id`) REFERENCES `orderstatus` (`orderstatus_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orders_payway_fk` FOREIGN KEY (`payway_id`) REFERENCES `payway` (`payway_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for `orderstatus`
-- ----------------------------
DROP TABLE IF EXISTS `orderstatus`;
CREATE TABLE `orderstatus` (
  `orderstatus_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`orderstatus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderstatus
-- ----------------------------

-- ----------------------------
-- Table structure for `payway`
-- ----------------------------
DROP TABLE IF EXISTS `payway`;
CREATE TABLE `payway` (
  `payway_id` int(11) NOT NULL,
  `paystyle` varchar(64) NOT NULL,
  PRIMARY KEY (`payway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payway
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product _id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `basePrice` decimal(12,2) NOT NULL,
  `category_id` int(11) NOT NULL,
  `author` varchar(128) NOT NULL,
  `publish` varchar(256) NOT NULL,
  `stock` int(11) NOT NULL,
  `images` varchar(128) NOT NULL,
  `intro` varchar(512) DEFAULT NULL,
  `url` varchar(100) NOT NULL,
  PRIMARY KEY (`product _id`),
  KEY `product_category_id_fk` (`category_id`),
  CONSTRAINT `product_category_id_fk` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '杜拉拉 2 华年似水(《杜拉拉升职记》第二部：超越职场的华年似水)', '28.50', '5', '李', '陕西师范大学出版', '283', 'images/product/zb_20232215_m.jpg', '希望这本虚构的小说，能够对人们的生活有一些超越职场规则的现', '');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(12) NOT NULL,
  `email` varchar(32) NOT NULL,
  `telephone` varchar(16) NOT NULL,
  `mobtelephone` varchar(16) DEFAULT NULL,
  `province` varchar(32) DEFAULT NULL,
  `city` varchar(32) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `state` int(11) NOT NULL,
  `confirmcode` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
