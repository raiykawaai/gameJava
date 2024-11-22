package br.com.fiap.tds.bean;

public class Jogo {
	
	//Atributos
	protected String local, instrumentoBatalha;
	protected int quantidadeJogador;
	
	//Método
	public void locomoverPersonagem() {
	}

	
	//Construtor
	public Jogo() {}
	
	public Jogo(String local, String instrumentoBatalha, int quantidadeJogador) {
		this.local = local;
		this.instrumentoBatalha = instrumentoBatalha;
		this.quantidadeJogador = quantidadeJogador;
	}

	//Get & Set
	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getInstrumentoBatalha() {
		return instrumentoBatalha;
	}


	public void setInstrumentoBatalha(String instrumentoBatalha) {
		this.instrumentoBatalha = instrumentoBatalha;
	}


	public int getQuantidadeJogador() {
		return quantidadeJogador;
	}


	public void setQuantidadeJogador(int quantidadeJogador) {
		this.quantidadeJogador = quantidadeJogador;
	}
	
	

}
