package br.com.estudarfatec.service;

import java.util.List;

import br.com.estudarfatec.model.Tarefa;
import br.com.estudarfatec.repository.TarefaRepository;

public class TarefaService {
	private TarefaRepository repository;

	public TarefaService(TarefaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public void adicionar(Tarefa tarefa)  {
		if(tarefa.getTitulo() == null || tarefa.getTitulo().isEmpty()) {
			throw new IllegalArgumentException("Titulo não pode ser vazio");
		}
		repository.adicionar(tarefa);
	}
	
	public void validacaoID(int id) {
		if(id <= 0) {
			throw new IllegalArgumentException("Id invalido");
		}
	}
	
	
	public void remover(int id) {
		validacaoID(id);
		repository.remover(id);
	}
	
	public Tarefa buscarPorId(int id) {
		validacaoID(id);
		return repository.buscarPorId(id);
	}
	
	public List<Tarefa> listar(){
		return repository.listar();
	}
	
}
