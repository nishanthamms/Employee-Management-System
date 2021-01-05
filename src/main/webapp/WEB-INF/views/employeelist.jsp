<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>EMS | Employee List</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
	   <li class="nav-item ">
           <a class="nav-link" href="/supervisor-to-branch">Assign Supervisors to Branch</a>
       </li>
      <li class="nav-item active active">
        	<a class="nav-link" href="/show-employee">Employee List</a>
      </li>
       <li class="nav-item">
	        <a class="nav-link" href="/show-supervisor">Supervisor List</a>
	   </li> 
    </ul>
  </div>
</nav>
<br> 
	<div class="container text-center" id="tasksDiv">
				<h3>EMPLOYEE LIST</h3>
				<hr>
				<div class="table-responsive">
					<table class="table  table-bordered table-hover">
						<thead>
							<tr class="bg-light">
								<th>Id</th>					
								<th>First Name</th>
								<th>LastName</th>
								<th>Address</th>
								<th>Email</th>
								<th>Telephone</th>
								<th>Working Project</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="employee" items="${employees}">
								<tr>
									<td>${employee.id}</td>
									<td>${employee.firstName}</td>
									<td>${employee.lastName}</td>
									<td>${employee.address}</td>
									<td>${employee.email}</td>
									<td>${employee.telephone}</td>
									<td>${employee.projectName}</td>
								  <c:if test="${employee.id%2!=0}">
									<td rowspan="2">						
										<a href="/delete-employee?id=${employee.id}"><i class="fa fa-trash iconcolor"></i></a>									
									</td>
								  </c:if>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
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