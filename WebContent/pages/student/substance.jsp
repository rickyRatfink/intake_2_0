<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");
  String warning=(String)request.getAttribute("WARNING");

 String sober1YearsErr = (String)request.getAttribute("sober1YearsErr");
   if (sober1YearsErr==null) sober1YearsErr="";

String sober3YearsErr = (String)request.getAttribute("sober3YearsErr");
   if (sober3YearsErr==null) sober3YearsErr="";

String yearsAttendedErr = (String)request.getAttribute("yearsAttendedErr");
   if (yearsAttendedErr==null) yearsAttendedErr="";

String previousFaithFarmFlagErr = (String)request.getAttribute("previousFaithFarmFlagErr");
   if (previousFaithFarmFlagErr==null) previousFaithFarmFlagErr="";
   
   String previousFaithFarmErr = (String)request.getAttribute("previousFaithFarmErr");
   if (previousFaithFarmErr==null) previousFaithFarmErr="";
   
   String ffYearsAttendedErr = (String)request.getAttribute("ffYearsAttendedErr");
   if (ffYearsAttendedErr==null) ffYearsAttendedErr="";
   
%>

<form method="POST" action="<%=request.getContextPath()%>/intake">
<% if (message!=null) { %>
<h3><font style="color:#0C0"><img src="<%=request.getContextPath()%>/img/success.png"/><%=message %></font></h3><br />	
<% } %>
<% if (warning!=null) { %>
<h3><font style="color:#F90"><img src="<%=request.getContextPath()%>/img/warning.jpg"/><%=warning %></font></h3><br />	
<% } %>
    <table width="750">
	<tr>
		<td colspan="8"><b>Substance Abuse Information: </b><br /><br /></td>
	</tr>



	<tr>
		<td colspan="11"><b>Chemical Dependency (Answer all that apply):</b></td>
	</tr>
	<tr>
		<td  valign="top" colspan="4">
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

					<input type="text" name="alcoholYearsUsed" value="<%=IntakeServlet.getIntake().getAlcoholYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="alcoholLastUsed" value="<%=IntakeServlet.getIntake().getAlcoholLastUsed()%>"  size="12" maxlength="25" ></td>
				</tr>
				<tr>
					<td width="124">

					Cocaine</td>
					<td width="102">

					<input type="text" name="cocaineYearsUsed" value="<%=IntakeServlet.getIntake().getCocaineYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="cocaineLastUsed" value="<%=IntakeServlet.getIntake().getCocaineLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Marijuana</td>
					<td width="102">

					<input type="text" name="marijuanaYearsUsed" value="<%=IntakeServlet.getIntake().getMarijuanaYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="marijuanaLastUsed" value="<%=IntakeServlet.getIntake().getMarijuanaLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Oxycodone</td>
					<td width="102">

					<input type="text" name="oxycodoneYearsUsed" value="<%=IntakeServlet.getIntake().getOxycodoneYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="oxycodoneLastUsed" value="<%=IntakeServlet.getIntake().getOxycodoneLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Speed</td>
					<td width="102">

					<input type="text" name="speedYearsUsed" value="<%=IntakeServlet.getIntake().getSpeedYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="speedLastUsed" value="<%=IntakeServlet.getIntake().getSpeedLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Heroin</td>
					<td width="102">

					<input type="text" name="heroinYearsUsed" value="<%=IntakeServlet.getIntake().getHeroinYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="heroinLastUsed" value="<%=IntakeServlet.getIntake().getHeroinLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
                <tr>
					<td width="124">

					Xanax</td>
					<td width="102">

					<input type="text" name="xanaxYearsUsed" value="<%=IntakeServlet.getIntake().getXanaxYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="xanaxLastUsed" value="<%=IntakeServlet.getIntake().getXanaxLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
				<tr>
					<td width="124">

					Other</td>
					<td width="102">

					<input type="text" name="otherYearsUsed" value="<%=IntakeServlet.getIntake().getOtherYearsUsed()%>" size="13" maxlength="2" ></td>
					<td>

					<input type="text" name="otherLastUsed" value="<%=IntakeServlet.getIntake().getOtherLastUsed()%>" size="12" maxlength="25"></td>
				</tr>
			</table>
		</td>
		<td>&nbsp;</td>
        </tr>
        
    
        <tr>
			<td valign="top">Longest time sober in past 3 years?&nbsp;<input type="text" name="sober3Years" value="<%=IntakeServlet.getIntake().getSober3Years()%>" size="9" maxlength="15" <% if (sober3YearsErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)"></td>
			<td valign="top">in the last year? <input type="text" name="sober1Years" value="<%=IntakeServlet.getIntake().getSober1Years()%>" size="9" maxlength="15" <% if (sober1YearsErr.length()>0) { %>class="textboxErr"<% } %> onkeyup="ucase(this)">
        	</td>
        </tr>
        <tr>
        	<td class="fieldError"><%=sober3YearsErr%></td>
            <td class="fieldError"><%=sober1YearsErr%></td>
        </tr>
        <tr>
			<td colspan="8">&nbsp;</td>
		</tr>
        <tr>
    	<td colspan="8">
        Physical effects of abuse<br><input type="text" name="abusePhysicalEffects" value="<%=IntakeServlet.getIntake().getAbusePhysicalEffects()%>" size="45" onkeyup="ucase(this)"><br><br>
		<b>Any Previous Rehabs?</b>&nbsp;
			<input type="checkbox" name="attendAA" value="YES" <% if ("YES".equals(IntakeServlet.getIntake().getAttendAA())) { %>checked <%}%>/>AA or NA&nbsp;&nbsp;
            Number of Years&nbsp;<input type="text" name="yearsAttended" value="<%=IntakeServlet.getIntake().getYearsAttended()%>" size="10" maxlength="10" <% if (yearsAttendedErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/>&nbsp;<div style="font:11px Arial;color: #b71524;"><b><i><%=yearsAttendedErr%></i></b></div>
         </td>
         
         <tr>
         <td colspan="8">
         	<table width="100%">
            <tr>
            	<td>
                    Ever been to a Faith Farm Before?&nbsp;
                    <% ArrayList ddl = (ArrayList)session.getAttribute("dll_yesno");
                        %>
                        <select name="previousFaithFarmFlag" <% if (previousFaithFarmFlagErr.length()>0) { %>class="ddlErr"<% } %>>
                        <%
                        if (ddl!=null) {
                          for (int j=0;j<ddl.size();j++) {
                            %>
                            <option 
                                value="<%=ddl.get(j)%>"
                                <%
                                if
                                (ddl.get(j).equals(IntakeServlet.getIntake().getPreviousFaithFarmFlag()))
                                {%>selected<%}%>>
                              <%=ddl.get(j)%>
                            </option>
                            <%
                          }
                          %>
                          <%
                        }
                    %></select>
                </td>
                <td>
					Year:&nbsp;<input type="text" name="ffYearsAttended" size="12" maxlength="12" value="<%=IntakeServlet.getIntake().getFfYearsAttended()%>" size="10" maxlength="10" <% if (ffYearsAttendedErr.length()>0) { %>class="textboxErr"<%}%> onkeyup="ucase(this)"/>
                </td>
                <td>
					Where:&nbsp;
                    <select name="previousFaithFarm" <% if (previousFaithFarmErr.length()>0) { %>class="ddlErr"<%}%>>
                        <option value="BOYNTON BEACH" <% if("BOYNTON BEACH".equals(IntakeServlet.getIntake().getPreviousFaithFarm())) { %>selected<% } %>>BOYNTON BEACH</option>
                        <option value="FT. LAUDERDALE"  <% if("FT. LAUDERDALE".equals(IntakeServlet.getIntake().getPreviousFaithFarm())) { %>selected<% } %>>FT. LAUDERDALE</option>
                        <option value="OKEECHOBEE"  <% if("OKEECHOBEE".equals(IntakeServlet.getIntake().getPreviousFaithFarm())) { %>selected<% } %>>OKEECHOBEE</option>
                        <option value=""></option>
                    </select>
            	</td>
             </tr>
              <tr>
             	<td class="fieldError"><%=previousFaithFarmFlagErr%></td>
                <td class="fieldError"><%=ffYearsAttendedErr%></td>
                <td class="fieldError"><%=previousFaithFarmErr%></td>
             </tr>
             <tr>
             	<td colspan="3">
           		 Other Rehabs<input type="text" name="otherRehabs" value="<%=IntakeServlet.getIntake().getOtherRehabs()%>" size="45" maxlength="45" onkeyup="ucase(this)"/>
                </td>
             </tr>
            
             </table>
		</td>
	</tr>
  
        <tr>
        	<td colspan="8" valign="top">
		<b>Pattern of usage:</b><br>
        	<input type="checkbox" name="usagePattern1" value="Constantly" <% if ("Constantly".equals (IntakeServlet.getIntake().getUsagePattern1())) { %>checked<%}%>  />Constantly&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern2" value="Weekends" <% if ("Weekends".equals (IntakeServlet.getIntake().getUsagePattern2())) { %>checked<%}%>/>Weekends&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern3" value="Special Occasions" <% if ("Special Occasions".equals (IntakeServlet.getIntake().getUsagePattern3())) { %>checked<%}%>/>Special Occasions&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern4" value="Whenever available" <% if ("Whenever available".equals (IntakeServlet.getIntake().getUsagePattern4())) { %>checked<%}%>/>Whenever available&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern5" value="When Things Get Tough" <% if ("When Things Get Tough".equals (IntakeServlet.getIntake().getUsagePattern5())) { %>checked<%}%>/>When Things Get Tough&nbsp;&nbsp;
            <input type="checkbox" name="usagePattern6" value="A Week/Off A Week" <% if ("A Week/Off A Week".equals (IntakeServlet.getIntake().getUsagePattern6())) { %>checked<%}%>/>On A Week/Off A Week
        </br></br> 
		<b>Losses due to usage:</b><br>
        	<input type="checkbox" name="usageLosses1" value="Job" <% if ("Job".equals (IntakeServlet.getIntake().getUsageLosses1())) { %>checked<%}%> />Job&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses2" value="Marriage" <% if ("Marriage".equals (IntakeServlet.getIntake().getUsageLosses2())) { %>checked<%}%>/>Marriage&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses3" value="Friends" <% if ("Friends".equals (IntakeServlet.getIntake().getUsageLosses3())) { %>checked<%}%>/>Friends&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses4" value="Possessions" <% if ("Possessions".equals (IntakeServlet.getIntake().getUsageLosses4())) { %>checked<%}%>/>Possessions&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses5" value="Arrests" <% if ("Arrests".equals (IntakeServlet.getIntake().getUsageLosses5())) { %>checked<%}%>/>Arrests&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses6" value="DUIs" <% if ("DUIs".equals (IntakeServlet.getIntake().getUsageLosses6())) { %>checked<%}%>/>DUI's&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses7" value="Heavy Debt" <% if ("Heavy Debt".equals (IntakeServlet.getIntake().getUsageLosses7())) { %>checked<%}%> />Heavy Debt&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses8" value="Health" <% if ("Health".equals (IntakeServlet.getIntake().getUsageLosses8())) { %>checked<%}%>/>Health&nbsp;&nbsp;
            <input type="checkbox" name="usageLosses9" value="Incarceration" <% if ("Incarceration".equals (IntakeServlet.getIntake().getUsageLosses9())) { %>checked<%}%>/>Incarceration
        	</td>
         </tr>
   
          <tr>
        	<td colspan="8" valign="top">
			<b>Quantity Consumed:</b><br>
        		Per week:&nbsp;&nbsp;<input type="textbox" name="qtyConsumed1" value="<%=IntakeServlet.getIntake().getQtyConsumed1() %>" size="25" maxlength="25" />
            	Per week 2 years ago:&nbsp;&nbsp;<input type="textbox" name="qtyConsumed2" value="<%=IntakeServlet.getIntake().getQtyConsumed2() %>" size="25" maxlength="25" />
 			</td>
         </tr>
    




     <tr>
		<td colspan="8" valign="bottom" align="center" height="45"><input type="submit" name="action" value="Save" class="imageButtonSave" title="Update Information" /></td>
	</tr>
    </table>
    <input type="hidden" name="source" value="substance"/>
</form>

  <br /><br />
   
</body>
</html>