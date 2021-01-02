<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>EMS | New Branch</title>
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
      	   <li class="nav-item active">
        	<a class="nav-link" href="/add-newbranch">New Branch</a>
      	  </li>
	      <li class="nav-item ">
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
<div class="container text-center">
				<h3>ADD NEW BRANCH</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-branch">
					<input type="hidden" name="id" value="${branch.id }" />
				
					<div class="form-group row">
						<label class="control-label col-md-3 text-left">Branch Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="branchname"
								value="${branch.name }" />
						</div>
					</div>
					<div class="form-group row">
						<label class="control-label col-md-3 text-left">Region</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="region"
								value="${branch.region}" />
						</div>
					</div>
				
					
					<div class="form-group row">
						<div class=" col-md-5"></div>
						<div class="col-md-3"><input type="submit" class="btn btn-primary btn-block" value="SAVE" /></div>
						<div class=" col-md-4"></div>
					</div>
				</form>
		</div>
		<div class="bg-secondary  footer ">
  			<p class="text-center txtfooter">Copyright © 2021 CST17049 | All rights reserved.</p>
		</div>
    <!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-3.5.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>