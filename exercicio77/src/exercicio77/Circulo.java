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
public class Circulo extends Forma {
    private double raio;
    private String unidade;
    private boolean preenchido;

    public Circulo() {}

    public Circulo(String cor, double raio) {
        super("Círculo", cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }
}