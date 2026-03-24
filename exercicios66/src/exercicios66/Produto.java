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
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor vazio
    public Produto() {}

    // Construtor com parâmetros
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPrecoFinal() {
        return preco;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
