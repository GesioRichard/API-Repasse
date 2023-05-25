package com.estacio.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estacio.api.dao.RepasseDAO;
import com.estacio.api.model.Repasse;

@RestController
@RequestMapping("repasses")
public class RepasseController {
	
	@GetMapping
	public List<Repasse> listarRepasses() {
		RepasseDAO repasseDAO = new RepasseDAO();
		
		return repasseDAO.findAll();
	}
	
	@GetMapping("/id")
	public Repasse listarRepasse(@RequestParam ("idMunicipio") Integer idMunicipio) {
		RepasseDAO repasseDAO = new RepasseDAO();
		
		return repasseDAO.findByMunicipio(idMunicipio);
	}
}
