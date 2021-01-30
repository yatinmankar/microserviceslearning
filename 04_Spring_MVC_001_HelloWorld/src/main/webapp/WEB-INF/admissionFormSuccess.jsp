<%@ page isELIgnored="false" %>
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
<table>
<tr> <td>Student Name :</td>
	<td>${student1.studentName}</td>
</tr>
<tr> 
<tr> <td>Student Hobby :</td>
	<td>${student1.studentHobby}</td>
</tr>
<tr> <td>Student mobile :</td>
	<td>${student1.studentMobile}</td>
</tr>
<tr> <td>Student DOB :</td>
	<td>${student1.studentDOB}</td>
</tr>
<tr> <td>Student skills :</td>
	<td>${student1.studentSkills}</td>
</tr>

<tr> <td>Student adress :</td>
	<td> State   : ${student1.addr.state}
		 Country : ${student1.addr.country}</td>
</tr>


</table>


</body>
</html>