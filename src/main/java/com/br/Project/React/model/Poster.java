package com.br.Project.React.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name="poster")

public class Poster {
	
	@Id
	@GeneratedValue(generator = "seq_poster")
	@SequenceGenerator(name = "seq_poster" , sequenceName =  "seq_poster" )
	private Integer id ;
	private String conteudo ;
	private String titulo ;
	
	public Poster () {
		
	}

	public Poster(Integer id, String conteudo, String titulo) {
		
		this.id = id;
		this.conteudo = conteudo;
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	

}
