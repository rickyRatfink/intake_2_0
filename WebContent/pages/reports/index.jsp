<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.ArrayList" %>


<jsp:include page="../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Report List
    </h2>
    <br/><br/>  
            <div align="left">
            <b>Class List</b>
            	<ul>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Boynton Beach">Boynton Beach</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Fort Lauderdale">Fort Lauderdale</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Okeechobee">Okeechobee</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Women's Home">Women's Home</a></li>
            	</ul>
            	<br/><br/>
            	<b>Bed List</b>
            	<ul>
            		<li><a href="<%=request.getContextPath()%>/student?action=BedList&farm=Boynton Beach">Boynton Beach</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=BedList&farm=Fort Lauderdale">Fort Lauderdale</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=BedList&farm=Okeechobee">Okeechobee</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=BedList&farm=Women's Home">Women's Home</a></li>
            	</ul>
            </div>
            
            
    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
