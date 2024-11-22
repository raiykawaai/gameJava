package br.com.fiap.tds.bean;

public class Moba extends Jogo{
	
	protected String acessorio;

	public Moba() {
		super();
		
	}

	public Moba(String local, String instrumentoBatalha, int quantidadeJogador, String acessorio) {
		super(local, instrumentoBatalha, quantidadeJogador);
		
	}
	
	@Override
	public void locomoverPersonagem() {
		System.out.println("andar");
	}

	//Get&Set
	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	
	
}
