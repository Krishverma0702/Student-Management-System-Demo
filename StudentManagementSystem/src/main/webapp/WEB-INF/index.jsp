<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Employee Form</h2>

	<form:form action="saveStudent" method="post"
		modelAttribute="student">
    Student Id: <form:input path="sId" />
		<br />
		<br />
    Student Name: <form:input path="sName" />
		<br />
		<br />
    Student Marks: <form:input path="sMarks" />
		<br />
		<br />
    Student Address: <form:input path="sAddress" />
		<br />
		<br />
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>
