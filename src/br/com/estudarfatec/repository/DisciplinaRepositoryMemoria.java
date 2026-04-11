package br.com.estudarfatec.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.estudarfatec.model.Disciplina;

public class DisciplinaRepositoryMemoria implements DisciplinaRepository{

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	@Override
	public void adicionar(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	@Override
	public List<Disciplina> listar() {
		return disciplinas;
	}

	@Override
	public Disciplina buscarPorId(int id) {
		for(Disciplina d: disciplinas) {
			if(d.getId() == id) {
				return d;
			}
		}
		return null;
	}

	@Override
	public void remover(int id) {
		disciplinas.removeIf(d -> d.getId() == id);
		
	}

	@Override
	public void atualizar(Disciplina disciplina) {
		for (int i = 0; i < disciplinas.size(); i++) {
			if(disciplinas.get(i).getId() == disciplina.getId()) {
				disciplinas.set(i, disciplina);
				break;
			}
		}
		
	}

}
