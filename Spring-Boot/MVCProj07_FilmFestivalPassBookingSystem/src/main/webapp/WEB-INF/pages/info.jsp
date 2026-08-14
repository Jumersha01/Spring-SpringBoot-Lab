<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Festival Pass Details</title>

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
	width: 650px;
	padding: 35px;
	background: rgba(255,255,255,.18);
	backdrop-filter: blur(18px);
	border-radius: 20px;
	box-shadow: 0 20px 40px rgba(0,0,0,.25);
	animation: fadeIn .8s ease;
}

@keyframes fadeIn {
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
	margin-bottom: 30px;
	font-size: 30px;
}

.success {
	text-align: center;
	font-size: 18px;
	color: #d4ffd4;
	font-weight: bold;
	margin-bottom: 25px;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left;
}

th {
	width: 40%;
	color: white;
	font-size: 17px;
}

td {
	color: #fff176;
	font-weight: bold;
	font-size: 17px;
}

tr {
	border-bottom: 1px solid rgba(255,255,255,.2);
	transition: .3s;
}

tr:hover {
	background: rgba(255,255,255,.12);
	transform: scale(1.01);
}

.btn {
	display: inline-block;
	margin-top: 30px;
	padding: 13px 30px;
	background: #1877f2;
	color: white;
	text-decoration: none;
	border-radius: 30px;
	font-weight: bold;
	transition: .3s;
}

.btn:hover {
	background: #0d5ed7;
	transform: translateY(-3px);
	box-shadow: 0 10px 20px rgba(0,0,0,.25);
}

.footer {
	text-align: center;
}
</style>

</head>
<body>

<div class="container">

	<h1>🎟 Festival Pass Details</h1>

	<div class="success">
		✅ Your Festival Pass has been Registered Successfully!
	</div>

	<table>

		<tr>
			<th>Pass ID</th>
			<td>${fes.passId}</td>
		</tr>

		<tr>
			<th>Visitor Name</th>
			<td>${fes.visitorName}</td>
		</tr>

		<tr>
			<th>Nationality</th>
			<td>${fes.nationality}</td>
		</tr>

		<tr>
			<th>Festival Category</th>
			<td>${fes.festivalCategory}</td>
		</tr>

		<tr>
			<th>Pass Type</th>
			<td>${fes.passType}</td>
		</tr>

		<tr>
			<th>Visiting Days</th>
			<td>${fes.visitingDays}</td>
		</tr>

		<tr>
			<th>Email Address</th>
			<td>${fes.email}</td>
		</tr>

	</table>

	<div class="footer">
		<a href="./" class="btn">Register Another Pass</a>
	</div>

</div>

</body>
</html>