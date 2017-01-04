package com.zup.marsrover;

public enum Direcao {
	
	NORTE(0, 'N'),
	OESTE(1, 'O'),
	SUL(2, 'S'),
	LESTE(3, 'L');
	
	private int valor;
	private char chave;
	
	
	private Direcao(int valor, char chave) {
		this.chave = chave;
		this.valor = valor;
	}

	public char getChave() {
		return chave;
	}
	
	public int getValor() {
		return valor;
	}
	
	
	
}
