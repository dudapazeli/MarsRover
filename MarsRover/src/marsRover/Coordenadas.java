package marsRover;

public class Coordenadas {

	private int pontoX;
	private int pontoY;
	private int pontoXMax;
	private int pontoYMax;
	
	private DirecaoEnum direcao;
	public int getPontoX() {
		return pontoX;
	}
	public void setPontoX(int pontoX) {
		this.pontoX = pontoX;
	}
	public int getPontoY() {
		return pontoY;
	}
	public void setPontoY(int pontoY) {
		this.pontoY = pontoY;
	}
	public DirecaoEnum getDirecao() {
		return direcao;
	}
	public void setDirecao(DirecaoEnum direcao) {
		this.direcao = direcao;
	}
	
	
	public int getPontoXMax() {
		return pontoXMax;
	}
	public void setPontoXMax(int pontoXMax) {
		this.pontoXMax = pontoXMax;
	}
	public int getPontoYMax() {
		return pontoYMax;
	}
	public void setPontoYMax(int pontoYMax) {
		this.pontoYMax = pontoYMax;
	}

	public Coordenadas(int pontoX, int pontoY, DirecaoEnum direcao, int pontoXMax, int pontoYMax) {
		this.pontoX = pontoX;
		this.pontoY = pontoY;
		this.direcao = direcao;
		this.pontoXMax = pontoXMax;
		this.pontoYMax = pontoYMax;
		
	}
	/** Mover Rover pelo grid
	 * sem deixar que ultrapasse o limite do grid 
	 */
	public void mover(){
		DirecaoEnum direcaoAtual = getDirecao();
		switch(direcaoAtual){
		case NORTE:
			if(getPontoY() < getPontoYMax()){
				setPontoY(pontoY + 1);
			}
			break;
		case SUL:
			if(getPontoY() > 0){
				setPontoY(pontoY - 1);
			}
			break;
		case LESTE:
			if(getPontoX() < getPontoXMax()){
				setPontoX(pontoX + 1);
			}
			
			break;
		case OESTE:
			if(getPontoX () > 0){
				setPontoX(pontoX - 1);
			}
			break;
			
		}
	}
	
	/** Rotacionar Rover 
	 * para uma dos quatro pontos cardeais existentes
	 */
	public void rotacionar(int direcaoValor){
		int direcaoRotacionar = (4 + getDirecao().getValor() + direcaoValor) % 4;
		direcao = DirecaoEnum.values()[direcaoRotacionar];
	}
	
	
}
