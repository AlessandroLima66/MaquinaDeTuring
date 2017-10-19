package br.com.maquinadeturing.model;

import java.util.List;

public class Cabecote {
	private List<FuncaoDeTransicao> funcaoDeTransicao;
	private List<String> fitaDeEntrada;
	private int indexFita;
	private String valorDaFita;
	private String estadoInicial;
	private String estadoAtual;

	public Cabecote(List<String> fitaDeEntrada, List<FuncaoDeTransicao> funsaoDeTransicao) {
		this.fitaDeEntrada = fitaDeEntrada;
		this.funcaoDeTransicao = funsaoDeTransicao;
		
		indexFita = 1;//Preciso verificar a fita a após o caracter que indica o inicio
		estadoInicial = "S0"; //O estado inicial sempre será o S0
		estadoAtual = estadoInicial;//Inicialmente o estado atual será o estado inicial
	}

	public void buscaFuncao() {
		
		//Montando um objeto FuncaoDeTransicao com os valores
		//estado atual da maquina
		//fita de entrada na posição atual da fita
		FuncaoDeTransicao fun = new FuncaoDeTransicao();
		fun.setEstadoAtual(estadoAtual);
		fun.setSimboloEncontrado(fitaDeEntrada.get(indexFita));

		if (funcaoDeTransicao.contains(fun)) {
			System.out.println("Existe");
			int indexFuncao = funcaoDeTransicao.indexOf(fun);
			System.out.println(fitaDeEntrada);
			estadoAtual = funcaoDeTransicao.get(indexFuncao).getEstadoFuturo();
			escreverNaFita();
			indexFita += funcaoDeTransicao.get(indexFuncao).getMovimentoDaFita().getDirecao();
			System.out.println(fitaDeEntrada);
			
			System.out.println(indexFita);
		} else {
			System.out.println("Não Existe");
		}
	}

	public void escreverNaFita() {
		fitaDeEntrada.set(indexFita, "X");
	}

	public void moverFita() {

	}
	

}
