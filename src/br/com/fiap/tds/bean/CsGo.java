package br.com.fiap.tds.bean;

public class CsGo extends Fps{

	public CsGo() {
		super();
		
	}

	public CsGo(String local, String instrumentoBatalha, int quantidadeJogador, String acessorio) {
		super(local, instrumentoBatalha, quantidadeJogador, acessorio);
		
	}
	
	@Override
	public void locomoverPersonagem() {
		System.out.println("rastejar");
	}
	

	public String exibirDados() {
		return("Jogo: CsGo\nlocal do jogo: Austria " + "\ninstrumento de batalha: Rifle de Precisão " + "\nquantidade de jogadores: 5 " + "\nacessório: luva terrorista");
		} 
	
	
}
