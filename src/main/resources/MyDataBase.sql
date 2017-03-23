/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.9-log : Database - cfm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cfm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cfm`;

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 预约id',
  `phoneNum` varchar(11) NOT NULL DEFAULT '' COMMENT '手机号',
  `peopleCount` int(11) NOT NULL DEFAULT '1' COMMENT '人数',
  `earliestTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '最早到达时间',
  `latestTime` datetime DEFAULT '1970-01-01 00:00:00' COMMENT '最晚到达时间',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效  1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `appointment` */

/*Table structure for table `desk` */

DROP TABLE IF EXISTS `desk`;

CREATE TABLE `desk` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '桌位编号',
  `deskPeopleCount` int(11) NOT NULL DEFAULT '1' COMMENT '人数',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效 1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `desk` */

insert  into `desk`(`id`,`deskPeopleCount`,`dataFlag`) values (1,2,1),(2,2,1),(3,3,1),(4,4,1),(5,4,1),(6,4,1),(7,4,1),(8,4,1),(9,4,1),(10,4,1),(11,4,1),(12,4,1),(13,4,1),(14,4,1),(15,4,1);

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键 工号',
  `phone` varchar(11) NOT NULL DEFAULT '0' COMMENT '手机号',
  `empPassword` varchar(16) NOT NULL DEFAULT '' COMMENT '密码',
  `empName` varchar(20) NOT NULL DEFAULT '' COMMENT '姓名',
  `sex` int(11) NOT NULL DEFAULT '0' COMMENT '员工性别 1 男 2 女',
  `empRoot` int(11) NOT NULL DEFAULT '0' COMMENT '员工权限；0为厨师，1为服务员，2为管理员',
  `birthday` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '出生日期',
  `headImage` varchar(50) NOT NULL DEFAULT '' COMMENT '员工头像',
  `createTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效，1无效',
  PRIMARY KEY (`id`),
  KEY `userId` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `emp` */

insert  into `emp`(`id`,`phone`,`empPassword`,`empName`,`sex`,`empRoot`,`birthday`,`headImage`,`createTime`,`dataFlag`) values (1,'18852950823','111','郭伏正',0,1,'1970-01-01 00:00:00','','1970-01-01 00:00:00',0),(2,'18852950833','111','陈君芃',0,2,'1970-01-01 00:00:00','','1970-01-01 00:00:00',0),(3,'18852950861','111','曹永明',0,1,'1970-01-01 00:00:00','','1970-01-01 00:00:00',0),(4,'18852950875','111','陈方明',0,0,'1993-12-24 18:29:59','','1970-01-01 00:00:00',0);

/*Table structure for table `food` */

DROP TABLE IF EXISTS `food`;

CREATE TABLE `food` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜品编号',
  `foodName` varchar(50) NOT NULL DEFAULT '' COMMENT '菜品名称',
  `price` float NOT NULL DEFAULT '0' COMMENT '菜品价格',
  `store` int(11) NOT NULL DEFAULT '0' COMMENT '库存',
  `sales` int(11) NOT NULL DEFAULT '0' COMMENT '销量',
  `introduce` varchar(200) NOT NULL DEFAULT '' COMMENT '菜品介绍',
  `typeId` int(11) NOT NULL DEFAULT '0' COMMENT '类别编号',
  `signiture` int(11) NOT NULL DEFAULT '0' COMMENT '招牌菜 0不是 1是',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '是0有效  1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `food` */

/*Table structure for table `foodevaluation` */

DROP TABLE IF EXISTS `foodevaluation`;

CREATE TABLE `foodevaluation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userMark` int(11) NOT NULL DEFAULT '0' COMMENT '用户标识',
  `foodId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品编号',
  `content` varchar(200) NOT NULL DEFAULT '' COMMENT '评价内容',
  `evaScore` int(11) NOT NULL DEFAULT '0' COMMENT '评价星级 1~5',
  `createTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效 1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `foodevaluation` */

/*Table structure for table `foodimage` */

DROP TABLE IF EXISTS `foodimage`;

CREATE TABLE `foodimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `foodId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品编号',
  `foodImage` varchar(100) NOT NULL DEFAULT '' COMMENT '菜品图片',
  `createTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效 1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `foodimage` */

/*Table structure for table `foodorder` */

DROP TABLE IF EXISTS `foodorder`;

CREATE TABLE `foodorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userMark` int(11) NOT NULL DEFAULT '0' COMMENT '用户标识',
  `deskNo` int(11) NOT NULL DEFAULT '0' COMMENT '桌号',
  `orderNo` varchar(50) NOT NULL DEFAULT '' COMMENT '订单编号',
  `foodId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品编号',
  `foodName` varchar(50) NOT NULL DEFAULT '' COMMENT '菜品名称',
  `orderCount` int(11) NOT NULL DEFAULT '0' COMMENT '数量',
  `orderState` int(11) NOT NULL DEFAULT '0' COMMENT '菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送 6已评价',
  `remark` varchar(20) NOT NULL DEFAULT '' COMMENT '备注',
  `createTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效 1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `foodorder` */

/*Table structure for table `foodtype` */

DROP TABLE IF EXISTS `foodtype`;

CREATE TABLE `foodtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别编号',
  `typeName` varchar(50) NOT NULL DEFAULT '' COMMENT '类别名称',
  `createTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `dataFlag` int(11) NOT NULL DEFAULT '0' COMMENT '0有效  1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `foodtype` */

insert  into `foodtype`(`id`,`typeName`,`createTime`,`dataFlag`) values (1,'冷菜','1970-01-01 00:00:00',1),(2,'刨冰沙类','1970-01-01 00:00:00',1),(3,'招牌菜','1970-01-01 00:00:00',1),(4,'热菜','1970-01-01 00:00:00',1),(5,'酒水饮料','1970-01-01 00:00:00',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
