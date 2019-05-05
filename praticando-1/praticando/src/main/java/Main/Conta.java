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
import java.io.Serializable;

public abstract class Conta implements Serializable {
    private int numero;
    private String nomeCliente;
    private double saldo=0;
    private int agencia;

    public Conta(int numero, String nomeCliente, double saldo, int agencia){
       this.numero = numero;
       this.nomeCliente = nomeCliente;
       this.saldo = saldo;
       this.agencia = agencia;      


    }

    public Conta(String numero, String nomeCliente, String saldo, String agencia){
       this.numero = Integer.parseInt(numero);
       this.nomeCliente = nomeCliente;
       this.saldo = Double.parseDouble(saldo);
       this.agencia = Integer.parseInt(agencia);        
    }

    public int getNumero() {
       return numero;
    }

    public void setNumero(int numero) {
       this.numero = numero;
    }

    public String getNomeCliente() {
       return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
       this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
       return saldo;
    }

    public void setSaldo(double saldo) {
       this.saldo = saldo;
    }

    public int getAgencia() {
       return agencia;
    }

    public void setAgencia(int agencia) {
       this.agencia = agencia;
    }

    public boolean depositar(double valor){        
       return true;        
    }    
    public boolean sacar(double valor){        
       return true;        
    }    
    public void imprimirSaldo(){        
        System.out.println("Prezado, "+ nomeCliente);
     System.out.println("Seu saldo atual é: R$ "+ saldo);          
    } 
}
