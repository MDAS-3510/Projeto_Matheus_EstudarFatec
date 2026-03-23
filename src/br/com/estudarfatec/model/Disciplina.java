package br.com.estudarfatec.model;

import java.util.ArrayList;

public class Disciplina {
	private int id;
	private String nome;
	private DiaSemana diaSemana;
	private ArrayList<Tarefa> tarefas;
	
	
	
	public Disciplina(int id, String nome, DiaSemana diaSemana ) {
		super();
		this.id = id;
		this.nome = nome;
		this.diaSemana = diaSemana;
		this.tarefas = new ArrayList<>();
		
	}

	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
		
	}
	
	
	public enum DiaSemana{
		SEGUNDA("Segunda-feira"), TERCA("Terça-feira"), QUARTA("Quarta-feira"), QUINTA("Quinta-feira"), SEXTA("Sexta-feira"),SABADO("Sábado");
		
		private String nomeDia;
		
		public String getNomeDia() {
			return nomeDia;
			
		}
		DiaSemana(String nomeDia) {
			this.nomeDia = nomeDia;
		}
	}
	

	
	public void adicionarTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa); 
	}
	
	public ArrayList<Tarefa> getTarefas(){
		return tarefas;
	}
	

}
