package com.ipartek.formacion.incidencias.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.incidencias.modelos.Incidencia;
import com.ipartek.formacion.incidencias.modelos.Usuario;



@Repository
public class IncidenciaMySQLDAO implements CrudAble<Incidencia>{
	private TreeMap<Integer, Incidencia> incidencias= new TreeMap<>();
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Incidencia> getAll(){
		List<Incidencia> resultados = new ArrayList<>();
		try {
		resultados = jdbcTemplate.query("call get_ALL_Incidencias", (rs, rowNum) -> new Incidencia(rs.getLong("ID"),
				rs.getDate("fecha"), rs.getString("usuarioCreador"), rs.getString("titulo"),
				rs.getString("descripcion"), rs.getString("equipo"),rs.getString("usuarioAsignado")));
		}catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return  resultados;
	}
	public Incidencia getById(int id) {
		Incidencia resultados = new Incidencia();
		try {
			resultados = jdbcTemplate.queryForObject("call get_ID_Incidencia (?)", new Object[] { id },
					(rs, rowNum) -> new Incidencia(rs.getLong("ID"),
							rs.getDate("fecha"), rs.getString("usuarioCreador"), rs.getString("titulo"),
							rs.getString("descripcion"), rs.getString("equipo"),rs.getString("usuarioAsignado")));
		} catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return resultados;
	}
	public boolean update(Incidencia pojo) {
		try {
			this.jdbcTemplate.update("CALL update_incidencia (?, ?, ?, ?, ?, ?, ?, ?)",
					new Object[] { pojo.getFecha(), pojo.getUsuarioCreador(), pojo.getTitulo(),
							pojo.getDescripcion(), pojo.getEquipo(), pojo.getUsuarioAsignado(), pojo.getID() });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}

	public boolean delete(int id) {
		try {
			this.jdbcTemplate.update("CALL delete_incidencia (?)",
					new Object[] { id });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}
	@Override
	public boolean insert(Incidencia pojo) {
		try {

			this.jdbcTemplate.update("CALL new_Incidencia(?, ?, ?, ?, ?, ?)",
					new Object[] { pojo.getFecha(), pojo.getUsuarioCreador(), pojo.getTitulo(),
							pojo.getDescripcion(), pojo.getEquipo(), pojo.getUsuarioAsignado() });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}
}
