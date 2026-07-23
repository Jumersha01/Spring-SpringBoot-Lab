<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Festival Pass Registration</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Segoe UI", sans-serif;
}

body {
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(-45deg, #1877f2, #42a5f5, #7b1fa2, #00bcd4);
	background-size: 400% 400%;
	animation: gradientBG 10s ease infinite;
}

@keyframes gradientBG {
	0% {
		background-position: 0% 50%;
	}
	50% {
		background-position: 100% 50%;
	}
	100% {
		background-position: 0% 50%;
	}
}

.container {
	width: 550px;
	padding: 35px;
	background: rgba(255, 255, 255, 0.18);
	backdrop-filter: blur(18px);
	border-radius: 20px;
	box-shadow: 0 20px 40px rgba(0, 0, 0, .25);
	animation: pop 0.8s ease;
}

@keyframes pop {
	from {
		opacity: 0;
		transform: translateY(40px) scale(.9);
	}
	to {
		opacity: 1;
		transform: translateY(0) scale(1);
	}
}

h1 {
	text-align: center;
	color: white;
	margin-bottom: 25px;
	font-size: 30px;
	letter-spacing: 1px;
}

table {
	width: 100%;
}

td {
	padding: 10px;
}

label {
	color: white;
	font-weight: bold;
	font-size: 16px;
}

input[type=text],
input[type=email],
input[type=number],
select {
	width: 100%;
	padding: 12px;
	border: none;
	outline: none;
	border-radius: 10px;
	font-size: 15px;
	background: rgba(255, 255, 255, .85);
	transition: .3s;
}

input:focus,
select:focus {
	background: white;
	transform: scale(1.03);
	box-shadow: 0 0 10px #ffffff;
}

.radio-group {
	color: white;
	font-weight: bold;
}

.radio-group label {
	margin-right: 15px;
	font-weight: normal;
}

.submit-btn {
	width: 100%;
	padding: 14px;
	border: none;
	border-radius: 30px;
	background: #1877f2;
	color: white;
	font-size: 18px;
	font-weight: bold;
	cursor: pointer;
	transition: .3s;
}

.submit-btn:hover {
	background: #0d5ed7;
	transform: translateY(-3px);
	box-shadow: 0 10px 20px rgba(0, 0, 0, .25);
}

.footer {
	text-align: center;
	color: white;
	margin-top: 20px;
	font-size: 14px;
}
</style>

</head>
<body>

<div class="container">

	<h1>🎉 Festival Pass Registration</h1>

	<form:form action="register" method="post" modelAttribute="fes">

		<table>

			<tr>
				<td><label>Pass ID</label></td>
				<td><form:input path="passId"/></td>
			</tr>

			<tr>
				<td><label>Visitor Name</label></td>
				<td><form:input path="visitorName"/></td>
			</tr>

			<tr>
				<td><label>Nationality</label></td>
				<td><form:input path="nationality"/></td>
			</tr>

			<tr>
				<td><label>Festival Category</label></td>
				<td>
					<form:select path="festivalCategory">
						<form:option value="">-- Select Category --</form:option>
						<form:option value="Music">🎵 Music</form:option>
						<form:option value="Food">🍔 Food</form:option>
						<form:option value="Cultural">🎭 Cultural</form:option>
						<form:option value="Technology">💻 Technology</form:option>
					</form:select>
				</td>
			</tr>

			<tr>
				<td><label>Pass Type</label></td>
				<td class="radio-group">
					<form:radiobutton path="passType" value="Regular"/> <label>Regular</label>
					<form:radiobutton path="passType" value="VIP"/> <label>VIP</label>
					<form:radiobutton path="passType" value="Premium"/> <label>Premium</label>
				</td>
			</tr>

			<tr>
				<td><label>Visiting Days</label></td>
				<td><form:input path="visitingDays" type="number"/></td>
			</tr>

			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email" type="email"/></td>
			</tr>

			<tr>
				<td colspan="2">
					<input type="submit" value="Book Festival Pass" class="submit-btn">
				</td>
			</tr>

		</table>

	</form:form>

	<div class="footer">
		Experience the festival with style ✨
	</div>

</div>

</body>
</html>