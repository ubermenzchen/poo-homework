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
public class ContaCorrente extends Conta{
    private double limite = 0;
    
    public ContaCorrente(String numero, String nomeCliente, String saldo, String agencia, String limite) {
        super(numero, nomeCliente, saldo, agencia);
        this.limite = Double.parseDouble(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
