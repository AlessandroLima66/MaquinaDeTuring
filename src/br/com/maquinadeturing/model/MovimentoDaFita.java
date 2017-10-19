package br.com.maquinadeturing.model;

public enum MovimentoDaFita {
	DIREITA(1), ESQUERDA(-1), NADA(0);
	
	private int direcao;

	MovimentoDaFita(int direcao) {
		this.direcao = direcao;
	}
	
	public int getDirecao() {
		return direcao;
	}
}
