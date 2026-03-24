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
public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
    private String tipo;
    private int aniversario;

    public ContaPoupanca() {}

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
        this.taxaJuros = 0.02;
        this.tipo = "Poupança";
        this.aniversario = 1;
    }

    public void renderJuros() {
        double rendimento = getSaldo() * taxaJuros;
        setSaldo(getSaldo() + rendimento);
    }

    public double getTaxaJuros() { return taxaJuros; }
}