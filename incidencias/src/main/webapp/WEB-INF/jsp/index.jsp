<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/header.jsp"%>
<div class="container-fluid" >
        <div class="container hueco">
            <div class="row"></div>
             <div class="col-sm3"></div>
             <div class="col-sm3">
            <h2>Introduzca email y contraseña</h2>
            </div>
            <div class="col-sm3"></div>
            <div class="row"></div>
            <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
            <p id="profile-name" class="profile-name-card"></p>
            <form action="login" method="post" class="form-signin">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="InputEmail" name="email" class="form-control" placeholder="Email..." required autofocus>
                <input type="password" id="InputPassword" name="password" class="form-control" placeholder="Password" required>
               
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Iniciar sesión</button>
            </form>
      
        </div><!-- /card-container -->
    </div><!-- /container -->
<%@ include file="includes/footer.jsp"%>
