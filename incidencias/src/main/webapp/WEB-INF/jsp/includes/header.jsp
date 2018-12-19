    <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<%@ page session="true" %>
    <!DOCTYPE html>
    <html lang="es">
    <head>
    <meta charset="UTF-8">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/bootstrap.css" />
    
	<link rel="stylesheet" href="../css/estilos.css" />
    <meta name="viewport"
        content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Gestión de libros online</title>
    </head>
    <body>

	<header>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
		
			<a class="navbar-brand" href="main"><img src="../img/logo.svg"
				height="45" width="45"  /></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarCollapse" aria-controls="navbarCollapse"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul class="navbar-nav mr-auto"> 
				
				<c:choose>
				<c:when test="${sessionScope.email != 'admin'}">
				<li class="nav-item"><a class="nav-link" href="main">Inicio</a>
				</ul>
					<a href="desconectar" class="btn btn-outline-danger">Desconectar</a>
				</c:when> 
				<c:otherwise>
				<li class="nav-item"><a class="nav-link" href="main">Inicio</a>
					</li>
					<li class="nav-item">
							<a class="btn  btn-outline-success" href="#"
								role="button"> Administrar usuarios </a>
					</li>
					</ul>
					<a href="desconectar" class="btn btn-outline-danger">Desconectar</a>
				</c:otherwise>
			</c:choose> 
			</div>
		</nav>
	</header>