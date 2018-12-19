package com.ipartek.formacion.incidencias.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.formacion.incidencias.modelos.Historico;
import com.ipartek.formacion.incidencias.repositorio.CrudAble;

@RestController
public class HistoricoRestController {
	@Autowired
	private CrudAble<Historico> repositorio;
	
	@GetMapping("/api/historicos")
	public List<Historico> obtenerHistorico() {
		return repositorio.getAll();
	}
	@GetMapping("/api/historicos/{idrecibido}")
	public Historico obtenerHistoricoPorId(@PathVariable("idrecibido") int id) {
		return repositorio.getById(id);
	}
	
	@PostMapping("/api/historicos")
	public boolean crearNuevaHistorico(@RequestBody Historico historico) {
		return repositorio.insert(historico);
	}
	
	@PutMapping("/api/historicos")
	public void cambiarHistorico(@RequestBody Historico historico) {
		repositorio.update(historico);
	}
	
	@DeleteMapping("/api/historicos/{id}")
	public void borrarHistorico(@PathVariable("id") int id) {
		repositorio.delete(id);
	}
}
