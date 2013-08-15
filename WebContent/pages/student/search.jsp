<%@ page import="java.util.ArrayList" %>

<jsp:include page="../../includes/header.jsp" flush="true"/>


    <h2>
        Student Search
    </h2>
    	<div align="center">
        <div class="studentSearch">
        
        <form method="POST" action="<%=request.getContextPath()%>/student">
          	<table width="380" cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td></td>
                <td>From:</td>
                <td>To:</td>
                <td></td>
            </tr>
            <tr>
            	<td>Entry Date:</td>
                <td><input 
                                      name="entryDate"
                                      size="13" class="tcal"
                                      value=""
                                  /></td>
                
                <td><input 
                                      name="exitDate"
                                      size="13" class="tcal"
                                      value=""
                                  /></td>
                <td></td>
            </tr>
             <tr><td colspan="4"><br /></td></tr>
            <tr>
            	<td>Last Name:</td>
                <td colspan="3"><input type="text" name="lastName" value="" size="30" maxlength="30"/></td>
            </tr>
             <tr><td colspan="4"><br /></td></tr>
             <tr>
            	<td>First Name:</td>
                <td colspan="3"><input type="text" name="firstName" value="" size="30" maxlength="30"/></td>
            </tr>
             <tr><td colspan="4"><br /></td></tr>
             <tr>
            	<td>SSN:</td>
                <td colspan="3">
                	<input type="text" name="SSN1" value="" size="3" maxlength="3"/>-
                    <input type="text" name="SSN2" value="" size="2" maxlength="2"/>-
                    <input type="text" name="SSN3" value="" size="4" maxlength="4"/>
                </td>
            </tr>
             <tr><td colspan="4"><br /></td></tr>
               <tr>
            	<td>Birthdate:</td>
                <td colspan="3"><input 
                                      name="dob"
                                      size="13" class="tcal"
                                      value=""
                                  /></td>
            </tr>
            
            <tr><td colspan="4"><br /></td></tr>
             <tr>
            	<td>Location:</td>
                <td><%
                            ArrayList ddl = (ArrayList)session.getAttribute("dllFarm");
                            %>
                            <select name="farm" size="5">
                            <%
                            if (ddl!=null) {
                              for (int i=0;i<ddl.size();i++) {
								  String opt = (String)ddl.get(i);
                                %>
                                <option 
                                    value="<%=opt%>"
                                    <%
                                    if
                                    (true)
                                    {%>selected<%}%>>
                                  <%=opt%>
                                </option>
                                <%
                              }
                              %>
                              <%
                            }
                        %></select></td>
                 <td colspan="2">
                 	<table cellpadding="0" cellspacing="0" border="0">
                    <tr>
                    	<td>Show Archived?</td>
                    </tr>
                    <tr>
                    	<td><input type="radio" name="archivedFlag" value="YES" />
                        	<input type="radio" name="archivedFlag" value="No" />
                        </td>
                    </tr>
                     <tr>
                    	<td>Show Pitcure?</td>
                    </tr>
                    <tr>
                    	<td><input type="radio" name="pictureFlag" value="YES" />
                        	<input type="radio" name="pictureFlag" value="No" />
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2">Need GED?<input type="checkbox" name="gedFlag" value="YES"/>
                        </td>
                     </tr>
                     
                      <tr><td colspan="4"><br /></td></tr>
                      
                     </table>
                        
                  
                    
                 
                 </td>
            </tr>
            </table>
            <table width="100%" >
            	<tr>
                	<td width="100%" align="center">
                      <input type="submit" name="action" value="Search Students"/>
                    </td>
                 </tr>
             </table>
                	
           </form>  
        </div>
        </div>
    <div class="footer">
        
    </div>
   
</form>
</body>
</html>
