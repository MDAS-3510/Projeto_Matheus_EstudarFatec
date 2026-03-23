package br.com.estudarfatec.model;

import java.util.ArrayList;
import br.com.estudarfatec.model.Tarefa;

public class MatrizEisenhower {
	private ArrayList<Tarefa> fazerAgora;  // importante E urgente
	private ArrayList<Tarefa> agendar;     // importante E NÃO urgente
	private ArrayList<Tarefa> delegar;     // NÃO importante E urgente
	private ArrayList<Tarefa> eliminar;    // NÃO importante E NÃO urgente

	    public MatrizEisenhower() {
	    	this.fazerAgora = new ArrayList<>();
	    	this.agendar = new ArrayList<>();
	    	this.delegar = new ArrayList<>();
	    	this.eliminar = new ArrayList<>();
	    }
	    
	    
	    
	    public ArrayList<Tarefa> getFazerAgora() {
	    	return fazerAgora;
	    }
	    
	    public void setFazerAgora(ArrayList<Tarefa> fazerAgora) {
	    	this.fazerAgora = fazerAgora;
	    }
	    
	    public ArrayList<Tarefa> getAgendar() {
	    	return agendar;
	    }
	    
	    public void setAgendar(ArrayList<Tarefa> agendar) {
	    	this.agendar = agendar;
	    }
	    
	    public ArrayList<Tarefa> getDelegar() {
	    	return delegar;
	    }
	    
	    public void setDelegar(ArrayList<Tarefa> delegar) {
	    	this.delegar = delegar;
	    }
	    
	    
	    public ArrayList<Tarefa> getEliminar() {
	    	return eliminar;
	    }
	    
	    public void setEliminar(ArrayList<Tarefa> eliminar) {
	    	this.eliminar = eliminar;
	    }


	    public void classificarTarefa(Tarefa tarefa) {
	    	if(tarefa.isUrgente() && tarefa.isImportante()) {
	    		this.fazerAgora.add(tarefa);
	    		} else if (tarefa.isUrgente() && !tarefa.isImportante()){
	    			this.delegar.add(tarefa);
	    		} else if (tarefa.isImportante() && !tarefa.isUrgente()) {
	    			this.agendar.add(tarefa);
	    		} else {
	    			this.eliminar.add(tarefa);
	    		}
	    	
	    }
	    
	    public void removerTarefa(Tarefa tarefa) {
	        fazerAgora.removeIf(t -> t.getId() == tarefa.getId());
	        agendar.removeIf(t -> t.getId() == tarefa.getId());
	        delegar.removeIf(t -> t.getId() == tarefa.getId());
	        eliminar.removeIf(t -> t.getId() == tarefa.getId());
	    }
	    


}
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	

