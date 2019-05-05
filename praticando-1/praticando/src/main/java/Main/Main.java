package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author phantom
 */
public class Main {
    public static void main(String[] args) {
        String tipo = "";
        while(!tipo.equals("corrente") && !tipo.equals("poupança")) {
           tipo = JOptionPane.showInputDialog("Digite \"corrente\" para criar uma conta corrente ou \"poupança\" para criar uma conta poupança.");
        }

        String limiteInicial;
        String numConta = JOptionPane.showInputDialog("Digite o numero da conta");        
        String numAgencia  = JOptionPane.showInputDialog("Digite a agência");
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
        String saldoInicial = JOptionPane.showInputDialog("Digite saldo"); 
        if(tipo.equals("corrente")) {
            limiteInicial = JOptionPane.showInputDialog("Digite o limite");
            Conta contaCliente = new  ContaCorrente(numConta,nomeCliente, saldoInicial,numAgencia, limiteInicial); 
            contaCliente.imprimirSaldo();
            PersistenciaArquivo<Conta> salvar = new PersistenciaArquivo();
            salvar.salvarConta(contaCliente, "/home/phantom/ContaObject"); 
        } else {
            Conta contaCliente = new  ContaPoupanca(numConta,nomeCliente, saldoInicial,numAgencia); 
            contaCliente.imprimirSaldo();
            PersistenciaArquivo<Conta> salvar = new PersistenciaArquivo();
            salvar.salvarConta(contaCliente, "/home/phantom/ContaObject"); 
        }
                               
           
    }
}
