package marsRover;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rover rover = new Rover();
		DirecaoEnum direcao = DirecaoEnum.NORTE;
		Coordenadas coordenadas = new Coordenadas(1, 2, direcao, 5, 5);	
		rover.setCoordenadas(coordenadas);
		rover.comandos("LMLMLMLMM");
		coordenadas = rover.getCoordenadas();
		System.out.println(coordenadas.getPontoX() + " " + coordenadas.getPontoY() + " " + coordenadas.getDirecao().getChave());
		
		
		DirecaoEnum direcao2 = DirecaoEnum.LESTE;
		Coordenadas coordenadas2 = new Coordenadas(3, 3, direcao2, 5, 5);	
		rover.setCoordenadas(coordenadas2);
		rover.comandos("MMRMMRMRRM");
		coordenadas2 = rover.getCoordenadas();
		System.out.println(coordenadas2.getPontoX() + " " + coordenadas2.getPontoY() + " " + coordenadas2.getDirecao().getChave());
	}

}
