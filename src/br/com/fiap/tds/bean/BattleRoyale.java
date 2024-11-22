package br.com.fiap.tds.bean;

public class BattleRoyale extends Jogo {
	
	//Atributo
	protected String acessorio, municao;
	

	//Construtor
	public BattleRoyale() {
		super();
		
	}


	public BattleRoyale(String local, String instrumentoBatalha, int quantidadeJogador, String acessorio,
			String municao) {
		super(local, instrumentoBatalha, quantidadeJogador);
		this.acessorio = acessorio;
		this.municao = municao;
	}





	@Override
	//Método
	public void locomoverPersonagem() {
		System.out.println("andar");
	}
	
	//Método
	public String toString() {
		return super.toString() + municao; 
	}
	

	//Get&Set
	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	
	
	public String getMunicao() {
		return municao;
	}


	public void setMunicao(String municao) {
		this.municao = municao;
	}


	public String exibirDados() {
		return("categoria: Battle Royale\nlocal do jogo: mapa " + "\ninstrumento de batalha: armamento " + "\nquantidade de jogadores por partida: 150 " + "\nacessório: utilitários ");
	} 
}

