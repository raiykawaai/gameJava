package br.com.fiap.tds.bean;

public class LeagueofLegends extends Moba{

	public LeagueofLegends() {
		super();
		
	}

	public LeagueofLegends(String local, String instrumentoBatalha, int quantidadeJogador, String acessorio) {
		super(local, instrumentoBatalha, quantidadeJogador, acessorio);
		
	}
	
	@Override
	public void locomoverPersonagem() {
		System.out.println("levitar");
	}

	public String exibirDados() {
		return("local do jogo: " + local + "\ninstrumento de batalha: " + instrumentoBatalha + "\nquantidade de jogadores: " + quantidadeJogador + "\nacessório: " + acessorio);
		} 
	
}
