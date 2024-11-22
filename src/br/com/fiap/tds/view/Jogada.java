package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.BattleRoyale;
import br.com.fiap.tds.bean.Warzone;

public class Jogada {
	
	public static void main(String[] args) {
	
	BattleRoyale b = new BattleRoyale();
	Warzone w = new Warzone();
	
	
		
	
	   
	   //chama dados Categoria
	   String dadoCategoria = b.exibirDados ();
	   System.out.println(dadoCategoria);
	   
	   System.out.println("meio de locomo��o: ");
	   b.locomoverPersonagem();
	   
	   
	   //chama dados Jogo
	   String dadoJogo = w.exibirDados ();
	   System.out.println(dadoJogo);
	   
	   System.out.println("meio de locomo��o: ");
	   w.locomoverPersonagem();
	   
	   
	   String condicao = JOptionPane.showInputDialog("Voc� precisa recarregar sua arma! Escolha a condi��o mais favor�vel:\n 1 para - Achou Esconderijo\n 2 para - Tem colete de vida extra\n 3 para - Nenhuma das anteriores\n Sua resposta �: ");
	   
	   
	   JOptionPane.showMessageDialog(null, w.recarregaArma (condicao));
		
		//M�todo
		String decisao = JOptionPane.showInputDialog("Digite sua decis�o:\nVoc� acabou de matar um inimigo e escuta outro se aproximando. O que voc� faria?\n1 para Recarregar arma\n2 para Repor colete de vida extra\n3 para Fugir");
		
		
		switch(decisao) {
		case "1":
			JOptionPane.showMessageDialog(null, "Boa escolha, Suas chances de sair vivo: 60%");
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "Escolha arriscada, Suas chances de sair vivo: 30%");
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "Escolha muito arriscada, Suas chances de sair vivo: 10%");
			break;
		default:
			System.out.println("decis�o inv�lida");
		
		}
	
	}
}

