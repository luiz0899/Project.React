package com.br.Project.React.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.Project.React.model.Poster;

@Repository

public interface  PosterRepository  extends JpaRepository<Poster,Integer>{
	
}
