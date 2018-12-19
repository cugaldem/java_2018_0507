package com.ipartek.formacion.incidencias.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.incidencias.modelos.Usuario;

@Repository
public class UsuarioMySQLDAO implements CrudAble<Usuario>{
	private TreeMap<Integer, Usuario> usuarios = new TreeMap<>();
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Usuario> getAll(){
		List<Usuario> resultados = new ArrayList<>();
		try {
		resultados = jdbcTemplate.query("call get_ALL_Usuarios", (rs, rowNum) -> new Usuario(rs.getLong("ID"),
				rs.getString("email"), rs.getString("password"), rs.getString("equipo")));
		}catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return  resultados;
	}
	public Usuario getById(int id) {
		Usuario resultados = new Usuario();
		try {
			resultados = jdbcTemplate.queryForObject("call get_ID_Usuario (?)", new Object[] { id },
					(rs, rowNum) -> new Usuario(rs.getLong("ID"), rs.getString("email"),
							rs.getString("password"), rs.getString("equipo")));
		} catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return resultados;
	}
	public Usuario getByEmailPass(String email, String password) {
		System.out.println("Llego al metodo");
		Usuario resultado = new Usuario();
		try {
			resultado =jdbcTemplate.queryForObject("call get_By_EmailPassword (?, ?)", new Object[] { email, password },
					(rs, rowNum) -> new Usuario(rs.getLong("ID"), rs.getString("email"),
							rs.getString("password"), rs.getString("equipo")));
		}catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return resultado;
	}
	
	public boolean update(Usuario pojo) {
		try {
			this.jdbcTemplate.update("CALL update_usuario (?, ?, ?, ?)",
					new Object[] { pojo.getEmail(), pojo.getPassword(), pojo.getEquipo(), pojo.getID() });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}

	public boolean delete(int id) {
		try {
			this.jdbcTemplate.update("CALL delete_usuario (?)",
					new Object[] { id });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}
	@Override
	public boolean insert(Usuario pojo) {
		try {

			this.jdbcTemplate.update("CALL new_usuario(?, ?, ?)",
					new Object[] { pojo.getEmail(), pojo.getPassword(), pojo.getEquipo() });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}
	
}
