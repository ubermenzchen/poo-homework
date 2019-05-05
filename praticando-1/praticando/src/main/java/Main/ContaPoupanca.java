/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author phantom
 */
public class ContaPoupanca extends Conta {

    private double rendimento = 0;
    public ContaPoupanca(String numero, String nomeCliente, String saldo, String agencia) {
        super(numero, nomeCliente, saldo, agencia);
    }
    
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
