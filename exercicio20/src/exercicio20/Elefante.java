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
public class Elefante extends Animal {
    private double tamanhoTromba;
    private String origem;
    private double forca;

    public Elefante() {}

    public Elefante(String nome, int idade, double peso, String origem) {
        super(nome, idade, peso);
        this.origem = origem;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está barrindo!");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está andando pesadamente.");
    }
}