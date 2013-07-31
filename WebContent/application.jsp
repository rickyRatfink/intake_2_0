<jsp:include page="header.jsp" flush="true"/>


<style type="text/css">

BODY {
font-family:Tahoma, Geneva, Helvetica; 
	font-size:.7em; 
	margin:0 auto; 
	color:#3F1910; 
	text-align:left;
}

</style>


<tr>
 			<td bgcolor="#ffffff" align="center"><br /><br />

<div class="interior-mid">
  <div class="interior-text-mid">
 

<form method=post action="/intake">
	
    <table>
	<tr>
		<td colspan="11"><h1><b>Online Student Application for Faith Farm Programs</b></h1></td>
	</tr>
	<tr>
		<td colspan="11"><b>Campus: Boynton Beach </b></td>
	</tr>
	<tr>
		<td colspan="11">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>General Information: </b></td>
	</tr>
	<tr>
		<td colspan="11">&nbsp;</td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="Last_Name" size="20"></td>
		<td>&nbsp;&nbsp;</td>
		<td>First Name</td>
		<td><input type="text" name="First_Name" size="20"></td>
		<td>&nbsp;&nbsp;</td>
		<td>MI</td>
		<td><input type="text" name="MI" size="4"></td>
		<td>&nbsp;&nbsp;</td>
		<td >Referred to<br>Faith Farm By</td>
		<td><input type="text" name="Referred_to_Faith_Farm_By" size="28"></td>
	</tr>
	<tr>
		<td colspan="11">&nbsp;</td>
	</tr>
	<tr>
		<td>Address of Contact</td>
		<td><input type="text" name="Address_of_Contact" size="28"></td>
		<td>&nbsp;&nbsp;</td>
		<td>City</td>
		<td><input type="text" name="City" size="20"></td>
		<td></td>
		<td>State</td>
		<td><input type="text" name="State" size="4"></td>
		<td></td>
		<td>Zip&nbsp;<input type="text" name="Zip" size="11"></td>
		<td></td>
	</tr>
	<tr>
		<td>Phone Number</td>
		<td><input type="text" name="Phone_Number" size="20"></td>
		<td>&nbsp;&nbsp;</td>
		<td>Date of Birth</td>
		<td><input type="text" name="Date_of_Birth" size="12"></td>
		<td>&nbsp;&nbsp;</td>
		<td>Age</td>
		<td><input type="text" name="Age" size="4"></td>
		<td>&nbsp;&nbsp;</td>
		<td colspan="2">Marial Status&nbsp;<input type="text" name="Marital_Status" size="20"></td>
	</tr>
	<tr>
		<td>Emergency Contact Person</td>
		<td><input type="text" name="Emergency_Contact_Person" size="28"> </td>
		<td></td>
		<td>Relationship</td>
		<td><input type="text" name="Relationship" size="20"></td>
	</tr>
	<tr>
		<td colspan="11">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11">Height&nbsp;<input type="text" name="Height" size="5">
		&nbsp;&nbsp;&nbsp;Weight&nbsp;
		<input type="text" name="Weight" size="6">
		&nbsp;&nbsp;&nbsp;Eyes&nbsp;<input type="text" name="Eyes" size="11">
		&nbsp;&nbsp;Hair&nbsp;
		<input type="text" name="Hair" size="12"></td>
		<td></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td>Where do you live?</td>
		<td><input type="text" name="Where_do_you_live" size="22"></td>
		<td></td>
		<td>Schooling Completed? </td>
		<td>
			<select size="1" name="Schooling_Completed">
				<option value="Middle School">Middle School</option>
				<option value="High School">High School</option>
				<option value="College">College</option>
				<option value="" selected>Select One</option>
			</select>
		</td>
		<td></td>
		<td nowrap colspan="5">Do you receive government benefits?&nbsp;&nbsp;
			<select size="1" name="government_benefits">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11">Describe your religious/spiritual experiences:</td>
	</tr>
	<tr>
		<td colspan="11"><textarea rows="5" name="Describe_your_religious_experiences" cols="93"></textarea></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Substances Regularly Used:</b></td>
	</tr>
	<tr>
		<td  valign="top" colspan="5">
			<table border="0" cellpadding="5" cellspacing="5" width="352" height="243" align="left">
				<tr>
					<td width="124">

					Substance</td>
					<td width="102">

					Years Used</td>
					<td>

					Last Used</td>
				</tr>
				<tr>
					<td width="124">

					Alcohol</td>
					<td width="102">

					<input type="text" name="Alcohol_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Alcohol_Last_Used" size="12"></td>
				</tr>
				<tr>
					<td width="124">

					Cocaine</td>
					<td width="102">

					<input type="text" name="Cocaine_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Cocaine_Last_Used" size="12"></td>
				</tr>
				<tr>
					<td width="124">

					Marijuana</td>
					<td width="102">

					<input type="text" name="Marijuana_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Marijuana_Last_Used" size="12"></td>
				</tr>
				<tr>
					<td width="124">

					Hallucinogens</td>
					<td width="102">

					<input type="text" name="Hallucinogens_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Hallucinogens_Last_Used" size="12"></td>
				</tr>
				<tr>
					<td width="124">

					Speed</td>
					<td width="102">

					<input type="text" name="Speed_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Speed_Last_Used" size="12"></td>
				</tr>
				<tr>
					<td width="124">

					Heroin</td>
					<td width="102">

					<input type="text" name="Heroin_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Heroin_Last_Used" size="12"></td>
				</tr>
				<tr>
					<td width="124">

					Other</td>
					<td width="102">

					<input type="text" name="Other_Years_Used" size="13"></td>
					<td>

					<input type="text" name="Other_Last_Used" size="12"></td>
				</tr>
			</table>
		</td>
		<td>&nbsp;</td>
		<td colspan="5" valign="top">Longest time sober in past 3 years?&nbsp;<input type="text" name="sober_in_past_3_years" size="8">
		<br>in the last year? <input type="text" name="in_the_last_year" size="9"><br><br>
		Pattern of usage<br><input type="text" name="Pattern_of_usage" size="45"><br> 
		Losses due to usage<br><input type="text" name="Losses_due_to_usage" size="45"><br>
		Physical effects of abuse<br><input type="text" name="Physical_effects_of_abuse" size="45"><br><br>
		Any Previous Rehabs?&nbsp;
			<select size="1" name="Previous_Rehabs">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
			</select><br><br>
		Ever been to a Faith Farm Before?&nbsp;
			<select size="1" name="Ever_been_to_a_Faith_Farm_Before">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
			</select><br><br>
		Year:&nbsp;<input type="text" name="Year" size="6">&nbsp;
		Where:&nbsp;
			<select size="1" name="Where">
				<option value="Boynton Beach">Boynton Beach</option>
				<option value="Ft. Lauderdale">Ft. Lauderdale</option>
				<option value="Okeechobee">Okeechobee</option>
				<option selected value="">Select One</option>
			</select><br>
		</td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Medical Information:</b></td>
	</tr>
	<tr>
		<td colspan="11">
		How would you rate your health?&nbsp;
		<select size="1" name="How_would_you_rate_your_health">
			<option value="Excellent">Excellent</option>
			<option value="Good">Good</option>
			<option value="Average">Average</option>
			<option value="Poor">Poor</option>
			<option selected value="">Select one</option>
		</select><br><br> 
		Are you on medications?&nbsp;
		<select size="1" name="Are_you_on_medications">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br><br>
		Do you have a 30 day supply?&nbsp;
		<select size="1" name="have_30_day_supply">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br><br>
		Do you have any kind of appointment in the next 30 days?&nbsp;
		<select size="1" name="appointment_in_the_next_30_days">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br><br>
		During the past five years have you:<br>
		Been treated for or told you have sickness or injury?&nbsp;
		<select size="1" name="Been_treated_for_or_told_you_have_sickness_or_injury">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br> If yes, give details:<br>
		<textarea rows="5" name="sickness_or_injury_give_details" cols="93"></textarea>
		<br><br>
		Have you had any injuries to back?&nbsp;
		<select size="1" name="injuries_to_back">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br> If yes, explain:<br>
		<textarea rows="5" name="back_injuries_explain" cols="93"></textarea>
		<br><br>
		Do you wear glasses:&nbsp;
		<select size="1" name="glasses">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select>&nbsp;&nbsp;&nbsp;
		Contact lenses:&nbsp;
		<select size="1" name="Contact_lenses">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select>&nbsp;&nbsp;&nbsp;
		Constantly&nbsp;
		<select size="1" name="Constantly">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select>&nbsp;&nbsp;&nbsp;Reading only
		<select size="1" name="Reading_only">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br><br>
		Do you have any bumps lesions or cuts&nbsp;
		<select size="1" name="bumps_lesions_or_cuts">
				<option value="Yes">YES</option>
				<option value="No">NO</option>
				<option value="" selected>Select</option>
		</select><br>Please explain:<br>
		<textarea rows="5" name="bumps_lesions_or_cuts_explain" cols="93"></textarea>
	</td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11">Have you ever had any of the following:</td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="8">
			<table>
				<tr>
					<td>
						<select size="1" name="Arthritis_or_Rheumatism">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Arthritis or Rheumatism</td>								
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>			
						<select size="1" name="Polio">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Polio</td>
				</tr>
				<tr>
					<td>
						<select size="1" name="Dizziness_or_Fainting">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Dizziness or Fainting spells</td>
					<td>&nbsp;&nbsp;</td>
					<td>
						<select size="1" name="Back_Surgery">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Back Surgery</td>
				</tr>
				<tr>
					<td>
						<select size="1" name="Head_Injury">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Head Injury</td>
					<td>&nbsp;&nbsp;</td>
					<td>
						<select size="1" name="Diabetes">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Diabetes</td>
				</tr>
				<tr>
					<td>
						<select size="1" name="High_Blood_Pressure">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>High Blood Pressure</td>
					<td>&nbsp;&nbsp;</td>
					<td>
						<select size="1" name="Epilepsy">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Epilepsy </td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="Kidney_or_Bladder_Trouble">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td nowrap>Kidney or Bladder Trouble</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
						<select size="1" name="Asthma">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Asthma</td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="Phlebitis">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Phlebitis</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
						<select size="1" name="Varicose_Veins">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Varicose Veins </td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="Knee_Injury">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Knee Injury</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
						<select size="1" name="Back_Injury">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Back Injury</td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="AIDS">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>AIDS</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
						<select size="1" name="Loss_of_Hearing">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Loss of Hearing</td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="Herpes">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Herpes</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
						<select size="1" name="Loss_of_sight">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td nowrap>Loss of sight in one eye</td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="HIV">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>HIV</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
						<select size="1" name="Hepatitis">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Hepatitis</td>
				</tr>
				<tr>
					<td>			
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>				
				<tr>
					<td>			
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="Rupture">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Rupture</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="Which_side">
							<option value="Left">LEFT</option>
							<option value="Right">RIGHT</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Which side?</td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>
				<tr>
					<td>			
						<select size="1" name="operated_on">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
						</select>
					</td>
					<td>&nbsp;&nbsp;</td>
					<td>Was it operated on? </td>
					<td>&nbsp;&nbsp;</td>
					<td>					
					</td>
					<td>&nbsp;&nbsp;</td>
					<td></td>
				</tr>
				<tr>
					<td colspan="5">Date: <input type="text" name="Date" size="8">&nbsp;&nbsp;Physician: <input type="text" name="Physician" size="13"></td>
				</tr>

			</table> 			 					
		</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><b>Legal Information:</b></td>
	</tr>
		<tr>
		<td colspan="8">Have you ever been sued?&nbsp;
			<select size="1" name="ever_been_sued">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="11">Are you involved in a lawsuit?&nbsp;
			<select size="1" name="involved_in_a_lawsuit">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
			</select>&nbsp;&nbsp;&nbsp;Date&nbsp;<input type="text" name="Date" size="10">
		</td>
	</tr>
	<tr>
		<td colspan="8"></td>
	</tr>
	<tr>
		<td colspan="11">Details:<br><textarea rows="5" name="Details" cols="93"></textarea></td>
	</tr>
	<tr>
		<td colspan="8">How many Felonies have you been convicted of?&nbsp;<input type="text" name="Felonies" size="4"></td>
	</tr>
	<tr>
		<td colspan="8">Name them:&nbsp;<input type="text" name="Name_them" size="71"></td>
	</tr>
	<tr>
		<td colspan="8">Are you on probation? &nbsp;
			<select size="1" name="probation">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
			</select>		
		</td>
	</tr>
	<tr>
		<td colspan="8">What County?&nbsp;<input type="text" name="County" size="20"></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Name:&nbsp;<input type="text" name="Probation_Officer" size="20"></td>
	</tr>
	<tr>
		<td colspan="8">Probation Officers Phone #:&nbsp;<input type="text" name="Phone" size="20"></td>
	</tr>
	<tr>
		<td colspan="8">Any Court or Probation appointments in the next 30 days?&nbsp;
			<select size="1" name="Probation_appointments">
							<option value="Yes">YES</option>
							<option value="No">NO</option>
							<option value="" selected>Select</option>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="8">Dates &amp; Times&nbsp;<input type="text" name="Dates_Times" size="67"></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>	
	<tr>
		<td colspan="11"><b>Employment History:</b></td>
	</tr>
	<tr>
		<td colspan="11">Employee Duties And Dates Worked:<br><textarea rows="5" name="Employee_Duties_And_Dates_Worked" cols="93"></textarea></td>
	</tr>
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>

	
	<tr>
	
		<td colspan="11"><strong>References:</strong>(Pastor, Probation Officer, Counselor, etc.)

		</td>

	</tr>

	<tr>
		<td width="50%" colspan="8">Name&nbsp;<input type="text" name="Namer" size="30"></td>
		<td width="50%" colspan="8">Name&nbsp;<input type="text" name="Namer1" size="30"></td>
	</tr>
	<tr>
		<td width="50%" colspan="8">Phone&nbsp;<input type="text" name="Phoner" size="20"></td>
		<td width="50%" colspan="8">Phone&nbsp;<input type="text" name="Phoner1" size="20"></td>
	</tr>
	<tr>
		<td width="50%" colspan="8">Relationship&nbsp;<input type="text" name="Relationship" size="30"></td>
		<td width="50%" colspan="8">Relationship&nbsp;<input type="text" name="Relationship1" size="30"></td>

	</tr>
	<tr>
		<td width="50%" colspan="8">Known How Long&nbsp;<input type="text" name="Known" size="20"></td>
		<td width="50%" colspan="8">Known How Long&nbsp;<input type="text" name="Known1" size="20"></td>

	</tr>


	
	<tr>
		<td colspan="8">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="11"><input type="submit" name="action" value="Save Application" class="imageButtonSave" title="Save Application" /></td>
	</tr>

	</table>
</form>
  </div>

</div>
  
<jsp:include page="footer.jsp" flush="true"/>
    

</body>
</html>
