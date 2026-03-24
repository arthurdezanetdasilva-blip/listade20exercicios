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
public class Roupa extends Produto {
    private String tamanho;
    private String cor;
    private String marca;

    public Roupa() {}

    public Roupa(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.80; // 20% desconto
    }

    // Getters e Setters
    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}