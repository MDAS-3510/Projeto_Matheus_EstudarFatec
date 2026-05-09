package br.com.estudarfatec.controller;

import java.util.List;

import br.com.estudarfatec.model.Disciplina;
import br.com.estudarfatec.model.Disciplina.DiaSemana;
import br.com.estudarfatec.service.DisciplinaService;

public class DisciplinaController {
	private DisciplinaService service;

	public DisciplinaController(DisciplinaService service) {
		super();
		this.service = service;
	}
	
	public void cadastrar(String nome, DiaSemana diaSemana) {
		Disciplina disciplina = new Disciplina(service.listar().size() + 1,nome, diaSemana );
		service.adicionar(disciplina);
	}
	
	public List<Disciplina> listar(){
		return service.listar();
	}
	
	public Disciplina BuscarPorId(int id) {
	     return service.buscarPorId(id);
		
	}
	
	public void atualizar(Disciplina disciplina) {
		service.atualizar(disciplina);
	}
	
	
	public void remover(int id) {
	     service.remover(id);
	}

}
