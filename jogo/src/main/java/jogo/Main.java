/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author phantom
 */

public class Main {
    public static void main(String[] args) {
        int quantidade = -1;
        
        while (quantidade < 0) {
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas perguntas deseja responder?"));
        }
        
        
        
        for(int i = 0; i < quantidade; i++) {
            getRandomClass().criarPergunta();
        }
    }
    
    public static IQuestao getRandomClass() {
        int n = ThreadLocalRandom.current().nextInt(0, 3);
        switch(n) {
        case 0:
            return new QuestaoAdicao();
        case 1:
            return new QuestaoSubtracao();
        case 2:
            return new QuestaoMultiplicacao();
        }
        return new QuestaoAdicao();
    }
}
