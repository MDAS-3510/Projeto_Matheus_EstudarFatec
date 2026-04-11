package br.com.estudarfatec.service;

import java.util.List;

import br.com.estudarfatec.model.Disciplina;
import br.com.estudarfatec.repository.DisciplinaRepository;



public class DisciplinaService {
	private DisciplinaRepository repository;

	
	
	public DisciplinaService(DisciplinaRepository repository) {
		super();
		this.repository = repository;
	}

	public void adicionar(Disciplina disciplina)  {
		if(disciplina.getNome() == null || disciplina.getNome().isEmpty()) {
			throw new IllegalArgumentException("Nome da disciplina não pode ser vazio");
		}
		repository.adicionar(disciplina);
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
	
	public Disciplina buscarPorId(int id) {
		validacaoID(id);
		return repository.buscarPorId(id);
	}
	
	public List<Disciplina> listar(){
		return repository.listar();
	}
	
	
	public void atualizar(Disciplina disciplina) {
		if(disciplina.getNome() == null || disciplina.getNome().isEmpty()) {
		    throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
		if(disciplina.getNome().length() < 2) {
		    throw new IllegalArgumentException("Nome deve ter pelo menos 2 caracteres!");
		}
		repository.atualizar(disciplina);
		
	}
	
}
