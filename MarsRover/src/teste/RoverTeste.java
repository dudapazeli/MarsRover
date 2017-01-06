package teste;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import marsRover.Coordenadas;
import marsRover.DirecaoEnum;
import marsRover.Rover;

import static org.assertj.core.api.Assertions.*;

public class RoverTeste {
	
	
	private Coordenadas coordenadas;
	DirecaoEnum direcao = DirecaoEnum.NORTE;
	private int pontoX;
	private int pontoY;
	private int maxPontoX;
	private int maxPontoY;
	private Rover rover;
	
	@Before
	public void beforeCoordenadasTeste(){
		pontoX =3;
		pontoY = 2;
		maxPontoX = 6;
		maxPontoY = 5;
		coordenadas = new Coordenadas(pontoX, pontoY, direcao, maxPontoX, maxPontoY);
		rover.setCoordenadas(coordenadas);
	}
	
	@Test
	public void testaInstanciaRover(){
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	
	@Test
	public void testaComandoRoverRotacionarEsquerda(){
		rover.moverRover('L');
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	
	@Test
	public void testaComandoRoverRotacionarDireita(){
		rover.moverRover('R');
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	
	@Test
	public void testaComandoRoverMover(){
		rover.moverRover('M');
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	
	@Test
	public void testaComandoRoverComandoInexistente(){
		rover.moverRover('X');
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	
	@Test
	public void testaComandoRoverReceberMultiplosComandos(){
		rover.comandos("MMRMMRMRRM");
		assertThat(rover.getCoordenadas()).isEqualToComparingFieldByField(coordenadas);
	}
	

}
