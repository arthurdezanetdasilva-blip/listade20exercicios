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
public class Eletronico extends Produto {
    private String marca;
    private int garantiaMeses;
    private String modelo;

    public Eletronico() {}

    public Eletronico(String nome, double preco, int quantidade, String marca) {
        super(nome, preco, quantidade);
        this.marca = marca;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.15; // 15% imposto
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getGarantiaMeses() { return garantiaMeses; }
    public void setGarantiaMeses(int garantiaMeses) { this.garantiaMeses = garantiaMeses; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
