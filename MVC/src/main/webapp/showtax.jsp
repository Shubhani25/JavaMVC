<jsp:useBean id="taxdata" class="mypkg.TaxBean" scope="request"/>


<!DOCTYPE html>
<html>
<body>
	<h1>Taxation Details</h1>
	<hr>
	<pre>
		Income <jsp:getProperty name="taxdata" property="income"/>
		Age <jsp:getProperty name="taxdata" property="age"/>
		Tax <jsp:getProperty name="taxdata" property="tax"/>
		
	</pre>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>