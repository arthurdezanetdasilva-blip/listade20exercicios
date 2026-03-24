/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio77;

/**
 *
 * @author aluno.saolucas
 */
public class Forma {
    private String nome;
    private String cor;
    private double area;

    // Construtor vazio
    public Forma() {}

    // Construtor com parâmetros
    public Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public double calcularArea() {
        return 0; // será sobrescrito
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }
}
