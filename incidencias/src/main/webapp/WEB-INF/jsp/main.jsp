<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/header.jsp"%>

<div class="container">
<div class="row">
<div class="col-sm-11 text-center"><h1>GESTION INCIDENCIAS</h1><br><br></div></div>	
  <div class="row">
    <div class="col-sm-2">
    </div>
    <div class="col-sm-5">
      <form action="createIncident" method="post" class="form-signin">
      <button class="btn btn-lg margen-boton" type="submit">Crear Incidencia</button>
    </form>
    </div>
    <div class="col-sm-5">
       <form action="listIncidents" method="post" class="form-signin">
      <button class="btn btn-lg margen-boton" type="submit">Mostrar Incidencias</button>
    </form>
    </div>
    <div class="col-sm-1">  
    </div>
  </div>
  <div class="row"><br><br><br></div>
  <div class="row">
  <div class="col-sm-2"	></div>
  <div class="col-sm-3"	><label>Buscar por id.</label></div>
  <div class="col-sm-3"	><label>Buscar por Usuario</label></div>
  <div class="col-sm-3"	><label>Buscar por estado</label></div>
  <div class="col-sm-1"	></div>
  </div>
  <div class="row">
  <div class="col-sm-2"	></div>
  <div class="col-sm-3"	><input type="text" id="InputId" name="id" class="form-control" placeholder="Introduzca Id" required autofocus></div>
  <div class="col-sm-3"	><input type="text" id="InputUsuario" name="usuario" class="form-control" placeholder="Introduzca Usuario"></div>
  <div class="col-sm-3"	><div class="form-check">
  <div>
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="optradio">Abierta</div>
    <input type="radio" class="form-check-input" name="optradio">Cerrada</div>
  </label></div>
  <div class="col-sm-1"	></div>
  </div>
  <div class="row">
  <div class="col-sm-2"	></div>
  <div class="col-sm-3"	><button type="button" class="btn btn-primary">Buscar por Id</button></div>
  <div class="col-sm-3"	><button type="button" class="btn btn-primary">Buscar por Usuario</button></div>
  <div class="col-sm-3"	><button type="button" class="btn btn-primary">Buscar por estado</button></div>
  <div class="col-sm-1"	></div>
  </div>
</div>
<%@ include file="includes/footer.jsp"%>
