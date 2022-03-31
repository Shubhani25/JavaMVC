<jsp:useBean id="taxdata" class="mypkg.TaxBean" scope="request"/>


<!DOCTYPE html>
<html>
<body>
	<h1>Taxation Details</h1>
	<hr>
	<h3>Your tax liability is zero</h3>
	<h4>Because your income is 
		<jsp:getProperty name="taxdata" property="income"/>
	</h4>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>