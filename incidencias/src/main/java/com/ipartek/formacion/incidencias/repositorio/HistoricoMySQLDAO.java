package com.ipartek.formacion.incidencias.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.incidencias.modelos.Historico;

@Repository
public class HistoricoMySQLDAO implements CrudAble<Historico>{
	private TreeMap<Integer, Historico> historicos = new TreeMap<>();
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Historico> getAll(){
		List<Historico> resultados = new ArrayList<>();
		try {
		resultados = jdbcTemplate.query("call get_ALL_Historicos", (rs, rowNum) -> new Historico(rs.getLong("ID"),
				rs.getString("incidencia"), rs.getString("usuario"), rs.getDate("fecha"), rs.getString("comentario"), rs.getString("estado")));
		}catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return  resultados;
	}
	public Historico getById(int id) {
		Historico resultados = new Historico();
		try {
			resultados = jdbcTemplate.queryForObject("call get_ID_Historico (?)", new Object[] { id },
					(rs, rowNum) -> new Historico(rs.getLong("ID"),
							rs.getString("incidencia"), rs.getString("usuario"), rs.getDate("fecha"),
							rs.getString("comentario"), rs.getString("estado")));
		} catch (Exception e) {
			throw new AccesoDatosException(e.getMessage(), e);
		}
		return resultados;
	}
	public boolean update(Historico pojo) {
		try {
			this.jdbcTemplate.update("CALL update_historico (?, ?, ?, ?, ?, ?)",
					new Object[] { pojo.getIncidencia(), pojo.getUsuario(), pojo.getFecha(), pojo.getComentario(), pojo.getEstado(), pojo.getID() });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}

	public boolean delete(int id) {
		try {
			this.jdbcTemplate.update("CALL delete_historico (?)",
					new Object[] { id });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}
	@Override
	public boolean insert(Historico pojo) {
		try {

			this.jdbcTemplate.update("CALL new_historico(?, ?, ?, ?, ?)",
					new Object[] { pojo.getIncidencia(), pojo.getUsuario(), pojo.getFecha(),
							pojo.getComentario(), pojo.getEstado() });
		} catch (Exception ey) {
			throw new AccesoDatosException(ey.getMessage(), ey);
		}
		return true;
	}
}
