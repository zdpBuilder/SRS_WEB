/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.31-log : Database - srs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`srs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `srs`;

/*Table structure for table `course_catalog` */

DROP TABLE IF EXISTS `course_catalog`;

CREATE TABLE `course_catalog` (
  `course_no` varchar(6) NOT NULL,
  `course_name` varchar(30) DEFAULT NULL,
  `credits` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course_catalog` */

insert  into `course_catalog`(`course_no`,`course_name`,`credits`) values ('CS101','C程序设计','3'),('CS102','面向对象程序设计','3'),('CS103','数据结构与算法','3'),('MAT101','概率与统计','3'),('CS201','离散数学','3');

/*Table structure for table `faculty` */

DROP TABLE IF EXISTS `faculty`;

CREATE TABLE `faculty` (
  `name` varchar(60) NOT NULL,
  `pid` varchar(6) DEFAULT NULL,
  `title` varchar(30) DEFAULT NULL,
  `dept` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `faculty` */

insert  into `faculty`(`name`,`pid`,`title`,`dept`) values ('董永','123401','副教授','计算机科学与技术'),('赵云','123402','教授','计算机科学与技术'),('郭天','123403','教授','数学');

/*Table structure for table `schedule_course` */

DROP TABLE IF EXISTS `schedule_course`;

CREATE TABLE `schedule_course` (
  `course_no` varchar(6) NOT NULL,
  `calss_no` tinyint(4) DEFAULT NULL,
  `day_of_week` char(12) DEFAULT NULL,
  `time_of_day` varchar(50) DEFAULT NULL,
  `room` varchar(6) DEFAULT NULL,
  `capacity` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `schedule_course` */

insert  into `schedule_course`(`course_no`,`calss_no`,`day_of_week`,`time_of_day`,`room`,`capacity`) values ('CS101',1,'周一','上午8:00-10:00','A101',30),('CS101',2,'周二','上午8:00-10:00','A202',30),('CS102',1,'周三','下午2:00-4:00','C105',25),('CS102',2,'周四','下午4:00-6:00','D330',25),('CS103',1,'周一','下午6:00-8:00','E101',20),('MAT101',1,'周五','下午4:00-6:00','D241',15),('CS201',1,'周一','下午4:00-6:00','A205',1);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `name` varchar(60) NOT NULL,
  `id` varchar(9) DEFAULT NULL,
  `major` char(30) DEFAULT NULL,
  `degree` char(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`name`,`id`,`major`,`degree`) values ('张三','202001001',' 数学','学士'),('李四','202001002','计算机科学与技术','学士'),('王五','202001003','计算机科学与技术','学士');

/*Table structure for table `student_course` */

DROP TABLE IF EXISTS `student_course`;

CREATE TABLE `student_course` (
  `student_id` varchar(11) NOT NULL COMMENT '学生id',
  `course_id` varchar(11) NOT NULL COMMENT '课程id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_course` */

insert  into `student_course`(`student_id`,`course_id`) values ('202001001','hjggjh '),('202001001','hjggjh '),('202001002','1212');

/*Table structure for table `teaching_assignments` */

DROP TABLE IF EXISTS `teaching_assignments`;

CREATE TABLE `teaching_assignments` (
  `pid` varchar(6) NOT NULL,
  `calss_no` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teaching_assignments` */

insert  into `teaching_assignments`(`pid`,`calss_no`) values ('123403','CS101-1'),('123402','CS101-2'),('123401','CS102-1'),('123403','CS102-2'),('123401','CS103-1'),('123402','MAT101-1'),('123403','CS201-1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
