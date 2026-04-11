package br.com.estudarfatec.repository;

import java.util.List;

import br.com.estudarfatec.model.Disciplina;

public interface DisciplinaRepository {
void adicionar(Disciplina disciplina);
	
	List<Disciplina> listar();
	
	Disciplina buscarPorId(int id);
	
	void remover(int id);
	
	void atualizar(Disciplina disciplina);
}
