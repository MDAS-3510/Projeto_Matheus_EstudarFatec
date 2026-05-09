package br.com.estudarfatec;


import br.com.estudarfatec.strategy.MetodoEstudo;
import br.com.estudarfatec.strategy.MetodoPomodoroTimer;
import br.com.estudarfatec.view.Menu;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.iniciar();


		MetodoEstudo metodo = new MetodoPomodoroTimer(1, 1);
		metodo.estudar();
	}
}


	


