package br.com.maquinadeturing.model;

public class FuncaoDeTransicao {
	private String estadoAtual;
	private String simboloEncontrado;
	private String operacaoDeImpressao;
	private String estadoFuturo;
	private MovimentoDaFita movimentoDaFita;

	public FuncaoDeTransicao() {

	}

	public FuncaoDeTransicao(String estadoAtual, String simboloEncontrado, String operacaoDeImpressao,
			String estadoFuturo, MovimentoDaFita movimentoDaFita) {

		setEstadoAtual(estadoAtual);
		setSimboloEncontrado(simboloEncontrado);
		setOperacaoDeImpressao(operacaoDeImpressao);
		setEstadoFuturo(estadoFuturo);
		setMovimentoDaFita(movimentoDaFita);
	}

	public String getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(String estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public String getSimboloEncontrado() {
		return simboloEncontrado;
	}

	public void setSimboloEncontrado(String simboloEncontrado) {
		this.simboloEncontrado = simboloEncontrado;
	}

	public String getOperacaoDeImpressao() {
		return operacaoDeImpressao;
	}

	public void setOperacaoDeImpressao(String operacaoDeImpressao) {
		this.operacaoDeImpressao = operacaoDeImpressao;
	}

	public String getEstadoFuturo() {
		return estadoFuturo;
	}

	public void setEstadoFuturo(String estadoFuturo) {
		this.estadoFuturo = estadoFuturo;
	}

	public MovimentoDaFita getMovimentoDaFita() {
		return movimentoDaFita;
	}

	public void setMovimentoDaFita(MovimentoDaFita movimentoDaFita) {
		this.movimentoDaFita = movimentoDaFita;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadoAtual == null) ? 0 : estadoAtual.hashCode());
		result = prime * result + ((simboloEncontrado == null) ? 0 : simboloEncontrado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncaoDeTransicao other = (FuncaoDeTransicao) obj;
		if (estadoAtual == null) {
			if (other.estadoAtual != null)
				return false;
		} else if (!estadoAtual.equals(other.estadoAtual))
			return false;
		if (simboloEncontrado == null) {
			if (other.simboloEncontrado != null)
				return false;
		} else if (!simboloEncontrado.equals(other.simboloEncontrado))
			return false;
		return true;
	}

}
