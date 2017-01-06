package marsRover;

public class Main {

	public static void main(String[] args) {
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
		
		
		DirecaoEnum direcao3 = DirecaoEnum.NORTE;
		Coordenadas coordenadas3 = new Coordenadas(3, 2, direcao3, 6, 5);	
		rover.setCoordenadas(coordenadas3);
		rover.comandos("MMRMMRMRRM");
		coordenadas3 = rover.getCoordenadas();
		System.out.println(coordenadas3.getPontoX() + " " + coordenadas3.getPontoY() + " " + coordenadas3.getDirecao().getChave());
	}

}
