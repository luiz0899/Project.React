package com.br.Project.React.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.Project.React.model.Poster;
import com.br.Project.React.repository.PosterRepository;

@RestController
@RequestMapping("/poscontroller")

public class PostController {
	
	@Autowired
	private PosterRepository repository;
	
	@PostMapping("/save")
	public Poster save(@RequestBody Poster poster) {
		return repository.save(poster);
	}
	
	@GetMapping("/todos")
	public List<Poster> buscarPoster() {
		return repository.findAll();

	
	}


}
