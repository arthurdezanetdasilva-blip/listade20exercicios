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
public class Pagamento {
    private double valor;
    private String data;
    private String descricao;

    public Pagamento() {}

    public Pagamento(double valor, String data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
