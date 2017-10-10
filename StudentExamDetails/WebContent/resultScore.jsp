<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Result Score of Student</title>
 <link href="css/style0.css" rel="stylesheet"/> 
</head>
<body>
<center>
<s:set var ="bean" value="${sessionScope.data}"/>
<h1>Student Exam Score Updating Form</h1>
<table align="center" cellspacing="2" cellpadding="5">
	<tr>
		<td>Student ID:</td>
		<td><s:out value="${bean.getStudentId()}"></s:out></td>
	</tr>
	<tr>
		<td>Student Name:</td>
		<td><s:out value="${bean.getStudentName()}"></s:out></td>
	</tr>
	<tr>
		<td>Subject Name:</td>
		<td><s:out value="${bean.getSubject()}"></s:out></td>
	</tr>
	<tr>
		<td>Total Marks:</td>
		<td><s:out value="${bean.getTotalScore()}"></s:out></td>
	</tr>
	<tr>
		<td>Grade:</td>
		<td><s:out value="${bean.getGrade()}"></s:out></td>
	</tr>

</table>

</body>
</html>