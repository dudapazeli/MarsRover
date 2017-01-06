package teste;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import marsRover.Coordenadas;
import marsRover.DirecaoEnum;
import marsRover.Rover;

public class RoverTeste {
	
	
	private Coordenadas coordenadas;
	DirecaoEnum direcao = DirecaoEnum.NORTE;
	private int pontoX;
	private int pontoY;
	private int maxPontoX;
	private int maxPontoY;
	private Rover rover;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void beforeCoordenadasTeste(){
		pontoX =3;
		pontoY = 2;
		maxPontoX = 6;
		maxPontoY = 5;
		coordenadas = new Coordenadas(pontoX, pontoY, direcao, maxPontoX, maxPontoY);
		rover = new Rover();
		rover.setCoordenadas(coordenadas);
		
		 System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testaInstanciaRover(){
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	
	@Test
	public void testaComandoRoverRotacionarEsquerda(){
		DirecaoEnum direcaoEsperada = DirecaoEnum.OESTE;
		rover.moverRover('L');
		assertThat(rover.getCoordenadas().getDirecao()).isEqualTo(direcaoEsperada);
	}
	
	@Test
	public void testaComandoRoverRotacionarDireita(){
		DirecaoEnum direcaoEsperada = DirecaoEnum.LESTE;
		rover.moverRover('R');
		assertThat(rover.getCoordenadas().getDirecao()).isEqualTo(direcaoEsperada);
	}
	
	@Test
	public void testaComandoRoverMover(){
		int pontoYEsperado = pontoY + 1;
		rover.moverRover('M');
		assertThat(rover.getCoordenadas().getPontoY()).isEqualTo(pontoYEsperado);
	}
	
	
	@Test
	public void testaComandoRoverComandoInexistente(){
		rover.moverRover('A');
		System.out.println(outContent.toString());
		assertThat("Comando nao capturado pelo Rover".equals(outContent.toString()));
	}
	
	@Test
	public void testaComandoRoverReceberMultiplosComandos(){
		int pontoXEsperado = 5;
		int pontoYEsperado = 4;
		DirecaoEnum direcao = DirecaoEnum.NORTE;
		rover.comandos("MMRMMRMRRM");
		assertThat(rover.getCoordenadas().getPontoX()).isEqualTo(pontoXEsperado);
		assertThat(rover.getCoordenadas().getPontoY()).isEqualTo(pontoYEsperado);
		assertThat(rover.getCoordenadas().getDirecao()).isEqualTo(direcao);
	}
	

}
