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
	private static String motherLiving="";
	private static String fatherLiving="";
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
	private static String quantityPerWeek = "";
	private static String quantity2Years = "";
	private static String usageLosses = "";
	private static String abusePhysicalEffects = "";
	private static String spouseAddicted = "";
	private static String familyAddicted = "";
	private static String attendAA = "";
	private static String attendNA = "";
	private static String yearsAttended = "";
	private static String ffYearsAttended = "";
	private static String otherRehabs="";
	private static String previousFaithFarm = "";
	private static String faithFarmYear = "";
	private static String currentHealth = "";
	private static String currentMedicationsFlag = "NO";
	private static String currentMedicationsDetails = "";
	private static String needMedicationFlag = "NO";
	private static String medicationSuppyFlag = "NO";
	private static String refillDetails = "";
	private static String doctorsAppointment = "";
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
	private static String herniaDetails="";
	
	private static String question1="NO";
	private static String question2="NO";
	private static String question3="NO";
	private static String question4="NO";
	private static String question5="NO";
	private static String question6="NO";
	private static String question7="NO";
	private static String question8="NO";
	private static String question9="NO";
	private static String question10="NO";
	private static String question11="NO";
	private static String question12="NO";
	private static String question13="NO";
	private static String question14="NO";
	private static String question15="NO";
	private static String question16="NO";
	private static String question17="NO";
	private static String question18="NO";
	private static String question19="NO";
	private static String question20="NO";
	private static String question21="NO";
	private static String question22="NO";
	private static String question23="NO";
	private static String question24="NO";
	private static String question25="NO";
	private static String question26="NO";
	private static String question27="NO";
	private static String question28="NO";
	private static String question29="NO";
	private static String question30="NO";
	private static String question31="NO";
	
	private static String lawsuitFlag="NO";
	private static String currentLawsuitFlag="NO";
	private static String lawsuitDetails="";
	private static String currentlawsuitDetails="";
	private static String lawsuitDate="";
	private static String currentlawsuitDate="";
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
	private static String probationCountyState = "";
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
	private static String homelessLenghtOfTime = "";
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
	public static String getMotherLiving() {
		return motherLiving;
	}
	public static void setMotherLiving(String motherLiving) {
		Intake.motherLiving = motherLiving;
	}
	public static String getFatherLiving() {
		return fatherLiving;
	}
	public static void setFatherLiving(String fatherLiving) {
		Intake.fatherLiving = fatherLiving;
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
	public static String getUsagePattern() {
		return usagePattern;
	}
	public static void setUsagePattern(String usagePattern) {
		Intake.usagePattern = usagePattern;
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
	public static String getUsageLosses() {
		return usageLosses;
	}
	public static void setUsageLosses(String usageLosses) {
		Intake.usageLosses = usageLosses;
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
	public static String getHerniaDetails() {
		return herniaDetails;
	}
	public static void setHerniaDetails(String herniaDetails) {
		Intake.herniaDetails = herniaDetails;
	}
	public static String getQuestion1() {
		return question1;
	}
	public static void setQuestion1(String question1) {
		Intake.question1 = question1;
	}
	public static String getQuestion2() {
		return question2;
	}
	public static void setQuestion2(String question2) {
		Intake.question2 = question2;
	}
	public static String getQuestion3() {
		return question3;
	}
	public static void setQuestion3(String question3) {
		Intake.question3 = question3;
	}
	public static String getQuestion4() {
		return question4;
	}
	public static void setQuestion4(String question4) {
		Intake.question4 = question4;
	}
	public static String getQuestion5() {
		return question5;
	}
	public static void setQuestion5(String question5) {
		Intake.question5 = question5;
	}
	public static String getQuestion6() {
		return question6;
	}
	public static void setQuestion6(String question6) {
		Intake.question6 = question6;
	}
	public static String getQuestion7() {
		return question7;
	}
	public static void setQuestion7(String question7) {
		Intake.question7 = question7;
	}
	public static String getQuestion8() {
		return question8;
	}
	public static void setQuestion8(String question8) {
		Intake.question8 = question8;
	}
	public static String getQuestion9() {
		return question9;
	}
	public static void setQuestion9(String question9) {
		Intake.question9 = question9;
	}
	public static String getQuestion10() {
		return question10;
	}
	public static void setQuestion10(String question10) {
		Intake.question10 = question10;
	}
	public static String getQuestion11() {
		return question11;
	}
	public static void setQuestion11(String question11) {
		Intake.question11 = question11;
	}
	public static String getQuestion12() {
		return question12;
	}
	public static void setQuestion12(String question12) {
		Intake.question12 = question12;
	}
	public static String getQuestion13() {
		return question13;
	}
	public static void setQuestion13(String question13) {
		Intake.question13 = question13;
	}
	public static String getQuestion14() {
		return question14;
	}
	public static void setQuestion14(String question14) {
		Intake.question14 = question14;
	}
	public static String getQuestion15() {
		return question15;
	}
	public static void setQuestion15(String question15) {
		Intake.question15 = question15;
	}
	public static String getQuestion16() {
		return question16;
	}
	public static void setQuestion16(String question16) {
		Intake.question16 = question16;
	}
	public static String getQuestion17() {
		return question17;
	}
	public static void setQuestion17(String question17) {
		Intake.question17 = question17;
	}
	public static String getQuestion18() {
		return question18;
	}
	public static void setQuestion18(String question18) {
		Intake.question18 = question18;
	}
	public static String getQuestion19() {
		return question19;
	}
	public static void setQuestion19(String question19) {
		Intake.question19 = question19;
	}
	public static String getQuestion20() {
		return question20;
	}
	public static void setQuestion20(String question20) {
		Intake.question20 = question20;
	}
	public static String getQuestion21() {
		return question21;
	}
	public static void setQuestion21(String question21) {
		Intake.question21 = question21;
	}
	public static String getQuestion22() {
		return question22;
	}
	public static void setQuestion22(String question22) {
		Intake.question22 = question22;
	}
	public static String getQuestion23() {
		return question23;
	}
	public static void setQuestion23(String question23) {
		Intake.question23 = question23;
	}
	public static String getQuestion24() {
		return question24;
	}
	public static void setQuestion24(String question24) {
		Intake.question24 = question24;
	}
	public static String getQuestion25() {
		return question25;
	}
	public static void setQuestion25(String question25) {
		Intake.question25 = question25;
	}
	public static String getQuestion26() {
		return question26;
	}
	public static void setQuestion26(String question26) {
		Intake.question26 = question26;
	}
	public static String getQuestion27() {
		return question27;
	}
	public static void setQuestion27(String question27) {
		Intake.question27 = question27;
	}
	public static String getQuestion28() {
		return question28;
	}
	public static void setQuestion28(String question28) {
		Intake.question28 = question28;
	}
	public static String getQuestion29() {
		return question29;
	}
	public static void setQuestion29(String question29) {
		Intake.question29 = question29;
	}
	public static String getQuestion30() {
		return question30;
	}
	public static void setQuestion30(String question30) {
		Intake.question30 = question30;
	}
	public static String getQuestion31() {
		return question31;
	}
	public static void setQuestion31(String question31) {
		Intake.question31 = question31;
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
	public static String getCurrentlawsuitDetails() {
		return currentlawsuitDetails;
	}
	public static void setCurrentlawsuitDetails(String currentlawsuitDetails) {
		Intake.currentlawsuitDetails = currentlawsuitDetails;
	}
	public static String getLawsuitDate() {
		return lawsuitDate;
	}
	public static void setLawsuitDate(String lawsuitDate) {
		Intake.lawsuitDate = lawsuitDate;
	}
	public static String getCurrentlawsuitDate() {
		return currentlawsuitDate;
	}
	public static void setCurrentlawsuitDate(String currentlawsuitDate) {
		Intake.currentlawsuitDate = currentlawsuitDate;
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
	public static String getProbationCountyState() {
		return probationCountyState;
	}
	public static void setProbationCountyState(String probationCountyState) {
		Intake.probationCountyState = probationCountyState;
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
	public static String getHomelessLenghtOfTime() {
		return homelessLenghtOfTime;
	}
	public static void setHomelessLenghtOfTime(String homelessLenghtOfTime) {
		Intake.homelessLenghtOfTime = homelessLenghtOfTime;
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
	
	
	
	
}
