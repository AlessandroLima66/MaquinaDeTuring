package br.com.maquinadeturing.model;

public class Cabecote {
	private String estadoInicial;
	private String estadoAtual;
	private FitaDeEntrada fitaDeEntrada;
	private FuncaoDeTransicao funcaoDeTransicao;

	public Cabecote(FitaDeEntrada fitaDeEntrada, FuncaoDeTransicao funcaoDeTransicao) {
		this.fitaDeEntrada = fitaDeEntrada;
		this.funcaoDeTransicao = funcaoDeTransicao;
		estadoInicial = "S0"; // O estado inicial sempre será o S0
		estadoAtual = estadoInicial;// Inicialmente o estado atual será o estado inicial
	}

	public boolean buscaFuncao() {

		// Montando um objeto FuncaoDeTransicao com os valores
		// estado atual da maquina
		// fita de entrada na posição atual da fita
		FuncaoDeTransicao fun = new FuncaoDeTransicao();
		fun.setEstadoAtual(estadoAtual);
		fun.setSimboloEncontrado(fitaDeEntrada.getPosicaoFitadeEntrada(fitaDeEntrada.getIndexFita()));

		if (fitaDeEntrada.getIndexFita() != 0) {
			if (funcaoDeTransicao.getFuncoesDeTransicao().contains(fun)) {
	
				int indexFunsao = funcaoDeTransicao.getFuncoesDeTransicao().indexOf(fun);
				
				// Pegando a funsão de transição encontrada
				fun = funcaoDeTransicao.getFuncoesDeTransicao().get(indexFunsao);
	
				System.out.println(mostraAlteracoes(fun));
				
				// Alterando a fita de entrada de acordo com a funsão de transição
				fitaDeEntrada.setPosicaoFitaDeEntrada(fun.getOperacaoDeImpressao());
				
				// Alterando o index da fita de acordo com a funsão de transição
				fitaDeEntrada.setIndexFita(fun.getMovimentoDaFita().getDirecao());
	
				// Aletrando o estado atual de acordo com a funsão de transição
				estadoAtual = fun.getEstadoFuturo();
	
				// Verificar se o valor da fita é o inicial (index = 0)
				// Se for encerrar a while, se não for continua
				//boolean retorno = isComecoDaFita();
	
				return true;
			} else {
				System.out.println(mostraAlteracoes(fun));
				System.out.println("\n- Não existe uma função de transição para este valor");
				System.out.println("\n- A Fita Não Foi Aceita");
				System.exit(0);
				return false;
			}
			
		}else {
			String x = "\nPosição: [" + fitaDeEntrada.getIndexFita() +"]"
					+ "\nvalor da Fita: [" + fun.getSimboloEncontrado() +  "] --> [<]"
					+ "\n" + fitaDeEntrada.getFitaDeEntrada()
					+ "\n\n------ A Fita Foi Aceita!!! ------";
			System.out.println(x);
			return false;
		}

	}

	public String mostraAlteracoes(FuncaoDeTransicao funcao) {
		return "\nPosição: [" + (fitaDeEntrada.getIndexFita()) +"]" 
			 + "\nvalor da Fita: [" + funcao.getSimboloEncontrado() +  "] --> [" + funcao.getOperacaoDeImpressao() +"]"	
		 	 + "\n" + fitaDeEntrada.getFitaDeEntrada()
		 	 + "\nMover Cabeçote: " + funcao.getMovimentoDaFita()
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
