<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Management system</title>
   <link href="Style.css" rel="stylesheet"/> 
   
   <script>
   function validate()
   {
	   var sid = document.forms[0].studentId.value;
	   var sub= document.forms[1].subjectName.value;
	   if(sid == "" || sub=="")
		   {
		  	alert("please select a value");
		   return false;
		   }
	   else
		   return true;
   }
   </script>
   
   
</head>
<body>
	<form action="details.obj" onsubmit = "return validate()">
	<h1>Student Exam Score Updating Form</h1>
	<table align="center">
	<tr>
		<td>Student ID* :&nbsp;&nbsp;</td>	
		<td>
		<select name="studentId" id ="studentId">
		
		<option value="">Please select Student id</option>
		<c:forEach items="${sessionScope.list}" var="studid">
		
				<option value="${studid}">${studid}</option>
		
		</c:forEach>
	<tr>
		<td>Subject Name* :&nbsp;&nbsp;</td>
		<td>
		<select id="subject" name="subjectName">
			<option value="">Please select Subject</option>
			<option value="Subject 1">Subject 1</option>
			<option value="Subject 2">Subject 2</option>
			<option value="Subject 3">Subject 3</option>
			<option value="Subject 4">Subject 4</option>
			<option value="Subject 5">Subject 5</option>
		</select>	
		</td>
	</tr>
	<tr>
		<td>Theory Score:&nbsp;&nbsp;</td>
		<td><input type="number" name="theoryMarks" min="0" max="100" required/></td>
	</tr>
	<tr>
		<td>Practical Score:&nbsp;&nbsp;</td>
		<td><input type="number" name="practicalMarks" min="0" max="100" required/></td>
	</tr>
	<tr>
		<td>Lab Score:&nbsp;&nbsp;</td>
		<td><input type="number" name="labMarks" min="0" max="100" required/></td>
	</tr>
	<tr>
		<th colspan="2">
			<input class="btn" type="submit" value="Submit Student Details" />
		</th>
	</tr>
	
	</table>
	</form>
	
	<p color="red" id = "result"></p>
	
</body>
</html>