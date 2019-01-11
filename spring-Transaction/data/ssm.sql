/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-01-11 18:12:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for airplane
-- ----------------------------
DROP TABLE IF EXISTS `airplane`;
CREATE TABLE `airplane` (
  `id` bigint(20) NOT NULL,
  `airNo` varchar(255) NOT NULL,
  `time` int(11) NOT NULL,
  `price` double NOT NULL,
  `takePort` int(11) NOT NULL,
  `landPort` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_landPort` (`landPort`),
  KEY `fk_takePort` (`takePort`),
  CONSTRAINT `fk_takePort` FOREIGN KEY (`takePort`) REFERENCES `airport` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_landPort` FOREIGN KEY (`landPort`) REFERENCES `airport` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of airplane
-- ----------------------------

-- ----------------------------
-- Table structure for airport
-- ----------------------------
DROP TABLE IF EXISTS `airport`;
CREATE TABLE `airport` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `portName` varchar(255) NOT NULL,
  `cityName` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of airport
-- ----------------------------
INSERT INTO `airport` VALUES ('1', '首都机场', '北京');
INSERT INTO `airport` VALUES ('2', '南苑机场', '北京');
