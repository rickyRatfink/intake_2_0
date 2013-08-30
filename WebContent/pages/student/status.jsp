<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.domain.StudentHistory" %>
<%@ page import="org.faithfarm.domain.PassHistory" %>
<%@ page import="org.faithfarm.util.Validator" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>

<jsp:include page="../../includes/header_info.jsp" flush="true"/>
 
<% 
 
   Validator valid8r = new Validator();
	
   String message=(String)request.getAttribute("MESSAGE");
     String warning=(String)request.getAttribute("WARNING");

   ArrayList ddl = new ArrayList();
   
	String updateFlag = (String)request.getAttribute("updateFlag");
	if (updateFlag==null) updateFlag = request.getParameter("updateFlag");
%>

<form method="POST" action="<%=request.getContextPath()%>/intake">
<% if (message!=null) { %>
<h3><font style="color:#0C0"><img src="<%=request.getContextPath()%>/img/success.png"/><%=message %></font></h3><br />	
<% } %>
<% if (warning!=null) { %>
<h3><font style="color:#F90"><img src="<%=request.getContextPath()%>/img/warning.jpg"/><%=warning %></font></h3><br />	
<% } %>
    <table width="950">
	<tr>
		<td width="100%" colspan="2"><b>Student Status: </b><br /><br /></td>
	</tr>
    <tr>
    	<td valign="top">
        	<table width="150" cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td >Supervisor</td>
            </tr>
            <tr>
            	<td><!-- <input type="text" name="supervisor" value="<%=IntakeServlet.getIntake().getSupervisor() %>" size="20" maxlength="20"/>-->
            	<%
                            Map<Long, String> supervisor = (Map)session.getAttribute("supervisor_map");
                            %>
                            <select name="supervisor_id" style="font-size:.90em;">
                            <option value="0"></option>
                            <%
                            if (supervisor!=null) {
                              for (Long key:supervisor.keySet()) {
                                %>
                                <option 
                                    value="<%=key%>"
                                    <%
                                    if
                                    (key.equals(IntakeServlet.getIntake().getSupervisorId()))
                                    {%>selected<%}%>>
                                  <%=supervisor.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
            	
            	</td>
            </tr>
            <tr>
            	<td>Job</td>
            </tr>
            <tr>
            	<td><!-- <input type="text" name="job" value="<%=IntakeServlet.getIntake().getJob() %>" size="20" maxlength="20"/>-->
            	<%
                            Map<Long, String> job = (Map)session.getAttribute("job_map");
                            %>
                            <select name="job_id" style="font-size:.90em;">
                            <option value="0"></option>
                            <%
                            if (job!=null) {
                              for (Long key:job.keySet()) {
                                %>
                                <option 
                                    value="<%=key%>"
                                    <%
                                    if
                                    (key.equals(IntakeServlet.getIntake().getJobId()))
                                    {%>selected<%}%>>
                                  <%=job.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
            	</td>
            </tr>
            <tr>
            	<td>Class</td>
            </tr>
            <tr>
            	<td><input type="text" name="class" value="<%=IntakeServlet.getIntake().getCurrentClass() %>" size="20" maxlength="20"/></td>
            </tr>
            <tr>
            	<td>Area</td>
            </tr>
            <tr>
            	<td><!-- <input type="text" name="area" value="<%=IntakeServlet.getIntake().getArea() %>" size="20" maxlength="20"/>-->
            	            <%
                            Map<Long, String> dept = (Map)session.getAttribute("department_map");
                            %>
                            <select name="department_id" style="font-size:.90em;">
                            <option value="0"></option>
                            <%
                            if (dept!=null) {
                              for (Long key:dept.keySet()) {
                                %>
                                <option 
                                    value="<%=key%>"
                                    <%
                                    if
                                    (key.equals(IntakeServlet.getIntake().getDepartmentId()))
                                    {%>selected<%}%>>
                                  <%=dept.get(key)%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select>
            	</td>
            </tr>
            <tr>
            	<td>Room</td>
            </tr>
            <tr>
            	<td><input type="text" name="room" value="<%=IntakeServlet.getIntake().getRoom() %>"  size="20" maxlength="20"/></td>
            </tr>
            <tr>
            	<td>Bed</td>
            </tr>
            <tr>
            	<td><input type="text" name="bed" value="<%=IntakeServlet.getIntake().getBed() %>" size="20" maxlength="20"/></td>
            </tr>
            <tr>
            	<td>Date Last Entered</td>
            </tr>
            <tr>
            	<td> <input name="entryDate" value="<%=IntakeServlet.getIntake().getEntryDate() %>" size="12" class="tcal"/></td>
            </tr>
            <tr>
            	<td>(This is the date they LAST ENTERED the program.  Please check the Student Status History for original entry date.)</td>
            </tr>
            <tr>
            	<td>Archived<input type="checkbox" name="archivedFlag" value="YES" <%if ("YES".equals(IntakeServlet.getIntake().getArchiveFlag())) { %>checked<% } %>/></td>
            </tr>
            <tr>
            	<td>(Archived students will not show up in searches or reports.)</td>
            </tr>
            
            
            
            
            </table>
        
        </td>
       
        <td valign="top">
        	<table width="750" cellpadding="0" cellspacing="0" border="0">
            <tr style="background: silver; text-align: left;">
            	<td width="10"></td>
            	<td width="100"><b>Location</b></td>
                <td width="100"><b>Program</b></td>
                <td width="100"><b>Status</b></td>
                <td width="100"><b>Reason</b></td>
                <td width="100"><b>Date Began</b></td>
                <td width="100"><b>Date Ended</b></td>
                <td width="50"><b>Reset?</b></td>
            </tr>
            <% ArrayList history = (ArrayList)IntakeServlet.getIntake().getHistory();
            
            if (history.size()>0) {
			   StudentHistory status=(StudentHistory)history.get(0);
		    %>
            <tr>
            	<td></td>
            	<td><%=status.getFarm() %></td>
            	<td><%=status.getPhase() %></td>
            	<td><%=status.getProgramStatus() %></td>
            	<td><%=status.getReason() %></td>
            	<td><%=status.getBeginDate() %></td>
            	<td><%=status.getEndDate() %></td>
            	<td></td>
        	</tr>
        	<% } else { %>
        		<td colspan="8">No Status</td>
        	<% } %>
        	<tr>
            	<td colspan="8">
               		 <hr style="border-bottom: 1px dotted #000000;"/>
                </td>
            </tr>
            <tr style="background: silver; text-align: left;">
            	<td colspan="8">Reason for Change of Status:<br /><br /></td>
            </tr>
            <tr style="background: silver; text-align: left;">
            	<td valign="top">Update:</td>
                <td valign="top"> <%
						 ddl = (ArrayList)session.getAttribute("dllFarm");
						
							%>
							<select name="farm" class="select">
							<%
							if (ddl!=null) {
							  for (int j=0;j<ddl.size();j++) {
								%>
								<option 
									value="<%=ddl.get(j)%>"
									<%
									if
									(ddl.get(j).equals(IntakeServlet.getHistory().getFarm()))
									{%>selected<%}%>>
								  <%=ddl.get(j)%>
								</option>
								<%
							  }
							  %>
							  
							<%}%>
							</select>&nbsp;&nbsp;
                </td>
                <td valign="top"> <%
						 ddl = (ArrayList)session.getAttribute("dllPhase");
						
							%>
							<select name="phase" class="select">
							<%
							if (ddl!=null) {
							  for (int j=0;j<ddl.size();j++) {
								%>
								<option 
									value="<%=ddl.get(j)%>"
									<%
									if
									(ddl.get(j).equals(IntakeServlet.getHistory().getPhase()))
									{%>selected<%}%>>
								  <%=ddl.get(j)%>
								</option>
								<%
							  }
							  %>
							  
							<%}%>
							</select>&nbsp;&nbsp;
                </td>
                <td valign="top" colspan="2"> <%
						 ddl = (ArrayList)session.getAttribute("dllProgramStatus");
						
							%>
							<select name="programStatus" class="select">
							<%
							if (ddl!=null) {
							  for (int j=0;j<ddl.size();j++) {
								%>
								<option 
									value="<%=ddl.get(j)%>"
									<%
									if
									(ddl.get(j).equals(IntakeServlet.getHistory().getProgramStatus()))
									{%>selected<%}%>>
								  <%=ddl.get(j)%>
								</option>
								<%
							  }
							  %>
							  
							<%}%>
							</select>&nbsp;&nbsp;
                </td>
                <td valign="top"> <input name="beginDate" size="12" class="tcal" value="<%=IntakeServlet.getHistory().getBeginDate()%>" /></td>
                <td valign="top"> <input name="endDate" size="12" class="tcal" value="<%=IntakeServlet.getHistory().getEndDate()%>" /></td>
                <td valign="top"></td>
                </tr>
                <tr style="background: silver; text-align: left;">
                	<td colspan="8">
                    	<textarea name="reason" cols="80" rows="5"><%=IntakeServlet.getHistory().getReason()%></textarea>
                    </td>
                </tr>
            </tr>
            
            </table>
            <br /><br />
            <table width="700" cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td  style="background: silver; text-align: center;color:#000000;font-weight:bold;height=18px;">Student History</td>
            </tr>
            <tr>
            	<table width="700" cellpadding="0" cellspacing="0" >
            		<tr>
                    	<td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">From</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">To</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Location</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Program</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Ending Status</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Reason For Change of Status</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Del</td>
                     </tr>
                     <%
					 //ArrayList history = (ArrayList)IntakeServlet.getIntake().getHistory();
					 
                     
                     for (int i=0;i<history.size();i++)
					 {
						 StudentHistory hist=(StudentHistory)history.get(i);
					 %> 
                     <tr> 
                     	<td><%=hist.getBeginDate()%></td>
                        <td><%=hist.getEndDate()%></td>
                        <td><%=hist.getFarm()%></td> 
                        <td><%=hist.getPhase()%></td>
                        <td><%=hist.getProgramStatus()%></td>
                        <td><%=hist.getReason()%></td>
                        <td><input type="submit" name="action" value="Delete History" onClick="javascript:document.getElementById('deleteId').value='<%=hist.getStudentHistoryId() %>'" class="imageButtonDelete"/></td>
                     </tr>
                     <%
					 }  
                     if (history.size()==0) { %> 
                     <tr>
                     	<td colspan="7">No history</td> 
                     </tr>
                     <% } %>
                </table>
                
            <br /><br />
            <table width="700" cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td  style="background: silver; text-align: center;color:#000000;font-weight:bold;height=18px;">Pass History</td>
            </tr>
            <tr>
            	<table width="700" cellpadding="0" cellspacing="0" >
            		<tr>
                    	<td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Pass Date</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Hours</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Type</td>
                        <td style="height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">Del</td>
                     </tr>
                     <tr>
                    	<td style="background: silver;height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">
                    		<input name="passDate" value="<%=IntakeServlet.getPassHistory().getPassDate() %>" size="12" class="tcal"/>
                    	</td>
                        <td style="background: silver;height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">
                            <%
                            ddl = (ArrayList)session.getAttribute("dllPassHours");
							%>
							<select name="hours" class="select">
							<%
							if (ddl!=null) {
							  for (int j=0;j<ddl.size();j++) {
								%>
								<option 
									value="<%=ddl.get(j)%>"
									<%
									if
									(ddl.get(j).equals(IntakeServlet.getPassHistory().getHours()))
									{%>selected<%}%>>
								  <%=ddl.get(j)%>
								</option>
								<%
							  }
							  %>
							  
							<%}%>
							</select>
                        </td>
                        <td colspan="2" style="background: silver;height:20px;border: 1px solid #666;color:#000000;font-weight:bold;padding-left:5px;">
                        <%
                            ddl = (ArrayList)session.getAttribute("dllPassType");
							%>
							<select name="passType" class="select">
							<%
							if (ddl!=null) {
							  for (int j=0;j<ddl.size();j++) {
								%>
								<option 
									value="<%=ddl.get(j)%>"
									<%
									if
									(ddl.get(j).equals(IntakeServlet.getPassHistory().getPassType()))
									{%>selected<%}%>>
								  <%=ddl.get(j)%>
								</option>
								<%
							  }
							  %>
							  
							<%}%>
							</select>
                        
                        </td>
                        
                     </tr>
                     <%
					 ArrayList passHistory = (ArrayList)IntakeServlet.getIntake().getPassHistory();
					 
                     
                     for (int i=0;i<passHistory.size();i++)
					 {
						 PassHistory pass=(PassHistory)passHistory.get(i);
					 %> 
                     <tr> 
                     	<td><%=pass.getPassDate()%></td>
                        <td><%=pass.getHours()%></td>
                        <td><%=pass.getPassType()%></td> 
                        <td><input type="submit" name="action" value="Delete Pass History" onClick="javascript:document.getElementById('deleteId').value='<%=pass.getPassHistoryId() %>'" class="imageButtonDelete"/></td>
                     </tr>
                     <%
					 }  
                     if (passHistory.size()==0) { %> 
                     <tr>
                     	<td colspan="7">No history</td> 
                     </tr>
                     <% } %>
                    
                </table>
                
            </tr>
            </table>
        </td>
    </tr>
    </table>
	<br /><br />
    <div align="center">
    <% if ("YES".equals(updateFlag)) { %>
    	<input type="submit" name="action" value="Update" class="imageButtonSave" title="Update Information" />&nbsp;
    <% } else { %>
    	<input type="submit" name="action" value="Save" class="imageButtonSave" title="Save Information" />&nbsp;
    <% } %>
   		<input type="reset" name="action" value="Cancel" class="imageButtonSave" title="Cancel Changes" />
	</div>





    <div class="footer">
        
    </div>
    <input type="hidden" name="source" value="status"/>
    <input type="hidden" name="key" value="<%=IntakeServlet.getIntake().getIntakeId()%>"/>
    <input type="hidden" id="deleteId" name="deleteId" value=""/>
</form>
</body>
</html>