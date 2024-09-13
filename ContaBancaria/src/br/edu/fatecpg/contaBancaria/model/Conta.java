package br.edu.fatecpg.contaBancaria.model;

public class Conta {

    private String titular;
    private double saldo;

   
    public Conta(String titu, double sld) {
        this.titular = titu;
        this.saldo = sld;
    }

   
    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor <= 0) {
            System.out.println("O valor para saque deve ser maior que R$0,00.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

   
    public void deposita(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor deve ser maior que R$0,00.");
        }
    }

    
    public String getTitular() {
        return this.titular;
    }

   
    public double getSaldo() {
        return this.saldo;
    }
}
