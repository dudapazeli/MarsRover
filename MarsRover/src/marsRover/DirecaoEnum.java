package marsRover;

public enum DirecaoEnum {
	
	NORTE(0, 'N'),
	OESTE(1, 'W'),
	SUL(2, 'S'),
	LESTE(3, 'E');
	
	private int valor;
	private char chave;
	
	
	private DirecaoEnum(int valor, char chave) {
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
