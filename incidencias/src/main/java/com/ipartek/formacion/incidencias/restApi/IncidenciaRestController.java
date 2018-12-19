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

import com.ipartek.formacion.incidencias.modelos.Incidencia;
import com.ipartek.formacion.incidencias.repositorio.CrudAble;

@RestController
public class IncidenciaRestController {
	
		@Autowired
		private CrudAble<Incidencia> repositorio;
		
		@GetMapping("/api/incidencias")
		public List<Incidencia> obtenerIncidencia() {
			return repositorio.getAll();
		}
		@GetMapping("/api/incidencias/{idrecibido}")
		public Incidencia obtenerIncidenciaPorId(@PathVariable("idrecibido") int id) {
			return repositorio.getById(id);
		}
		
		@PostMapping("/api/incidencias")
		public boolean crearNuevaIncidencia(@RequestBody Incidencia incidencia) {
			return repositorio.insert(incidencia);
		}
		
		@PutMapping("/api/incidencias")
		public void cambiarIncidencia(@RequestBody Incidencia incidencia) {
			repositorio.update(incidencia);
		}
		
		@DeleteMapping("/api/incidencias/{id}")
		public void borrarIncidencia(@PathVariable("id") int id) {
			repositorio.delete(id);
		}
}
