package br.com.estudarfatec.strategy;

public class MetodoPomodoro implements MetodoEstudo {
	@Override
	public void estudar() {
		System.out.println("=== Iniciando Ciclo Pomodoro (25/5) ===");
        System.out.println("1. Foco Total: 25 ou 30 minutos.");
        System.out.println("2. Pausa Curta: 5 minutos.");
        System.out.println("Dica: A cada 4 ciclos, faça uma pausa maior!");
		
	}
	

	
}
