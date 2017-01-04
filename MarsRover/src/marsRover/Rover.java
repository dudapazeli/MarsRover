package marsRover;

public class Rover {

	private Coordenadas coordenadas;

	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	/** Receber instrucoes passadas ao Rover
	 * para que ele se movimente e/ou rotacione no grid
	 */
	public void comandos(String comandosMovimento){
		for(int i=0; i < comandosMovimento.length(); i++){
			moverRover(comandosMovimento.charAt(i));
		}
	}
	
	/** Mover Rover de acordo com as 
	 * instrucoes recbidas
	 */
	public void moverRover(char comandoMovimento){
		switch(comandoMovimento){
			case 'M':
				getCoordenadas().mover();
				break;
			case 'L':
				getCoordenadas().rotacionar(1);
				break;
			case 'R':
				getCoordenadas().rotacionar(-1);
				break;
			default:
				System.out.println("Comando não capturado pelo Rover");
				break;
		}
	}


	
}
