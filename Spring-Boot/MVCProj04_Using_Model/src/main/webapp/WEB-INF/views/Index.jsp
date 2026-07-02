<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot MVC Home</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(-45deg,#6a11cb,#2575fc,#00c9ff,#92fe9d);
    background-size:400% 400%;
    animation:bgAnimation 10s ease infinite;
}

@keyframes bgAnimation{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

.container{
    width:550px;
    padding:40px;
    border-radius:20px;
    background:rgba(255,255,255,0.15);
    backdrop-filter:blur(15px);
    box-shadow:0 15px 35px rgba(0,0,0,.3);
    text-align:center;
    color:white;
    transition:.4s;
}

.container:hover{
    transform:translateY(-8px);
    box-shadow:0 20px 45px rgba(0,0,0,.4);
}

.logo{
    font-size:80px;
    margin-bottom:20px;
}

h1{
    font-size:38px;
    margin-bottom:15px;
}

h3{
    font-size:22px;
    color:#fff8dc;
    margin-bottom:20px;
}

p{
    font-size:17px;
    line-height:28px;
    margin-bottom:30px;
}

.btn{
    display:inline-block;
    text-decoration:none;
    padding:14px 35px;
    background:white;
    color:#2575fc;
    font-weight:bold;
    border-radius:30px;
    transition:.3s;
}

.btn:hover{
    background:#2575fc;
    color:white;
    transform:scale(1.08);
}

.footer{
    margin-top:25px;
    font-size:14px;
    opacity:.9;
}

</style>

</head>

<body>

<div class="container">

    <div class="logo">🚀</div>

    <h1>Welcome to Spring Boot MVC</h1>

    <h3>Employee Management System</h3>

    <p>
        Build powerful web applications using
        <strong>Spring Boot</strong>,
        <strong>Spring MVC</strong>,
        <strong>JSP</strong>,
        and
        <strong>Hibernate</strong>.
    </p>

    <a href="employeeForm" class="btn">Get Started</a>

    <div class="footer">
        © 2026 Spring Boot MVC Application
    </div>

</div>

</body>
</html>