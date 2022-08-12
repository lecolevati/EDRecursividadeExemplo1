package view;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController div = new DivisaoController();
		int dividendo = 14;
		int divisor = 3;
		int resultado = div.divisao(dividendo, divisor);
		System.out.println(resultado);
	}

}
