<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>Agregar Profesional</title>
</head>

<header>
	<nav class="navbar navbar-expand-md navbar-dark"
		style="background-color: black">
		<div>
			<a href="../index.jsp" class="navbar-brand">SPR</a>
		</div>
		<ul class="navbar-nav">
			<li><a href="../viewProf" class="nav-link">Profesionales</a></li>
			<li><a href="../viewClient" class="nav-link"> Clientes </a></li>
			<li><a href="../viewAct" class="nav-link">Actividades</a></li>
			<li><a href="../viewPayment" class="nav-link">Pagos</a></li>
		</ul>
	</nav>
</header>
<br>
<div class="container col-md-5">
	<div class="card">
		<div class="card-body">
			<caption>
				<h1>Editar Profesional</h1>
			</caption>


			<form:form method="POST" action="/SpringM5Final/saveUpdateProf">
				<fieldset class="form-group">
					<label>RUT</label>
					<form:hidden path="pr_rut" class="form-control" />
				</fieldset>
				<fieldset class="form-group">
					<label>Nombres</label>
					<form:input path="pr_nombres" class="form-control" />
				</fieldset>
				<fieldset class="form-group">
					<label>Apellidos</label>
					<form:input path="pr_apellidos" class="form-control" />

				</fieldset>
				<fieldset class="form-group">
					<label>Ocupaci�n</label>
					<form:input path="pr_ocupacion" class="form-control" />
				</fieldset>
				<fieldset class="form-group">
					<label>Numero de tel�fono</label>
					<form:input path="pr_numero" class="form-control" />
				</fieldset>
				<fieldset class="form-group">
					<label>Correo electr�nico</label>
					<form:input path="pr_email" class="form-control" />
				</fieldset>


				<input type="submit" class="btn btn-success"
					value="Actualizar Profesional" />

			</form:form>
		</div>
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