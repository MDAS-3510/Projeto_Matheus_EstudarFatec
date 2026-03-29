package br.com.estudarfatec.repository;

import java.util.List;

import br.com.estudarfatec.model.Tarefa;

public interface TarefaRepository {
	
    void adicionar(Tarefa tarefa);
    
    List<Tarefa> listar();
    
    Tarefa buscarPorId(int id);
    
    void remover(int id);

}