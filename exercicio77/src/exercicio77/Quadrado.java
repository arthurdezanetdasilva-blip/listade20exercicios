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
public class Quadrado extends Forma {
    private double lado;
    private String tipo;
    private boolean preenchido;

    public Quadrado() {}

    public Quadrado(String cor, double lado) {
        super("Quadrado", cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
}