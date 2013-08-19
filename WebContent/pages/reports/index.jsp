<%@ page import="org.faithfarm.cwt.CWTServlet" %>
<%@ page import="java.util.ArrayList" %>


<jsp:include page="../../includes/header.jsp" flush="true"/>





<form method="POST" action="<%=request.getContextPath()%>/cwt">
    <h2>
        Report List
    </h2>
    <h4>Please click one of the following links to generate the report</h4>
      
            <div align="left">
            	<ul>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Boynton Beach">Class List (Boynton Beach)</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Fort Lauderdale">Class List (Fort Lauderdale)</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Okeechobee">Class List (Okeechobee))</a></li>
            		<li><a href="<%=request.getContextPath()%>/student?action=ClassList&farm=Women's Home">Class List (Women's Home)</a></li>
            	</ul>
            </div>
            
            
    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
    <div class="footer">
        Faith Farm Ministries &copy;2013
    </div>
   
</form>
</body>
</html>
