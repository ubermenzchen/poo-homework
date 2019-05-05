/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author phantom
 */
public class QuestaoMultiplicacao implements IQuestao {
    
    @Override
    public void criarPergunta() {
        int operando1 = ThreadLocalRandom.current().nextInt(0, 10);
        int operando2 = ThreadLocalRandom.current().nextInt(0, 10);
        double respostaUsuario = Double.parseDouble(JOptionPane.showInputDialog(String.format("Qual a resposta de %d * %d?", operando1, operando2)));
        double respostaCerta = operando1 * operando2;
        if (respostaCerta == respostaUsuario) {
            JOptionPane.showMessageDialog(null, "You're god damn right!");
        } else {
            JOptionPane.showMessageDialog(null, "EERROOOOUUUU!");
        }
    }
}
