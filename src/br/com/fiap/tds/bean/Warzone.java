package br.com.fiap.tds.bean;

public class Warzone extends BattleRoyale {

	public Warzone() {
		super();
		
	}

		
		
	public Warzone(String local, String instrumentoBatalha, int quantidadeJogador, String acessorio, String municao) {
		super(local, instrumentoBatalha, quantidadeJogador, acessorio, municao);
		
	}


	@Override
	public void locomoverPersonagem() {
		System.out.println("correr");
	}
	
	public String toString() {
		return super.toString() + municao; 
	}
	
	public String recarregaArma() {
		return ("Muniçao Cheia");
	}
	
    public String recarregaArma(String municao) {
		if (municao.equals("1")){
			return("Municão Cheia");
		}else if (municao.equals("2")) {
			return("Municão Cheia");
		}else {
			return("Pouca Munição");
		}
	}

	public String exibirDados() {
		return("jogo: Warzone\nlocal do jogo: Verdansk " + "\ninstrumento de batalha: Fuzil de Assalto " + "\nquantidade de jogadores: 4 " + "\nacessório: granada ");
		} 
	
}
