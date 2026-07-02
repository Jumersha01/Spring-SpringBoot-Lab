<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1{
text-align:center;
color:red;
font-family:ariel;
background-color:pink;
}
</style>
</head><%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(-45deg,#4facfe,#00f2fe,#667eea,#764ba2);
    background-size:400% 400%;
    animation:bgAnimation 12s ease infinite;
    overflow:hidden;
}

@keyframes bgAnimation{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

/* Card */

.card{
    position:relative;
    width:450px;
    padding:35px;
    border-radius:25px;
    background:rgba(255,255,255,.15);
    backdrop-filter:blur(18px);
    box-shadow:0 20px 40px rgba(0,0,0,.35);
    overflow:hidden;
    transition:.4s;
}

.card:hover{
    transform:translateY(-10px) scale(1.02);
}

.card h1{
    text-align:center;
    color:white;
    margin-bottom:25px;
    font-size:34px;
}

.icon{
    text-align:center;
    font-size:70px;
    margin-bottom:15px;
}

/* Details */

.row{
    display:flex;
    justify-content:space-between;
    margin:15px 0;
    padding:14px;
    border-radius:12px;
    background:rgba(255,255,255,.15);
    color:white;
    transition:.3s;
}

.row:hover{
    background:rgba(255,255,255,.30);
    transform:scale(1.03);
}

.label{
    font-weight:bold;
}

.value{
    color:#ffe66d;
    font-weight:bold;
}

/* Floating Balls */

.ball{
    position:absolute;
    border-radius:50%;
    opacity:.8;
    filter:blur(1px);
}

.ball1{
    width:90px;
    height:90px;
    background:#00f2fe;
    animation:move1 8s linear infinite;
}

.ball2{
    width:60px;
    height:60px;
    background:#ff4d6d;
    animation:move2 10s linear infinite;
}

.ball3{
    width:70px;
    height:70px;
    background:#ffd93d;
    animation:move3 12s linear infinite;
}

.ball4{
    width:50px;
    height:50px;
    background:#7bed9f;
    animation:move4 9s linear infinite;
}

@keyframes move1{
0%{top:-40px;left:-40px;}
25%{top:-40px;left:390px;}
50%{top:470px;left:390px;}
75%{top:470px;left:-40px;}
100%{top:-40px;left:-40px;}
}

@keyframes move2{
0%{top:420px;left:-30px;}
25%{top:-30px;left:-30px;}
50%{top:-30px;left:410px;}
75%{top:420px;left:410px;}
100%{top:420px;left:-30px;}
}

@keyframes move3{
0%{top:180px;left:-40px;}
50%{top:180px;left:420px;}
100%{top:180px;left:-40px;}
}

@keyframes move4{
0%{top:-20px;left:200px;}
50%{top:430px;left:200px;}
100%{top:-20px;left:200px;}
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

    <!-- Floating Balls -->
    <div class="ball ball1"></div>
    <div class="ball ball2"></div>
    <div class="ball ball3"></div>
    <div class="ball ball4"></div>

    <div class="icon">🎓</div>

    <h1>Student Details</h1>

    <div class="row">
        <span class="label">Student Name</span>
        <span class="value">${Name}</span>
    </div>

    <div class="row">
        <span class="label">Course</span>
        <span class="value">${course}</span>
    </div>

    <div class="row">
        <span class="label">City</span>
        <span class="value">${City}</span>
    </div>

    <div class="footer">
        ✔ Student Information Loaded Successfully
    </div>

</div>

</body>

</html>