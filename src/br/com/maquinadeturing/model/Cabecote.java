package br.com.maquinadeturing.model;

public class Cabecote {
	private String estadoInicial;
	private String estadoAtual;
	private FitaDeEntrada fitaDeEntrada;
	private FuncaoDeTransicao funcaoDeTransicao;

	public Cabecote(FitaDeEntrada fitaDeEntrada, FuncaoDeTransicao funcaoDeTransicao) {
		this.fitaDeEntrada = fitaDeEntrada;
		this.funcaoDeTransicao = funcaoDeTransicao;
		estadoInicial = "S0"; // O estado inicial sempre ser� o S0
		estadoAtual = estadoInicial;// Inicialmente o estado atual ser� o estado inicial
	}

	public boolean buscaFuncao() {

		// Montando um objeto FuncaoDeTransicao com os valores
		// estado atual da maquina
		// fita de entrada na posi��o atual da fita
		FuncaoDeTransicao fun = new FuncaoDeTransicao();
		fun.setEstadoAtual(estadoAtual);
		fun.setSimboloEncontrado(fitaDeEntrada.getPosicaoFitadeEntrada(fitaDeEntrada.getIndexFita()));

		if (fitaDeEntrada.getIndexFita() != 0) {
			if (funcaoDeTransicao.getFuncoesDeTransicao().contains(fun)) {
	
				int indexFunsao = funcaoDeTransicao.getFuncoesDeTransicao().indexOf(fun);
				
				// Pegando a funs�o de transi��o encontrada
				fun = funcaoDeTransicao.getFuncoesDeTransicao().get(indexFunsao);
	
				System.out.println(mostraAlteracoes(fun));
				
				// Alterando a fita de entrada de acordo com a funs�o de transi��o
				fitaDeEntrada.setPosicaoFitaDeEntrada(fun.getOperacaoDeImpressao());
				
				// Alterando o index da fita de acordo com a funs�o de transi��o
				fitaDeEntrada.setIndexFita(fun.getMovimentoDaFita().getDirecao());
	
				// Aletrando o estado atual de acordo com a funs�o de transi��o
				estadoAtual = fun.getEstadoFuturo();
	
				// Verificar se o valor da fita � o inicial (index = 0)
				// Se for encerrar a while, se n�o for continua
				//boolean retorno = isComecoDaFita();
	
				return true;
			} else {
				System.out.println(mostraAlteracoes(fun));
				System.out.println("\n- N�o existe uma fun��o de transi��o para este valor");
				System.out.println("\n- A Fita N�o Foi Aceita");
				System.exit(0);
				return false;
			}
			
		}else {
			String x = "\nPosi��o: [" + fitaDeEntrada.getIndexFita() +"]"
					+ "\nvalor da Fita: [" + fun.getSimboloEncontrado() +  "] --> [<]"
					+ "\n" + fitaDeEntrada.getFitaDeEntrada()
					+ "\n\n------ A Fita Foi Aceita!!! ------";
			System.out.println(x);
			return false;
		}

	}

	public String mostraAlteracoes(FuncaoDeTransicao funcao) {
		return "\nPosi��o: [" + (fitaDeEntrada.getIndexFita()) +"]" 
			 + "\nvalor da Fita: [" + funcao.getSimboloEncontrado() +  "] --> [" + funcao.getOperacaoDeImpressao() +"]"	
		 	 + "\n" + fitaDeEntrada.getFitaDeEntrada()
		 	 + "\nMover Cabe�ote: " + funcao.getMovimentoDaFita()
		 	 + "\nEstado: [" + funcao.getEstadoAtual() + "] --> [" + funcao.getEstadoFuturo() +"]"
		 	 ;
	}
	
	public boolean isComecoDaFita() {
		if(fitaDeEntrada.getIndexFita() < 0) {
			return false;
		}
		return true;
	}

}
