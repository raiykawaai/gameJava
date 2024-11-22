package br.com.fiap.tds.bean;

public class Fps extends Jogo {
	
	protected String acessorio;

	public Fps() {
		super();
		
	}

	public Fps(String local, String instrumentoBatalha, int quantidadeJogador, String acessorio) {
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
