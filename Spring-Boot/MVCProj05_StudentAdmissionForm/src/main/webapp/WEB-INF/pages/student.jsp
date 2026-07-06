<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="register" method="post">

		<table>
			<tr>
				<td>Student Id:</td>
				<td><input type=text name="studentId"></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type=text name="studentName"></td>
			</tr>

			<tr>
				<td>Student Course:</td>
				<td><input type=text name="course"></td>
			</tr>

			<tr>
				<td>Student Mobile:</td>
				<td><input type=text name="mobile"></td>
			</tr>
	<tr>	
  <td>Submit: </td>
  <td><input type=submit value="Register"></td>
</tr>
		</table>

	</form>


</body>
</html>