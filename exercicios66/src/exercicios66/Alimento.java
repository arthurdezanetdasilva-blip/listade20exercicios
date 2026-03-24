/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios66;

/**
 *
 * @author aluno.saolucas
 */
public class Alimento extends Produto {
    private String dataValidade;
    private String tipo;
    private boolean perecivel;

    public Alimento() {}

    public Alimento(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.dataValidade = validade;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.95; // 5% desconto
    }

    // Getters e Setters
    public String getDataValidade() { return dataValidade; }
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public boolean isPerecivel() { return perecivel; }
    public void setPerecivel(boolean perecivel) { this.perecivel = perecivel; }
}