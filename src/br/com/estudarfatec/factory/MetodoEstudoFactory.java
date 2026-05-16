package br.com.estudarfatec.factory;

import br.com.estudarfatec.strategy.MetodoEstudo;
import br.com.estudarfatec.strategy.MetodoPomodoro;
import br.com.estudarfatec.strategy.MetodoPomodoroTimer;

public class MetodoEstudoFactory {

	public static MetodoEstudo criar(int escolha) {
		switch (escolha) {
		case 1:
			return new MetodoPomodoro();
		case 2:
			return new MetodoPomodoroTimer(25, 5);
		default:
			throw new IllegalArgumentException("Método inválido!");
		}
	}

	public static MetodoEstudo criar(int escolha, int minutosFoco, int minutoPause) {
		switch (escolha) {

		case 1:
			return new MetodoPomodoro();
		case 2:
			return new MetodoPomodoroTimer(minutosFoco, minutoPause);
		default:
			throw new IllegalArgumentException("Metodo Inválido");

		}

	}
}
