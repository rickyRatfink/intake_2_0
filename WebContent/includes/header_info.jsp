<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="org.faithfarm.domain.SystemUser" %>
<%@ page import="org.faithfarm.intake.IntakeServlet" %>
<%@ page import="org.faithfarm.util.Validator" %>

<% 
    SystemUser user = null;
	Validator v8r = new Validator();
	try {
	  user = (SystemUser)session.getAttribute("USER_"+session.getId()); 
	  if (user==null) user = new SystemUser();
	} catch (Exception e) {
		user=new SystemUser();
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head><title>
	Faith Farm Student Information System
</title>

	<link href="<%=request.getContextPath()%>/styles/site.css" rel="stylesheet" type="text/css" />
    <link href="<%=request.getContextPath()%>/styles/tcal.css" rel="stylesheet" type="text/css" />
   
    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/tcal.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/chart.js"></script>

    <script  type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery-1.4.1.min.js">
    </script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.format.1.02.js">
    </script>    
    <script  type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.dateentry.min.js">
    </script>    
    <style type="text/css">
        @import "/Styles/jquery.datepick.css";
    </style>
    <script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery.datepick.min.js"></script>    
   
   




 <div class="page">
        <div class="header">
            <div class="title">
                <a href="/Default.aspx"> 
                <h1>
                   Faith Farm Student Management 2.0
                </h1>
                </a>
            </div>
            <div class="loginDisplay">
                	<% if (user.getUsername()!=null) { %>
                        Welcome <b><%=user.getUsername() %></b>!&nbsp;[ <a href="<%=request.getContextPath()%>/login?action=Log Out" >Log Out</a> ]
                    <% } else { %>
                        [ <a href="<%=request.getContextPath()%>/login" >Log In</a> ]
                    <% } %>
            </div>
             <div class="clear hideSkiplink"> 
                          
               
    
		<div class="menu" >	
		<ul>
    		<li><a href="<%=request.getContextPath()%>/pages/student/personal.jsp" >Personal</a></li>
      		<li><a href="<%=request.getContextPath()%>/pages/student/religious.jsp" >Religious</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/substance.jsp" >Substance</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/health.jsp" >Health</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/legal.jsp" >Legal</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/employment.jsp" >Employment</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/status.jsp" >Status</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/search.jsp" >Search</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/main.jsp" >Home</a></li>
        </ul>
		<table>
    	<tr>
    		 <td width="33"></td>
		     <td><font style="color:#FFFFFF"><b>Student Name:</b>&nbsp;<font style="color:#aeadad"><%=IntakeServlet.getIntake().getFirstName() %>&nbsp;<%=IntakeServlet.getIntake().getLastName() %></font>
		     &nbsp;&nbsp;&nbsp;</td>
		     <td><font style="color:#FFFFFF"><b>SSN:</b>&nbsp;<font style="color:#aeadad"><%=IntakeServlet.getIntake().getSsn() %></font>
		     &nbsp;&nbsp;&nbsp;</td>
		     <%
		     String sDate = IntakeServlet.getIntake().getCreationDate();
		    
		     try {
		    	Long lDate=new Long(sDate);
		    	sDate = v8r.convertEpoch(lDate);
		    	
		     } catch (Exception e) { 
		    	 System.out.println(e.getMessage());
		     }
		     %>
		     <td><font style="color:#FFFFFF"><b>Date Entered:</b>&nbsp;<font style="color:#aeadad"><%=IntakeServlet.getIntake().getEntryDate() %></font>
		     &nbsp;&nbsp;&nbsp;</td>
		     <td><a href="<%=request.getContextPath()%>/pages/student/card.jsp" style="color:#19fd01"><b>Print Card</b></a>
		     &nbsp;&nbsp;&nbsp;</td>
		     <td colspan="4"><a href="<%=request.getContextPath()%>/pages/student/card.jsp" style="color:#19fd01""><b>Print Student Information</b></a></td>
    	</tr>
    </table> 
    </div>

                  
          
            
            </div>
        </div>
        <div class="main">