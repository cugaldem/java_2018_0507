<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/header.jsp"%>

<div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <table class="table table-striped ">
                <thead>
                    <tr>
                        <th scope="col" hidden>id</th>
                        <th scope="col">Fecha</th>
                        <th scope="col">Usuario Creador</th>
                        <th scope="col">Titulo</th>
                        <th scope="col">Descripcion</th>
                        <th scope="col">Usuario Asignado</th>
                        <c:choose>
							<c:when test="${sessionScope.email == 'admin'}">
                        		
                        	</c:when>
                        	<c:otherwise></c:otherwise>
                        	</c:choose>
                    </tr>
                </thead>
                <tbody>
				<c:forEach items="${incidencias}" var="incidencia">
				<tr>
						<th scope="row" hidden>${incidencia.ID}</th>
                        <td> ${incidencia.fecha} </td>
                        <td> ${incidencia.usuarioCreador}</td>
                        <td> ${incidencia.titulo}</td>
                        <td> ${incidencia.descripcion}</td>
                        <td> ${incidencia.usuarioAsignado}</td>
				<tr>
				</c:forEach>
                    
                </tbody>
            </table>
        </div>
        <div class="col-md-3"></div>
    </div>

<%@ include file="includes/footer.jsp"%>