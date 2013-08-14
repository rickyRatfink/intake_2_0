/*
SQLyog Trial v11.2 (64 bit)
MySQL - 5.6.12 : Database - ffarm_dev
*********************************************************************
*/ 

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ffarm_dev` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ffarm_dev`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `ADDRESS_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DONOR_ID` bigint(20) DEFAULT NULL,
  `LINE1` varchar(60) NOT NULL,
  `LINE2` varchar(60) DEFAULT NULL,
  `CITY` varchar(45) NOT NULL,
  `STATE` varchar(25) NOT NULL,
  `ZIPCODE` varchar(10) NOT NULL,
  `MAJOR_INTERSECTION` varchar(45) NOT NULL,
  `SUBDIVISION` varchar(45) DEFAULT NULL,
  `STREET_SUFFIX` varchar(20) DEFAULT NULL,
  `STRUCTURE_TYPE` varchar(45) DEFAULT NULL,
  `UNIT` varchar(10) DEFAULT NULL,
  `BUILDING` varchar(10) DEFAULT NULL,
  `FLOOR` varchar(3) DEFAULT NULL,
  `ELEVATOR_FLAG` varchar(3) DEFAULT 'No',
  `GATED_FLAG` varchar(3) DEFAULT 'No',
  `GATE_INSTRUCTIONS` varchar(60) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `LAST_UPDATED_BY` varchar(45) DEFAULT NULL,
  `LAST_UPDATED_DATE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ADDRESS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `address` */

insert  into `address`(`ADDRESS_ID`,`DONOR_ID`,`LINE1`,`LINE2`,`CITY`,`STATE`,`ZIPCODE`,`MAJOR_INTERSECTION`,`SUBDIVISION`,`STREET_SUFFIX`,`STRUCTURE_TYPE`,`UNIT`,`BUILDING`,`FLOOR`,`ELEVATOR_FLAG`,`GATED_FLAG`,`GATE_INSTRUCTIONS`,`CREATED_BY`,`LAST_UPDATED_BY`,`LAST_UPDATED_DATE`) values (1,1,'2089 HUGH LILLIOTT','','PERRY','FLORIDA','32347','HWY 19','','ROAD','HOME','','','','','Y','CALLBOX CODE','null','admin','1375122924068'),(2,2,'2090 HUGH LILLIOTT','','PERRY','FLORIDA','32347','HWY 19','','ROAD','HOME','','','','','','','null','admin','1375121083469'),(3,3,'89 WILLOW STREET','','NYC','NEW YORK','34958','PARK AVE','','STREET','CONDOMINIUM','','','','Y','Y','ASK SECURITY','admin','admin','1375123954171'),(4,10001,'11 MAIN STREET','','WPB','FLORIDA','34850','I95','','AVENUE','BUSINESS','','','','','No','','admin',NULL,NULL),(5,10002,'1900 PUCKETT ROAD','','JACKSONVILLE','FLORIDA','30282','I-10','','BOULEVARD','CONDOMINIUM','','','','','NO','','admin',NULL,NULL),(6,10003,'1900 PUCKETT ROAD','','JACKSONVILLE','FLORIDA','30282','I-10','','BOULEVARD','CONDOMINIUM','','','','','NO','','admin',NULL,NULL);

/*Table structure for table `call_log` */

DROP TABLE IF EXISTS `call_log`;

CREATE TABLE `call_log` (
  `CALL_LOG_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CALL_TYPE` varchar(45) NOT NULL,
  `SOURCE` varchar(60) NOT NULL,
  `CALL_DATE` varchar(45) NOT NULL,
  `CALL_AGENT` varchar(25) NOT NULL,
  `FARM_BASE` varchar(45) NOT NULL,
  PRIMARY KEY (`CALL_LOG_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `call_log` */

insert  into `call_log`(`CALL_LOG_ID`,`CALL_TYPE`,`SOURCE`,`CALL_DATE`,`CALL_AGENT`,`FARM_BASE`) values (1,'New Ticket','TRUCKS','1375709316703','BOYNTON BEACH','admin');

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `COURSE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(25) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `BEGIN_DATE` varchar(10) DEFAULT NULL,
  `END_DATE` varchar(10) DEFAULT NULL,
  `BEGIN_TIME` varchar(10) DEFAULT NULL,
  `END_TIME` varchar(10) DEFAULT NULL,
  `MEETING_DAYS` varchar(7) DEFAULT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`COURSE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `course_instructor` */

DROP TABLE IF EXISTS `course_instructor`;

CREATE TABLE `course_instructor` (
  `COURSE_INSTRUCTOR_ID` bigint(20) NOT NULL,
  `COURSE_ID` bigint(20) NOT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`COURSE_INSTRUCTOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course_instructor` */

/*Table structure for table `cwt_certification_student_exam` */

DROP TABLE IF EXISTS `cwt_certification_student_exam`;

CREATE TABLE `cwt_certification_student_exam` (
  `certification_exam_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `program_id` bigint(20) NOT NULL,
  `exam_date` varchar(20) DEFAULT NULL,
  `grade` varchar(10) DEFAULT NULL,
  `intake_id` bigint(20) NOT NULL,
  `creation_date` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`certification_exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_certification_student_exam` */

/*Table structure for table `cwt_job_assignment_program` */

DROP TABLE IF EXISTS `cwt_job_assignment_program`;

CREATE TABLE `cwt_job_assignment_program` (
  `program_id` bigint(20) NOT NULL,
  `job_assignment_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_job_assignment_program` */

/*Table structure for table `cwt_metrics` */

DROP TABLE IF EXISTS `cwt_metrics`;

CREATE TABLE `cwt_metrics` (
  `metric_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `metric_name` varchar(50) DEFAULT NULL,
  `description` varchar(150) DEFAULT NULL,
  `creation_date` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`metric_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_metrics` */

/*Table structure for table `cwt_module_offering` */

DROP TABLE IF EXISTS `cwt_module_offering`;

CREATE TABLE `cwt_module_offering` (
  `module_offering_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `module_id` bigint(20) DEFAULT NULL,
  `meeting_days` varchar(10) DEFAULT NULL,
  `meeting_times` varchar(10) DEFAULT NULL,
  `credit_hours` varchar(3) DEFAULT NULL,
  `instructor_id` bigint(20) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `effective_date` varchar(20) DEFAULT NULL,
  `expiration_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`module_offering_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_module_offering` */

/*Table structure for table `cwt_module_student` */

DROP TABLE IF EXISTS `cwt_module_student`;

CREATE TABLE `cwt_module_student` (
  `module_roster_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `module_offering_id` bigint(20) DEFAULT NULL,
  `intake_id` bigint(20) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `meeting_date` varchar(20) DEFAULT NULL,
  `completion_flag` varchar(20) DEFAULT NULL,
  `creation_date` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`module_roster_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_module_student` */

/*Table structure for table `cwt_modules` */

DROP TABLE IF EXISTS `cwt_modules`;

CREATE TABLE `cwt_modules` (
  `module_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `module_name` varchar(50) DEFAULT NULL,
  `description` varchar(150) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `creation_date` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_modules` */

/*Table structure for table `cwt_program` */

DROP TABLE IF EXISTS `cwt_program`;

CREATE TABLE `cwt_program` (
  `program_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `program_name` varchar(50) DEFAULT NULL,
  `description` varchar(150) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `creation_date` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`program_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_program` */

/*Table structure for table `cwt_program_metric_modules` */

DROP TABLE IF EXISTS `cwt_program_metric_modules`;

CREATE TABLE `cwt_program_metric_modules` (
  `program_metric_id` bigint(20) DEFAULT NULL,
  `module_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_program_metric_modules` */

/*Table structure for table `cwt_program_metrics` */

DROP TABLE IF EXISTS `cwt_program_metrics`;

CREATE TABLE `cwt_program_metrics` (
  `program_metric_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `metric_id` bigint(20) DEFAULT NULL,
  `program_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`program_metric_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cwt_program_metrics` */

/*Table structure for table `daily_limit` */

DROP TABLE IF EXISTS `daily_limit`;

CREATE TABLE `daily_limit` (
  `DAILY_LIMIT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DISPATCH_DATE` varchar(45) NOT NULL,
  `DAILY_LIMIT` int(11) NOT NULL DEFAULT '65',
  `UPDATED_BY` varchar(45) NOT NULL,
  `UPDATED_DATE` varchar(25) NOT NULL,
  `FARM_BASE` varchar(45) NOT NULL,
  PRIMARY KEY (`DAILY_LIMIT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `daily_limit` */

insert  into `daily_limit`(`DAILY_LIMIT_ID`,`DISPATCH_DATE`,`DAILY_LIMIT`,`UPDATED_BY`,`UPDATED_DATE`,`FARM_BASE`) values (1,'07/29/2013',90,'admin','1374939359030','BOYNTON BEACH'),(2,'07/29/2013',90,'admin','1374939359030','BOYNTON BEACH'),(3,'07/30/2013',60,'admin','1375191351504','BOYNTON BEACH'),(4,'07/25/2013',15,'admin','1374939890205','BOYNTON BEACH'),(5,'07/31/2013',75,'admin','1375191359707','BOYNTON BEACH'),(6,'07/11/2013',22,'1374940046457','admin','BOYNTON BEACH'),(7,'08/01/2013',85,'1375191379897','admin','BOYNTON BEACH'),(8,'08/02/2013',95,'1375191389361','admin','BOYNTON BEACH'),(9,'07/06/2013',110,'1375191396957','admin','BOYNTON BEACH'),(10,'08/03/2013',100,'1375191458633','admin','BOYNTON BEACH'),(11,'08/04/2013',0,'1375191469915','admin','BOYNTON BEACH'),(12,'08/05/2013',95,'1375191489130','admin','BOYNTON BEACH'),(13,'08/13/2013',90,'1375544194491','admin','BOYNTON BEACH');

/*Table structure for table `donation` */

DROP TABLE IF EXISTS `donation`;

CREATE TABLE `donation` (
  `DONATION_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DONOR_ID` bigint(20) NOT NULL,
  `CONFIRMATION_NUMBER` varchar(45) DEFAULT NULL,
  `DISPATCH_DATE` varchar(45) DEFAULT NULL,
  `STATUS` varchar(45) DEFAULT NULL,
  `SPECIAL_FLAG` varchar(45) DEFAULT 'No',
  `CALL_REQUIREMENTS` varchar(45) DEFAULT NULL,
  `AC` varchar(45) DEFAULT NULL,
  `BEDDING` varchar(45) DEFAULT NULL,
  `BEDDING_QTY_TYPE` varchar(45) DEFAULT NULL,
  `BOOKS` varchar(45) DEFAULT NULL,
  `BOOKS_QTY_TYPE` varchar(45) DEFAULT NULL,
  `CLOTHING` varchar(45) DEFAULT NULL,
  `CLOTHING_QTY_TYPE` varchar(45) DEFAULT NULL,
  `COMPUTER` varchar(45) DEFAULT NULL,
  `DESK` varchar(45) DEFAULT NULL,
  `CHEST` varchar(45) DEFAULT NULL,
  `ARMOIRE` varchar(45) DEFAULT NULL,
  `DRESSER` varchar(45) DEFAULT NULL,
  `MIRROR` varchar(45) DEFAULT NULL,
  `NIGHTSTAND` varchar(45) DEFAULT NULL,
  `HEADBOARD` varchar(45) DEFAULT NULL,
  `FOOTBOARD` varchar(45) DEFAULT NULL,
  `RAILS` varchar(45) DEFAULT NULL,
  `LAMP` varchar(45) DEFAULT NULL,
  `LAWN_FURNITURE` varchar(45) DEFAULT NULL,
  `MATTRESS` varchar(45) DEFAULT NULL,
  `MATTRESS_QTY_SIZE` varchar(45) DEFAULT NULL,
  `MISC_HOUSEHOLD_ITEMS` varchar(45) DEFAULT NULL,
  `REFRIDGERATOR` varchar(45) DEFAULT NULL,
  `STOVE` varchar(45) DEFAULT NULL,
  `RECLINER` varchar(45) DEFAULT NULL,
  `SOFA` varchar(45) DEFAULT NULL,
  `LOVESEAT` varchar(45) DEFAULT NULL,
  `WALL_UNIT` varchar(45) DEFAULT NULL,
  `TABLES` varchar(45) DEFAULT NULL,
  `CHAIR` varchar(45) DEFAULT NULL,
  `TELEVISION` varchar(45) DEFAULT NULL,
  `TELEVISION_SIZE` varchar(45) DEFAULT NULL,
  `ELECTRONICS` varchar(45) DEFAULT NULL,
  `WASHER` varchar(45) DEFAULT NULL,
  `DRYER` varchar(45) DEFAULT NULL,
  `EXERCISE_EQUIPMENT` varchar(45) DEFAULT NULL,
  `SPECIAL_NOTES` varchar(100) DEFAULT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `LAST_UPDATED_DATE` varchar(45) DEFAULT NULL,
  `UPDATED_BY` varchar(45) DEFAULT NULL,
  `FARM_BASE` varchar(45) NOT NULL,
  PRIMARY KEY (`DONATION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=101552 DEFAULT CHARSET=utf8;

/*Data for the table `donation` */

insert  into `donation`(`DONATION_ID`,`DONOR_ID`,`CONFIRMATION_NUMBER`,`DISPATCH_DATE`,`STATUS`,`SPECIAL_FLAG`,`CALL_REQUIREMENTS`,`AC`,`BEDDING`,`BEDDING_QTY_TYPE`,`BOOKS`,`BOOKS_QTY_TYPE`,`CLOTHING`,`CLOTHING_QTY_TYPE`,`COMPUTER`,`DESK`,`CHEST`,`ARMOIRE`,`DRESSER`,`MIRROR`,`NIGHTSTAND`,`HEADBOARD`,`FOOTBOARD`,`RAILS`,`LAMP`,`LAWN_FURNITURE`,`MATTRESS`,`MATTRESS_QTY_SIZE`,`MISC_HOUSEHOLD_ITEMS`,`REFRIDGERATOR`,`STOVE`,`RECLINER`,`SOFA`,`LOVESEAT`,`WALL_UNIT`,`TABLES`,`CHAIR`,`TELEVISION`,`TELEVISION_SIZE`,`ELECTRONICS`,`WASHER`,`DRYER`,`EXERCISE_EQUIPMENT`,`SPECIAL_NOTES`,`CREATION_DATE`,`CREATED_BY`,`LAST_UPDATED_DATE`,`UPDATED_BY`,`FARM_BASE`) values (6,10002,'10002','07/29/2013','Pending','No','TAG(DONATION ONLY)','','','','','','','','','','','','','','','','','','','','','','','','','','1','','','','','','','','','','','','1375125435100','admin',NULL,NULL,'BOYNTON BEACH'),(7,10002,'0','07/31/2013','Pending','No','TAG(DONATION ONLY)','','','','','','4','BAGS','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','1375205568608','admin',NULL,NULL,'BOYNTON BEACH'),(8,10002,'0','07/31/2013','Pending','No','HALF-HOUR CALL','','','','','','','','','','','','','','','','','','','','','','','1','','','','','','','','','','','','','','','1375205691378','admin',NULL,NULL,'BOYNTON BEACH'),(9,10002,'0','07/31/2013','Pending','No','TAG(DONATION ONLY)','','','','','','','','','','','','','','','','','','','','','','','','','','','','','2','','','','','','','','','1375205719834','admin',NULL,NULL,'BOYNTON BEACH'),(10,10002,'0','07/31/2013','Pending','No','TAG(DONATION ONLY)','','','','','','','','','','','','','','','','','','','','','','','','','','','','','1','','','','','','','','','1375207232752','admin',NULL,NULL,'BOYNTON BEACH'),(101548,10002,'101548','07/31/2013','PENDING','NO','TAG(DONATION ONLY)',NULL,NULL,'2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'BOYNTON BEACH'),(101549,10002,NULL,'08/01/2013','PENDING','No','TAG(DONATION ONLY)','','','','','','','','','','','','','','','','1','','','','','','','','','','','','','','','','','','','','','','1375207461123','admin',NULL,NULL,'BOYNTON BEACH'),(101550,10002,NULL,'08/06/2013','PENDING','NO','TAG(DONATION ONLY)','','','','','','','','','','1','','','','','','','','','','','','','','','','','','','','','','','','','','','','1375709223282','admin',NULL,NULL,'BOYNTON BEACH'),(101551,10003,NULL,'08/06/2013','PENDING','NO','TAG(DONATION ONLY)','','','','','','','','','','1','','','','','','','','','','','','','','','','','','','','','','','','','','','','1375709311886','admin',NULL,NULL,'BOYNTON BEACH');

/*Table structure for table `donor` */

DROP TABLE IF EXISTS `donor`;

CREATE TABLE `donor` (
  `DONOR_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `LASTNAME` varchar(40) NOT NULL,
  `FIRSTNAME` varchar(40) NOT NULL,
  `SUFFIX` varchar(4) DEFAULT NULL,
  `CONTACT_PHONE` varchar(13) NOT NULL,
  `EMAIL_ADDRESS` varchar(60) NOT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `LAST_UPDATED_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(20) DEFAULT NULL,
  `UPDATED_BY` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DONOR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10004 DEFAULT CHARSET=utf8;

/*Data for the table `donor` */

insert  into `donor`(`DONOR_ID`,`LASTNAME`,`FIRSTNAME`,`SUFFIX`,`CONTACT_PHONE`,`EMAIL_ADDRESS`,`CREATION_DATE`,`LAST_UPDATED_DATE`,`CREATED_BY`,`UPDATED_BY`) values (1,'RATLIFF','RICKY','','(850)555-1212','RICKY.RAYMOND.RATLIFF@GMAIL.COM','1375112294516','1375122924025','null','admin'),(2,'RATLIFF','RICKY','','(850)555-1212','RRRATLIFF@YAHOO.COM','1375112369664','1375121083433','null','admin'),(3,'JOPLIN','JANICE','III','(213)555-1212','JJ@YAHOO.COM','1375123487315','1375123954132','','admin'),(10000,'JOHN','DOE',NULL,'(555)555-1212','JOHN_DOE@HOTMAIL.COM',NULL,NULL,'ADMIN',NULL),(10001,'SYNDROME','BUD','','(561)555-1212','SYNDROM@GMAIL.COM','1375124219954',NULL,'',NULL),(10002,'JONES','MARY','','(904)587-4837','MARY.JONES@GMAIL.COM','1375125434940',NULL,'',NULL),(10003,'JONES','MARY','','(904)587-4837','MARY.JONES@GMAIL.COM','1375709311824',NULL,'',NULL);

/*Table structure for table `intake` */

DROP TABLE IF EXISTS `intake`;

CREATE TABLE `intake` (
  `INTAKE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LASTNAME` varchar(30) DEFAULT NULL,
  `FIRSTNAME` varchar(30) DEFAULT NULL,
  `MI` varchar(1) DEFAULT NULL,
  `SUFFIX` varchar(5) DEFAULT NULL,
  `ADDRESS` varchar(45) DEFAULT NULL,
  `CITY` varchar(45) DEFAULT NULL,
  `STATE` varchar(25) DEFAULT NULL,
  `ZIPCODE` varchar(10) DEFAULT NULL,
  `DOB` varchar(10) DEFAULT NULL,
  `SSN` varchar(11) DEFAULT NULL,
  `SSN_CARD_FLAG` varchar(1) DEFAULT NULL,
  `AGE` varchar(2) DEFAULT NULL,
  `HEIGHT` varchar(4) DEFAULT NULL,
  `WEIGHT` varchar(3) DEFAULT NULL,
  `ETHNICITY` varchar(25) DEFAULT NULL,
  `HAIR_COLOR` varchar(20) DEFAULT NULL,
  `EYE_COLOR` varchar(20) DEFAULT NULL,
  `MARITAL_STATUS` varchar(20) DEFAULT NULL,
  `EDUCATION_LEVEL` varchar(25) DEFAULT NULL,
  `GRADUATE_FLAG` varchar(3) DEFAULT NULL,
  `TRANSCRIPTS_FLAG` varchar(3) DEFAULT NULL,
  `ENGLISH_SPEAKING_FLAG` varchar(3) DEFAULT NULL,
  `ENGLISH_READING_FLAG` varchar(3) DEFAULT NULL,
  `HOME_LOCATION` varchar(45) DEFAULT NULL,
  `REFERRED_BY` varchar(45) DEFAULT NULL,
  `REFERRED_BY_PHONE` varchar(45) DEFAULT NULL,
  `EMERGENCY_CONTACT` varchar(45) DEFAULT NULL,
  `EMERGENCY_PHONE` varchar(45) DEFAULT NULL,
  `EMERGENCRY_RELATIONSHIP` varchar(45) DEFAULT NULL,
  `MOTHER_LIVING_FLAG` varchar(3) DEFAULT NULL,
  `FATHER_LIVING_FLAG` varchar(3) DEFAULT NULL,
  `BROTHERS` varchar(2) DEFAULT NULL,
  `SISTERS` varchar(2) DEFAULT NULL,
  `CHILDREN` varchar(2) DEFAULT NULL,
  `VETERAN_STATUS` varchar(25) DEFAULT NULL,
  `BRANCH_OF_SERVICE` varchar(45) DEFAULT NULL,
  `RANK` varchar(45) DEFAULT NULL,
  `LENGTH_OF_SERVICE` varchar(45) DEFAULT NULL,
  `DL_FLAG` varchar(45) DEFAULT NULL,
  `DL_NUMBER` varchar(45) DEFAULT NULL,
  `DL_STATE` varchar(45) DEFAULT NULL,
  `DL_EXP_DATE` varchar(45) DEFAULT NULL,
  `STATE_ID_FLAG` varchar(3) DEFAULT NULL,
  `STATE_ID_STATE` varchar(45) DEFAULT NULL,
  `STATE_ID_EXP_DATE` varchar(45) DEFAULT NULL,
  `GOVERNMENT_BENEFITS_FLAG` varchar(60) DEFAULT NULL,
  `RELIGION` varchar(45) DEFAULT NULL,
  `RELIGIOUS_EXPERIENCE` varchar(45) DEFAULT NULL,
  `ALCOHOL_LAST_USED` varchar(15) DEFAULT NULL,
  `COCAINE_LAST_USED` varchar(15) DEFAULT NULL,
  `MARIJUANA_LAST_USED` varchar(15) DEFAULT NULL,
  `OXYCODONE_LAST_USED` varchar(15) DEFAULT NULL,
  `SPEED_LAST_USED` varchar(15) DEFAULT NULL,
  `HEROIN_LAST_USED` varchar(15) DEFAULT NULL,
  `XANAX_LAST_USED` varchar(15) DEFAULT NULL,
  `OTHER_LAST_USED` varchar(15) DEFAULT NULL,
  `ALCOHOL_YEARS_USED` varchar(15) DEFAULT NULL,
  `COCAINE_YEARS_USED` varchar(15) DEFAULT NULL,
  `MARIJUANA_YEARS_USED` varchar(15) DEFAULT NULL,
  `OXYCODONE_YEARS_USED` varchar(15) DEFAULT NULL,
  `SPEED_YEARS_USED` varchar(15) DEFAULT NULL,
  `HEROIN_YEARS_USED` varchar(15) DEFAULT NULL,
  `XANAX_YEARS_USED` varchar(15) DEFAULT NULL,
  `OTHER_YEARS_USED` varchar(15) DEFAULT NULL,
  `SOBER_1_YEAR` varchar(15) DEFAULT NULL,
  `SOBER_3_YEARS` varchar(15) DEFAULT NULL,
  `USAGE_PATTERN` varchar(45) DEFAULT NULL,
  `QUANTITY_PER_WEEK` varchar(45) DEFAULT NULL,
  `QUANTITY_2_YEARS` varchar(45) DEFAULT NULL,
  `USAGE_LOSSES` varchar(45) DEFAULT NULL,
  `PHYSICAL_EFFECTS` varchar(45) DEFAULT NULL,
  `AA_FLAG` varchar(45) DEFAULT NULL,
  `NA_FLAG` varchar(45) DEFAULT NULL,
  `PREV_FF_FLAG` varchar(3) DEFAULT NULL,
  `PREV_FF_YEAR` varchar(45) DEFAULT NULL,
  `PREV_FF_OTHER` varchar(45) DEFAULT NULL,
  `CURRENT_HEALTH` varchar(45) DEFAULT NULL,
  `MEDICATION_FLAG` varchar(3) DEFAULT NULL,
  `MEDICATION_SUPPLY_FLAG` varchar(3) DEFAULT NULL,
  `MEDICATION_NEED_FLAG` varchar(3) DEFAULT NULL,
  `MEDICATION_DETAILS` varchar(45) DEFAULT NULL,
  `MEDICATION_REFILL_DETAILS` varchar(45) DEFAULT NULL,
  `DOCTOR_APPT_FLAG` varchar(3) DEFAULT NULL,
  `DOCTOR_APPT_DETAILS` varchar(45) DEFAULT NULL,
  `EYEWEAR_FLAG` varchar(3) DEFAULT NULL,
  `EYEWEAR_USAGE` varchar(45) DEFAULT NULL,
  `HOMELESS_TIME` varchar(65) DEFAULT NULL,
  `HOMELESS_REASON` varchar(150) DEFAULT NULL,
  `HOMELESS_HOW_OFTEN` varchar(65) DEFAULT NULL,
  `INDUSTRIAL_INJURY_FLAG` varchar(3) DEFAULT NULL,
  `INDUSTRIAL_INJURY_DATE` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_REASON` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_LOCATION` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_EMPLOYER` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_CLAIM_STATUS` varchar(45) DEFAULT NULL,
  `DISABILITY_FLAG` varchar(3) DEFAULT NULL,
  `DISABILITY_DETAILS` varchar(45) DEFAULT NULL,
  `DISABILITY_EXAMINATION_DATE` varchar(45) DEFAULT NULL,
  `DISABILITY_PHYSICIAN` varchar(45) DEFAULT NULL,
  `DISABILITY_PHYSICIAN_ADDRESS` varchar(45) DEFAULT NULL,
  `HERNIA_SIDE` varchar(45) DEFAULT NULL,
  `HERNIA_OPERATION_FLAG` varchar(3) DEFAULT NULL,
  `HERNIA_DETAILS` varchar(45) DEFAULT NULL,
  `LAWSUIT_FLAG` varchar(45) DEFAULT NULL,
  `CURRENT_LAWSUIT_FLAG` varchar(3) DEFAULT NULL,
  `LAWSUIT_DETAILS` varchar(45) DEFAULT NULL,
  `CURRENT_LAWSUIT_DETAILS` varchar(150) DEFAULT NULL,
  `FELONY_FLAG` varchar(45) DEFAULT NULL,
  `SEXUAL_OFFENSE_FLAG` varchar(3) DEFAULT NULL,
  `FELONY_DETAILS` varchar(150) DEFAULT NULL,
  `SEXUAL_OFFENSE_QTY` varchar(2) DEFAULT NULL,
  `SEXUAL_OFFENSE_DETAILS` varchar(150) DEFAULT NULL,
  `PROBATION_FLAG` varchar(3) DEFAULT NULL,
  `PROBATION_COUNTY` varchar(45) DEFAULT NULL,
  `PROBATION_OFFICER` varchar(45) DEFAULT NULL,
  `PROBATION_OFFICER_PHONE` varchar(45) DEFAULT NULL,
  `PROBATION_APPT_FLAG` varchar(3) DEFAULT NULL,
  `PROBATION_APPT_DETAILS` varchar(150) DEFAULT NULL,
  `INCOME_AMOUNT` varchar(45) DEFAULT NULL,
  `INCOME_SOURCE` varchar(45) DEFAULT NULL,
  `INCOME_WEEKLY_FLAG` varchar(3) DEFAULT NULL,
  `INCOME_MONTHLY_FLAG` varchar(3) DEFAULT NULL,
  `APPLICATION_STATUS` varchar(45) DEFAULT NULL,
  `APPLICATION_SIGNATURE` varchar(45) DEFAULT NULL,
  `INTAKE_COUNSELOR_SIGNATURE` varchar(45) DEFAULT NULL,
  `DIRECTOR_SIGNATURE` varchar(45) DEFAULT NULL,
  `APPLICATION_SIGN_DATE` varchar(45) DEFAULT NULL,
  `INTAKE_COUNSELOR_SIGN_DATE` varchar(45) DEFAULT NULL,
  `DIRECTOR_SIGN_DATE` varchar(45) DEFAULT NULL,
  `CELL_DISCLOSURE_CONSENT` varchar(45) DEFAULT NULL,
  `RELEASE_WAIVER_CONSENT` varchar(45) DEFAULT NULL,
  `BIBLICAL_COUNSELING_CONSENT` varchar(45) DEFAULT NULL,
  `ENTRY_AGREEMENT_CONSENT` varchar(45) DEFAULT NULL,
  `RULES_VISITATION_CONSENT` varchar(45) DEFAULT NULL,
  `RELEASE_INFORMATION_CONSENT` varchar(45) DEFAULT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  `LAST_UPDATED_DATE` varchar(45) DEFAULT NULL,
  `LAST_UPDATED_BY` varchar(45) DEFAULT NULL,
  `SUBMISSION_DATE` varchar(45) DEFAULT NULL,
  `ENTRY_DATE` varchar(45) DEFAULT NULL,
  `INTAKE_STATUS` varchar(25) DEFAULT NULL,
  `IMAGE_HEADSHOT` blob,
  `IMAGE_STATE_ID` blob,
  `IMAGE_SSN` blob,
  `PROBATION_STATE` varchar(45) DEFAULT NULL,
  `RELATIONSHIP_WITH_MOTHER` varchar(45) DEFAULT NULL,
  `RELATIONSHIP_WITH_FATHER` varchar(45) DEFAULT NULL,
  `MEDICAL_CONDITION_DETAILS` varchar(60) DEFAULT NULL,
  `HERNIA_DATE` varchar(45) DEFAULT NULL,
  `OTHER_JOB_SKILL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=131 DEFAULT CHARSET=utf8;

/*Data for the table `intake` */

insert  into `intake`(`INTAKE_ID`,`LASTNAME`,`FIRSTNAME`,`MI`,`SUFFIX`,`ADDRESS`,`CITY`,`STATE`,`ZIPCODE`,`DOB`,`SSN`,`SSN_CARD_FLAG`,`AGE`,`HEIGHT`,`WEIGHT`,`ETHNICITY`,`HAIR_COLOR`,`EYE_COLOR`,`MARITAL_STATUS`,`EDUCATION_LEVEL`,`GRADUATE_FLAG`,`TRANSCRIPTS_FLAG`,`ENGLISH_SPEAKING_FLAG`,`ENGLISH_READING_FLAG`,`HOME_LOCATION`,`REFERRED_BY`,`REFERRED_BY_PHONE`,`EMERGENCY_CONTACT`,`EMERGENCY_PHONE`,`EMERGENCRY_RELATIONSHIP`,`MOTHER_LIVING_FLAG`,`FATHER_LIVING_FLAG`,`BROTHERS`,`SISTERS`,`CHILDREN`,`VETERAN_STATUS`,`BRANCH_OF_SERVICE`,`RANK`,`LENGTH_OF_SERVICE`,`DL_FLAG`,`DL_NUMBER`,`DL_STATE`,`DL_EXP_DATE`,`STATE_ID_FLAG`,`STATE_ID_STATE`,`STATE_ID_EXP_DATE`,`GOVERNMENT_BENEFITS_FLAG`,`RELIGION`,`RELIGIOUS_EXPERIENCE`,`ALCOHOL_LAST_USED`,`COCAINE_LAST_USED`,`MARIJUANA_LAST_USED`,`OXYCODONE_LAST_USED`,`SPEED_LAST_USED`,`HEROIN_LAST_USED`,`XANAX_LAST_USED`,`OTHER_LAST_USED`,`ALCOHOL_YEARS_USED`,`COCAINE_YEARS_USED`,`MARIJUANA_YEARS_USED`,`OXYCODONE_YEARS_USED`,`SPEED_YEARS_USED`,`HEROIN_YEARS_USED`,`XANAX_YEARS_USED`,`OTHER_YEARS_USED`,`SOBER_1_YEAR`,`SOBER_3_YEARS`,`USAGE_PATTERN`,`QUANTITY_PER_WEEK`,`QUANTITY_2_YEARS`,`USAGE_LOSSES`,`PHYSICAL_EFFECTS`,`AA_FLAG`,`NA_FLAG`,`PREV_FF_FLAG`,`PREV_FF_YEAR`,`PREV_FF_OTHER`,`CURRENT_HEALTH`,`MEDICATION_FLAG`,`MEDICATION_SUPPLY_FLAG`,`MEDICATION_NEED_FLAG`,`MEDICATION_DETAILS`,`MEDICATION_REFILL_DETAILS`,`DOCTOR_APPT_FLAG`,`DOCTOR_APPT_DETAILS`,`EYEWEAR_FLAG`,`EYEWEAR_USAGE`,`HOMELESS_TIME`,`HOMELESS_REASON`,`HOMELESS_HOW_OFTEN`,`INDUSTRIAL_INJURY_FLAG`,`INDUSTRIAL_INJURY_DATE`,`INDUSTRIAL_INJURY_REASON`,`INDUSTRIAL_INJURY_LOCATION`,`INDUSTRIAL_INJURY_EMPLOYER`,`INDUSTRIAL_INJURY_CLAIM_STATUS`,`DISABILITY_FLAG`,`DISABILITY_DETAILS`,`DISABILITY_EXAMINATION_DATE`,`DISABILITY_PHYSICIAN`,`DISABILITY_PHYSICIAN_ADDRESS`,`HERNIA_SIDE`,`HERNIA_OPERATION_FLAG`,`HERNIA_DETAILS`,`LAWSUIT_FLAG`,`CURRENT_LAWSUIT_FLAG`,`LAWSUIT_DETAILS`,`CURRENT_LAWSUIT_DETAILS`,`FELONY_FLAG`,`SEXUAL_OFFENSE_FLAG`,`FELONY_DETAILS`,`SEXUAL_OFFENSE_QTY`,`SEXUAL_OFFENSE_DETAILS`,`PROBATION_FLAG`,`PROBATION_COUNTY`,`PROBATION_OFFICER`,`PROBATION_OFFICER_PHONE`,`PROBATION_APPT_FLAG`,`PROBATION_APPT_DETAILS`,`INCOME_AMOUNT`,`INCOME_SOURCE`,`INCOME_WEEKLY_FLAG`,`INCOME_MONTHLY_FLAG`,`APPLICATION_STATUS`,`APPLICATION_SIGNATURE`,`INTAKE_COUNSELOR_SIGNATURE`,`DIRECTOR_SIGNATURE`,`APPLICATION_SIGN_DATE`,`INTAKE_COUNSELOR_SIGN_DATE`,`DIRECTOR_SIGN_DATE`,`CELL_DISCLOSURE_CONSENT`,`RELEASE_WAIVER_CONSENT`,`BIBLICAL_COUNSELING_CONSENT`,`ENTRY_AGREEMENT_CONSENT`,`RULES_VISITATION_CONSENT`,`RELEASE_INFORMATION_CONSENT`,`CREATION_DATE`,`CREATED_BY`,`LAST_UPDATED_DATE`,`LAST_UPDATED_BY`,`SUBMISSION_DATE`,`ENTRY_DATE`,`INTAKE_STATUS`,`IMAGE_HEADSHOT`,`IMAGE_STATE_ID`,`IMAGE_SSN`,`PROBATION_STATE`,`RELATIONSHIP_WITH_MOTHER`,`RELATIONSHIP_WITH_FATHER`,`MEDICAL_CONDITION_DETAILS`,`HERNIA_DATE`,`OTHER_JOB_SKILL`) values (129,'RATLIFF','RICKY','R','','2089 HUGH LILLIOTT RD','PERRY','Florida','32347','06/12/1973','555511212','','40','5\'9','190','White, not Hispanic','Brown','Brown','Never Married','Bachelor\'s Degree','YES','','YES','YES','Own Home','FRIEND','8505846174','RANDY RATLIFF','8505846174','FATHER','YES','YES','0','1','0','YES','Army','OFFICER','12 YEARS','YES','R341','Florida','','','','','Social Security VA Workmans Comp NONE','Christian','SOMETHING','a','b','c','d','e','f','g','h','1','2','3','4','5','6','7','8','12 MONTHS','1 YEAR','Constantly,,,,,','10','20','Job,,Friends,,,,,,','TREMORS','YES','','YES','2012','FT. LAUDERDALE','excellent','YES','YES','YES','ambien','','YES','october 31','YES','All the time','Less than 2 weeks','1 to 2 times','Lack of a fixed, regular and adequate night time residence.','YES','2007','INJURY','MILL','BUCKEYE','','YES','','JAN 2012','DR M','TALLY','','NO','','YES','YES','ABC','DEF','YES','YES','ghi','0','fjk','YES','TAYLOR','OFFICER JOHN','8505846174','YES','NOT SURE','90000','BCBS','YES','','PENDING','','','','','','','NO','NO','NO','NO','NO','NO','1375971580882','application','','','1375971580882','','','','','','Florida','GOOD','GOOD','','','programming'),(130,'RATLIFF','RICKY','R','','2089 HUGH LILLIOTT RD','PERRY','Florida','32347','06/12/1973','555511212','','40','5\'9','190','White, not Hispanic','Brown','Brown','Never Married','Bachelor\'s Degree','YES','','YES','YES','Own Home','FRIEND','8505846174','RANDY RATLIFF','8505846174','FATHER','YES','YES','0','1','0','YES','Army','OFFICER','12 YEARS','YES','R341','Florida','','','','','Social Security VA Workmans Comp NONE','Christian','SOMETHING','a','b','c','d','e','f','g','h','1','2','3','4','5','6','7','8','12 MONTHS','1 YEAR','Constantly,,,,,','10','20','Job,,Friends,,,,,,','TREMORS','YES','','YES','2012','FT. LAUDERDALE','excellent','YES','YES','YES','ambien','','YES','october 31','YES','All the time','Less than 2 weeks','1 to 2 times','Lack of a fixed, regular and adequate night time residence.','YES','2007','INJURY','MILL','BUCKEYE','','YES','','JAN 2012','DR M','TALLY','','NO','','YES','YES','ABC','DEF','YES','YES','ghi','0','fjk','YES','TAYLOR','OFFICER JOHN','8505846174','YES','NOT SURE','90000','BCBS','YES','','PENDING','','','','','','','NO','NO','NO','NO','NO','NO','1375971771709','application','','','1375971771709','','','','','','Florida','GOOD','GOOD','','','');

/*Table structure for table `intake_course_enrollment` */

DROP TABLE IF EXISTS `intake_course_enrollment`;

CREATE TABLE `intake_course_enrollment` (
  `INTAKE_COURSE_ENROLLMENT_ID` bigint(20) NOT NULL,
  `COURSE_ID` bigint(20) NOT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  `STATUS` varchar(15) NOT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_COURSE_ENROLLMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='			';

/*Data for the table `intake_course_enrollment` */

/*Table structure for table `intake_employer` */

DROP TABLE IF EXISTS `intake_employer`;

CREATE TABLE `intake_employer` (
  `INTAKE_EMPLOYER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `COMPANY_NAME` varchar(45) NOT NULL,
  `CONTACT_NAME` varchar(45) NOT NULL,
  `CONTACT_PHONE` varchar(45) NOT NULL,
  `BEGIN_DATE` varchar(45) NOT NULL,
  `END_DATE` varchar(45) DEFAULT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`INTAKE_EMPLOYER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `intake_employer` */

/*Table structure for table `intake_job_assignment` */

DROP TABLE IF EXISTS `intake_job_assignment`;

CREATE TABLE `intake_job_assignment` (
  `INTAKE_JOB_ASSIGNMENT_ID` bigint(20) NOT NULL,
  `JOB_ASSIGNMENT_ID` bigint(20) NOT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_JOB_ASSIGNMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `intake_job_assignment` */

/*Table structure for table `intake_job_history` */

DROP TABLE IF EXISTS `intake_job_history`;

CREATE TABLE `intake_job_history` (
  `INTAKE_JOB_HISTORY_ID` bigint(20) NOT NULL,
  `JOB_ASSIGNMENT_ID` bigint(20) NOT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  `BEGIN_DATE` varchar(10) NOT NULL,
  `END_DATE` varchar(10) DEFAULT NULL,
  `COMMENTS` varchar(200) DEFAULT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_JOB_HISTORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `intake_job_history` */

/*Table structure for table `intake_job_skill` */

DROP TABLE IF EXISTS `intake_job_skill`;

CREATE TABLE `intake_job_skill` (
  `INTAKE_JOB_SKILL_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `JOB_SKILL_ID` bigint(20) NOT NULL,
  `INTAKE_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_JOB_SKILL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `intake_job_skill` */

insert  into `intake_job_skill`(`INTAKE_JOB_SKILL_ID`,`JOB_SKILL_ID`,`INTAKE_ID`) values (4,1,'129'),(5,2,'129'),(6,20,'129'),(7,1,'130'),(8,2,'130'),(9,20,'130');

/*Table structure for table `intake_medical_condition` */

DROP TABLE IF EXISTS `intake_medical_condition`;

CREATE TABLE `intake_medical_condition` (
  `INTAKE_MEDICAL_CONDITION_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `INTAKE_ID` bigint(20) NOT NULL,
  `ANSWER` varchar(3) NOT NULL DEFAULT 'NO',
  `MEDICAL_CONDITION_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_MEDICAL_CONDITION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `intake_medical_condition` */

insert  into `intake_medical_condition`(`INTAKE_MEDICAL_CONDITION_ID`,`INTAKE_ID`,`ANSWER`,`MEDICAL_CONDITION_ID`) values (13,129,'YES',3),(14,129,'YES',5),(15,129,'YES',8),(16,129,'YES',10),(17,130,'YES',3),(18,130,'YES',5),(19,130,'YES',8),(20,130,'YES',10);

/*Table structure for table `intake_question_answer` */

DROP TABLE IF EXISTS `intake_question_answer`;

CREATE TABLE `intake_question_answer` (
  `INTAKE_QUESTION_ANSWER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `QUESTION_ID` bigint(20) NOT NULL,
  `ANSWER` varchar(3) DEFAULT 'NO',
  `INTAKE_ID` bigint(20) NOT NULL,
  `DETAIL` varchar(65) DEFAULT NULL,
  `DATES` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_QUESTION_ANSWER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

/*Data for the table `intake_question_answer` */

insert  into `intake_question_answer`(`INTAKE_QUESTION_ANSWER_ID`,`QUESTION_ID`,`ANSWER`,`INTAKE_ID`,`DETAIL`,`DATES`) values (69,3,'YES',129,'',''),(70,6,'YES',129,'',''),(71,15,'YES',129,'',''),(72,16,'YES',129,'MIKE SCARES ME','2 years'),(73,17,'YES',129,'NOGTHING','3 years'),(74,22,'YES',129,'the flu bug',''),(75,3,'YES',130,'',''),(76,6,'YES',130,'',''),(77,15,'YES',130,'',''),(78,16,'YES',130,'MIKE SCARES ME','2 years'),(79,17,'YES',130,'NOGTHING','3 years'),(80,22,'YES',130,'the flu bug','');

/*Table structure for table `intake_record_entry` */

DROP TABLE IF EXISTS `intake_record_entry`;

CREATE TABLE `intake_record_entry` (
  `INTAKE_RECORD_ENTRY_ID` int(11) NOT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  `RECORD_TYPE` varchar(25) DEFAULT NULL,
  `DESCRIPTION` longtext,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_RECORD_ENTRY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `intake_record_entry` */

/*Table structure for table `intake_reference` */

DROP TABLE IF EXISTS `intake_reference`;

CREATE TABLE `intake_reference` (
  `INTAKE_REFERENCE` bigint(20) NOT NULL AUTO_INCREMENT,
  `INTAKE_ID` bigint(20) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `CONTACT_PHONE` varchar(45) DEFAULT NULL,
  `CONTACT_EMAIL` varchar(45) DEFAULT NULL,
  `YEARS_KNOWN` varchar(45) DEFAULT NULL,
  `RELATIONSHIP` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_REFERENCE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `intake_reference` */

/*Table structure for table `job_assignment` */

DROP TABLE IF EXISTS `job_assignment`;

CREATE TABLE `job_assignment` (
  `JOB_ASSIGNMENTS_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(45) DEFAULT NULL,
  `DESCRIPTION` varchar(150) DEFAULT NULL,
  `DEPARTMENT` varchar(45) DEFAULT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`JOB_ASSIGNMENTS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='	';

/*Data for the table `job_assignment` */

/*Table structure for table `job_skill` */

DROP TABLE IF EXISTS `job_skill`;

CREATE TABLE `job_skill` (
  `JOB_SKILL_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(45) NOT NULL,
  PRIMARY KEY (`JOB_SKILL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `job_skill` */

insert  into `job_skill`(`JOB_SKILL_ID`,`DESCRIPTION`) values (1,'Office Work'),(2,'Mechanic'),(3,'Painter'),(4,'Upholstery'),(5,'Maintenance'),(6,'Electrician'),(7,'Cook'),(8,'Air Conditioning'),(9,'Radio/TV Repair'),(10,'Auto Body Repair'),(11,'Welder'),(12,'Carpenter'),(13,'Custodian'),(14,'Landscaping'),(15,'Warehousing'),(16,'Sales'),(17,'Appliance Repair'),(18,'Truck Driver'),(19,'Fork Lift Operator'),(20,'Computer Repair'),(21,'Plumber'),(22,'Kitchen'),(23,'Phone Room (general)'),(24,'Clothes Sorter'),(25,'Other');

/*Table structure for table `job_supervisor` */

DROP TABLE IF EXISTS `job_supervisor`;

CREATE TABLE `job_supervisor` (
  `JOB_SUPERVISOR_ID` bigint(20) NOT NULL,
  `LASTNAME` varchar(30) DEFAULT NULL,
  `FIRSTNAME` varchar(30) DEFAULT NULL,
  `JOB_ASSIGNMENT_ID` varchar(45) DEFAULT NULL,
  `CREATION_DATE` varchar(45) DEFAULT NULL,
  `CREATED_BY` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`JOB_SUPERVISOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `job_supervisor` */

/*Table structure for table `medical_condition` */

DROP TABLE IF EXISTS `medical_condition`;

CREATE TABLE `medical_condition` (
  `MEDICAL_CONDITION_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(45) NOT NULL,
  PRIMARY KEY (`MEDICAL_CONDITION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `medical_condition` */

insert  into `medical_condition`(`MEDICAL_CONDITION_ID`,`DESCRIPTION`) values (1,'Arthritis or Rheumatism'),(2,'Polio'),(3,'Amputations'),(4,'Dizziness or Fainting Spells'),(5,'Back Surgery'),(6,'Any Permanent Disabilities'),(7,'Head Injury'),(8,'Diabetes'),(9,'Hepatitis'),(10,'High Blood Pressure'),(11,'Epilepsy'),(12,'Cancer'),(13,'Kidney or Bladder Trouble'),(14,'Asthma'),(15,'HIV'),(16,'Phlebitis'),(17,'Varicose Veins'),(18,'Heart Problems'),(19,'Knee Injury'),(20,'Back Injury'),(21,'Loss of Hearing'),(22,'AIDS'),(23,'Hernia/Rupture'),(24,'Herpes'),(25,'Loss of Sight');

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `QUESTION_ID` bigint(20) DEFAULT NULL,
  `QUESTION` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question` */

insert  into `question`(`QUESTION_ID`,`QUESTION`) values (1,'Is your spouse addicted?'),(2,'Are any of your family members addicted?'),(3,'In the last month, have you taken a drink first thing in the morning to help recover from a hangover?'),(4,'In the last year, have you had a drink while driving or driven under the influence of alcohol?'),(5,'In the last 3 months, have you continued to drink until passing out?'),(6,'Are more than 50% of your friends drinkers?'),(7,'Do you consume more than 7 alcholic beverages per week?'),(8,'In the last 3 months, have you taken alcohol to work or drank at lunch or during your workday?'),(9,'Do you hide your drinking from friends or family?'),(10,'Have you failed to keep a promise to yourself or a loved one that you would quit drinking?'),(11,'Have you ever had trouble remembering what happened while you were drinking?'),(12,'In the last year, have you done anything while drinking that you regret doing?'),(13,'Do you find it difficult to stop after one or two drinks?'),(14,'In the last year, have you wet the bed or wet your pants during or after drinking?'),(15,'Have you ever woken up after drinking and not remembered how you got to where you were?'),(16,'Does anyone scare or threaten you or others?'),(17,'Does anyone act jealous or possessive toward you?'),(18,'Does anyone isolate from your family or friends?'),(19,'Does anyone own or use weapons to intimidate you?'),(20,'Does anyone break or strike objects to intimidate you?'),(21,'Has anyone ever become violent with you or others?'),(22,'Been treated for or told that you have any sickness or injury in the past 5 years?'),(23,'Consulted, been examined by or been treated by a doctor in the past 5 years?'),(24,'Been in a hospital, psychiatric hospital or other institution for diagnosis, treatment or operation in the past 5 years?'),(26,'Had any prior injuries to your back that would affect your lifting, bending, or twisting capabilities?'),(27,'Do you have any mental and/or emotional health problems?'),(28,'Have you ever been diagnosed and/or treated with mental or emotional health problems?'),(29,'Are you taking medication related to mental health?'),(30,'Are you prescribed medication related to mental health that you cannot afford?'),(31,'Are you prescribed medication related to mental health that you are not taking?'),(32,'Are you in need of any counseling or other mental health help?'),(25,'Been advised to have any hospital, clinical, surgical or other treatment in the past 5 years?');

/*Table structure for table `system_user` */

DROP TABLE IF EXISTS `system_user`;

CREATE TABLE `system_user` (
  `USER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(15) NOT NULL,
  `PASSWORD` varchar(10) NOT NULL,
  `CREATION_DATE` varchar(30) DEFAULT NULL,
  `LAST_UPDATED_DATE` varchar(10) DEFAULT NULL,
  `USER_ROLE` varchar(10) NOT NULL,
  `FARM_BASE` varchar(25) DEFAULT NULL,
  `LOGIN_COUNT` bigint(20) DEFAULT '0',
  `CREATED_BY` varchar(25) DEFAULT NULL,
  `QUESTION` varchar(45) DEFAULT NULL,
  `ANSWER` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10003 DEFAULT CHARSET=utf8;

/*Data for the table `system_user` */

insert  into `system_user`(`USER_ID`,`USERNAME`,`PASSWORD`,`CREATION_DATE`,`LAST_UPDATED_DATE`,`USER_ROLE`,`FARM_BASE`,`LOGIN_COUNT`,`CREATED_BY`,`QUESTION`,`ANSWER`) values (2,'agent','agent1',NULL,NULL,'AGENT','BOYNTON BEACH',25,NULL,'What is your mother\'s maiden name?','Deal'),(10000,'rratliff','a999919',NULL,NULL,'ADMIN','BOYNTON BEACH',6,'ADMIN','WHAT CITY WERE YOU BORN?','Perry'),(10002,'admin','admin','1374951183097',NULL,'ADMIN','BOYNTON BEACH',130,'rratliff',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
