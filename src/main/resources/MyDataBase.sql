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
  `appointId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 预约id',
  `userAccount` varchar(11) NOT NULL DEFAULT '' COMMENT '预约人手机号',
  `appointUserName` varchar(20) NOT NULL COMMENT '预约人姓名',
  `appointTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '预约时间',
  `appointPeopleCount` int(11) NOT NULL DEFAULT '1' COMMENT '预约座位人数',
  `appointIsDelete` int(11) NOT NULL DEFAULT '0' COMMENT '否删除 0未删除  1删除',
  PRIMARY KEY (`appointId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `appointment` */

/*Table structure for table `desk` */

DROP TABLE IF EXISTS `desk`;

CREATE TABLE `desk` (
  `deskId` int(3) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '桌位编号',
  `deskPeopleCount` int(11) NOT NULL DEFAULT '1' COMMENT '桌位人数',
  `deskIsInUse` int(11) NOT NULL DEFAULT '0' COMMENT '是否正在被使用 0未使用  1 使用',
  `userAccount` varchar(11) NOT NULL DEFAULT '' COMMENT '当前客户',
  `deskIsDelete` int(11) NOT NULL DEFAULT '0' COMMENT '是否被删除 0未删除 1删除',
  PRIMARY KEY (`deskId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `desk` */

insert  into `desk`(`deskId`,`deskPeopleCount`,`deskIsInUse`,`userAccount`,`deskIsDelete`) values (001,2,0,'',1),(002,2,0,'',1),(003,3,0,'',1),(004,4,0,'',1),(005,4,0,'',1),(006,4,0,'',1),(007,4,0,'',1),(008,4,0,'',1),(009,4,0,'',1),(010,4,0,'',1),(011,4,0,'',1),(012,4,0,'',1),(013,4,0,'',1),(014,4,0,'',1),(015,4,0,'',1);

/*Table structure for table `food` */

DROP TABLE IF EXISTS `food`;

CREATE TABLE `food` (
  `foodId` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜品编号',
  `foodName` varchar(50) NOT NULL DEFAULT '' COMMENT '菜品名称',
  `foodPrice` float NOT NULL DEFAULT '0' COMMENT '菜品价格',
  `foodStore` int(11) NOT NULL DEFAULT '0' COMMENT '菜品库存',
  `foodSales` int(11) NOT NULL DEFAULT '0' COMMENT '菜品销量',
  `foodIntroduce` varchar(200) NOT NULL DEFAULT '' COMMENT '菜品介绍',
  `foodTypeId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品类别编号',
  `foodTypeName` varchar(50) NOT NULL DEFAULT '' COMMENT '菜品类别名称',
  `foodIsSpecialty` int(11) NOT NULL DEFAULT '0' COMMENT '是否为招牌菜 0不是1是',
  `foodIsDelete` int(11) NOT NULL DEFAULT '0' COMMENT '是否删除 0未删除  1删除',
  PRIMARY KEY (`foodId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `food` */

/*Table structure for table `foodevaluation` */

DROP TABLE IF EXISTS `foodevaluation`;

CREATE TABLE `foodevaluation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `foodId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品编号',
  `content` varchar(200) NOT NULL DEFAULT '' COMMENT '评价内容',
  `evaScore` int(11) NOT NULL DEFAULT '0' COMMENT '评价星级 1~5',
  `evaTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '评价时间',
  `userAccount` int(11) NOT NULL DEFAULT '0' COMMENT '用户账号',
  `evaIsDelete` int(11) NOT NULL DEFAULT '0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `foodevaluation` */

/*Table structure for table `foodimage` */

DROP TABLE IF EXISTS `foodimage`;

CREATE TABLE `foodimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `foodId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品编号',
  `foodImage` varchar(100) NOT NULL DEFAULT '' COMMENT '菜品图片',
  `foodImageIsDelete` int(11) DEFAULT '0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `foodimage` */

/*Table structure for table `foodorder` */

DROP TABLE IF EXISTS `foodorder`;

CREATE TABLE `foodorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `foodOrderNo` varchar(50) NOT NULL DEFAULT '' COMMENT '订单编号',
  `foodOrderTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '订单时间',
  `foodOrderState` int(11) NOT NULL DEFAULT '0' COMMENT '菜品状态 0 购物车 1待支付 2待后台支付 3后台确认支付 4制作中 5已派送',
  `foodOrderCount` int(11) NOT NULL DEFAULT '0' COMMENT '菜品数量',
  `foodId` int(11) NOT NULL DEFAULT '0' COMMENT '菜品编号',
  `foodName` varchar(50) NOT NULL COMMENT '菜品名称',
  `foodOrderEvaState` int(11) NOT NULL DEFAULT '0' COMMENT '评价状态  0 未评价  1评价',
  `foodOrderIsDelete` int(11) NOT NULL DEFAULT '1' COMMENT '是否删除 0 删除  1未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `foodorder` */

/*Table structure for table `foodtype` */

DROP TABLE IF EXISTS `foodtype`;

CREATE TABLE `foodtype` (
  `foodTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜品类别编号',
  `foodTypeName` varchar(50) NOT NULL DEFAULT '' COMMENT '菜品类别名称',
  `foodTypeIsDelete` int(11) DEFAULT '0' COMMENT '0未删除  1删除',
  PRIMARY KEY (`foodTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `foodtype` */

insert  into `foodtype`(`foodTypeId`,`foodTypeName`,`foodTypeIsDelete`) values (1,'冷菜',1),(2,'刨冰沙类',1),(3,'招牌菜',1),(4,'热菜',1),(5,'酒水饮料',1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userAccount` varchar(11) NOT NULL DEFAULT '0' COMMENT '用户账户,兼手机号',
  `userPassword` varchar(16) NOT NULL DEFAULT '' COMMENT '用户密码',
  `userName` varchar(20) NOT NULL DEFAULT '' COMMENT '用户姓名',
  `userSex` int(11) NOT NULL DEFAULT '0' COMMENT '用户性别 1 男 2 女',
  `userRoot` int(11) NOT NULL DEFAULT '0' COMMENT '用户权限；0为会员，1为厨师，2为服务员，3为管理员',
  `userBirthday` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '出生日期',
  `userHeadImage` varchar(50) NOT NULL DEFAULT '' COMMENT '用户头像',
  `userIsDelete` int(11) NOT NULL DEFAULT '0' COMMENT '是否删除  0未删除，1删除',
  `openId` varchar(100) NOT NULL DEFAULT '' COMMENT 'openId',
  `unionId` varchar(100) NOT NULL DEFAULT '' COMMENT 'unionId',
  PRIMARY KEY (`userAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userAccount`,`userPassword`,`userName`,`userSex`,`userRoot`,`userBirthday`,`userHeadImage`,`userIsDelete`,`openId`,`unionId`) values ('18852950823','18852950823','郭伏正',0,1,'1970-01-01 00:00:00','',0,'',''),('18852950833','18852950833','陈君芃',0,2,'1970-01-01 00:00:00','',0,'',''),('18852950861','18852950861','曹永明',0,3,'1970-01-01 00:00:00','',0,'',''),('18852950875','18852950875','陈方明',0,0,'1993-12-24 18:29:59','',0,'','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
