<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/b1ace28686.js"
	crossorigin="anonymous"></script>

<title>Clientes</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: black">
			<div>
				<a href="index.jsp" class="navbar-brand">SPR</a>
			</div>
			<ul class="navbar-nav">
				<li><a href="viewProf" class="nav-link">Profesionales</a></li>
				<li><a href="viewClient" class="nav-link"> Clientes </a></li>
				<li><a href="viewAct" class="nav-link">Actividades</a></li>
				<li><a href="viewPayment" class="nav-link">Pagos</a></li>
			</ul>
		</nav>
	</header>

	<br>

	<div class="row">
		<div class="container">
			<h3 class="text-center">Lista de Clientes</h3>
			<hr>
			<div class="container text-left">
				<a href="formClient" class="btn btn-success">Añadir nuevo
					cliente</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>RUT</th>
						<th>Nombre</th>
						<th>Rubro</th>
						<th>Numero</th>
						<th>Correo Electrónico</th>
						<th>Descripción</th>
						<th>Ubicación</th>
					</tr>
				</thead>
				<tbody>


					<c:forEach var="c" items="${listaClient}">
						<tr>
							<td>${c.cl_rut}</td>
							<td>${c.cl_nombre}</td>
							<td>${c.cl_rubro}</td>
							<td>${c.cl_numero}</td>
							<td>${c.cl_email}</td>
							<td>${c.cl_desc}</td>
							<td>${c.cl_ubi}</td>
							<td><a href="editClient/${c.cl_rut}">Editar</a>
								&nbsp;&nbsp;&nbsp; <a href="deleteClient/${c.cl_rut}">Eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<br>

	<div class="card-footer text-muted" style="height: 20vw;">
		<div class="" style="">
			<div class="container">
				<div class="row">
					<div class="col-sm">
						<div class="mx-auto" style="padding: 25%">
							<a href="https://www.linkedin.com/in/mattsoan/" class="mx-auto">
								<i class="fab fa-linkedin fa-5x"></i>
							</a>
						</div>

					</div>
					<div class="col-sm">
						<div class="mx-auto" style="padding: 25%">
							<a href="https://github.com/matsoan"> <i
								class="fab fa-github fa-5x"></i>
							</a>
						</div>
					</div>
					<div class="col-sm">
						<div class="mx-auto" style="padding: 25%">
							<a href="https://www.instagram.com/matsoan.wd/?hl=es-la"> <i
								class="fab fa-instagram fa-5x"></i>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>