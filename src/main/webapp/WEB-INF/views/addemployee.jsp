<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>tecno-tab | Registration</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <a class="navbar-brand" href="/">Tecno-Tab</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarText">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item ">
	        <a class="nav-link" href="/login">Login <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item active">
	         <a class="nav-link" href="/add-employee">Add Employee</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/show-employee">All Users</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<br>
<div class="container text-center">
				<h3>New Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-employee">
					<input type="hidden" name="id" value="${employee.id }" />
				
					<div class="form-group row">
						<label class="control-label col-md-3">First Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="firstname"
								value="${employee.firstName }" />
						</div>
					</div>
					<div class="form-group row">
						<label class="control-label col-md-3">Last Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="lastname"
								value="${employee.lastName }" />
						</div>
					</div>
					<div class="form-group row">
						<label class="control-label col-md-3">Email</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email"
								value="${employee.email }" />
						</div>
					</div>
					<div class="form-group row">
						<label class="control-label col-md-3">Phone Number</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="telephone"
								value="${employee.telephone }" />
						</div>
					</div>
					<div class="form-group row">
						<label class="control-label col-md-3">Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="address"
								value="${employee.address }" />
						</div>
					</div>
					<div class="form-group row">
						<div class=" col-md-3"></div>
						<div class="col-md-7"><input type="submit" class="btn btn-primary" value="Register" /></div>
					</div>
				</form>
		</div>
    <!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-3.5.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>