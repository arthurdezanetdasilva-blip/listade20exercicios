/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio88;

/**
 *
 * @author aluno.saolucas
 */
public class Dinheiro extends Pagamento {
    private double valorRecebido;
    private double troco;
    private String moeda;

    public Dinheiro() {}

    public Dinheiro(double valor, String data, String desc) {
        super(valor, data, desc);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em Dinheiro - Valor: " + getValor());
    }
}