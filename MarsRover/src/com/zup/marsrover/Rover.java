package com.zup.marsrover;

public class Rover {

	private Coordenadas coordenadas;

	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public void comandos(String comandosMovimento){
		for(int i=0; i < comandosMovimento.length(); i++){
			moverRover(comandosMovimento.charAt(i));
		}
	}
	
	public void moverRover(char comandoMovimento){
		switch(comandoMovimento){
			case 'M':
				getCoordenadas().mover();
				break;
			case 'L':
				getCoordenadas().rotacionar(-1);
				break;
			case 'R':
				getCoordenadas().rotacionar(1);
				break;
			default:
				System.out.println("Comando inexistente");
		}
	}
	
}
