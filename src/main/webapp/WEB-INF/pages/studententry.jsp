<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
	<h3>Student-Registration-Form</h3>
	<hr>
		<form:form action="savestudent" modelAttribute="student">
		<pre>
		RollNo	<form:input path ="rno"/>	<form:errors path="rno"/>
		Name	<form:input path="name"/> 	<form:errors path="name"/>
		Email	<form:input path="email"/> 	<form:errors path="email"/>
		Mobile	<form:input path="mobile"/> <form:errors path="mobile"/>
			<input type="submit" value="Save"/>
		</pre>			
		</form:form>
	<hr>
	
</body>
</html>