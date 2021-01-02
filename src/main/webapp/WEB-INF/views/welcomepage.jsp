<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title> EMS | Home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
  <a class="navbar-brand" href="/"><b>EMS</b></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
       <li class="nav-item ">
	        <a class="nav-link" href="/add-employee">New Employee</a>
	   </li>
	   <li class="nav-item">
        	<a class="nav-link" href="/add-newsupervisor">New Supervisor</a>
        </li>
         <li class="nav-item">
        	<a class="nav-link" href="/add-newbranch">New Branch</a>
      	 </li>
	    <li class="nav-item">
        	<a class="nav-link" href="/supervisor-to-branch">Assign Supervisors to Branch</a>
      	</li>
      <li class="nav-item">
        	<a class="nav-link" href="/show-employee">Employee List</a>
      </li>
      <li class="nav-item">
	        <a class="nav-link" href="/show-supervisor">Supervisor List</a>
	  </li> 
    </ul>
  </div>
</nav>
<br> 
<h3 class="text-center"><b>WELCOME TO EMPLOYEE MANAGEMENT SYSTEM</b></h3>
<hr>
	
</br>
<div class="container" id="home">
<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="static/img/1.jpg" alt="pic1" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="static/img/2.jpg" alt="pic2" width="1100" height="500"> 
    </div>
    <div class="carousel-item">
      <img src="static/img/3.jpg" alt="pic2" width="1100" height="500"> 
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
</div>
<br>
<div class="bg-secondary  footer ">
  <p class="text-center txtfooter">Copyright © 2021 CST17049 | All rights reserved.</p>
</div>
	 <!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-3.5.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	
</body>
</html>