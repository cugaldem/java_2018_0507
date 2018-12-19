package com.ipartek.formacion.incidencias.logicaUsuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.incidencias.modelos.Incidencia;
import com.ipartek.formacion.incidencias.modelos.Usuario;
import com.ipartek.formacion.incidencias.repositorio.AccesoDatosException;
import com.ipartek.formacion.incidencias.repositorio.CrudAble;
import com.ipartek.formacion.incidencias.repositorio.UsuarioMySQLDAO;

@Service
public class Logica {
	
	@Autowired
	private CrudAble<Usuario> repositorioU;
	@Autowired
	private CrudAble<Incidencia> repositorioI;
		
	public List<Incidencia> getIncidencias(){
		ArrayList<Incidencia> in = (ArrayList<Incidencia>) repositorioI.getAll();
		
		return in;
	}
	
	public boolean validarUsuario(String email, String password) {
		System.out.println(email + " " + password);
		Usuario usuario = new Usuario(email, password);
		try {
			System.out.println("Vamos a entrar en la consulta");
			usuario = ((UsuarioMySQLDAO) repositorioU).getByEmailPass(email, password);
			System.out.println("El email de la base de datos es: " + usuario.getEmail());
				if(usuario.getEmail().equals(email)&&usuario.getPassword().equals(password)){
					return true;
				}else {
					return false;
				}
		} catch (AccesoDatosException e) {
			e.printStackTrace();
		}
		
		return false;	
	}
}
