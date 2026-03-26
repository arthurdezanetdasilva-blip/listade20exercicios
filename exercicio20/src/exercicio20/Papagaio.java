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
public class Papagaio extends Animal {
    private String cor;
    private boolean fala;
    private String especie;

    public Papagaio() {}

    public Papagaio(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso);
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está falando!");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está voando.");
    }
}