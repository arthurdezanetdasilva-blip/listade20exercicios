/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios44;

/**
 *
 * @author aluno.saolucas
 */
public class ContaBancaria {
    private int numero;
    private double saldo;
    private Cliente titular;

    public ContaBancaria() {}

    public ContaBancaria(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Cliente getTitular() { return titular; }
    public void setTitular(Cliente titular) { this.titular = titular; }
}