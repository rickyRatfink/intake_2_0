package org.faithfarm.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Intake implements Serializable {
 
	private Long intakeId;
	private String farmBase = "";
	private String firstName = "";
	private String lastName = "";
	private String middleInitial = "";
	private String suffix = "";
	private String address = "";
	private String city = "";
	private String state = "";
	private String zipcode = "";
	private String dateOfBirth = "";
	private String ssn = "";
	private String ssnCard = "";
	private String age = "";
	private String height = "";
	private String weight = "";
	private String ethnicity = "";
	private String hairColor = "";
	private String eyeColor = "";
	private String maritalStatus = "";
	private String educationLevel = "";
	private String graduateFlag = "NO";
	private String transcriptsFlag = "NO";
	private String englishSpeakFlag = "NO";
	private String englishReadFlag = "NO";
	private String homeLocation = "";
	private String personType = "";
	private String referredBy = "";
	private String referralPhone = "";
	private String emergencyContact = "";
	private String emergencyPhone = "";
	private String emergencyRelationship = "";
	private String motherLiving;
	private String fatherLiving;
	private String brothers;
	private String sisters;
	private String children;
	private String veteranStatus = "";
	private String branchOfService = "";
	private String rank = "";
	private String lengthOfService = "";
	private String driversLicenseStatus = "";
	private String driversLicenseNumber = "";
	private String driversLicenseState = "";
	private String driversLicenseExpirationDate = "";
	private String stateIdentificationFlag = "NO";
	private String stateIdentificationState = "";
	private String stateIdentificationExpirationDate = "";
	private String governmentBenefits = "";
	private String religion = "";
	private String religiousExperience = "";
	private String alcohol = "";
	private String cocaine = "";
	private String marijuana = "";
	private String oxicoden = "";
	private String speed = "";
	private String heroin = "";
	private String xanax = "";
	private String other = "";
	private String alcoholYearsUsed = "";
	private String cocaineYearsUsed = "";
	private String marijuanaYearsUsed = "";
	private String oxicodenYearsUsed = "";
	private String speedYearsUsed = "";
	private String heroinYearsUsed = "";
	private String xanaxYearsUsed = "";
	private String otherYearsUsed = "";
	private String alcoholLastUsed = "";
	private String cocaineLastUsed = "";
	private String marijuanaLastUsed = "";
	private String oxicodenLastUsed = "";
	private String speedLastUsed = "";
	private String heroinLastUsed = "";
	private String xanaxLastUsed = "";
	private String otherLastUsed = "";
	private String otherDrug = "";
	private String sober3Years = "";
	private String sober1Years = "";
	private String usagePattern = "";
	private String quantityPerWeek = "";
	private String quantity2Years = "";
	private String usageLosses = "";
	private String abusePhysicalEffects = "";
	private String spouseAddicted = "";
	private String familyAddicted = "";
	private String attendAA = "";
	private String attendNA = "";
	private String yearsAttended = "";
	private String previousFaithFarm = "";
	private String faithFarmYear = "";
	private String currentHealth = "";
	private String currentMedicationsFlag = "NO";
	private String currentMedicationsDetails = "";
	private String needMedicationFlag = "NO";
	private String medicationSuppyFlag = "NO";
	private String refillDetails = "";
	private String doctorsAppointment = "";
	private String eyewearFlag = "NO";
	private String eyewearUsage = "";
	private String industrialInjuryFlag = "NO";
	private String industrialInjuryDate = "";
	private String industrialInjuryReason = "";
	private String industrialInjuryLocation = "";
	private String industrialInjuryEmployer = "";
	private String industrialInjuryClaimStatus = "";
	private String disabilityFlag = "NO";
	private String disabilityDetails = "";
	private String examinationDate = "";
	private String physician = "";
	private String herniaSide = "";
	private String herniaOperationFlag = "NO";
	private String herniaDetails="";
	
	private String lawsuitFlag="NO";
	private String currentLawsuitFlag="NO";
	private String lawsuitDetails="";
	private String currentlawsuitDetails="";
	private String felonyFlag= "NO";
	private String sexualOffenseFlag= "NO";
	private String felonyDetails= "";
	private String sexualOffenseQty= "";
	private String sexualOffenseDetails= "";
	
	
	private String probationFlag = "NO";
	private String probationCountyState = "";
	private String probationOfficer = "";
	private String probationOfficerPhone = "";	
	private String probationAppt="NO";
	private String probationApptDetails="";
	private String libraryCard = "";
	private String birthCertFlag = "NO";
	private String birthCertCounty = "";
	private String birthCertState = "";
	private String govtHealthCoverage = "";
	private String privateHealthCoverage = "";
	private String selectiveService = "";
	private String pendingCourtDates = "";
	private String childSupport = "";
	private String restitution = "";
	private String homelessLenghtOfTime = "";
	private String homelessHowOften="";
	private String homelessReason = "";
	private String incomeAmount = "";
	private String incomeSource = "";
	private String incomeWeeklyFlag = "NO";
	private String incomeMonthlyFlag = "NO";
	
	private ArrayList answer = new ArrayList();
	private ArrayList answerDetail = new ArrayList();
	private ArrayList answerDate = new ArrayList();
	private ArrayList medicationCondition = new ArrayList();
	private ArrayList jobSkill = new ArrayList();
	private ArrayList employer = new ArrayList();
	private ArrayList reference = new ArrayList();
	private ArrayList visitor = new ArrayList();
	private ArrayList property = new ArrayList();
		
	private String creationDate = "";
	private String createdBy = "";
	private String lastUpdatedDate = "";
	private String lastUpdatedBy = "";
	private String submissionDate = "";
	private String applicationStatus = "PENDING";
	
	private String applicationSignature = "";
	private String intakeCounselorSignature = "";
	private String directorSignature = "";
	private String applicationSignatureDate = "";
	private String intakeCounselorSignatureDate = "";
	private String directorSignatureDate = "";
	
	private String cellDisclosureConsent = "NO";
	private String releaseWaiverConsent = "NO";
	private String biblicalBasedCounselingConsent = "NO";
	private String entryAgreementConsent = "NO";
	private String rulesVisitationConsent = "NO";
	private String releaseInformationConsent = "NO";
	private String Consent = "NO";
	
	
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
	public String getMotherLiving() {
		return motherLiving;
	}
	public void setMotherLiving(String motherLiving) {
		this.motherLiving = motherLiving;
	}
	public String getFatherLiving() {
		return fatherLiving;
	}
	public void setFatherLiving(String fatherLiving) {
		this.fatherLiving = fatherLiving;
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
	public String getVeteranStatus() {
		return veteranStatus;
	}
	public void setVeteranStatus(String veteranStatus) {
		this.veteranStatus = veteranStatus;
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
	public String getOxicoden() {
		return oxicoden;
	}
	public void setOxicoden(String oxicoden) {
		this.oxicoden = oxicoden;
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
	public String getOxicodenYearsUsed() {
		return oxicodenYearsUsed;
	}
	public void setOxicodenYearsUsed(String oxicodenYearsUsed) {
		this.oxicodenYearsUsed = oxicodenYearsUsed;
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
	public String getOxicodenLastUsed() {
		return oxicodenLastUsed;
	}
	public void setOxicodenLastUsed(String oxicodenLastUsed) {
		this.oxicodenLastUsed = oxicodenLastUsed;
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
	public String getUsageLosses() {
		return usageLosses;
	}
	public void setUsageLosses(String usageLosses) {
		this.usageLosses = usageLosses;
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

	public String getProbationFlag() {
		return probationFlag;
	}
	public void setProbationFlag(String probationFlag) {
		this.probationFlag = probationFlag;
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
	public String getHomelessLenghtOfTime() {
		return homelessLenghtOfTime;
	}
	public void setHomelessLenghtOfTime(String homelessLenghtOfTime) {
		this.homelessLenghtOfTime = homelessLenghtOfTime;
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
	public String getIncomeMonthlyFlag() {
		return incomeMonthlyFlag;
	}
	public void setIncomeMonthlyFlag(String incomeMonthlyFlag) {
		this.incomeMonthlyFlag = incomeMonthlyFlag;
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
	public String getHerniaDetails() {
		return herniaDetails;
	}
	public void setHerniaDetails(String herniaDetails) {
		this.herniaDetails = herniaDetails;
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
	public String getCurrentlawsuitDetails() {
		return currentlawsuitDetails;
	}
	public void setCurrentlawsuitDetails(String currentlawsuitDetails) {
		this.currentlawsuitDetails = currentlawsuitDetails;
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
	public String getProbationCountyState() {
		return probationCountyState;
	}
	public void setProbationCountyState(String probationCountyState) {
		this.probationCountyState = probationCountyState;
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
	public String getIncomeAmount() {
		return incomeAmount;
	}
	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	
	
	
	
	
	
}
