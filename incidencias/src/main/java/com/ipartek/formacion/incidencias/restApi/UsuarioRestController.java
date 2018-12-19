package com.ipartek.formacion.incidencias.restApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.formacion.incidencias.modelos.Usuario;
import com.ipartek.formacion.incidencias.repositorio.CrudAble;

@RestController
public class UsuarioRestController {

	private CrudAble<Usuario> repositorio;
	
	@GetMapping("/api/usuarios")
	public List<Usuario> obtenerUsuario() {
		return repositorio.getAll();
	}
	
}
