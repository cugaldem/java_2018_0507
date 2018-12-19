package com.ipartek.formacion.incidencias.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipartek.formacion.incidencias.logicaUsuario.Logica;

@Controller
public class LoginController {

//	@Autowired
//	private CrudAble<Usuario> repositorio;
	
	@GetMapping("/login")
	public String principal(Model modelo) {
		return "index";
	}
	
	@Autowired
	private Logica l;
	
	@PostMapping("/login")
	public String validation(@RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request){
		if(l.validarUsuario(email, password)) {
			request.getSession().setAttribute("email", email);
			return "/main";	
		}else {
			return "/index";
		}
		
	}
}
