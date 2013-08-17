package org.faithfarm.intake.validation;

import javax.servlet.http.HttpServletRequest;

import org.faithfarm.domain.Intake;
import org.faithfarm.intake.IntakeServlet;
import org.faithfarm.util.Validator;

public class IntakeValidator {

	public boolean validate(Intake intake, String source, HttpServletRequest req) {
		boolean success = true;
		Validator valid8r = new Validator();
		int validAreaCount =0;
		
		String fieldErr = "";

		if ("application".equals(source) || "personal".equals(source)) {

			fieldErr = valid8r.validateRequired("lastname",
					intake.getLastName());
			if ("".equals(fieldErr))
				fieldErr = valid8r.validateOnlyLetters("lastname",
						intake.getLastName());
			req.setAttribute("lastNameErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("firstname",
					intake.getFirstName());
			if ("".equals(fieldErr))
				fieldErr = valid8r.validateOnlyLetters("firstname",
						intake.getFirstName());
			req.setAttribute("firstNameErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateOnlyLetters("middle initial",
					intake.getMiddleInitial());
			req.setAttribute("middleInitialErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("ssn", intake.getSsn());
			req.setAttribute("ssnErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("address", intake.getAddress());
			req.setAttribute("addressErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("city", intake.getCity());
			req.setAttribute("cityErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("state", intake.getState());
			req.setAttribute("stateErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("zipcode", intake.getZipcode());
			req.setAttribute("zipcodeErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("referral phone",
					intake.getReferralPhone());
			if ("".equals(fieldErr))
				fieldErr = valid8r.validatePhone("referral phone",
						intake.getReferralPhone());
			req.setAttribute("referralPhoneErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("date of birth",
					intake.getDateOfBirth());
			if ("".equals(fieldErr))
				fieldErr = valid8r.validateDate("date of birth",
						intake.getDateOfBirth());
			req.setAttribute("dobErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("age", intake.getAge());
			req.setAttribute("ageErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("emergency contact",
					intake.getEmergencyContact());
			req.setAttribute("emergencyContactErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("relationship",
					intake.getEmergencyRelationship());
			req.setAttribute("emergencyRelationshipErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("emergency phone",
					intake.getEmergencyPhone());
			if ("".equals(fieldErr))
				fieldErr = valid8r.validatePhone("emergency phone",
						intake.getEmergencyPhone());
			req.setAttribute("emergencyPhoneErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("marital status",
					intake.getMaritalStatus());
			req.setAttribute("maritalStatusErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("ethnicity",
					intake.getEthnicity());
			req.setAttribute("ethnicityErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("height", intake.getHeight());
			req.setAttribute("heightErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("weight", intake.getWeight());
			req.setAttribute("weightErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("eyecolor",
					intake.getEyeColor());
			req.setAttribute("eyecolorErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("haircolor",
					intake.getHairColor());
			req.setAttribute("haircolorErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("where do you live",
					intake.getHomeLocation());
			req.setAttribute("homeLocationErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("schooling completed",
					intake.getEducationLevel());
			req.setAttribute("educationLevelErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("did you graduate",
					intake.getGraduateFlag());
			req.setAttribute("graduateFlagErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("read english",
					intake.getEnglishReadFlag());
			req.setAttribute("englishReadErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("speak english",
					intake.getEnglishSpeakFlag());
			req.setAttribute("englishSpeakErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			if ("YES".equals(intake.getVeteranFlag())) {

				fieldErr = valid8r.validateRequired("branch of service",
						intake.getBranchOfService());
				req.setAttribute("branchOfServiceErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("rank", intake.getRank());
				req.setAttribute("rankErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("length of service",
						intake.getLengthOfService());
				req.setAttribute("lengthOfServiceErr", fieldErr);
				
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getDriversLicenseFlag())) {

				fieldErr = valid8r.validateRequired("license state",
						intake.getDriversLicenseState());
				req.setAttribute("driversLicenseStateErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("license number",
						intake.getDriversLicenseNumber());
				req.setAttribute("driversLicenseNumberErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

			} else {
				fieldErr = valid8r.validateRequired("valid license",
						intake.getDriversLicenseFlag());
				req.setAttribute("driversLicenseFlagErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			fieldErr = valid8r.validateRequired("mother living",
					intake.getMotherLivingFlag());
			req.setAttribute("motherLivingFlagErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("father living",
					intake.getFatherLivingFlag());
			req.setAttribute("fatherLivingFlagErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;
			
			if (success) {
				validAreaCount++;
				IntakeServlet.setPersonal(true);
			}
	}

		if ("application".equals(source) || "religious".equals(source)) {
			fieldErr = valid8r.validateRequired("spiritual experience",
					intake.getReligiousExperience());
			req.setAttribute("religiousExperienceErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("religion",
					intake.getReligion());
			req.setAttribute("religionErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;
		
			if (success) {
				validAreaCount++;
				IntakeServlet.setReligious(true);
			}
		}

		if ("application".equals(source) || "substance".equals(source)) {
			fieldErr = valid8r.validateRequired("3 years sober",
					intake.getSober3Years());
			req.setAttribute("sober3YearsErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("1 year sober",
					intake.getSober1Years());
			req.setAttribute("sober1YearsErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			if ("YES".equals(intake.getAttendAA())) {

				fieldErr = valid8r.validateRequired("number of years",
						intake.getYearsAttended());
				req.setAttribute("yearsAttendedErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getPreviousFaithFarmFlag())) {

				fieldErr = valid8r.validateRequired("years attended",
						intake.getFfYearsAttended());
				req.setAttribute("ffYearsAttendedErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("farm location",
						intake.getPreviousFaithFarm());
				req.setAttribute("previousFaithFarmErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			} else {
				fieldErr = valid8r.validateRequired("previous farm",
						intake.getPreviousFaithFarmFlag());
				req.setAttribute("previousFaithFarmFlagErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}
		
			if (success) {
				validAreaCount++;
				IntakeServlet.setSubstance(true);
			}
		}

		if ("application".equals(source) || "health".equals(source)) {
			fieldErr = valid8r.validateRequired("current health",
					intake.getCurrentHealth());
			req.setAttribute("currentHealthErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("current medications",
					intake.getCurrentMedicationsFlag());
			req.setAttribute("currentMedicationsFlagErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			if ("YES".equals(intake.getCurrentMedicationsFlag())) {

				fieldErr = valid8r.validateRequired("list of medications",
						intake.getCurrentMedications());
				req.setAttribute("currentMedicationsErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			fieldErr = valid8r.validateRequired("need medications",
					intake.getNeedMedicationFlag());
			req.setAttribute("needMedicationFlagErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			fieldErr = valid8r.validateRequired("medication supply",
					intake.getMedicationSuppyFlag());
			req.setAttribute("medicationSupplyFlagErr", fieldErr);
			if (fieldErr.length() > 0)
				success = false;

			if ("YES".equals(intake.getDoctorsAppointment())) {

				fieldErr = valid8r.validateRequired("appointment date",
						intake.getDoctorsAppointmentDate());
				req.setAttribute("doctorsAppointmentDateErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			} else {
				fieldErr = valid8r.validateRequired("doctor appointment",
						intake.getDoctorsAppointment());
				req.setAttribute("doctorsAppointmentErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getEyewearFlag())) {

				fieldErr = valid8r.validateRequired("usage",
						intake.getEyewearUsage());
				req.setAttribute("eyewearUsageErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getIndustrialInjuryFlag())) {

				fieldErr = valid8r.validateRequired("date",
						intake.getIndustrialInjuryDate());
				req.setAttribute("industrialInjuryDateErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("reason",
						intake.getIndustrialInjuryReason());
				req.setAttribute("industrialInjuryReasonErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("location",
						intake.getIndustrialInjuryLocation());
				req.setAttribute("industrialInjuryLocationErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("employer",
						intake.getIndustrialInjuryEmployer());
				req.setAttribute("industrialInjuryEmployerErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getDisabilityFlag())) {

				fieldErr = valid8r.validateRequired("physician",
						intake.getPhysician());
				req.setAttribute("physicianErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("physician's address",
						intake.getPhysicianAddress());
				req.setAttribute("physicianAddressErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("examination date",
						intake.getExaminationDate());
				req.setAttribute("examinationErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

			}

			String medicalCondition[] = intake.getMedicalCondition();
			// hernia condition is option 12
			if ("YES".equals(medicalCondition[22])) {

				fieldErr = valid8r.validateRequired("hernia side",
						intake.getHerniaSide());
				req.setAttribute("herniaSideErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				if ("YES".equals(intake.getHerniaOperationFlag())) {
					fieldErr = valid8r.validateRequired("operation date",
							intake.getHerniaDate());
					req.setAttribute("herniaOperationDateErr", fieldErr);
					if (fieldErr.length() > 0)
						success = false;

					fieldErr = valid8r.validateRequired("physician",
							intake.getHerniaPhysician());
					req.setAttribute("herniaPhysicianErr", fieldErr);
					if (fieldErr.length() > 0)
						success = false;
				}
			}
		
			if (success) {
				validAreaCount++;
				IntakeServlet.setHealth(true);
			}

		}// end health

		if ("application".equals(source) || "legal".equals(source)) {
			if ("YES".equals(intake.getLawsuitFlag())) {
				fieldErr = valid8r.validateRequired("lawsuit date",
						intake.getLawsuitDate());
				req.setAttribute("lawsuitDateErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("details",
						intake.getLawsuitDetails());
				req.setAttribute("lawsuitDetailsErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getCurrentLawsuitFlag())) {
				fieldErr = valid8r.validateRequired("current lawsuit date",
						intake.getCurrentLawsuitDate());
				req.setAttribute("currentLawsuitDateErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("current lawsuit details",
						intake.getCurrentLawsuitDetails());
				req.setAttribute("currentLawsuitDetailsErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getFelonyFlag())) {
				fieldErr = valid8r.validateRequired("felony qantity",
						intake.getFelonyQty());
				req.setAttribute("felonyQtyErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("felony details",
						intake.getFelonyDetails());
				req.setAttribute("felonyDetailsErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getSexualOffenseFlag())) {
				fieldErr = valid8r.validateRequired("offense qantity",
						intake.getSexualOffenseQty());
				req.setAttribute("sexualOffenseQtyErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("offense details",
						intake.getSexualOffenseDetails());
				req.setAttribute("sexualOffenseDetailsErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getProbationFlag())) {
				fieldErr = valid8r.validateRequired("probation county",
						intake.getProbationCounty());
				req.setAttribute("probationCountyErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("probation state",
						intake.getProbationState());
				req.setAttribute("probationStateErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired("probation officer",
						intake.getProbationOfficer());
				req.setAttribute("probationOfficerErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;

				fieldErr = valid8r.validateRequired(
						"probation officer's phone",
						intake.getProbationOfficerPhone());
				req.setAttribute("probationOfficerPhoneErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}

			if ("YES".equals(intake.getProbationAppt())) {
				fieldErr = valid8r.validateRequired(
						"probation appointment dates/times",
						intake.getProbationApptDetails());
				req.setAttribute("probationApptDetailsErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}
		
			if (success) {
				validAreaCount++;
				IntakeServlet.setLegal(true);
			}
		}

		if ("application".equals(source) || "employment".equals(source)) {
			if ("YES".equals(intake.getWorkExperienceOther())) {
				fieldErr = valid8r.validateRequired("other experience",
						intake.getWorkExperienceOtherDesc());
				req.setAttribute("workExperienceOtherDescErr", fieldErr);
				if (fieldErr.length() > 0)
					success = false;
			}
		
			if (success) {
				validAreaCount++;
				IntakeServlet.setEmployment(true);
			}

		}
		
		if ("application".equals(source) || "status".equals(source)) {
			validAreaCount++;
			IntakeServlet.setStatus(true);
		}
		IntakeServlet.setValidAreaCount(validAreaCount);
		return success;
	}

}
