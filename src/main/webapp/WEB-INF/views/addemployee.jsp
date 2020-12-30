<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>EMS | Add Employee</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <a class="navbar-brand" href="/">EMS</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarText">
	    <ul class="navbar-nav mr-auto">
	       <li class="nav-item active">
	         <a class="nav-link" href="/add-employee">New Employee</a>
	       </li>
	       <li class="nav-item ">
        	<a class="nav-link" href="/add-newbranch">New Branch</a>
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
				<h3>ADD NEW EMPLOYEE</h3>
				<hr>
			<form class="form-horizontal" method="POST" action="save-employee">
					<div class="form-group row">
						<label class="control-label col-md-3">Project</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="project"
								value="${employee.project }" />
						</div>
					</div>
				<div class="row">
					<div class="col-md-6">
						<h4>Employee 1</h4>
						<!-- input type="hidden" name="id" value="${employee.id }" /-->
				
						<div class="form-group row">
							<label class="control-label col-md-3">First Name</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="firstname1"
									value="${employee.firstName }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Last Name</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="lastname1"
									value="${employee.lastName }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Email</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="email1"
									value="${employee.email }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Phone Number</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="telephone1"
									value="${employee.telephone }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Address</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="address1"
									value="${employee.address }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Branch</label>
							<div class="col-md-7">
								<!--input type="text" class="form-control" name="branch1"
									value="${employee.branch }" /-->
									<select class="form-control"  name="branch1">
										<c:forEach var="branch" items="${branches}">
										    <option value="<c:out value="${branch.id}"/>"><c:out value="${branch.name}"/></option>
									    </c:forEach>
						  			</select>
							</div>
							
						  
						</div>
						
					</div>
					<div class="col-md-6">
								<h4>Employee 2</h4>
						<!--  input type="hidden" name="id" value="${employee.id }" /-->
				
						<div class="form-group row">
							<label class="control-label col-md-3">First Name</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="firstname2"
									value="${employee.firstName }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Last Name</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="lastname2"
									value="${employee.lastName }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Email</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="email2"
									value="${employee.email }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Phone Number</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="telephone2"
									value="${employee.telephone }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Address</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="address2"
									value="${employee.address }" />
							</div>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-3">Branch</label>
							<div class="col-md-7">
								<!--input type="text" class="form-control" name="branch2"
									value="${employee.branch }" /-->
									<select class="form-control" id="sel1" name="branch2">
										<c:forEach var="branch" items="${branches}">
										    <option value="<c:out value="${branch.id}"/>"><c:out value="${branch.name}"/></option>									    
									    </c:forEach>
						  			</select>
							</div>
						</div>
					</div>
				</div>				
				
				<div class="form-group row">
					<div class="col-md-2"></div>
					<div class="col-md-8"><input type="submit" class="btn btn-primary btn-block" value="SAVE" /></div>
					<div class="col-md-2"></div>
				</div>
			</form>
		</div>
    <!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-3.5.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>