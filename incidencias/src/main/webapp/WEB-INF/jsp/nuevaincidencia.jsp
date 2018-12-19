<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/header.jsp"%>
<div class="container text-center">
	<h1>Nueva Incidencia</h1>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-3"><label>Fecha</label></div>
		<div class="col-sm-3"><label>Usuario Creador</label></div>
		<div class="col-sm-4"></div>
	</div>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-3"><input type="text" id="InputFecha" name="fecha" class="form-control" placeholder="Introduzca fecha dd-mm-yyyy" required autofocus></div>
		<div class="col-sm-3"><input type="text" id="InputUsuarioCreador" name="usuarioCreador" class="form-control" placeholder="Introduzca usuario creador"></div>
		<div class="col-sm-4"></div>
	</div>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-3"><label>Titulo</label></div>
		<div class="col-sm-3"><label>Descripcion</label></div>
		<div class="col-sm-4"></div>
	</div>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-3"><input type="text" id="InputTitulo" name="titulo" class="form-control" placeholder="Introduzca titulo" required autofocus></div>
		<div class="col-sm-3"><textarea id="InputDescripcion" name="descripcion" class="form-control" placeholder="Introduzca descripcion"></textarea></div>
		<div class="col-sm-4"></div>
	</div>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-3"><label>Usuario Asignado</label></div>
		<div class="col-sm-3"></div>
		<div class="col-sm-4"></div>
	</div>
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-3"><input type="text" id="inputUsuarioAsignado" name="usuarioAsignado" class="form-control" placeholder="Introduzca usuario asignado" required autofocus></div>
		<div class="col-sm-3"></div>
		<div class="col-sm-4"></div>
	</div>
</div>
<%@ include file="includes/footer.jsp"%>