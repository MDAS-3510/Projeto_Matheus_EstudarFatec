package br.com.estudarfatec.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.estudarfatec.model.Tarefa;

public class TarefaRepositoryMamoria implements TarefaRepository{

	private List<Tarefa> tarefas = new ArrayList<Tarefa>();

	@Override
	public void adicionar(Tarefa tarefa) {
		tarefas.add(tarefa);

	}

	@Override
	public List<Tarefa> listar() {

		return tarefas;
	}

	@Override
	public Tarefa buscarPorId(int id) {

		for (Tarefa t: tarefas) {
			if(t.getId() == id) {
				return t;
			}
		}
		return null;
	}
	
	
	@Override
	public void remover(int id) {
		tarefas.removeIf(t -> t.getId() == id);

	}
}