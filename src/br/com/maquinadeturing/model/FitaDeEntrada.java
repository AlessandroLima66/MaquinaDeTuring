package br.com.maquinadeturing.model;

import java.util.ArrayList;
import java.util.List;

public class FitaDeEntrada {
	private List<String> fitadeEntrada= new ArrayList<>();
	private int indexFita = 1;
	
	public FitaDeEntrada() {
	
	}

	
	public List<String> getFitaDeEntrada(){
		return this.fitadeEntrada;
	}

	public void setFitadeEntrada(String elementoFita) {
		this.fitadeEntrada.add(elementoFita);
	}
	
	public String getPosicaoFitadeEntrada(int index) {
		return this.fitadeEntrada.get(index);
	}
	
	public void setPosicaoFitaDeEntrada(String elementoFita) {
		this.fitadeEntrada.set(indexFita, elementoFita);
	}


	public int getIndexFita() {
		return indexFita;
	}

	public void setIndexFita(int indexFita) {
		this.indexFita += indexFita;
	}
	
	

}
