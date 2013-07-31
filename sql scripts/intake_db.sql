delimiter $$

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
  `GRADUATE_FLAG` varchar(1) DEFAULT NULL,
  `TRANSCRIPTS_FLAG` varchar(1) DEFAULT NULL,
  `ENGLISH_SPEAKING_FLAG` varchar(1) DEFAULT NULL,
  `ENGLISH_READING_FLAG` varchar(1) DEFAULT NULL,
  `HOME_LOCATION` varchar(45) DEFAULT NULL,
  `REFERRED_BY` varchar(45) DEFAULT NULL,
  `REFERRED_BY_PHONE` varchar(45) DEFAULT NULL,
  `EMERGENCY_CONTACT` varchar(45) DEFAULT NULL,
  `EMERGENCY_PHONE` varchar(45) DEFAULT NULL,
  `EMERGENCRY_RELATIONSHIP` varchar(45) DEFAULT NULL,
  `MOTHER_LIVING_FLAG` varchar(1) DEFAULT NULL,
  `FATHER_LIVING_FLAG` varchar(1) DEFAULT NULL,
  `BROTHERS` varchar(2) DEFAULT NULL,
  `SISTERS` varchar(2) DEFAULT NULL,
  `CHILDREN` varchar(2) DEFAULT NULL,
  `VETERAN_STATUS` varchar(25) DEFAULT NULL,
  `BRANCH_OF_SERVICE` varchar(45) DEFAULT NULL,
  `RANK` varchar(45) DEFAULT NULL,
  `LENGTH_OF_SERVICE` varchar(45) DEFAULT NULL,
  `DL_STATUS` varchar(45) DEFAULT NULL,
  `DL_NUMBER` varchar(45) DEFAULT NULL,
  `DL_STATE` varchar(45) DEFAULT NULL,
  `DL_EXP_DATE` varchar(45) DEFAULT NULL,
  `STATE_ID_FLAG` varchar(1) DEFAULT NULL,
  `STATE_ID_STATE` varchar(45) DEFAULT NULL,
  `STATE_ID_EXP_DATE` varchar(45) DEFAULT NULL,
  `GOVERNMENT_BENEFITS_FLAG` varchar(1) DEFAULT NULL,
  `RELIGION` varchar(45) DEFAULT NULL,
  `RELIGIOUS_EXPERIENCE` varchar(45) DEFAULT NULL,
  `ALCOHOL_FLAG` varchar(1) DEFAULT NULL,
  `COCAINE_FLAG` varchar(1) DEFAULT NULL,
  `MARIJUANA_FLAG` varchar(1) DEFAULT NULL,
  `OXYCODONE_FLAG` varchar(1) DEFAULT NULL,
  `SPEED_FLAG` varchar(1) DEFAULT NULL,
  `HEROIN_FLAG` varchar(1) DEFAULT NULL,
  `XANAX_FLAG` varchar(1) DEFAULT NULL,
  `OTHER_FLAG` varchar(1) DEFAULT NULL,
  `ALCOHOL_YEARS_USED` varchar(2) DEFAULT NULL,
  `COCAINE_YEARS_USED` varchar(2) DEFAULT NULL,
  `MARIJUANA_YEARS_USED` varchar(2) DEFAULT NULL,
  `OXYCODONE_YEARS_USED` varchar(2) DEFAULT NULL,
  `SPEED_YEARS_USED` varchar(2) DEFAULT NULL,
  `HEROIN_YEARS_USED` varchar(2) DEFAULT NULL,
  `XANAX_YEARS_USED` varchar(2) DEFAULT NULL,
  `OTHER_YEARS_USED` varchar(2) DEFAULT NULL,
  `SOBER_1_YEAR` varchar(15) DEFAULT NULL,
  `SOBER_3_YEARS` varchar(15) DEFAULT NULL,
  `USAGE_PATTERN` varchar(45) DEFAULT NULL,
  `QUANTITY_PER_WEEK` varchar(45) DEFAULT NULL,
  `QUANTITY_2_YEARS` varchar(45) DEFAULT NULL,
  `USAGE_LOSSES` varchar(45) DEFAULT NULL,
  `PHYSICAL_EFFECTS` varchar(45) DEFAULT NULL,
  `AA_FLAG` varchar(45) DEFAULT NULL,
  `NA_FLAG` varchar(45) DEFAULT NULL,
  `PREV_FF_FLAG` varchar(1) DEFAULT NULL,
  `PREV_FF_YEAR` varchar(45) DEFAULT NULL,
  `PREV_FF_OTHER` varchar(45) DEFAULT NULL,
  `CURRENT_HEALTH` varchar(45) DEFAULT NULL,
  `MEDICATION_FLAG` varchar(1) DEFAULT NULL,
  `MEDICATION_SUPPLY_FLAG` varchar(1) DEFAULT NULL,
  `MEDICATION_NEED_FLAG` varchar(1) DEFAULT NULL,
  `MEDICATION_DETAILS` varchar(45) DEFAULT NULL,
  `MEDICATION_REFILL_DETAILS` varchar(45) DEFAULT NULL,
  `DOCTOR_APPT_FLAG` varchar(1) DEFAULT NULL,
  `DOCTOR_APPT_DETAILS` varchar(45) DEFAULT NULL,
  `EYEWEAR_FLAG` varchar(1) DEFAULT NULL,
  `EYEWEAR_USAGE` varchar(45) DEFAULT NULL,
  `HOMELESS_TIME` varchar(45) DEFAULT NULL,
  `HOMELESS_REASON` varchar(45) DEFAULT NULL,
  `HOMELESS_HOW_OFTEN` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_FLAG` varchar(1) DEFAULT NULL,
  `INDUSTRIAL_INJURY_DATE` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_REASON` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_LOCATION` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_EMPLOYER` varchar(45) DEFAULT NULL,
  `INDUSTRIAL_INJURY_CLAIM_STATUS` varchar(45) DEFAULT NULL,
  `DISABILITY_FLAG` varchar(1) DEFAULT NULL,
  `DISABILITY_DETAILS` varchar(45) DEFAULT NULL,
  `DISABILITY_EXAMINATION_DATE` varchar(45) DEFAULT NULL,
  `DISABILITY_PHYSICIAN` varchar(45) DEFAULT NULL,
  `DISABILITY_PHYSICIAN_ADDRESS` varchar(45) DEFAULT NULL,
  `HERNIA_SIDE` varchar(45) DEFAULT NULL,
  `HERNIA_OPERATION_FLAG` varchar(1) DEFAULT NULL,
  `HERNIA_DETAILS` varchar(45) DEFAULT NULL,
  `LAWSUIT_FLAG` varchar(45) DEFAULT NULL,
  `CURRENT_LAWSUIT_FLAG` varchar(1) DEFAULT NULL,
  `LAWSUIT_DETAILS` varchar(45) DEFAULT NULL,
  `CURRENT_LAWSUIT_DETAILS` varchar(150) DEFAULT NULL,
  `FELONY_FLAG` varchar(45) DEFAULT NULL,
  `SEXUAL_OFFENSE_FLAG` varchar(1) DEFAULT NULL,
  `FELONY_DETAILS` varchar(150) DEFAULT NULL,
  `SEXUAL_OFFENSE_QTY` varchar(2) DEFAULT NULL,
  `SEXUAL_OFFENSE_DETAILS` varchar(150) DEFAULT NULL,
  `PROBATION_FLAG` varchar(1) DEFAULT NULL,
  `PROBATION_COUNTY_STATE` varchar(45) DEFAULT NULL,
  `PROBATION_OFFICER` varchar(45) DEFAULT NULL,
  `PROBATION_OFFICER_PHONE` varchar(45) DEFAULT NULL,
  `PROBATION_APPT_FLAG` varchar(1) DEFAULT NULL,
  `PROBATION_APPT_DETAILS` varchar(150) DEFAULT NULL,
  `INCOME_AMOUNT` varchar(45) DEFAULT NULL,
  `INCOME_SOURCE` varchar(45) DEFAULT NULL,
  `INCOME_WEEKLY_FLAG` varchar(1) DEFAULT NULL,
  `INCOME_MONTHLY_FLAG` varchar(1) DEFAULT NULL,
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
  `INTAKEcol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_employer` (
  `INTAKE_EMPLOYER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `COMPANY_NAME` varchar(45) NOT NULL,
  `CONTACT_NAME` varchar(45) NOT NULL,
  `CONTACT_PHONE` varchar(45) NOT NULL,
  `BEGIN_DATE` varchar(45) NOT NULL,
  `END_DATE` varchar(45) DEFAULT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`INTAKE_EMPLOYER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_job_skill` (
  `INTAKE_JOB_SKILL_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `JOB_SKILL_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`INTAKE_JOB_SKILL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_medical_condition` (
  `INTAKE_MEDICAL_CONDITION_ID` bigint(20) NOT NULL,
  `INTAKE_ID` bigint(20) NOT NULL,
  `VALUE` varchar(3) NOT NULL DEFAULT 'NO',
  PRIMARY KEY (`INTAKE_MEDICAL_CONDITION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_quesiton_answer_date` (
  `INTAKE_QUESITON_ANSWER_DATE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `INTAKE_QUESITON_ANSWER` bigint(20) NOT NULL,
  `DETAIL_DATE` varchar(45) NOT NULL,
  PRIMARY KEY (`INTAKE_QUESITON_ANSWER_DATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_question_answer` (
  `INTAKE_QUESTION_ANSWER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `QUESTION_ID` bigint(20) NOT NULL,
  `ANSWER` varchar(3) DEFAULT 'NO',
  `INTAKE_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`INTAKE_QUESTION_ANSWER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_question_answer_detail` (
  `INTAKE_QUESTION_ANSWER_DETAIL_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `INTAKE_QUESTION_ANSWER_ID` bigint(20) NOT NULL,
  `DETAIL` varchar(150) NOT NULL,
  PRIMARY KEY (`INTAKE_QUESTION_ANSWER_DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `intake_reference` (
  `INTAKE_REFERENCE` bigint(20) NOT NULL AUTO_INCREMENT,
  `INTAKE_ID` bigint(20) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `CONTACT_PHONE` varchar(45) DEFAULT NULL,
  `CONTACT_EMAIL` varchar(45) DEFAULT NULL,
  `YEARS_KNOWN` varchar(45) DEFAULT NULL,
  `RELATIONSHIP` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`INTAKE_REFERENCE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `job_skill` (
  `JOB_SKILL_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(45) NOT NULL,
  PRIMARY KEY (`JOB_SKILL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `medical_condition` (
  `MEDICAL_CONDITION_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(45) NOT NULL,
  PRIMARY KEY (`MEDICAL_CONDITION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `question` (
  `QUESTION_ID` bigint(20) NOT NULL,
  `QUESTION` varchar(250) NOT NULL,
  PRIMARY KEY (`QUESTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

