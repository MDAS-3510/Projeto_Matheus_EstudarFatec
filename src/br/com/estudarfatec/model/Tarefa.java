package br.com.estudarfatec.model;

public class Tarefa {
	private int id;
	private String titulo;
	private String descricao;
	private boolean concluido;
	private boolean urgente;
	private boolean importante;
	
 
	
	
	//Contrutor: Garante que o objeto nasça com os dados necessarios 
	public Tarefa(int id, String titulo, String descricao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluido = false;
		this.importante = false;
		this.urgente = false;

	}

	
	
	// a regra de negocio: O estado 'concluida só muda através deste metodo 
	public void concluir() {
		this.concluido = true;
	}
	
	public void desconcluir() {
		this.concluido = false;
	}
	
	
	
	// criando só os getters e setters para o acessoa a controle de dados 
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public boolean isConcluido() {
		return concluido;
	}
	
	
	public boolean isUrgente() {
		return urgente;
	}
	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}
	public boolean isImportante() {
		return importante;
	}
	public void setImportante(boolean importante) {
		this.importante = importante;
	}

	
	@Override
	public String toString() {
		String status = concluido ? "[x]" : "[ ]";
		return String.format("%s ID: %d | %s: %s",status, id, titulo, descricao);
		}	
	
	
}