package teste;
import org.junit.Before;
import org.junit.Test;

import marsRover.Coordenadas;
import marsRover.DirecaoEnum;

import static org.assertj.core.api.Assertions.*;

public class CoordenadasTeste {
	
	private Coordenadas coordenadas;
	DirecaoEnum direcao = DirecaoEnum.NORTE;
	private int pontoX;
	private int pontoY;
	private int maxPontoX;
	private int maxPontoY;
	
	
	@Before
	public void beforeCoordenadasTeste(){
		pontoX =3;
		pontoY = 2;
		maxPontoX = 6;
		maxPontoY = 5;
		coordenadas = new Coordenadas(pontoX, pontoY, direcao, maxPontoX, maxPontoY);
	}
	
	@Test
	public void testaInstanciaCoordenada(){
		assertThat(coordenadas.getDirecao()).isEqualTo(direcao);
		assertThat(coordenadas.getPontoX()).isEqualTo(pontoX);
		assertThat(coordenadas.getPontoY()).isEqualTo(pontoY);
		assertThat(coordenadas.getPontoXMax()).isEqualTo(maxPontoX);
		assertThat(coordenadas.getPontoYMax()).isEqualTo(maxPontoY);	
	}
	
	@Test
	public void testaMoverRoverXFrente(){
		coordenadas.setDirecao(DirecaoEnum.LESTE);
		int pontoEsperado = pontoX + 1;
		coordenadas.mover();
		assertThat(coordenadas.getPontoX()).isEqualTo(pontoEsperado);	
	}

	
	@Test
	public void testaMoverRoverXTras(){
		coordenadas.setDirecao(DirecaoEnum.OESTE);
		int pontoEsperado = pontoX -1;
		coordenadas.mover();
		assertThat(coordenadas.getPontoX()).isEqualTo(pontoEsperado);	
		
	}
	
	@Test
	public void testaMoverRoverYFrente(){
		coordenadas.setDirecao(DirecaoEnum.NORTE);
		int pontoEsperado = pontoY +1;
		coordenadas.mover();
		assertThat(coordenadas.getPontoY()).isEqualTo(pontoEsperado);	
	}
	
	@Test
	public void testaMoverRoverYTras(){
		coordenadas.setDirecao(DirecaoEnum.SUL);
		int pontoEsperado = pontoY -1;
		coordenadas.mover();
		assertThat(coordenadas.getPontoY()).isEqualTo(pontoEsperado);	
	}
	
	
	@Test
	public void testaLimiteMaxGridY(){
		coordenadas.setDirecao(DirecaoEnum.NORTE);
		int pontoEsperado = maxPontoY;
		coordenadas.setPontoY(maxPontoY);
		coordenadas.mover();
		assertThat(coordenadas.getPontoY()).isEqualTo(pontoEsperado);	
	}
	
	@Test
	public void testaLimiteMaxGridX(){
		coordenadas.setDirecao(DirecaoEnum.LESTE);
		int pontoEsperado = maxPontoX;
		coordenadas.setPontoX(maxPontoX);
		coordenadas.mover();
		assertThat(coordenadas.getPontoX()).isEqualTo(pontoEsperado);	
	}
	
	
	@Test
	public void testaLimiteMinGridY(){
		coordenadas.setDirecao(DirecaoEnum.SUL);
		int pontoEsperado = 0;
		coordenadas.setPontoY(0);
		coordenadas.mover();
		assertThat(coordenadas.getPontoY()).isEqualTo(pontoEsperado);	
	}
	
	@Test
	public void testaLimiteMinGridX(){
		coordenadas.setDirecao(DirecaoEnum.OESTE);
		int pontoEsperado = 0;
		coordenadas.setPontoX(0);
		coordenadas.mover();
		assertThat(coordenadas.getPontoX()).isEqualTo(pontoEsperado);	
	}
	
	
	

}

