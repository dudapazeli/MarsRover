package com.zup.marsrover;

public class Coordenadas {

	private int pontoX;
	private int pontoY;
	
	private Direcao direcao;
	
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
	public Direcao getDirecao() {
		return direcao;
	}
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
	public Coordenadas(int pontoX, int pontoY, Direcao direcao) {
		super();
		this.pontoX = pontoX;
		this.pontoY = pontoY;
		this.direcao = direcao;
	}
	
	public void mover(){
		Direcao direcaoAtual = getDirecao();
		switch(direcaoAtual){
		case NORTE:
			setPontoY(pontoY + 1);
			break;
		case SUL:
			if(pontoY > 0){
				setPontoY(pontoY - 1);
			}
			break;
		case LESTE:
			setPontoX(pontoX + 1);
			break;
		case OESTE:
			if(pontoX > 0){
				setPontoX(pontoX - 1);
			}
			break;
			
		}
	}
	
	public void rotacionar(int direcaoValor){
		Direcao direcaoAtual = getDirecao();
		int direcaoRotacionar = (4 + direcaoAtual.getValor() + direcaoValor) % 4;
	}
	
	
}
