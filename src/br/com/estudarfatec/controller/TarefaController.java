package br.com.estudarfatec.controller;

import java.util.List;

import br.com.estudarfatec.model.Tarefa;
import br.com.estudarfatec.service.TarefaService;

public class TarefaController {
	private TarefaService service;
	
	
	
	public TarefaController(TarefaService service) {
		super();
		this.service = service;
	}

	public void cadastrar(String titulo, String descricao) {
		Tarefa tarefa = new Tarefa(service.listar().size() + 1, titulo, descricao);
		service.adicionar(tarefa);
	}
	
	public List<Tarefa> listar(){
		return service.listar();
	}
	
	public Tarefa BuscarPorId(int id) {
	     return service.buscarPorId(id);
		
	}
	
	
	public void remover(int id) {
	     service.remover(id);
	}
	
	
	
	

}
