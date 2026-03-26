/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20;

/**
 *
 * @author aluno.saolucas
 */
public class Leao extends Animal {
    private String habitat;
    private String tipoJuba;
    private double forca;

    public Leao() {}

    public Leao(String nome, int idade, double peso, String habitat) {
        super(nome, idade, peso);
        this.habitat = habitat;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo!");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está correndo rapidamente.");
    }

    // Getters e Setters
    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }
}