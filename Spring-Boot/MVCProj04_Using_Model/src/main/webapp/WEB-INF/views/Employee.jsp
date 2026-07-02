<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>

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
    background:linear-gradient(135deg,#4facfe,#00f2fe);
}

.card{
    width:420px;
    background:rgba(255,255,255,0.18);
    backdrop-filter:blur(15px);
    border-radius:20px;
    padding:30px;
    box-shadow:0 15px 35px rgba(0,0,0,0.3);
    color:white;
    transition:0.4s;
}

.card:hover{
    transform:translateY(-8px);
    box-shadow:0 20px 40px rgba(0,0,0,0.4);
}

.profile{
    text-align:center;
    margin-bottom:20px;
}

.profile img{
    width:100px;
    height:100px;
    border-radius:50%;
    border:4px solid white;
    margin-bottom:10px;
}

.profile h1{
    font-size:30px;
    margin-top:10px;
}

.info{
    margin-top:20px;
}

.row{
    display:flex;
    justify-content:space-between;
    padding:12px 15px;
    margin:10px 0;
    background:rgba(255,255,255,0.15);
    border-radius:10px;
    transition:.3s;
}

.row:hover{
    background:rgba(255,255,255,0.3);
    transform:scale(1.03);
}

.label{
    font-weight:bold;
}

.value{
    color:#ffff66;
    font-weight:bold;
}

.footer{
    margin-top:25px;
    text-align:center;
    color:white;
    font-size:14px;
}
</style>

</head>

<body>

<div class="card">

    <div class="profile">
        <img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
             alt="Employee">
        <h1>Employee Details</h1>
    </div>

    <div class="info">

        <div class="row">
            <span class="label">Employee ID</span>
            <span class="value">${id}</span>
        </div>

        <div class="row">
            <span class="label">Employee Name</span>
            <span class="value">${name}</span>
        </div>

        <div class="row">
            <span class="label">Department</span>
            <span class="value">${department}</span>
        </div>

        <div class="row">
            <span class="label">Salary</span>
            <span class="value">₹ ${salary}</span>
        </div>

    </div>

    <div class="footer">
        ✔ Employee Information Loaded Successfully
    </div>

</div>

</body>
</html>