package org.faithfarm.domain;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;

public class Intake implements Serializable {
 
	private  Long intakeId; 
	private  String farmBase = ""; 
	private  String firstName = "";
	private  String lastName = "";
	private  String middleInitial = "";
	private  String suffix = "";
	private  String address = ""; 
	private  String city = "";  
	private  String state = "";
	private  String zipcode = "";
	private  String dateOfBirth = "";
	private  String ssn = "";
	private  String ssnCard = "";
	private  String age = "";
	private  String height = "";
	private  String weight = "";
	private  String ethnicity = "";
	private  String hairColor = "";
	private  String eyeColor = "";
	private  String maritalStatus = "";
	private  String educationLevel = "";
	private  String graduateFlag = "";
	private  String transcriptsFlag = "";
	private  String englishSpeakFlag = "";
	private  String englishReadFlag = "";
	private  String homeLocation = "";
	private  String personType = "";
	private  String referredBy = "";
	private  String referralPhone = "";
	private  String emergencyContact = "";
	private  String emergencyPhone = "";
	private  String emergencyRelationship = "";
	private  String motherLivingFlag="";
	private  String fatherLivingFlag="";
	private  String motherRelationship="";
	private  String fatherRelationship="";
	private  String brothers="";
	private  String sisters="";
	private  String children="";
	private  String veteranFlag = "NO";
	private  String branchOfService = "";
	private  String rank = "";
	private  String lengthOfService = "";
	private  String driversLicenseFlag = "";
	private  String driversLicenseStatus = "";
	private  String driversLicenseNumber = "";
	private  String driversLicenseState = "";
	private  String driversLicenseExpirationDate = "";
	private  String stateIdentificationFlag = "NO";
	private  String stateIdentificationState = "";
	private  String stateIdentificationExpirationDate = "";
	private  String governmentBenefits = "";
	private  String religion = "";
	private  String religiousExperience = "";
	private  String alcohol = "";
	private  String cocaine = "";
	private  String marijuana = "";
	private  String oxycodone = "";
	private  String speed = "";
	private  String heroin = "";
	private  String xanax = "";
	private  String other = "";
	private  String hallucinogensYearsUsed="";
	private  String hallucinogensLastUsed="";
	private  String alcoholYearsUsed = "";
	private  String cocaineYearsUsed = "";
	private  String marijuanaYearsUsed = "";
	private  String oxycodoneYearsUsed = "";
	private  String speedYearsUsed = "";
	private  String heroinYearsUsed = "";
	private  String xanaxYearsUsed = "";
	private  String otherYearsUsed = "";
	private  String alcoholLastUsed = "";
	private  String cocaineLastUsed = "";
	private  String marijuanaLastUsed = "";
	private  String oxycodoneLastUsed = "";
	private  String speedLastUsed = "";
	private  String heroinLastUsed = "";
	private  String xanaxLastUsed = "";
	private  String otherLastUsed = "";
	private  String otherDrug = "";
	private  String sober3Years = "";
	private  String sober1Years = "";
	private  String usagePattern = "";
	private  String usageLosses="";
	private  String usagePattern1 = "";
	private  String usagePattern2 = "";
	private  String usagePattern3 = "";
	private  String usagePattern4 = "";
	private  String usagePattern5 = "";
	private  String usagePattern6 = "";
	private  String usageLosses1 = "";
	private  String usageLosses2 = "";
	private  String usageLosses3 = "";
	private  String usageLosses4 = "";
	private  String usageLosses5 = "";
	private  String usageLosses6 = "";
	private  String usageLosses7 = "";
	private  String usageLosses8 = "";
	private  String usageLosses9 = "";
	private  String quantityPerWeek = "";
	private  String quantity2Years = "";	
	private  String abusePhysicalEffects = "";
	private  String spouseAddicted = "";
	private  String familyAddicted = "";
	private  String attendAA = "";
	private  String attendNA = "";
	private  String yearsAttended = "";
	private  String ffYearsAttended = "";
	private  String otherRehabs="";
	private  String previousFaithFarmFlag = "";
	private  String previousFaithFarm = "";
	private  String faithFarmYear = "";
	private  String currentHealth = "";
	private  String currentMedicationsFlag = "NO";
	private  String currentMedicationsDetails = "";
	private  String needMedicationFlag = "NO";
	private  String medicationSuppyFlag = "NO";
	private  String refillDetails = "";
	private  String doctorsAppointment = "";
	private  String doctorsAppointmentDate = "";
	private  String eyewearFlag = "NO";
	private  String eyewearUsage = "";
	private  String industrialInjuryFlag = "NO";
	private  String industrialInjuryDate = "";
	private  String industrialInjuryReason = "";
	private  String industrialInjuryLocation = "";
	private  String industrialInjuryEmployer = "";
	private  String industrialInjuryClaimStatus = "";
	private  String disabilityFlag = "NO";
	private  String disabilityDetails = "";
	private  String examinationDate = "";
	private  String physician = "";
	private  String physicianAddress = "";
	private  String herniaSide = "";
	private  String herniaOperationFlag = "NO";
	private  String herniaDate="";
	private  String herniaPhysician="";
	private  String qtyConsumed1="";
	private  String qtyConsumed2="";
	private  String currentMedications="";
	private  String refillDirections="";
	private  String medicalConditionDetails="";
	private  String otherJobSkill="";
	private String exitDate="";
	private String supervisor="";
	private String job="";
	private String area="";
	private String currentClass="";
	private String room="";
	private String bed="";
	private String archiveFlag="";
	private String imageUrl="";
	private Blob imageHeadshot;
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	private  String question[] = new String[]{ 
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO",
						"NO","NO","NO","NO","NO","NO","NO","NO","NO","NO" };
	
	private  String questionAnswerDetails[] = new String[]{ 
			"","","","","","",
			"","","","","","",
			"","","","","","",
			"","","","","","",
			"","","","","","","","","","" };
	
	private  String questionAnswerDates[] = new String[]{ 
		"","","","","","",
		"","","","","","",
		"","","","","","",
		"","","","","","",
		"","","","","","","","","","" };
	
	private  String medicalCondition[] = new String[]{ 
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO",
		"NO","NO","NO","NO","NO","NO","NO","NO","NO","NO" };
	
	private  String workExperience[] = new String[]{ 
		"","","","","","","",
		"","","","","","","",
		"","","","","","","",
		"","","","","","","",
		"","","","","","",""};
	
	private  String workExperienceOther="";
	private  String workExperienceOtherDesc="";
	
	private  String employer1="";
	private  String employerContact1="";
	private  String employerPhone1="";
	private  String employerDates1="";
	
	private  String employer2="";
	private  String employerContact2="";
	private  String employerPhone2="";
	private  String employerDates2="";
	
	private  String employer3="";
	private  String employerContact3="";
	private  String employerPhone3="";
	private  String employerDates3="";
	
	private  String employer4="";
	private  String employerContact4="";
	private  String employerPhone4="";
	private  String employerDates4="";
	
	private  String lawsuitFlag="NO";
	private  String currentLawsuitFlag="NO";
	private  String lawsuitDetails="";
	private  String currentLawsuitDetails="";
	private  String lawsuitDate="";
	private  String currentLawsuitDate="";
	private  String felonyFlag= "NO";
	private  String sexualOffenseFlag= "NO";
	private  String felonyDetails= "";
	private  String sexualOffenseQty= "";
	private  String sexualOffenseDetails= "";
	private  String felonyQty="";
	
	private  String SSFlag="";
	private  String VAFlag="";
	private  String WCFlag="";
	private  String otherBenefits="";
	
	private  String probationFlag = "NO";
	private  String probationCounty = "";
	private  String probationState = "";
	private  String probationOfficer = "";
	private  String probationOfficerPhone = "";	
	private  String probationAppt="NO";
	private  String probationApptDetails="";
	private  String libraryCard = "";
	private  String birthCertFlag = "NO";
	private  String birthCertCounty = "";
	private  String birthCertState = "";
	private  String govtHealthCoverage = "";
	private  String privateHealthCoverage = "";
	private  String selectiveService = "";
	private  String pendingCourtDates = "";
	private  String childSupport = "";
	private  String restitution = "";
	private  String homelessLengthOfTime = "";
	private  String homelessHowOften="";
	private  String homelessReason = "";
	private  String incomeAmount = "";
	private  String incomeSource = "";
	private  String incomeWeeklyFlag = "NO";
	private  String incomeBiWeeklyFlag = "NO";
	private  String incomeMonthlyFlag = "NO";
	private  String incomeYearlyFlag = "NO";
	private  ArrayList answer = new ArrayList();
	private  ArrayList answerDetail = new ArrayList();
	private  ArrayList answerDate = new ArrayList();
	private  ArrayList medicationCondition = new ArrayList();
	private  ArrayList jobSkill = new ArrayList();
	private  ArrayList employer = new ArrayList();
	private  ArrayList reference = new ArrayList();
	private  ArrayList visitor = new ArrayList();
	private  ArrayList property = new ArrayList();
		
	private  String creationDate = "";
	private  String createdBy = "";
	private  String lastUpdatedDate = "";
	private  String lastUpdatedBy = "";
	private  String submissionDate = "";
	private  String applicationStatus = "PENDING";
	
	private  String applicationSignature = "";
	private  String intakeCounselorSignature = "";
	private  String directorSignature = "";
	private  String applicationSignatureDate = "";
	private  String intakeCounselorSignatureDate = "";
	private  String directorSignatureDate = "";
	
	private  String cellDisclosureConsent = "NO";
	private  String releaseWaiverConsent = "NO";
	private  String biblicalBasedCounselingConsent = "NO";
	private  String entryAgreementConsent = "NO";
	private  String rulesVisitationConsent = "NO";
	private  String releaseInformationConsent = "NO";
	private  String Consent = "NO";
	
	private  String entryDate ="";
	private  String intakeStatus = "";
	
	private Long departmentId;
	private Long jobId;
	private Long supervisorId;
	
	
	private BufferedImage studentPhoto;
	
	private  ArrayList history = new ArrayList();
	
	
	public ArrayList getHistory() {
		return history;
	}

	public void setHistory(ArrayList history) {
		this.history = history;
	}

	public Long getIntakeId() {
		return intakeId;
	}

	public void setIntakeId(Long intakeId) {
		this.intakeId = intakeId;
	}

	public String getFarmBase() {
		return farmBase;
	}
	public void setFarmBase(String farmBase) {
		this.farmBase = farmBase;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsnCard() {
		return ssnCard;
	}
	public void setSsnCard(String ssnCard) {
		this.ssnCard = ssnCard;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getGraduateFlag() {
		return graduateFlag;
	}
	public void setGraduateFlag(String graduateFlag) {
		this.graduateFlag = graduateFlag;
	}
	public String getTranscriptsFlag() {
		return transcriptsFlag;
	}
	public void setTranscriptsFlag(String transcriptsFlag) {
		this.transcriptsFlag = transcriptsFlag;
	}
	public String getEnglishSpeakFlag() {
		return englishSpeakFlag;
	}
	public void setEnglishSpeakFlag(String englishSpeakFlag) {
		this.englishSpeakFlag = englishSpeakFlag;
	}
	public String getEnglishReadFlag() {
		return englishReadFlag;
	}
	public void setEnglishReadFlag(String englishReadFlag) {
		this.englishReadFlag = englishReadFlag;
	}
	public String getHomeLocation() {
		return homeLocation;
	}
	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	public String getReferralPhone() {
		return referralPhone;
	}
	public void setReferralPhone(String referralPhone) {
		this.referralPhone = referralPhone;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getEmergencyPhone() {
		return emergencyPhone;
	}
	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}
	public String getEmergencyRelationship() {
		return emergencyRelationship;
	}
	public void setEmergencyRelationship(String emergencyRelationship) {
		this.emergencyRelationship = emergencyRelationship;
	}
	public String getMotherLivingFlag() {
		return motherLivingFlag;
	}
	public void setMotherLivingFlag(String motherLivingFlag) {
		this.motherLivingFlag = motherLivingFlag;
	}
	public String getFatherLivingFlag() {
		return fatherLivingFlag;
	}
	public void setFatherLivingFlag(String fatherLivingFlag) {
		this.fatherLivingFlag = fatherLivingFlag;
	}
	public String getMotherRelationship() {
		return motherRelationship;
	}
	public void setMotherRelationship(String motherRelationship) {
		this.motherRelationship = motherRelationship;
	}
	public String getFatherRelationship() {
		return fatherRelationship;
	}
	public void setFatherRelationship(String fatherRelationship) {
		this.fatherRelationship = fatherRelationship;
	}
	public String getBrothers() {
		return brothers;
	}
	public void setBrothers(String brothers) {
		this.brothers = brothers;
	}
	public String getSisters() {
		return sisters;
	}
	public void setSisters(String sisters) {
		this.sisters = sisters;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public String getVeteranFlag() {
		return veteranFlag;
	}
	public void setVeteranFlag(String veteranFlag) {
		this.veteranFlag = veteranFlag;
	}
	public String getBranchOfService() {
		return branchOfService;
	}
	public void setBranchOfService(String branchOfService) {
		this.branchOfService = branchOfService;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getLengthOfService() {
		return lengthOfService;
	}
	public void setLengthOfService(String lengthOfService) {
		this.lengthOfService = lengthOfService;
	}
	public String getDriversLicenseFlag() {
		return driversLicenseFlag;
	}
	public void setDriversLicenseFlag(String driversLicenseFlag) {
		this.driversLicenseFlag = driversLicenseFlag;
	}
	public String getDriversLicenseStatus() {
		return driversLicenseStatus;
	}
	public void setDriversLicenseStatus(String driversLicenseStatus) {
		this.driversLicenseStatus = driversLicenseStatus;
	}
	public String getDriversLicenseNumber() {
		return driversLicenseNumber;
	}
	public void setDriversLicenseNumber(String driversLicenseNumber) {
		this.driversLicenseNumber = driversLicenseNumber;
	}
	public String getDriversLicenseState() {
		return driversLicenseState;
	}
	public void setDriversLicenseState(String driversLicenseState) {
		this.driversLicenseState = driversLicenseState;
	}
	public String getDriversLicenseExpirationDate() {
		return driversLicenseExpirationDate;
	}
	public void setDriversLicenseExpirationDate(String driversLicenseExpirationDate) {
		this.driversLicenseExpirationDate = driversLicenseExpirationDate;
	}
	public String getStateIdentificationFlag() {
		return stateIdentificationFlag;
	}
	public void setStateIdentificationFlag(String stateIdentificationFlag) {
		this.stateIdentificationFlag = stateIdentificationFlag;
	}
	public String getStateIdentificationState() {
		return stateIdentificationState;
	}
	public void setStateIdentificationState(String stateIdentificationState) {
		this.stateIdentificationState = stateIdentificationState;
	}
	public String getStateIdentificationExpirationDate() {
		return stateIdentificationExpirationDate;
	}
	public void setStateIdentificationExpirationDate(
			String stateIdentificationExpirationDate) {
		this.stateIdentificationExpirationDate = stateIdentificationExpirationDate;
	}
	public String getGovernmentBenefits() {
		return governmentBenefits;
	}
	public void setGovernmentBenefits(String governmentBenefits) {
		this.governmentBenefits = governmentBenefits;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getReligiousExperience() {
		return religiousExperience;
	}
	public void setReligiousExperience(String religiousExperience) {
		this.religiousExperience = religiousExperience;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String getCocaine() {
		return cocaine;
	}
	public void setCocaine(String cocaine) {
		this.cocaine = cocaine;
	}
	public String getMarijuana() {
		return marijuana;
	}
	public void setMarijuana(String marijuana) {
		this.marijuana = marijuana;
	}
	public String getOxycodone() {
		return oxycodone;
	}
	public void setOxycodone(String oxycodone) {
		this.oxycodone = oxycodone;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getHeroin() {
		return heroin;
	}
	public void setHeroin(String heroin) {
		this.heroin = heroin;
	}
	public String getXanax() {
		return xanax;
	}
	public void setXanax(String xanax) {
		this.xanax = xanax;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getHallucinogensYearsUsed() {
		return hallucinogensYearsUsed;
	}
	public void setHallucinogensYearsUsed(String hallucinogensYearsUsed) {
		this.hallucinogensYearsUsed = hallucinogensYearsUsed;
	}
	public String getHallucinogensLastUsed() {
		return hallucinogensLastUsed;
	}
	public void setHallucinogensLastUsed(String hallucinogensLastUsed) {
		this.hallucinogensLastUsed = hallucinogensLastUsed;
	}
	public String getAlcoholYearsUsed() {
		return alcoholYearsUsed;
	}
	public void setAlcoholYearsUsed(String alcoholYearsUsed) {
		this.alcoholYearsUsed = alcoholYearsUsed;
	}
	public String getCocaineYearsUsed() {
		return cocaineYearsUsed;
	}
	public void setCocaineYearsUsed(String cocaineYearsUsed) {
		this.cocaineYearsUsed = cocaineYearsUsed;
	}
	public String getMarijuanaYearsUsed() {
		return marijuanaYearsUsed;
	}
	public void setMarijuanaYearsUsed(String marijuanaYearsUsed) {
		this.marijuanaYearsUsed = marijuanaYearsUsed;
	}
	public String getOxycodoneYearsUsed() {
		return oxycodoneYearsUsed;
	}
	public void setOxycodoneYearsUsed(String oxycodoneYearsUsed) {
		this.oxycodoneYearsUsed = oxycodoneYearsUsed;
	}
	public String getSpeedYearsUsed() {
		return speedYearsUsed;
	}
	public void setSpeedYearsUsed(String speedYearsUsed) {
		this.speedYearsUsed = speedYearsUsed;
	}
	public String getHeroinYearsUsed() {
		return heroinYearsUsed;
	}
	public void setHeroinYearsUsed(String heroinYearsUsed) {
		this.heroinYearsUsed = heroinYearsUsed;
	}
	public String getXanaxYearsUsed() {
		return xanaxYearsUsed;
	}
	public void setXanaxYearsUsed(String xanaxYearsUsed) {
		this.xanaxYearsUsed = xanaxYearsUsed;
	}
	public String getOtherYearsUsed() {
		return otherYearsUsed;
	}
	public void setOtherYearsUsed(String otherYearsUsed) {
		this.otherYearsUsed = otherYearsUsed;
	}
	public String getAlcoholLastUsed() {
		return alcoholLastUsed;
	}
	public void setAlcoholLastUsed(String alcoholLastUsed) {
		this.alcoholLastUsed = alcoholLastUsed;
	}
	public String getCocaineLastUsed() {
		return cocaineLastUsed;
	}
	public void setCocaineLastUsed(String cocaineLastUsed) {
		this.cocaineLastUsed = cocaineLastUsed;
	}
	public String getMarijuanaLastUsed() {
		return marijuanaLastUsed;
	}
	public void setMarijuanaLastUsed(String marijuanaLastUsed) {
		this.marijuanaLastUsed = marijuanaLastUsed;
	}
	public String getOxycodoneLastUsed() {
		return oxycodoneLastUsed;
	}
	public void setOxycodoneLastUsed(String oxycodoneLastUsed) {
		this.oxycodoneLastUsed = oxycodoneLastUsed;
	}
	public String getSpeedLastUsed() {
		return speedLastUsed;
	}
	public void setSpeedLastUsed(String speedLastUsed) {
		this.speedLastUsed = speedLastUsed;
	}
	public String getHeroinLastUsed() {
		return heroinLastUsed;
	}
	public void setHeroinLastUsed(String heroinLastUsed) {
		this.heroinLastUsed = heroinLastUsed;
	}
	public String getXanaxLastUsed() {
		return xanaxLastUsed;
	}
	public void setXanaxLastUsed(String xanaxLastUsed) {
		this.xanaxLastUsed = xanaxLastUsed;
	}
	public String getOtherLastUsed() {
		return otherLastUsed;
	}
	public void setOtherLastUsed(String otherLastUsed) {
		this.otherLastUsed = otherLastUsed;
	}
	public String getOtherDrug() {
		return otherDrug;
	}
	public void setOtherDrug(String otherDrug) {
		this.otherDrug = otherDrug;
	}
	public String getSober3Years() {
		return sober3Years;
	}
	public void setSober3Years(String sober3Years) {
		this.sober3Years = sober3Years;
	}
	public String getSober1Years() {
		return sober1Years;
	}
	public void setSober1Years(String sober1Years) {
		this.sober1Years = sober1Years;
	}
	public String getUsagePattern() {
		return usagePattern;
	}
	public void setUsagePattern(String usagePattern) {
		this.usagePattern = usagePattern;
	}
	public String getUsageLosses() {
		return usageLosses;
	}
	public void setUsageLosses(String usageLosses) {
		this.usageLosses = usageLosses;
	}
	public String getUsagePattern1() {
		return usagePattern1;
	}
	public void setUsagePattern1(String usagePattern1) {
		this.usagePattern1 = usagePattern1;
	}
	public String getUsagePattern2() {
		return usagePattern2;
	}
	public void setUsagePattern2(String usagePattern2) {
		this.usagePattern2 = usagePattern2;
	}
	public String getUsagePattern3() {
		return usagePattern3;
	}
	public void setUsagePattern3(String usagePattern3) {
		this.usagePattern3 = usagePattern3;
	}
	public String getUsagePattern4() {
		return usagePattern4;
	}
	public void setUsagePattern4(String usagePattern4) {
		this.usagePattern4 = usagePattern4;
	}
	public String getUsagePattern5() {
		return usagePattern5;
	}
	public void setUsagePattern5(String usagePattern5) {
		this.usagePattern5 = usagePattern5;
	}
	public String getUsagePattern6() {
		return usagePattern6;
	}
	public void setUsagePattern6(String usagePattern6) {
		this.usagePattern6 = usagePattern6;
	}
	public String getUsageLosses1() {
		return usageLosses1;
	}
	public void setUsageLosses1(String usageLosses1) {
		this.usageLosses1 = usageLosses1;
	}
	public String getUsageLosses2() {
		return usageLosses2;
	}
	public void setUsageLosses2(String usageLosses2) {
		this.usageLosses2 = usageLosses2;
	}
	public String getUsageLosses3() {
		return usageLosses3;
	}
	public void setUsageLosses3(String usageLosses3) {
		this.usageLosses3 = usageLosses3;
	}
	public String getUsageLosses4() {
		return usageLosses4;
	}
	public void setUsageLosses4(String usageLosses4) {
		this.usageLosses4 = usageLosses4;
	}
	public String getUsageLosses5() {
		return usageLosses5;
	}
	public void setUsageLosses5(String usageLosses5) {
		this.usageLosses5 = usageLosses5;
	}
	public String getUsageLosses6() {
		return usageLosses6;
	}
	public void setUsageLosses6(String usageLosses6) {
		this.usageLosses6 = usageLosses6;
	}
	public String getUsageLosses7() {
		return usageLosses7;
	}
	public void setUsageLosses7(String usageLosses7) {
		this.usageLosses7 = usageLosses7;
	}
	public String getUsageLosses8() {
		return usageLosses8;
	}
	public void setUsageLosses8(String usageLosses8) {
		this.usageLosses8 = usageLosses8;
	}
	public String getUsageLosses9() {
		return usageLosses9;
	}
	public void setUsageLosses9(String usageLosses9) {
		this.usageLosses9 = usageLosses9;
	}
	public String getQuantityPerWeek() {
		return quantityPerWeek;
	}
	public void setQuantityPerWeek(String quantityPerWeek) {
		this.quantityPerWeek = quantityPerWeek;
	}
	public String getQuantity2Years() {
		return quantity2Years;
	}
	public void setQuantity2Years(String quantity2Years) {
		this.quantity2Years = quantity2Years;
	}
	public String getAbusePhysicalEffects() {
		return abusePhysicalEffects;
	}
	public void setAbusePhysicalEffects(String abusePhysicalEffects) {
		this.abusePhysicalEffects = abusePhysicalEffects;
	}
	public String getSpouseAddicted() {
		return spouseAddicted;
	}
	public void setSpouseAddicted(String spouseAddicted) {
		this.spouseAddicted = spouseAddicted;
	}
	public String getFamilyAddicted() {
		return familyAddicted;
	}
	public void setFamilyAddicted(String familyAddicted) {
		this.familyAddicted = familyAddicted;
	}
	public String getAttendAA() {
		return attendAA;
	}
	public void setAttendAA(String attendAA) {
		this.attendAA = attendAA;
	}
	public String getAttendNA() {
		return attendNA;
	}
	public void setAttendNA(String attendNA) {
		this.attendNA = attendNA;
	}
	public String getYearsAttended() {
		return yearsAttended;
	}
	public void setYearsAttended(String yearsAttended) {
		this.yearsAttended = yearsAttended;
	}
	public String getFfYearsAttended() {
		return ffYearsAttended;
	}
	public void setFfYearsAttended(String ffYearsAttended) {
		this.ffYearsAttended = ffYearsAttended;
	}
	public String getOtherRehabs() {
		return otherRehabs;
	}
	public void setOtherRehabs(String otherRehabs) {
		this.otherRehabs = otherRehabs;
	}
	public String getPreviousFaithFarmFlag() {
		return previousFaithFarmFlag;
	}
	public void setPreviousFaithFarmFlag(String previousFaithFarmFlag) {
		this.previousFaithFarmFlag = previousFaithFarmFlag;
	}
	public String getPreviousFaithFarm() {
		return previousFaithFarm;
	}
	public void setPreviousFaithFarm(String previousFaithFarm) {
		this.previousFaithFarm = previousFaithFarm;
	}
	public String getFaithFarmYear() {
		return faithFarmYear;
	}
	public void setFaithFarmYear(String faithFarmYear) {
		this.faithFarmYear = faithFarmYear;
	}
	public String getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(String currentHealth) {
		this.currentHealth = currentHealth;
	}
	public String getCurrentMedicationsFlag() {
		return currentMedicationsFlag;
	}
	public void setCurrentMedicationsFlag(String currentMedicationsFlag) {
		this.currentMedicationsFlag = currentMedicationsFlag;
	}
	public String getCurrentMedicationsDetails() {
		return currentMedicationsDetails;
	}
	public void setCurrentMedicationsDetails(String currentMedicationsDetails) {
		this.currentMedicationsDetails = currentMedicationsDetails;
	}
	public String getNeedMedicationFlag() {
		return needMedicationFlag;
	}
	public void setNeedMedicationFlag(String needMedicationFlag) {
		this.needMedicationFlag = needMedicationFlag;
	}
	public String getMedicationSuppyFlag() {
		return medicationSuppyFlag;
	}
	public void setMedicationSuppyFlag(String medicationSuppyFlag) {
		this.medicationSuppyFlag = medicationSuppyFlag;
	}
	public String getRefillDetails() {
		return refillDetails;
	}
	public void setRefillDetails(String refillDetails) {
		this.refillDetails = refillDetails;
	}
	public String getDoctorsAppointment() {
		return doctorsAppointment;
	}
	public void setDoctorsAppointment(String doctorsAppointment) {
		this.doctorsAppointment = doctorsAppointment;
	}
	public String getDoctorsAppointmentDate() {
		return doctorsAppointmentDate;
	}
	public void setDoctorsAppointmentDate(String doctorsAppointmentDate) {
		this.doctorsAppointmentDate = doctorsAppointmentDate;
	}
	public String getEyewearFlag() {
		return eyewearFlag;
	}
	public void setEyewearFlag(String eyewearFlag) {
		this.eyewearFlag = eyewearFlag;
	}
	public String getEyewearUsage() {
		return eyewearUsage;
	}
	public void setEyewearUsage(String eyewearUsage) {
		this.eyewearUsage = eyewearUsage;
	}
	public String getIndustrialInjuryFlag() {
		return industrialInjuryFlag;
	}
	public void setIndustrialInjuryFlag(String industrialInjuryFlag) {
		this.industrialInjuryFlag = industrialInjuryFlag;
	}
	public String getIndustrialInjuryDate() {
		return industrialInjuryDate;
	}
	public void setIndustrialInjuryDate(String industrialInjuryDate) {
		this.industrialInjuryDate = industrialInjuryDate;
	}
	public String getIndustrialInjuryReason() {
		return industrialInjuryReason;
	}
	public void setIndustrialInjuryReason(String industrialInjuryReason) {
		this.industrialInjuryReason = industrialInjuryReason;
	}
	public String getIndustrialInjuryLocation() {
		return industrialInjuryLocation;
	}
	public void setIndustrialInjuryLocation(String industrialInjuryLocation) {
		this.industrialInjuryLocation = industrialInjuryLocation;
	}
	public String getIndustrialInjuryEmployer() {
		return industrialInjuryEmployer;
	}
	public void setIndustrialInjuryEmployer(String industrialInjuryEmployer) {
		this.industrialInjuryEmployer = industrialInjuryEmployer;
	}
	public String getIndustrialInjuryClaimStatus() {
		return industrialInjuryClaimStatus;
	}
	public void setIndustrialInjuryClaimStatus(String industrialInjuryClaimStatus) {
		this.industrialInjuryClaimStatus = industrialInjuryClaimStatus;
	}
	public String getDisabilityFlag() {
		return disabilityFlag;
	}
	public void setDisabilityFlag(String disabilityFlag) {
		this.disabilityFlag = disabilityFlag;
	}
	public String getDisabilityDetails() {
		return disabilityDetails;
	}
	public void setDisabilityDetails(String disabilityDetails) {
		this.disabilityDetails = disabilityDetails;
	}
	public String getExaminationDate() {
		return examinationDate;
	}
	public void setExaminationDate(String examinationDate) {
		this.examinationDate = examinationDate;
	}
	public String getPhysician() {
		return physician;
	}
	public void setPhysician(String physician) {
		this.physician = physician;
	}
	public String getPhysicianAddress() {
		return physicianAddress;
	}
	public void setPhysicianAddress(String physicianAddress) {
		this.physicianAddress = physicianAddress;
	}
	public String getHerniaSide() {
		return herniaSide;
	}
	public void setHerniaSide(String herniaSide) {
		this.herniaSide = herniaSide;
	}
	public String getHerniaOperationFlag() {
		return herniaOperationFlag;
	}
	public void setHerniaOperationFlag(String herniaOperationFlag) {
		this.herniaOperationFlag = herniaOperationFlag;
	}
	public String getHerniaDate() {
		return herniaDate;
	}
	public void setHerniaDate(String herniaDate) {
		this.herniaDate = herniaDate;
	}
	public String getHerniaPhysician() {
		return herniaPhysician;
	}
	public void setHerniaPhysician(String herniaPhysician) {
		this.herniaPhysician = herniaPhysician;
	}
	public String getQtyConsumed1() {
		return qtyConsumed1;
	}
	public void setQtyConsumed1(String qtyConsumed1) {
		this.qtyConsumed1 = qtyConsumed1;
	}
	public String getQtyConsumed2() {
		return qtyConsumed2;
	}
	public void setQtyConsumed2(String qtyConsumed2) {
		this.qtyConsumed2 = qtyConsumed2;
	}
	public String getCurrentMedications() {
		return currentMedications;
	}
	public void setCurrentMedications(String currentMedications) {
		this.currentMedications = currentMedications;
	}
	public String getRefillDirections() {
		return refillDirections;
	}
	public void setRefillDirections(String refillDirections) {
		this.refillDirections = refillDirections;
	}
	public String getMedicalConditionDetails() {
		return medicalConditionDetails;
	}
	public void setMedicalConditionDetails(String medicalConditionDetails) {
		this.medicalConditionDetails = medicalConditionDetails;
	}
	public String getOtherJobSkill() {
		return otherJobSkill;
	}
	public void setOtherJobSkill(String otherJobSkill) {
		this.otherJobSkill = otherJobSkill;
	}
	public String[] getQuestion() {
		return question;
	}
	public void setQuestion(String[] question) {
		this.question = question;
	}
	public String[] getQuestionAnswerDetails() {
		return questionAnswerDetails;
	}
	public void setQuestionAnswerDetails(String[] questionAnswerDetails) {
		this.questionAnswerDetails = questionAnswerDetails;
	}
	public String[] getQuestionAnswerDates() {
		return questionAnswerDates;
	}
	public void setQuestionAnswerDates(String[] questionAnswerDates) {
		this.questionAnswerDates = questionAnswerDates;
	}
	public String[] getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String[] medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String[] getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String[] workExperience) {
		this.workExperience = workExperience;
	}
	public String getWorkExperienceOther() {
		return workExperienceOther;
	}
	public void setWorkExperienceOther(String workExperienceOther) {
		this.workExperienceOther = workExperienceOther;
	}
	public String getWorkExperienceOtherDesc() {
		return workExperienceOtherDesc;
	}
	public void setWorkExperienceOtherDesc(String workExperienceOtherDesc) {
		this.workExperienceOtherDesc = workExperienceOtherDesc;
	}
	public String getEmployer1() {
		return employer1;
	}
	public void setEmployer1(String employer1) {
		this.employer1 = employer1;
	}
	public String getEmployerContact1() {
		return employerContact1;
	}
	public void setEmployerContact1(String employerContact1) {
		this.employerContact1 = employerContact1;
	}
	public String getEmployerPhone1() {
		return employerPhone1;
	}
	public void setEmployerPhone1(String employerPhone1) {
		this.employerPhone1 = employerPhone1;
	}
	public String getEmployerDates1() {
		return employerDates1;
	}
	public void setEmployerDates1(String employerDates1) {
		this.employerDates1 = employerDates1;
	}
	public String getEmployer2() {
		return employer2;
	}
	public void setEmployer2(String employer2) {
		this.employer2 = employer2;
	}
	public String getEmployerContact2() {
		return employerContact2;
	}
	public void setEmployerContact2(String employerContact2) {
		this.employerContact2 = employerContact2;
	}
	public String getEmployerPhone2() {
		return employerPhone2;
	}
	public void setEmployerPhone2(String employerPhone2) {
		this.employerPhone2 = employerPhone2;
	}
	public String getEmployerDates2() {
		return employerDates2;
	}
	public void setEmployerDates2(String employerDates2) {
		this.employerDates2 = employerDates2;
	}
	public String getEmployer3() {
		return employer3;
	}
	public void setEmployer3(String employer3) {
		this.employer3 = employer3;
	}
	public String getEmployerContact3() {
		return employerContact3;
	}
	public void setEmployerContact3(String employerContact3) {
		this.employerContact3 = employerContact3;
	}
	public String getEmployerPhone3() {
		return employerPhone3;
	}
	public void setEmployerPhone3(String employerPhone3) {
		this.employerPhone3 = employerPhone3;
	}
	public String getEmployerDates3() {
		return employerDates3;
	}
	public void setEmployerDates3(String employerDates3) {
		this.employerDates3 = employerDates3;
	}
	public String getEmployer4() {
		return employer4;
	}
	public void setEmployer4(String employer4) {
		this.employer4 = employer4;
	}
	public String getEmployerContact4() {
		return employerContact4;
	}
	public void setEmployerContact4(String employerContact4) {
		this.employerContact4 = employerContact4;
	}
	public String getEmployerPhone4() {
		return employerPhone4;
	}
	public void setEmployerPhone4(String employerPhone4) {
		this.employerPhone4 = employerPhone4;
	}
	public String getEmployerDates4() {
		return employerDates4;
	}
	public void setEmployerDates4(String employerDates4) {
		this.employerDates4 = employerDates4;
	}
	public String getLawsuitFlag() {
		return lawsuitFlag;
	}
	public void setLawsuitFlag(String lawsuitFlag) {
		this.lawsuitFlag = lawsuitFlag;
	}
	public String getCurrentLawsuitFlag() {
		return currentLawsuitFlag;
	}
	public void setCurrentLawsuitFlag(String currentLawsuitFlag) {
		this.currentLawsuitFlag = currentLawsuitFlag;
	}
	public String getLawsuitDetails() {
		return lawsuitDetails;
	}
	public void setLawsuitDetails(String lawsuitDetails) {
		this.lawsuitDetails = lawsuitDetails;
	}
	public String getCurrentLawsuitDetails() {
		return currentLawsuitDetails;
	}
	public void setCurrentLawsuitDetails(String currentLawsuitDetails) {
		this.currentLawsuitDetails = currentLawsuitDetails;
	}
	public String getLawsuitDate() {
		return lawsuitDate;
	}
	public void setLawsuitDate(String lawsuitDate) {
		this.lawsuitDate = lawsuitDate;
	}
	public String getCurrentLawsuitDate() {
		return currentLawsuitDate;
	}
	public void setCurrentLawsuitDate(String currentLawsuitDate) {
		this.currentLawsuitDate = currentLawsuitDate;
	}
	public String getFelonyFlag() {
		return felonyFlag;
	}
	public void setFelonyFlag(String felonyFlag) {
		this.felonyFlag = felonyFlag;
	}
	public String getSexualOffenseFlag() {
		return sexualOffenseFlag;
	}
	public void setSexualOffenseFlag(String sexualOffenseFlag) {
		this.sexualOffenseFlag = sexualOffenseFlag;
	}
	public String getFelonyDetails() {
		return felonyDetails;
	}
	public void setFelonyDetails(String felonyDetails) {
		this.felonyDetails = felonyDetails;
	}
	public String getSexualOffenseQty() {
		return sexualOffenseQty;
	}
	public void setSexualOffenseQty(String sexualOffenseQty) {
		this.sexualOffenseQty = sexualOffenseQty;
	}
	public String getSexualOffenseDetails() {
		return sexualOffenseDetails;
	}
	public void setSexualOffenseDetails(String sexualOffenseDetails) {
		this.sexualOffenseDetails = sexualOffenseDetails;
	}
	public String getFelonyQty() {
		return felonyQty;
	}
	public void setFelonyQty(String felonyQty) {
		this.felonyQty = felonyQty;
	}
	public String getSSFlag() {
		return SSFlag;
	}
	public void setSSFlag(String sSFlag) {
		SSFlag = sSFlag;
	}
	public String getVAFlag() {
		return VAFlag;
	}
	public void setVAFlag(String vAFlag) {
		VAFlag = vAFlag;
	}
	public String getWCFlag() {
		return WCFlag;
	}
	public void setWCFlag(String wCFlag) {
		WCFlag = wCFlag;
	}
	public String getOtherBenefits() {
		return otherBenefits;
	}
	public void setOtherBenefits(String otherBenefits) {
		this.otherBenefits = otherBenefits;
	}
	public String getProbationFlag() {
		return probationFlag;
	}
	public void setProbationFlag(String probationFlag) {
		this.probationFlag = probationFlag;
	}
	public String getProbationCounty() {
		return probationCounty;
	}
	public void setProbationCounty(String probationCounty) {
		this.probationCounty = probationCounty;
	}
	public String getProbationState() {
		return probationState;
	}
	public void setProbationState(String probationState) {
		this.probationState = probationState;
	}
	public String getProbationOfficer() {
		return probationOfficer;
	}
	public void setProbationOfficer(String probationOfficer) {
		this.probationOfficer = probationOfficer;
	}
	public String getProbationOfficerPhone() {
		return probationOfficerPhone;
	}
	public void setProbationOfficerPhone(String probationOfficerPhone) {
		this.probationOfficerPhone = probationOfficerPhone;
	}
	public String getProbationAppt() {
		return probationAppt;
	}
	public void setProbationAppt(String probationAppt) {
		this.probationAppt = probationAppt;
	}
	public String getProbationApptDetails() {
		return probationApptDetails;
	}
	public void setProbationApptDetails(String probationApptDetails) {
		this.probationApptDetails = probationApptDetails;
	}
	public String getLibraryCard() {
		return libraryCard;
	}
	public void setLibraryCard(String libraryCard) {
		this.libraryCard = libraryCard;
	}
	public String getBirthCertFlag() {
		return birthCertFlag;
	}
	public void setBirthCertFlag(String birthCertFlag) {
		this.birthCertFlag = birthCertFlag;
	}
	public String getBirthCertCounty() {
		return birthCertCounty;
	}
	public void setBirthCertCounty(String birthCertCounty) {
		this.birthCertCounty = birthCertCounty;
	}
	public String getBirthCertState() {
		return birthCertState;
	}
	public void setBirthCertState(String birthCertState) {
		this.birthCertState = birthCertState;
	}
	public String getGovtHealthCoverage() {
		return govtHealthCoverage;
	}
	public void setGovtHealthCoverage(String govtHealthCoverage) {
		this.govtHealthCoverage = govtHealthCoverage;
	}
	public String getPrivateHealthCoverage() {
		return privateHealthCoverage;
	}
	public void setPrivateHealthCoverage(String privateHealthCoverage) {
		this.privateHealthCoverage = privateHealthCoverage;
	}
	public String getSelectiveService() {
		return selectiveService;
	}
	public void setSelectiveService(String selectiveService) {
		this.selectiveService = selectiveService;
	}
	public String getPendingCourtDates() {
		return pendingCourtDates;
	}
	public void setPendingCourtDates(String pendingCourtDates) {
		this.pendingCourtDates = pendingCourtDates;
	}
	public String getChildSupport() {
		return childSupport;
	}
	public void setChildSupport(String childSupport) {
		this.childSupport = childSupport;
	}
	public String getRestitution() {
		return restitution;
	}
	public void setRestitution(String restitution) {
		this.restitution = restitution;
	}
	public String getHomelessLengthOfTime() {
		return homelessLengthOfTime;
	}
	public void setHomelessLengthOfTime(String homelessLengthOfTime) {
		this.homelessLengthOfTime = homelessLengthOfTime;
	}
	public String getHomelessHowOften() {
		return homelessHowOften;
	}
	public void setHomelessHowOften(String homelessHowOften) {
		this.homelessHowOften = homelessHowOften;
	}
	public String getHomelessReason() {
		return homelessReason;
	}
	public void setHomelessReason(String homelessReason) {
		this.homelessReason = homelessReason;
	}
	public String getIncomeAmount() {
		return incomeAmount;
	}
	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	public String getIncomeSource() {
		return incomeSource;
	}
	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}
	public String getIncomeWeeklyFlag() {
		return incomeWeeklyFlag;
	}
	public void setIncomeWeeklyFlag(String incomeWeeklyFlag) {
		this.incomeWeeklyFlag = incomeWeeklyFlag;
	}
	public String getIncomeBiWeeklyFlag() {
		return incomeBiWeeklyFlag;
	}
	public void setIncomeBiWeeklyFlag(String incomeBiWeeklyFlag) {
		this.incomeBiWeeklyFlag = incomeBiWeeklyFlag;
	}
	public String getIncomeMonthlyFlag() {
		return incomeMonthlyFlag;
	}
	public void setIncomeMonthlyFlag(String incomeMonthlyFlag) {
		this.incomeMonthlyFlag = incomeMonthlyFlag;
	}
	public String getIncomeYearlyFlag() {
		return incomeYearlyFlag;
	}
	public void setIncomeYearlyFlag(String incomeYearlyFlag) {
		this.incomeYearlyFlag = incomeYearlyFlag;
	}
	public ArrayList getAnswer() {
		return answer;
	}
	public void setAnswer(ArrayList answer) {
		this.answer = answer;
	}
	public ArrayList getAnswerDetail() {
		return answerDetail;
	}
	public void setAnswerDetail(ArrayList answerDetail) {
		this.answerDetail = answerDetail;
	}
	public ArrayList getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(ArrayList answerDate) {
		this.answerDate = answerDate;
	}
	public ArrayList getMedicationCondition() {
		return medicationCondition;
	}
	public void setMedicationCondition(ArrayList medicationCondition) {
		this.medicationCondition = medicationCondition;
	}
	public ArrayList getJobSkill() {
		return jobSkill;
	}
	public void setJobSkill(ArrayList jobSkill) {
		this.jobSkill = jobSkill;
	}
	public ArrayList getEmployer() {
		return employer;
	}
	public void setEmployer(ArrayList employer) {
		this.employer = employer;
	}
	public ArrayList getReference() {
		return reference;
	}
	public void setReference(ArrayList reference) {
		this.reference = reference;
	}
	public ArrayList getVisitor() {
		return visitor;
	}
	public void setVisitor(ArrayList visitor) {
		this.visitor = visitor;
	}
	public ArrayList getProperty() {
		return property;
	}
	public void setProperty(ArrayList property) {
		this.property = property;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public String getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getApplicationSignature() {
		return applicationSignature;
	}
	public void setApplicationSignature(String applicationSignature) {
		this.applicationSignature = applicationSignature;
	}
	public String getIntakeCounselorSignature() {
		return intakeCounselorSignature;
	}
	public void setIntakeCounselorSignature(String intakeCounselorSignature) {
		this.intakeCounselorSignature = intakeCounselorSignature;
	}
	public String getDirectorSignature() {
		return directorSignature;
	}
	public void setDirectorSignature(String directorSignature) {
		this.directorSignature = directorSignature;
	}
	public String getApplicationSignatureDate() {
		return applicationSignatureDate;
	}
	public void setApplicationSignatureDate(String applicationSignatureDate) {
		this.applicationSignatureDate = applicationSignatureDate;
	}
	public String getIntakeCounselorSignatureDate() {
		return intakeCounselorSignatureDate;
	}
	public void setIntakeCounselorSignatureDate(String intakeCounselorSignatureDate) {
		this.intakeCounselorSignatureDate = intakeCounselorSignatureDate;
	}
	public String getDirectorSignatureDate() {
		return directorSignatureDate;
	}
	public void setDirectorSignatureDate(String directorSignatureDate) {
		this.directorSignatureDate = directorSignatureDate;
	}
	public String getCellDisclosureConsent() {
		return cellDisclosureConsent;
	}
	public void setCellDisclosureConsent(String cellDisclosureConsent) {
		this.cellDisclosureConsent = cellDisclosureConsent;
	}
	public String getReleaseWaiverConsent() {
		return releaseWaiverConsent;
	}
	public void setReleaseWaiverConsent(String releaseWaiverConsent) {
		this.releaseWaiverConsent = releaseWaiverConsent;
	}
	public String getBiblicalBasedCounselingConsent() {
		return biblicalBasedCounselingConsent;
	}
	public void setBiblicalBasedCounselingConsent(
			String biblicalBasedCounselingConsent) {
		this.biblicalBasedCounselingConsent = biblicalBasedCounselingConsent;
	}
	public String getEntryAgreementConsent() {
		return entryAgreementConsent;
	}
	public void setEntryAgreementConsent(String entryAgreementConsent) {
		this.entryAgreementConsent = entryAgreementConsent;
	}
	public String getRulesVisitationConsent() {
		return rulesVisitationConsent;
	}
	public void setRulesVisitationConsent(String rulesVisitationConsent) {
		this.rulesVisitationConsent = rulesVisitationConsent;
	}
	public String getReleaseInformationConsent() {
		return releaseInformationConsent;
	}
	public void setReleaseInformationConsent(String releaseInformationConsent) {
		this.releaseInformationConsent = releaseInformationConsent;
	}
	public String getConsent() {
		return Consent;
	}
	public void setConsent(String consent) {
		Consent = consent;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getIntakeStatus() {
		return intakeStatus;
	}
	public void setIntakeStatus(String intakeStatus) {
		this.intakeStatus = intakeStatus;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCurrentClass() {
		return currentClass;
	}
	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public String getArchiveFlag() {
		return archiveFlag;
	}
	public void setArchiveFlag(String archiveFlag) {
		this.archiveFlag = archiveFlag;
	}
	public String getExitDate() {
		return exitDate;
	}
	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
	}

	public BufferedImage getStudentPhoto() {
		return studentPhoto;
	}

	public void setStudentPhoto(BufferedImage studentPhoto) {
		this.studentPhoto = studentPhoto;
	}

	public Blob getImageHeadshot() {
		return imageHeadshot;
	}

	public void setImageHeadshot(Blob imageHeadshot) {
		this.imageHeadshot = imageHeadshot;
	}
	
	
	
	
}
