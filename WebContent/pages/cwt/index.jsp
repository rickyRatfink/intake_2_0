


<jsp:include page="../../includes/header.jsp" flush="true"/>


    <h2>
        Course Work Therapy
    </h2>
    
            <p>
            Now you can manage programs, metrics, modules, exams, and certifications for Faith Farm students enrolled in the CWT Program.
            <br />
            </p>
            <ul style="color: Blue">
                <li><a href="<%=request.getContextPath()%>/cwt?action=programs">Programs</a></li>
                <li><a href="<%=request.getContextPath()%>/cwt?action=metrics">Metrics</a></li>
                <li><a href="<%=request.getContextPath()%>/cwt?action=modules">Modules</a></li>
                <li><a href="">Exams</a></li>
                <li><a href="">Students</a></li>
            </ul>
        
			<br/><br/>
	        <p>
            Rotation <i>(Applies only to Orientation to Class 5)</i>
            <ul style="color: Blue">
                <li><a href="<%=request.getContextPath()%>/student?action=Rotate&farm=Boynton Beach">Course Rotation</a></i>
            </ul>
 		
			
        </div>
        <div class="clear">
        </div>
    </div>
    <div class="footer">
        
    </div>
   
</form>
</body>
</html>
