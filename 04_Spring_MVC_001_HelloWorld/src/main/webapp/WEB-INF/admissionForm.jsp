<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${headerMsg}
</br>

<form:errors path="student1.*"/>

<!-- <form action="submitadmission.html" method="post">
 -->
 <form action="submitadmissionModel1.html" method="post">

<table>
<tr> <td>Student Name :</td>
	<td><input type="text" name="studentName"></td>
</tr>

<tr> <td>Student Hobby :</td>
	<td><input type="text" name="studentHobby"></td>
</tr>

<tr> <td>Student Mobile :</td>
	<td><input type="text" name="studentMobile"></td>
</tr>

<tr> <td>Student Birthdate :</td>
	<td><input type="text" name="studentDOB"></td>
</tr>

<tr> <td>Student skills :</td>
	<td><select name="studentSkills" multiple>
		<option value="Spring MVC">springMVC<option/>
		<option value="Spring Boot">springBoot<option/>
		<option value="Spring JDBC">springJDBC<option/>
		<option value="Spring Core">springCore<option/>
	</select></td>
</tr>
<tr> <td>Student Adress :</td></tr>
<tr> <td>State :</td>
	<td><input type="text" name="addr.state"></td>
</tr>
<tr> <td>Country :</td>
	<td><input type="text" name="addr.country"></td>
</tr>
<tr> 
	<td colspan="2"><input type="submit" value="Submit"></td>
</tr>

</table>
</form>

</body>
</html>