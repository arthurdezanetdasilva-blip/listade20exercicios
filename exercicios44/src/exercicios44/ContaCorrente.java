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
public class ContaCorrente extends ContaBancaria {
    private double limite;
    private double taxa;
    private String tipo;

    public ContaCorrente() {}

    public ContaCorrente(int numero, Cliente titular, double limite) {
        super(numero, titular);
        this.limite = limite;
        this.taxa = 2.0;
        this.tipo = "Corrente";
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + limite >= valor + taxa) {
            setSaldo(getSaldo() - (valor + taxa));
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }
}