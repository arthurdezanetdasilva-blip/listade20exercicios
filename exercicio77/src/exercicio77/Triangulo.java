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
public class Triangulo extends Forma {
    private double base;
    private double altura;
    private String tipo;

    public Triangulo() {}

    public Triangulo(String cor, double base, double altura) {
        super("Triângulo", cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}