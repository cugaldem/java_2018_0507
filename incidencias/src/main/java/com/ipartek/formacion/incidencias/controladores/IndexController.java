package com.ipartek.formacion.incidencias.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ipartek.formacion.incidencias.logicaUsuario.Logica;
import com.ipartek.formacion.incidencias.modelos.Incidencia;

@Controller
public class IndexController {
	@Autowired
	private Logica l;
	
	@PostMapping("/listIncidents")
	public String mostrarLista(Model model) {
		ArrayList<Incidencia> incidencias = (ArrayList<Incidencia>) l.getIncidencias();
		model.addAttribute("incidencias", incidencias);
		return "Incidencias";
	}
	@GetMapping("/index")
	public String main(Model modelo) {
		return "index";
	}
	@PostMapping("/createIncident")
	public String nuevaInci(Model model) {
		return "nuevaincidencia";
	}
}
