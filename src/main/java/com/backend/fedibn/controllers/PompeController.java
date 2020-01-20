package com.backend.fedibn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.fedibn.models.Pompe;
import com.backend.fedibn.repositories.PompeRepos;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/pompe")
public class PompeController {
	@Autowired
	private  PompeRepos pompeRepos;
	
	@PostMapping("/")
	public Pompe addPompe(@RequestBody Pompe pompe) {
		pompeRepos.save(pompe);
		return pompe;
	}
	
	@GetMapping("/")
	public List<Pompe> listePompes(){
		return (List) pompeRepos.findAll();
	}
	
	@PutMapping("/{id}/{outflow}")
	public Pompe updatePompe(@PathVariable(value="id") int id, @PathVariable(value="outflow") int outflow) {
		Pompe pompe = pompeRepos.findById(id).orElse(null);
		if (pompe != null) {
			pompe.setOutflow(outflow);
			return pompe;
		}
		return null;
	}
}
