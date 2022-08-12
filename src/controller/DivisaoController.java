package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int divisao(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return 0;//0 ou 1
		} else {
			dividendo = dividendo - divisor;
			return 1 + divisao(dividendo, divisor);
		}
	}
	
	
}
