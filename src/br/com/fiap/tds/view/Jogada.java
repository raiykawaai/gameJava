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
	   
	   System.out.println("meio de locomoção: ");
	   b.locomoverPersonagem();
	   
	   
	   //chama dados Jogo
	   String dadoJogo = w.exibirDados ();
	   System.out.println(dadoJogo);
	   
	   System.out.println("meio de locomoção: ");
	   w.locomoverPersonagem();
	   
	   
	   String condicao = JOptionPane.showInputDialog("Você precisa recarregar sua arma! Escolha a condição mais favorável:\n 1 para - Achou Esconderijo\n 2 para - Tem colete de vida extra\n 3 para - Nenhuma das anteriores\n Sua resposta é: ");
	   
	   
	   JOptionPane.showMessageDialog(null, w.recarregaArma (condicao));
		
		//Método
		String decisao = JOptionPane.showInputDialog("Digite sua decisão:\nVocê acabou de matar um inimigo e escuta outro se aproximando. O que você faria?\n1 para Recarregar arma\n2 para Repor colete de vida extra\n3 para Fugir");
		
		
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
			System.out.println("decisão inválida");
		
		}
	
	}
}

