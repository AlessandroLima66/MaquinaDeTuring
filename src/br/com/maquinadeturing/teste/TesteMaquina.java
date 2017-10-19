package br.com.maquinadeturing.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.maquinadeturing.model.Cabecote;
import br.com.maquinadeturing.model.FitaDeEntrada;
import br.com.maquinadeturing.model.FuncaoDeTransicao;
import br.com.maquinadeturing.model.MovimentoDaFita;

public class TesteMaquina {

	public static void main(String[] args) {
		
		//Iniciando a Fita de Entrada
		List<String> fitaDeEntrada = new FitaDeEntrada().getFitadeEntrada();
		fitaDeEntrada.add("<");
		fitaDeEntrada.add("0");
		fitaDeEntrada.add("9");
		fitaDeEntrada.add("5");
		fitaDeEntrada.add("1");
		fitaDeEntrada.add("7");
		fitaDeEntrada.add("4");
		fitaDeEntrada.add("5");
		fitaDeEntrada.add("0");
		fitaDeEntrada.add("9");
		fitaDeEntrada.add("9");
		fitaDeEntrada.add("B");
		
		//Iniciando a Funsão de Transição
		List<FuncaoDeTransicao> funsaoDeTransicao = new ArrayList();
		funsaoDeTransicao.add(new FuncaoDeTransicao("S0", "0", "X", "S1", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S1", "1", "X", "S3", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S1", "9", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S3", "5", "X", "S4", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "1", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "2", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "3", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "4", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "5", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "6", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "7", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "8", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S4", "9", "X", "S5", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "1", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "2", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "3", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "4", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "5", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "6", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "7", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "8", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S5", "9", "X", "S6", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S6", "9", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "0", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "1", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "2", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "3", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "4", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "5", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "6", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "7", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "8", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "9", "X", "S2", MovimentoDaFita.DIREITA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "B", "X", "S2", MovimentoDaFita.ESQUERDA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "X", "X", "S2", MovimentoDaFita.ESQUERDA));
		funsaoDeTransicao.add(new FuncaoDeTransicao("S2", "<", "", "S2", MovimentoDaFita.NADA));
		
		
		Cabecote cabecote = new Cabecote(fitaDeEntrada, funsaoDeTransicao);
		
		cabecote.buscaFuncao();
	}

}
