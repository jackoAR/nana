package com.uisrael.nana.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uisrael.nana.model.Nana;
import com.uisrael.nana.service.INanaService;

@Controller
public class NanaController implements Serializable {

	/**
	 * 
	 */
	@Autowired
	private INanaService srv;

	private static final long serialVersionUID = 1L;

	@GetMapping("/nanas")
	public String abrirNanas(Model model) {
		List<Nana> listarNana = srv.listarNana();
		model.addAttribute("lista", listarNana);
		return "/Nana/nanas";
	}

	@GetMapping("/nuevoNana")
	public String abrirNana(Model model) {
		model.addAttribute("nuevo", new Nana());
		return "/Nana/nuevoNana";
	}

	@GetMapping("/nuevoNana/{idNana}")
	public String actualizarNana(@PathVariable(value = "id") String idNana, Model model) {
		Optional<Nana> existe = null;
		if (idNana != null && !idNana.isEmpty()) {
			existe = srv.buscarPorId(idNana);
		} else {
			return "redirect:/nanas";
		}
		model.addAttribute("nuevo", existe);
		return "/Nana/nuevoNana";
	}

	@PostMapping("/guardar")
	public String insertarNana(@ModelAttribute("nuevo") Nana nuevoNana) {
		srv.insertarNana(nuevoNana);
		return "redirect:/nanas";
	}

	@RequestMapping("/eliminarNana/{idNana}")
	public String eliminarNana(@PathVariable(value = "id") String idNana) {

		if (idNana != null && !idNana.isEmpty()) {
			srv.eliminarNana(idNana);
		}
		return "redirect:/nanas";
	}

}
