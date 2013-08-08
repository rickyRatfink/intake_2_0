package org.faithfarm.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Intake implements Serializable {
 
	private static Long intakeId; 
	private static String farmBase = ""; 
	private static String firstName = "";
	private static String lastName = "";
	private static String middleInitial = "";
	private static String suffix = "";
	private static String address = ""; 
	private static String city = "";  
	private static String state = "";
	private static String zipcode = "";
	private static String dateOfBirth = "";
	private static String ssn = "";
	private static String ssnCard = "";
	private static String age = "";
	private static String height = "";
	private static String weight = "";
	private static String ethnicity = "";
	private static String hairColor = "";
	private static String eyeColor = "";
	private static String maritalStatus = "";
	private static String educationLevel = "";
	private static String graduateFlag = "";
	private static String transcriptsFlag = "";
	private static String englishSpeakFlag = "";
	private static String englishReadFlag = "";
	private static String homeLocation = "";
	private static String personType = "";
	private static String referredBy = "";
	private static String referralPhone = "";
	private static String emergencyContact = "";
	private static String emergencyPhone = "";
	private static String emergencyRelationship = "";
	private static String motherLivingFlag="";
	private static String fatherLivingFlag="";
	private static String motherRelationship="";
	private static String fatherRelationship="";
	private static String brothers="";
	private static String sisters="";
	private static String children="";
	private static String veteranFlag = "NO";
	private static String branchOfService = "";
	private static String rank = "";
	private static String lengthOfService = "";
	private static String driversLicenseFlag = "";
	private static String driversLicenseStatus = "";
	private static String driversLicenseNumber = "";
	private static String driversLicenseState = "";
	private static String driversLicenseExpirationDate = "";
	private static String stateIdentificationFlag = "NO";
	private static String stateIdentificationState = "";
	private static String stateIdentificationExpirationDate = "";
	private static String governmentBenefits = "";
	private static String religion = "";
	private static String religiousExperience = "";
	private static String alcohol = "";
	private static String cocaine = "";
	private static String marijuana = "";
	private static String oxycodone = "";
	private static String speed = "";
	private static String heroin = "";
	private static String xanax = "";
	private static String other = "";
	private static String hallucinogensYearsUsed="";
	private static String hallucinogensLastUsed="";
	private static String alcoholYearsUsed = "";
	private static String cocaineYearsUsed = "";
	private static String marijuanaYearsUsed = "";
	private static String oxycodoneYearsUsed = "";
	private static String speedYearsUsed = "";
	private static String heroinYearsUsed = "";
	private static String xanaxYearsUsed = "";
	private static String otherYearsUsed = "";
	private static String alcoholLastUsed = "";
	private static String cocaineLastUsed = "";
	private static String marijuanaLastUsed = "";
	private static String oxycodoneLastUsed = "";
	private static String speedLastUsed = "";
	private static String heroinLastUsed = "";
	private static String xanaxLastUsed = "";
	private static String otherLastUsed = "";
	private static String otherDrug = "";
	private static String sober3Years = "";
	private static String sober1Years = "";
	private static String usagePattern = "";
	private static String usageLosses="";
	private static String usagePattern1 = "";
	private static String usagePattern2 = "";
	private static String usagePattern3 = "";
	private static String usagePattern4 = "";
	private static String usagePattern5 = "";
	private static String usagePattern6 = "";
	private static String usageLosses1 = "";
	private static String usageLosses2 = "";
	private static String usageLosses3 = "";
	private static String usageLosses4 = "";
	private static String usageLosses5 = "";
	private static String usageLosses6 = "";
	private static String usageLosses7 = "";
	private static String usageLosses8 = "";
	private static String usageLosses9 = "";
	private static String quantityPerWeek = "";
	private static String quantity2Years = "";	
	private static String abusePhysicalEffects = "";
	private static String spouseAddicted = "";
	private static String familyAddicted = "";
	private static String attendAA = "";
	private static String attendNA = "";
	private static String yearsAttended = "";
	private static String ffYearsAttended = "";
	private static String otherRehabs="";
	private static String previousFaithFarmFlag = "";
	private static String previousFaithFarm = "";
	private static String faithFarmYear = "";
	private static String currentHealth = "";
	private static String currentMedicationsFlag = "NO";
	private static String currentMedicationsDetails = "";
	private static String needMedicationFlag = "NO";
	private static String medicationSuppyFlag = "NO";
	private static String refillDetails = "";
	private static String doctorsAppointment = "";
	private static String doctorsAppointmentDate = "";
	private static String eyewearFlag = "NO";
	private static String eyewearUsage = "";
	private static String industrialInjuryFlag = "NO";
	private static String industrialInjuryDate = "";
	private static String industrialInjuryReason = "";
	private static String industrialInjuryLocation = "";
	private static String industrialInjuryEmployer = "";
	private static String industrialInjuryClaimStatus = "";
	private static String disabilityFlag = "NO";
	private static String disabilityDetails = "";
	private static String examinationDate = "";
	private static String physician = "";
	private static String physicianAddress = "";
	private static String herniaSide = "";
	private static String herniaOperationFlag = "NO";
	private static String herniaDate="";
	private static String herniaPhysician="";
	private static String qtyConsumed1="";
	private static String qtyConsumed2="";
	private static String currentMedications="";
	private static String refillDirections="";
	private static String medicalConditionDetails="";
	private static String otherJobSkill="";
	
	private static String question[] = new String[]{ 
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO","NO","NO","NO","NO" };
	
	private static String questionAnswerDetails[] = new String[]{ 
			"","","","","","",
			"","","","","","",
			"","","","","","",
			"","","","","","",
			"","","","","","","","","","" };
	
	private static String questionAnswerDates[] = new String[]{ 
		"","","","","","",
		"","","","","","",
		"","","","","","",
		"","","","","","",
		"","","","","","","","","","" };
	
	private static String medicalCondition[] = new String[]{ 
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO","NO","NO","NO","NO" };
	
	private static String workExperience[] = new String[]{ 
		"","","","","","","",
		"","","","","","","",
		"","","","","","","",
		"","","","","","","",
		"","","","","","",""};
	
	private static String workExperienceOther="";
	private static String workExperienceOtherDesc="";
	
	private static String employer1="";
	private static String employerContact1="";
	private static String employerPhone1="";
	private static String employerDates1="";
	
	private static String employer2="";
	private static String employerContact2="";
	private static String employerPhone2="";
	private static String employerDates2="";
	
	private static String employer3="";
	private static String employerContact3="";
	private static String employerPhone3="";
	private static String employerDates3="";
	
	private static String employer4="";
	private static String employerContact4="";
	private static String employerPhone4="";
	private static String employerDates4="";
	
	private static String lawsuitFlag="NO";
	private static String currentLawsuitFlag="NO";
	private static String lawsuitDetails="";
	private static String currentLawsuitDetails="";
	private static String lawsuitDate="";
	private static String currentLawsuitDate="";
	private static String felonyFlag= "NO";
	private static String sexualOffenseFlag= "NO";
	private static String felonyDetails= "";
	private static String sexualOffenseQty= "";
	private static String sexualOffenseDetails= "";
	private static String felonyQty="";
	
	private static String SSFlag="";
	private static String VAFlag="";
	private static String WCFlag="";
	private static String otherBenefits="";
	
	private static String probationFlag = "NO";
	private static String probationCounty = "";
	private static String probationState = "";
	private static String probationOfficer = "";
	private static String probationOfficerPhone = "";	
	private static String probationAppt="NO";
	private static String probationApptDetails="";
	private static String libraryCard = "";
	private static String birthCertFlag = "NO";
	private static String birthCertCounty = "";
	private static String birthCertState = "";
	private static String govtHealthCoverage = "";
	private static String privateHealthCoverage = "";
	private static String selectiveService = "";
	private static String pendingCourtDates = "";
	private static String childSupport = "";
	private static String restitution = "";
	private static String homelessLengthOfTime = "";
	private static String homelessHowOften="";
	private static String homelessReason = "";
	private static String incomeAmount = "";
	private static String incomeSource = "";
	private static String incomeWeeklyFlag = "NO";
	private static String incomeBiWeeklyFlag = "NO";
	private static String incomeMonthlyFlag = "NO";
	private static String incomeYearlyFlag = "NO";
	private static ArrayList answer = new ArrayList();
	private static ArrayList answerDetail = new ArrayList();
	private static ArrayList answerDate = new ArrayList();
	private static ArrayList medicationCondition = new ArrayList();
	private static ArrayList jobSkill = new ArrayList();
	private static ArrayList employer = new ArrayList();
	private static ArrayList reference = new ArrayList();
	private static ArrayList visitor = new ArrayList();
	private static ArrayList property = new ArrayList();
		
	private static String creationDate = "";
	private static String createdBy = "";
	private static String lastUpdatedDate = "";
	private static String lastUpdatedBy = "";
	private static String submissionDate = "";
	private static String applicationStatus = "PENDING";
	
	private static String applicationSignature = "";
	private static String intakeCounselorSignature = "";
	private static String directorSignature = "";
	private static String applicationSignatureDate = "";
	private static String intakeCounselorSignatureDate = "";
	private static String directorSignatureDate = "";
	
	private static String cellDisclosureConsent = "NO";
	private static String releaseWaiverConsent = "NO";
	private static String biblicalBasedCounselingConsent = "NO";
	private static String entryAgreementConsent = "NO";
	private static String rulesVisitationConsent = "NO";
	private static String releaseInformationConsent = "NO";
	private static String Consent = "NO";
	
	private static String entryDate ="";
	private static String intakeStatus = "";
	
	
	
	public static Long getIntakeId() {
		return intakeId;
	}
	public static void setIntakeId(Long intakeId) {
		Intake.intakeId = intakeId;
	}
	public static String getFarmBase() {
		return farmBase;
	}
	public static void setFarmBase(String farmBase) {
		Intake.farmBase = farmBase;
	}
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		Intake.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		Intake.lastName = lastName;
	}
	public static String getMiddleInitial() {
		return middleInitial;
	}
	public static void setMiddleInitial(String middleInitial) {
		Intake.middleInitial = middleInitial;
	}
	public static String getSuffix() {
		return suffix;
	}
	public static void setSuffix(String suffix) {
		Intake.suffix = suffix;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		Intake.address = address;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Intake.city = city;
	}
	public static String getState() {
		return state;
	}
	public static void setState(String state) {
		Intake.state = state;
	}
	public static String getZipcode() {
		return zipcode;
	}
	public static void setZipcode(String zipcode) {
		Intake.zipcode = zipcode;
	}
	public static String getDateOfBirth() {
		return dateOfBirth;
	}
	public static void setDateOfBirth(String dateOfBirth) {
		Intake.dateOfBirth = dateOfBirth;
	}
	public static String getSsn() {
		return ssn;
	}
	public static void setSsn(String ssn) {
		Intake.ssn = ssn;
	}
	public static String getSsnCard() {
		return ssnCard;
	}
	public static void setSsnCard(String ssnCard) {
		Intake.ssnCard = ssnCard;
	}
	public static String getAge() {
		return age;
	}
	public static void setAge(String age) {
		Intake.age = age;
	}
	public static String getHeight() {
		return height;
	}
	public static void setHeight(String height) {
		Intake.height = height;
	}
	public static String getWeight() {
		return weight;
	}
	public static void setWeight(String weight) {
		Intake.weight = weight;
	}
	public static String getEthnicity() {
		return ethnicity;
	}
	public static void setEthnicity(String ethnicity) {
		Intake.ethnicity = ethnicity;
	}
	public static String getHairColor() {
		return hairColor;
	}
	public static void setHairColor(String hairColor) {
		Intake.hairColor = hairColor;
	}
	public static String getEyeColor() {
		return eyeColor;
	}
	public static void setEyeColor(String eyeColor) {
		Intake.eyeColor = eyeColor;
	}
	public static String getMaritalStatus() {
		return maritalStatus;
	}
	public static void setMaritalStatus(String maritalStatus) {
		Intake.maritalStatus = maritalStatus;
	}
	public static String getEducationLevel() {
		return educationLevel;
	}
	public static void setEducationLevel(String educationLevel) {
		Intake.educationLevel = educationLevel;
	}
	public static String getGraduateFlag() {
		return graduateFlag;
	}
	public static void setGraduateFlag(String graduateFlag) {
		Intake.graduateFlag = graduateFlag;
	}
	public static String getTranscriptsFlag() {
		return transcriptsFlag;
	}
	public static void setTranscriptsFlag(String transcriptsFlag) {
		Intake.transcriptsFlag = transcriptsFlag;
	}
	public static String getEnglishSpeakFlag() {
		return englishSpeakFlag;
	}
	public static void setEnglishSpeakFlag(String englishSpeakFlag) {
		Intake.englishSpeakFlag = englishSpeakFlag;
	}
	public static String getEnglishReadFlag() {
		return englishReadFlag;
	}
	public static void setEnglishReadFlag(String englishReadFlag) {
		Intake.englishReadFlag = englishReadFlag;
	}
	public static String getHomeLocation() {
		return homeLocation;
	}
	public static void setHomeLocation(String homeLocation) {
		Intake.homeLocation = homeLocation;
	}
	public static String getPersonType() {
		return personType;
	}
	public static void setPersonType(String personType) {
		Intake.personType = personType;
	}
	public static String getReferredBy() {
		return referredBy;
	}
	public static void setReferredBy(String referredBy) {
		Intake.referredBy = referredBy;
	}
	public static String getReferralPhone() {
		return referralPhone;
	}
	public static void setReferralPhone(String referralPhone) {
		Intake.referralPhone = referralPhone;
	}
	public static String getEmergencyContact() {
		return emergencyContact;
	}
	public static void setEmergencyContact(String emergencyContact) {
		Intake.emergencyContact = emergencyContact;
	}
	public static String getEmergencyPhone() {
		return emergencyPhone;
	}
	public static void setEmergencyPhone(String emergencyPhone) {
		Intake.emergencyPhone = emergencyPhone;
	}
	public static String getEmergencyRelationship() {
		return emergencyRelationship;
	}
	public static void setEmergencyRelationship(String emergencyRelationship) {
		Intake.emergencyRelationship = emergencyRelationship;
	}
	
	public static String getMotherLivingFlag() {
		return motherLivingFlag;
	}
	public static void setMotherLivingFlag(String motherLivingFlag) {
		Intake.motherLivingFlag = motherLivingFlag;
	}
	public static String getFatherLivingFlag() {
		return fatherLivingFlag;
	}
	public static void setFatherLivingFlag(String fatherLivingFlag) {
		Intake.fatherLivingFlag = fatherLivingFlag;
	}
	public static String getMotherRelationship() {
		return motherRelationship;
	}
	public static void setMotherRelationship(String motherRelationship) {
		Intake.motherRelationship = motherRelationship;
	}
	public static String getFatherRelationship() {
		return fatherRelationship;
	}
	public static void setFatherRelationship(String fatherRelationship) {
		Intake.fatherRelationship = fatherRelationship;
	}
	public static String getBrothers() {
		return brothers;
	}
	public static void setBrothers(String brothers) {
		Intake.brothers = brothers;
	}
	public static String getSisters() {
		return sisters;
	}
	public static void setSisters(String sisters) {
		Intake.sisters = sisters;
	}
	public static String getChildren() {
		return children;
	}
	public static void setChildren(String children) {
		Intake.children = children;
	}
	
	public static String getVeteranFlag() {
		return veteranFlag;
	}
	public static void setVeteranFlag(String veteranFlag) {
		Intake.veteranFlag = veteranFlag;
	}
	public static String getBranchOfService() {
		return branchOfService;
	}
	public static void setBranchOfService(String branchOfService) {
		Intake.branchOfService = branchOfService;
	}
	public static String getRank() {
		return rank;
	}
	public static void setRank(String rank) {
		Intake.rank = rank;
	}
	public static String getLengthOfService() {
		return lengthOfService;
	}
	public static void setLengthOfService(String lengthOfService) {
		Intake.lengthOfService = lengthOfService;
	}
	public static String getDriversLicenseFlag() {
		return driversLicenseFlag;
	}
	public static void setDriversLicenseFlag(String driversLicenseFlag) {
		Intake.driversLicenseFlag = driversLicenseFlag;
	}
	public static String getDriversLicenseStatus() {
		return driversLicenseStatus;
	}
	public static void setDriversLicenseStatus(String driversLicenseStatus) {
		Intake.driversLicenseStatus = driversLicenseStatus;
	}
	public static String getDriversLicenseNumber() {
		return driversLicenseNumber;
	}
	public static void setDriversLicenseNumber(String driversLicenseNumber) {
		Intake.driversLicenseNumber = driversLicenseNumber;
	}
	public static String getDriversLicenseState() {
		return driversLicenseState;
	}
	public static void setDriversLicenseState(String driversLicenseState) {
		Intake.driversLicenseState = driversLicenseState;
	}
	public static String getDriversLicenseExpirationDate() {
		return driversLicenseExpirationDate;
	}
	public static void setDriversLicenseExpirationDate(
			String driversLicenseExpirationDate) {
		Intake.driversLicenseExpirationDate = driversLicenseExpirationDate;
	}
	public static String getStateIdentificationFlag() {
		return stateIdentificationFlag;
	}
	public static void setStateIdentificationFlag(String stateIdentificationFlag) {
		Intake.stateIdentificationFlag = stateIdentificationFlag;
	}
	public static String getStateIdentificationState() {
		return stateIdentificationState;
	}
	public static void setStateIdentificationState(String stateIdentificationState) {
		Intake.stateIdentificationState = stateIdentificationState;
	}
	public static String getStateIdentificationExpirationDate() {
		return stateIdentificationExpirationDate;
	}
	public static void setStateIdentificationExpirationDate(
			String stateIdentificationExpirationDate) {
		Intake.stateIdentificationExpirationDate = stateIdentificationExpirationDate;
	}
	public static String getGovernmentBenefits() {
		return governmentBenefits;
	}
	public static void setGovernmentBenefits(String governmentBenefits) {
		Intake.governmentBenefits = governmentBenefits;
	}
	public static String getReligion() {
		return religion;
	}
	public static void setReligion(String religion) {
		Intake.religion = religion;
	}
	public static String getReligiousExperience() {
		return religiousExperience;
	}
	public static void setReligiousExperience(String religiousExperience) {
		Intake.religiousExperience = religiousExperience;
	}
	public static String getAlcohol() {
		return alcohol;
	}
	public static void setAlcohol(String alcohol) {
		Intake.alcohol = alcohol;
	}
	public static String getCocaine() {
		return cocaine;
	}
	public static void setCocaine(String cocaine) {
		Intake.cocaine = cocaine;
	}
	public static String getMarijuana() {
		return marijuana;
	}
	public static void setMarijuana(String marijuana) {
		Intake.marijuana = marijuana;
	}
	public static String getOxycodone() {
		return oxycodone;
	}
	public static void setOxycodone(String oxycodone) {
		Intake.oxycodone = oxycodone;
	}
	public static String getSpeed() {
		return speed;
	}
	public static void setSpeed(String speed) {
		Intake.speed = speed;
	}
	public static String getHeroin() {
		return heroin;
	}
	public static void setHeroin(String heroin) {
		Intake.heroin = heroin;
	}
	public static String getXanax() {
		return xanax;
	}
	public static void setXanax(String xanax) {
		Intake.xanax = xanax;
	}
	public static String getOther() {
		return other;
	}
	public static void setOther(String other) {
		Intake.other = other;
	}
	public static String getAlcoholYearsUsed() {
		return alcoholYearsUsed;
	}
	public static void setAlcoholYearsUsed(String alcoholYearsUsed) {
		Intake.alcoholYearsUsed = alcoholYearsUsed;
	}
	public static String getCocaineYearsUsed() {
		return cocaineYearsUsed;
	}
	public static void setCocaineYearsUsed(String cocaineYearsUsed) {
		Intake.cocaineYearsUsed = cocaineYearsUsed;
	}
	public static String getMarijuanaYearsUsed() {
		return marijuanaYearsUsed;
	}
	public static void setMarijuanaYearsUsed(String marijuanaYearsUsed) {
		Intake.marijuanaYearsUsed = marijuanaYearsUsed;
	}
	public static String getOxycodoneYearsUsed() {
		return oxycodoneYearsUsed;
	}
	public static void setOxycodoneYearsUsed(String oxycodoneYearsUsed) {
		Intake.oxycodoneYearsUsed = oxycodoneYearsUsed;
	}
	public static String getSpeedYearsUsed() {
		return speedYearsUsed;
	}
	public static void setSpeedYearsUsed(String speedYearsUsed) {
		Intake.speedYearsUsed = speedYearsUsed;
	}
	public static String getHeroinYearsUsed() {
		return heroinYearsUsed;
	}
	public static void setHeroinYearsUsed(String heroinYearsUsed) {
		Intake.heroinYearsUsed = heroinYearsUsed;
	}
	public static String getXanaxYearsUsed() {
		return xanaxYearsUsed;
	}
	public static void setXanaxYearsUsed(String xanaxYearsUsed) {
		Intake.xanaxYearsUsed = xanaxYearsUsed;
	}
	public static String getOtherYearsUsed() {
		return otherYearsUsed;
	}
	public static void setOtherYearsUsed(String otherYearsUsed) {
		Intake.otherYearsUsed = otherYearsUsed;
	}
	public static String getAlcoholLastUsed() {
		return alcoholLastUsed;
	}
	public static void setAlcoholLastUsed(String alcoholLastUsed) {
		Intake.alcoholLastUsed = alcoholLastUsed;
	}
	public static String getCocaineLastUsed() {
		return cocaineLastUsed;
	}
	public static void setCocaineLastUsed(String cocaineLastUsed) {
		Intake.cocaineLastUsed = cocaineLastUsed;
	}
	public static String getMarijuanaLastUsed() {
		return marijuanaLastUsed;
	}
	public static void setMarijuanaLastUsed(String marijuanaLastUsed) {
		Intake.marijuanaLastUsed = marijuanaLastUsed;
	}
	public static String getOxycodoneLastUsed() {
		return oxycodoneLastUsed;
	}
	public static void setOxycodoneLastUsed(String oxycodoneLastUsed) {
		Intake.oxycodoneLastUsed = oxycodoneLastUsed;
	}
	public static String getSpeedLastUsed() {
		return speedLastUsed;
	}
	public static void setSpeedLastUsed(String speedLastUsed) {
		Intake.speedLastUsed = speedLastUsed;
	}
	public static String getHeroinLastUsed() {
		return heroinLastUsed;
	}
	public static void setHeroinLastUsed(String heroinLastUsed) {
		Intake.heroinLastUsed = heroinLastUsed;
	}
	public static String getXanaxLastUsed() {
		return xanaxLastUsed;
	}
	public static void setXanaxLastUsed(String xanaxLastUsed) {
		Intake.xanaxLastUsed = xanaxLastUsed;
	}
	public static String getOtherLastUsed() {
		return otherLastUsed;
	}
	public static void setOtherLastUsed(String otherLastUsed) {
		Intake.otherLastUsed = otherLastUsed;
	}
	public static String getOtherDrug() {
		return otherDrug;
	}
	public static void setOtherDrug(String otherDrug) {
		Intake.otherDrug = otherDrug;
	}
	public static String getSober3Years() {
		return sober3Years;
	}
	public static void setSober3Years(String sober3Years) {
		Intake.sober3Years = sober3Years;
	}
	public static String getSober1Years() {
		return sober1Years;
	}
	public static void setSober1Years(String sober1Years) {
		Intake.sober1Years = sober1Years;
	}
	
	public static String getUsagePattern1() {
		return usagePattern1;
	}
	public static void setUsagePattern1(String usagePattern1) {
		Intake.usagePattern1 = usagePattern1;
	}
	public static String getUsagePattern2() {
		return usagePattern2;
	}
	public static void setUsagePattern2(String usagePattern2) {
		Intake.usagePattern2 = usagePattern2;
	}
	public static String getUsagePattern3() {
		return usagePattern3;
	}
	public static void setUsagePattern3(String usagePattern3) {
		Intake.usagePattern3 = usagePattern3;
	}
	public static String getUsagePattern4() {
		return usagePattern4;
	}
	public static void setUsagePattern4(String usagePattern4) {
		Intake.usagePattern4 = usagePattern4;
	}
	public static String getUsagePattern5() {
		return usagePattern5;
	}
	public static void setUsagePattern5(String usagePattern5) {
		Intake.usagePattern5 = usagePattern5;
	}
	public static String getUsagePattern6() {
		return usagePattern6;
	}
	public static void setUsagePattern6(String usagePattern6) {
		Intake.usagePattern6 = usagePattern6;
	}
	public static String getUsageLosses1() {
		return usageLosses1;
	}
	public static void setUsageLosses1(String usageLosses1) {
		Intake.usageLosses1 = usageLosses1;
	}
	public static String getUsageLosses2() {
		return usageLosses2;
	}
	public static void setUsageLosses2(String usageLosses2) {
		Intake.usageLosses2 = usageLosses2;
	}
	public static String getUsageLosses3() {
		return usageLosses3;
	}
	public static void setUsageLosses3(String usageLosses3) {
		Intake.usageLosses3 = usageLosses3;
	}
	public static String getUsageLosses4() {
		return usageLosses4;
	}
	public static void setUsageLosses4(String usageLosses4) {
		Intake.usageLosses4 = usageLosses4;
	}
	public static String getUsageLosses5() {
		return usageLosses5;
	}
	public static void setUsageLosses5(String usageLosses5) {
		Intake.usageLosses5 = usageLosses5;
	}
	public static String getUsageLosses6() {
		return usageLosses6;
	}
	public static void setUsageLosses6(String usageLosses6) {
		Intake.usageLosses6 = usageLosses6;
	}
	public static String getUsageLosses7() {
		return usageLosses7;
	}
	public static void setUsageLosses7(String usageLosses7) {
		Intake.usageLosses7 = usageLosses7;
	}
	public static String getUsageLosses8() {
		return usageLosses8;
	}
	public static void setUsageLosses8(String usageLosses8) {
		Intake.usageLosses8 = usageLosses8;
	}
	public static String getUsageLosses9() {
		return usageLosses9;
	}
	public static void setUsageLosses9(String usageLosses9) {
		Intake.usageLosses9 = usageLosses9;
	}
	public static String getQuantityPerWeek() {
		return quantityPerWeek;
	}
	public static void setQuantityPerWeek(String quantityPerWeek) {
		Intake.quantityPerWeek = quantityPerWeek;
	}
	public static String getQuantity2Years() {
		return quantity2Years;
	}
	public static void setQuantity2Years(String quantity2Years) {
		Intake.quantity2Years = quantity2Years;
	}
	
	public static String getAbusePhysicalEffects() {
		return abusePhysicalEffects;
	}
	public static void setAbusePhysicalEffects(String abusePhysicalEffects) {
		Intake.abusePhysicalEffects = abusePhysicalEffects;
	}
	public static String getSpouseAddicted() {
		return spouseAddicted;
	}
	public static void setSpouseAddicted(String spouseAddicted) {
		Intake.spouseAddicted = spouseAddicted;
	}
	public static String getFamilyAddicted() {
		return familyAddicted;
	}
	public static void setFamilyAddicted(String familyAddicted) {
		Intake.familyAddicted = familyAddicted;
	}
	public static String getAttendAA() {
		return attendAA;
	}
	public static void setAttendAA(String attendAA) {
		Intake.attendAA = attendAA;
	}
	public static String getAttendNA() {
		return attendNA;
	}
	public static void setAttendNA(String attendNA) {
		Intake.attendNA = attendNA;
	}
	public static String getYearsAttended() {
		return yearsAttended;
	}
	public static void setYearsAttended(String yearsAttended) {
		Intake.yearsAttended = yearsAttended;
	}
	public static String getFfYearsAttended() {
		return ffYearsAttended;
	}
	public static void setFfYearsAttended(String ffYearsAttended) {
		Intake.ffYearsAttended = ffYearsAttended;
	}
	public static String getOtherRehabs() {
		return otherRehabs;
	}
	public static void setOtherRehabs(String otherRehabs) {
		Intake.otherRehabs = otherRehabs;
	}
	public static String getPreviousFaithFarm() {
		return previousFaithFarm;
	}
	public static void setPreviousFaithFarm(String previousFaithFarm) {
		Intake.previousFaithFarm = previousFaithFarm;
	}
	public static String getFaithFarmYear() {
		return faithFarmYear;
	}
	public static void setFaithFarmYear(String faithFarmYear) {
		Intake.faithFarmYear = faithFarmYear;
	}
	public static String getCurrentHealth() {
		return currentHealth;
	}
	public static void setCurrentHealth(String currentHealth) {
		Intake.currentHealth = currentHealth;
	}
	public static String getCurrentMedicationsFlag() {
		return currentMedicationsFlag;
	}
	public static void setCurrentMedicationsFlag(String currentMedicationsFlag) {
		Intake.currentMedicationsFlag = currentMedicationsFlag;
	}
	public static String getCurrentMedicationsDetails() {
		return currentMedicationsDetails;
	}
	public static void setCurrentMedicationsDetails(String currentMedicationsDetails) {
		Intake.currentMedicationsDetails = currentMedicationsDetails;
	}
	public static String getNeedMedicationFlag() {
		return needMedicationFlag;
	}
	public static void setNeedMedicationFlag(String needMedicationFlag) {
		Intake.needMedicationFlag = needMedicationFlag;
	}
	public static String getMedicationSuppyFlag() {
		return medicationSuppyFlag;
	}
	public static void setMedicationSuppyFlag(String medicationSuppyFlag) {
		Intake.medicationSuppyFlag = medicationSuppyFlag;
	}
	public static String getRefillDetails() {
		return refillDetails;
	}
	public static void setRefillDetails(String refillDetails) {
		Intake.refillDetails = refillDetails;
	}
	public static String getDoctorsAppointment() {
		return doctorsAppointment;
	}
	public static void setDoctorsAppointment(String doctorsAppointment) {
		Intake.doctorsAppointment = doctorsAppointment;
	}
	public static String getEyewearFlag() {
		return eyewearFlag;
	}
	public static void setEyewearFlag(String eyewearFlag) {
		Intake.eyewearFlag = eyewearFlag;
	}
	public static String getEyewearUsage() {
		return eyewearUsage;
	}
	public static void setEyewearUsage(String eyewearUsage) {
		Intake.eyewearUsage = eyewearUsage;
	}
	public static String getIndustrialInjuryFlag() {
		return industrialInjuryFlag;
	}
	public static void setIndustrialInjuryFlag(String industrialInjuryFlag) {
		Intake.industrialInjuryFlag = industrialInjuryFlag;
	}
	public static String getIndustrialInjuryDate() {
		return industrialInjuryDate;
	}
	public static void setIndustrialInjuryDate(String industrialInjuryDate) {
		Intake.industrialInjuryDate = industrialInjuryDate;
	}
	public static String getIndustrialInjuryReason() {
		return industrialInjuryReason;
	}
	public static void setIndustrialInjuryReason(String industrialInjuryReason) {
		Intake.industrialInjuryReason = industrialInjuryReason;
	}
	public static String getIndustrialInjuryLocation() {
		return industrialInjuryLocation;
	}
	public static void setIndustrialInjuryLocation(String industrialInjuryLocation) {
		Intake.industrialInjuryLocation = industrialInjuryLocation;
	}
	public static String getIndustrialInjuryEmployer() {
		return industrialInjuryEmployer;
	}
	public static void setIndustrialInjuryEmployer(String industrialInjuryEmployer) {
		Intake.industrialInjuryEmployer = industrialInjuryEmployer;
	}
	public static String getIndustrialInjuryClaimStatus() {
		return industrialInjuryClaimStatus;
	}
	public static void setIndustrialInjuryClaimStatus(
			String industrialInjuryClaimStatus) {
		Intake.industrialInjuryClaimStatus = industrialInjuryClaimStatus;
	}
	public static String getDisabilityFlag() {
		return disabilityFlag;
	}
	public static void setDisabilityFlag(String disabilityFlag) {
		Intake.disabilityFlag = disabilityFlag;
	}
	public static String getDisabilityDetails() {
		return disabilityDetails;
	}
	public static void setDisabilityDetails(String disabilityDetails) {
		Intake.disabilityDetails = disabilityDetails;
	}
	public static String getExaminationDate() {
		return examinationDate;
	}
	public static void setExaminationDate(String examinationDate) {
		Intake.examinationDate = examinationDate;
	}
	public static String getPhysician() {
		return physician;
	}
	public static void setPhysician(String physician) {
		Intake.physician = physician;
	}
	public static String getPhysicianAddress() {
		return physicianAddress;
	}
	public static void setPhysicianAddress(String physicianAddress) {
		Intake.physicianAddress = physicianAddress;
	}
	public static String getHerniaSide() {
		return herniaSide;
	}
	public static void setHerniaSide(String herniaSide) {
		Intake.herniaSide = herniaSide;
	}
	public static String getHerniaOperationFlag() {
		return herniaOperationFlag;
	}
	public static void setHerniaOperationFlag(String herniaOperationFlag) {
		Intake.herniaOperationFlag = herniaOperationFlag;
	}
	
	
	public static String getHerniaDate() {
		return herniaDate;
	}
	public static void setHerniaDate(String herniaDate) {
		Intake.herniaDate = herniaDate;
	}
	public static String getHerniaPhysician() {
		return herniaPhysician;
	}
	public static void setHerniaPhysician(String herniaPhysician) {
		Intake.herniaPhysician = herniaPhysician;
	}
	public static String getLawsuitFlag() {
		return lawsuitFlag;
	}
	public static void setLawsuitFlag(String lawsuitFlag) {
		Intake.lawsuitFlag = lawsuitFlag;
	}
	public static String getCurrentLawsuitFlag() {
		return currentLawsuitFlag;
	}
	public static void setCurrentLawsuitFlag(String currentLawsuitFlag) {
		Intake.currentLawsuitFlag = currentLawsuitFlag;
	}
	public static String getLawsuitDetails() {
		return lawsuitDetails;
	}
	public static void setLawsuitDetails(String lawsuitDetails) {
		Intake.lawsuitDetails = lawsuitDetails;
	}
	
	public static String getLawsuitDate() {
		return lawsuitDate;
	}
	public static void setLawsuitDate(String lawsuitDate) {
		Intake.lawsuitDate = lawsuitDate;
	}
	
	public static String getCurrentLawsuitDetails() {
		return currentLawsuitDetails;
	}
	public static void setCurrentLawsuitDetails(String currentLawsuitDetails) {
		Intake.currentLawsuitDetails = currentLawsuitDetails;
	}
	public static String getCurrentLawsuitDate() {
		return currentLawsuitDate;
	}
	public static void setCurrentLawsuitDate(String currentLawsuitDate) {
		Intake.currentLawsuitDate = currentLawsuitDate;
	}
	public static String getFelonyFlag() {
		return felonyFlag;
	}
	public static void setFelonyFlag(String felonyFlag) {
		Intake.felonyFlag = felonyFlag;
	}
	public static String getSexualOffenseFlag() {
		return sexualOffenseFlag;
	}
	public static void setSexualOffenseFlag(String sexualOffenseFlag) {
		Intake.sexualOffenseFlag = sexualOffenseFlag;
	}
	public static String getFelonyDetails() {
		return felonyDetails;
	}
	public static void setFelonyDetails(String felonyDetails) {
		Intake.felonyDetails = felonyDetails;
	}
	public static String getSexualOffenseQty() {
		return sexualOffenseQty;
	}
	public static void setSexualOffenseQty(String sexualOffenseQty) {
		Intake.sexualOffenseQty = sexualOffenseQty;
	}
	public static String getSexualOffenseDetails() {
		return sexualOffenseDetails;
	}
	public static void setSexualOffenseDetails(String sexualOffenseDetails) {
		Intake.sexualOffenseDetails = sexualOffenseDetails;
	}
	public static String getFelonyQty() {
		return felonyQty;
	}
	public static void setFelonyQty(String felonyQty) {
		Intake.felonyQty = felonyQty;
	}
	public static String getProbationFlag() {
		return probationFlag;
	}
	public static void setProbationFlag(String probationFlag) {
		Intake.probationFlag = probationFlag;
	}
	
	public static String getProbationCounty() {
		return probationCounty;
	}
	public static void setProbationCounty(String probationCounty) {
		Intake.probationCounty = probationCounty;
	}
	public static String getProbationState() {
		return probationState;
	}
	public static void setProbationState(String probationState) {
		Intake.probationState = probationState;
	}
	public static String getProbationOfficer() {
		return probationOfficer;
	}
	public static void setProbationOfficer(String probationOfficer) {
		Intake.probationOfficer = probationOfficer;
	}
	public static String getProbationOfficerPhone() {
		return probationOfficerPhone;
	}
	public static void setProbationOfficerPhone(String probationOfficerPhone) {
		Intake.probationOfficerPhone = probationOfficerPhone;
	}
	public static String getProbationAppt() {
		return probationAppt;
	}
	public static void setProbationAppt(String probationAppt) {
		Intake.probationAppt = probationAppt;
	}
	public static String getProbationApptDetails() {
		return probationApptDetails;
	}
	public static void setProbationApptDetails(String probationApptDetails) {
		Intake.probationApptDetails = probationApptDetails;
	}
	public static String getLibraryCard() {
		return libraryCard;
	}
	public static void setLibraryCard(String libraryCard) {
		Intake.libraryCard = libraryCard;
	}
	public static String getBirthCertFlag() {
		return birthCertFlag;
	}
	public static void setBirthCertFlag(String birthCertFlag) {
		Intake.birthCertFlag = birthCertFlag;
	}
	public static String getBirthCertCounty() {
		return birthCertCounty;
	}
	public static void setBirthCertCounty(String birthCertCounty) {
		Intake.birthCertCounty = birthCertCounty;
	}
	public static String getBirthCertState() {
		return birthCertState;
	}
	public static void setBirthCertState(String birthCertState) {
		Intake.birthCertState = birthCertState;
	}
	public static String getGovtHealthCoverage() {
		return govtHealthCoverage;
	}
	public static void setGovtHealthCoverage(String govtHealthCoverage) {
		Intake.govtHealthCoverage = govtHealthCoverage;
	}
	public static String getSelectiveService() {
		return selectiveService;
	}
	public static void setSelectiveService(String selectiveService) {
		Intake.selectiveService = selectiveService;
	}
	public static String getPendingCourtDates() {
		return pendingCourtDates;
	}
	public static void setPendingCourtDates(String pendingCourtDates) {
		Intake.pendingCourtDates = pendingCourtDates;
	}
	public static String getChildSupport() {
		return childSupport;
	}
	public static void setChildSupport(String childSupport) {
		Intake.childSupport = childSupport;
	}
	public static String getRestitution() {
		return restitution;
	}
	public static void setRestitution(String restitution) {
		Intake.restitution = restitution;
	}
	
	public static String getHomelessLengthOfTime() {
		return homelessLengthOfTime;
	}
	public static void setHomelessLengthOfTime(String homelessLengthOfTime) {
		Intake.homelessLengthOfTime = homelessLengthOfTime;
	}
	public static String getHomelessHowOften() {
		return homelessHowOften;
	}
	public static void setHomelessHowOften(String homelessHowOften) {
		Intake.homelessHowOften = homelessHowOften;
	}
	public static String getHomelessReason() {
		return homelessReason;
	}
	public static void setHomelessReason(String homelessReason) {
		Intake.homelessReason = homelessReason;
	}
	public static String getIncomeAmount() {
		return incomeAmount;
	}
	public static void setIncomeAmount(String incomeAmount) {
		Intake.incomeAmount = incomeAmount;
	}
	public static String getIncomeSource() {
		return incomeSource;
	}
	public static void setIncomeSource(String incomeSource) {
		Intake.incomeSource = incomeSource;
	}
	public static String getIncomeWeeklyFlag() {
		return incomeWeeklyFlag;
	}
	public static void setIncomeWeeklyFlag(String incomeWeeklyFlag) {
		Intake.incomeWeeklyFlag = incomeWeeklyFlag;
	}
	public static String getIncomeMonthlyFlag() {
		return incomeMonthlyFlag;
	}
	public static void setIncomeMonthlyFlag(String incomeMonthlyFlag) {
		Intake.incomeMonthlyFlag = incomeMonthlyFlag;
	}
	public static String getIncomeYearlyFlag() {
		return incomeYearlyFlag;
	}
	public static void setIncomeYearlyFlag(String incomeYearlyFlag) {
		Intake.incomeYearlyFlag = incomeYearlyFlag;
	}
	public static ArrayList getAnswer() {
		return answer;
	}
	public static void setAnswer(ArrayList answer) {
		Intake.answer = answer;
	}
	public static ArrayList getAnswerDetail() {
		return answerDetail;
	}
	public static void setAnswerDetail(ArrayList answerDetail) {
		Intake.answerDetail = answerDetail;
	}
	public static ArrayList getAnswerDate() {
		return answerDate;
	}
	public static void setAnswerDate(ArrayList answerDate) {
		Intake.answerDate = answerDate;
	}
	public static ArrayList getMedicationCondition() {
		return medicationCondition;
	}
	public static void setMedicationCondition(ArrayList medicationCondition) {
		Intake.medicationCondition = medicationCondition;
	}
	public static ArrayList getJobSkill() {
		return jobSkill;
	}
	public static void setJobSkill(ArrayList jobSkill) {
		Intake.jobSkill = jobSkill;
	}
	public static ArrayList getEmployer() {
		return employer;
	}
	public static void setEmployer(ArrayList employer) {
		Intake.employer = employer;
	}
	public static ArrayList getReference() {
		return reference;
	}
	public static void setReference(ArrayList reference) {
		Intake.reference = reference;
	}
	public static ArrayList getVisitor() {
		return visitor;
	}
	public static void setVisitor(ArrayList visitor) {
		Intake.visitor = visitor;
	}
	public static ArrayList getProperty() {
		return property;
	}
	public static void setProperty(ArrayList property) {
		Intake.property = property;
	}
	public static String getCreationDate() {
		return creationDate;
	}
	public static void setCreationDate(String creationDate) {
		Intake.creationDate = creationDate;
	}
	public static String getCreatedBy() {
		return createdBy;
	}
	public static void setCreatedBy(String createdBy) {
		Intake.createdBy = createdBy;
	}
	public static String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public static void setLastUpdatedDate(String lastUpdatedDate) {
		Intake.lastUpdatedDate = lastUpdatedDate;
	}
	public static String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public static void setLastUpdatedBy(String lastUpdatedBy) {
		Intake.lastUpdatedBy = lastUpdatedBy;
	}
	public static String getSubmissionDate() {
		return submissionDate;
	}
	public static void setSubmissionDate(String submissionDate) {
		Intake.submissionDate = submissionDate;
	}
	public static String getApplicationStatus() {
		return applicationStatus;
	}
	public static void setApplicationStatus(String applicationStatus) {
		Intake.applicationStatus = applicationStatus;
	}
	public static String getApplicationSignature() {
		return applicationSignature;
	}
	public static void setApplicationSignature(String applicationSignature) {
		Intake.applicationSignature = applicationSignature;
	}
	public static String getIntakeCounselorSignature() {
		return intakeCounselorSignature;
	}
	public static void setIntakeCounselorSignature(String intakeCounselorSignature) {
		Intake.intakeCounselorSignature = intakeCounselorSignature;
	}
	public static String getDirectorSignature() {
		return directorSignature;
	}
	public static void setDirectorSignature(String directorSignature) {
		Intake.directorSignature = directorSignature;
	}
	public static String getApplicationSignatureDate() {
		return applicationSignatureDate;
	}
	public static void setApplicationSignatureDate(String applicationSignatureDate) {
		Intake.applicationSignatureDate = applicationSignatureDate;
	}
	public static String getIntakeCounselorSignatureDate() {
		return intakeCounselorSignatureDate;
	}
	public static void setIntakeCounselorSignatureDate(
			String intakeCounselorSignatureDate) {
		Intake.intakeCounselorSignatureDate = intakeCounselorSignatureDate;
	}
	public static String getDirectorSignatureDate() {
		return directorSignatureDate;
	}
	public static void setDirectorSignatureDate(String directorSignatureDate) {
		Intake.directorSignatureDate = directorSignatureDate;
	}
	public static String getCellDisclosureConsent() {
		return cellDisclosureConsent;
	}
	public static void setCellDisclosureConsent(String cellDisclosureConsent) {
		Intake.cellDisclosureConsent = cellDisclosureConsent;
	}
	public static String getReleaseWaiverConsent() {
		return releaseWaiverConsent;
	}
	public static void setReleaseWaiverConsent(String releaseWaiverConsent) {
		Intake.releaseWaiverConsent = releaseWaiverConsent;
	}
	public static String getBiblicalBasedCounselingConsent() {
		return biblicalBasedCounselingConsent;
	}
	public static void setBiblicalBasedCounselingConsent(
			String biblicalBasedCounselingConsent) {
		Intake.biblicalBasedCounselingConsent = biblicalBasedCounselingConsent;
	}
	public static String getEntryAgreementConsent() {
		return entryAgreementConsent;
	}
	public static void setEntryAgreementConsent(String entryAgreementConsent) {
		Intake.entryAgreementConsent = entryAgreementConsent;
	}
	public static String getRulesVisitationConsent() {
		return rulesVisitationConsent;
	}
	public static void setRulesVisitationConsent(String rulesVisitationConsent) {
		Intake.rulesVisitationConsent = rulesVisitationConsent;
	}
	public static String getReleaseInformationConsent() {
		return releaseInformationConsent;
	}
	public static void setReleaseInformationConsent(String releaseInformationConsent) {
		Intake.releaseInformationConsent = releaseInformationConsent;
	}
	public static String getConsent() {
		return Consent;
	}
	public static void setConsent(String consent) {
		Consent = consent;
	}
	public static String getPrivateHealthCoverage() {
		return privateHealthCoverage;
	}
	public static void setPrivateHealthCoverage(String privateHealthCoverage) {
		Intake.privateHealthCoverage = privateHealthCoverage;
	}
	public static String getIncomeBiWeeklyFlag() {
		return incomeBiWeeklyFlag;
	}
	public static void setIncomeBiWeeklyFlag(String incomeBiWeeklyFlag) {
		Intake.incomeBiWeeklyFlag = incomeBiWeeklyFlag;
	}
	public static String getSSFlag() {
		return SSFlag;
	}
	public static void setSSFlag(String sSFlag) {
		SSFlag = sSFlag;
	}
	public static String getVAFlag() {
		return VAFlag;
	}
	public static void setVAFlag(String vAFlag) {
		VAFlag = vAFlag;
	}
	public static String getWCFlag() {
		return WCFlag;
	}
	public static void setWCFlag(String wCFlag) {
		WCFlag = wCFlag;
	}
	public static String getOtherBenefits() {
		return otherBenefits;
	}
	public static void setOtherBenefits(String otherBenefits) {
		Intake.otherBenefits = otherBenefits;
	}
	public static String getPreviousFaithFarmFlag() {
		return previousFaithFarmFlag;
	}
	public static void setPreviousFaithFarmFlag(String previousFaithFarmFlag) {
		Intake.previousFaithFarmFlag = previousFaithFarmFlag;
	}
	public static String[] getQuestion() {
		return question;
	}
	public static void setQuestion(String[] question) {
		Intake.question = question;
	}
	public static String getDoctorsAppointmentDate() {
		return doctorsAppointmentDate;
	}
	public static void setDoctorsAppointmentDate(String doctorsAppointmentDate) {
		Intake.doctorsAppointmentDate = doctorsAppointmentDate;
	}
	public static String[] getQuestionAnswerDetails() {
		return questionAnswerDetails;
	}
	public static void setQuestionAnswerDetails(String[] questionAnswerDetails) {
		Intake.questionAnswerDetails = questionAnswerDetails;
	}
	public static String[] getQuestionAnswerDates() {
		return questionAnswerDates;
	}
	public static void setQuestionAnswerDates(String[] questionAnswerDates) {
		Intake.questionAnswerDates = questionAnswerDates;
	}
	public static String[] getMedicalCondition() {
		return medicalCondition;
	}
	public static void setMedicalCondition(String[] medicalCondition) {
		Intake.medicalCondition = medicalCondition;
	}
	public static String[] getWorkExperience() {
		return workExperience;
	}
	public static void setWorkExperience(String[] workExperience) {
		Intake.workExperience = workExperience;
	}
	public static String getWorkExperienceOther() {
		return workExperienceOther;
	}
	public static void setWorkExperienceOther(String workExperienceOther) {
		Intake.workExperienceOther = workExperienceOther;
	}
	public static String getWorkExperienceOtherDesc() {
		return workExperienceOtherDesc;
	}
	public static void setWorkExperienceOtherDesc(String workExperienceOtherDesc) {
		Intake.workExperienceOtherDesc = workExperienceOtherDesc;
	}
	public static String getEmployer1() {
		return employer1;
	}
	public static void setEmployer1(String employer1) {
		Intake.employer1 = employer1;
	}
	public static String getEmployerContact1() {
		return employerContact1;
	}
	public static void setEmployerContact1(String employerContact1) {
		Intake.employerContact1 = employerContact1;
	}
	public static String getEmployerPhone1() {
		return employerPhone1;
	}
	public static void setEmployerPhone1(String employerPhone1) {
		Intake.employerPhone1 = employerPhone1;
	}
	public static String getEmployerDates1() {
		return employerDates1;
	}
	public static void setEmployerDates1(String employerDates1) {
		Intake.employerDates1 = employerDates1;
	}
	public static String getEmployer2() {
		return employer2;
	}
	public static void setEmployer2(String employer2) {
		Intake.employer2 = employer2;
	}
	public static String getEmployerContact2() {
		return employerContact2;
	}
	public static void setEmployerContact2(String employerContact2) {
		Intake.employerContact2 = employerContact2;
	}
	public static String getEmployerPhone2() {
		return employerPhone2;
	}
	public static void setEmployerPhone2(String employerPhone2) {
		Intake.employerPhone2 = employerPhone2;
	}
	public static String getEmployerDates2() {
		return employerDates2;
	}
	public static void setEmployerDates2(String employerDates2) {
		Intake.employerDates2 = employerDates2;
	}
	public static String getEmployer3() {
		return employer3;
	}
	public static void setEmployer3(String employer3) {
		Intake.employer3 = employer3;
	}
	public static String getEmployerContact3() {
		return employerContact3;
	}
	public static void setEmployerContact3(String employerContact3) {
		Intake.employerContact3 = employerContact3;
	}
	public static String getEmployerPhone3() {
		return employerPhone3;
	}
	public static void setEmployerPhone3(String employerPhone3) {
		Intake.employerPhone3 = employerPhone3;
	}
	public static String getEmployerDates3() {
		return employerDates3;
	}
	public static void setEmployerDates3(String employerDates3) {
		Intake.employerDates3 = employerDates3;
	}
	public static String getEmployer4() {
		return employer4;
	}
	public static void setEmployer4(String employer4) {
		Intake.employer4 = employer4;
	}
	public static String getEmployerContact4() {
		return employerContact4;
	}
	public static void setEmployerContact4(String employerContact4) {
		Intake.employerContact4 = employerContact4;
	}
	public static String getEmployerPhone4() {
		return employerPhone4;
	}
	public static void setEmployerPhone4(String employerPhone4) {
		Intake.employerPhone4 = employerPhone4;
	}
	public static String getEmployerDates4() {
		return employerDates4;
	}
	public static void setEmployerDates4(String employerDates4) {
		Intake.employerDates4 = employerDates4;
	}
	public static String getQtyConsumed1() {
		return qtyConsumed1;
	}
	public static void setQtyConsumed1(String qtyConsumed1) {
		Intake.qtyConsumed1 = qtyConsumed1;
	}
	public static String getQtyConsumed2() {
		return qtyConsumed2;
	}
	public static void setQtyConsumed2(String qtyConsumed2) {
		Intake.qtyConsumed2 = qtyConsumed2;
	}
	public static String getCurrentMedications() {
		return currentMedications;
	}
	public static void setCurrentMedications(String currentMedications) {
		Intake.currentMedications = currentMedications;
	}
	public static String getRefillDirections() {
		return refillDirections;
	}
	public static void setRefillDirections(String refillDirections) {
		Intake.refillDirections = refillDirections;
	}
	public static String getMedicalConditionDetails() {
		return medicalConditionDetails;
	}
	public static void setMedicalConditionDetails(String medicalConditionDetails) {
		Intake.medicalConditionDetails = medicalConditionDetails;
	}
	public static String getHallucinogensYearsUsed() {
		return hallucinogensYearsUsed;
	}
	public static void setHallucinogensYearsUsed(String hallucinogensYearsUsed) {
		Intake.hallucinogensYearsUsed = hallucinogensYearsUsed;
	}
	public static String getHallucinogensLastUsed() {
		return hallucinogensLastUsed;
	}
	public static void setHallucinogensLastUsed(String hallucinogensLastUsed) {
		Intake.hallucinogensLastUsed = hallucinogensLastUsed;
	}
	public static String getUsagePattern() {
		return usagePattern;
	}
	public static void setUsagePattern(String usagePattern) {
		Intake.usagePattern = usagePattern;
	}
	public static String getUsageLosses() {
		return usageLosses;
	}
	public static void setUsageLosses(String usageLosses) {
		Intake.usageLosses = usageLosses;
	}
	public static String getEntryDate() {
		return entryDate;
	}
	public static void setEntryDate(String entryDate) {
		Intake.entryDate = entryDate;
	}
	public static String getIntakeStatus() {
		return intakeStatus;
	}
	public static void setIntakeStatus(String intakeStatus) {
		Intake.intakeStatus = intakeStatus;
	}
	public static String getOtherJobSkill() {
		return otherJobSkill;
	}
	public static void setOtherJobSkill(String otherJobSkill) {
		Intake.otherJobSkill = otherJobSkill;
	}
	
	
	
	
	
}
