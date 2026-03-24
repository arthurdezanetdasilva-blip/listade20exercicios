/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio99;

/**
 *
 * @author aluno.saolucas
 */
public class Mago extends Personagem {
    private int mana;
    private String magia;
    private int inteligencia;

    public Mago() {}

    public Mago(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Mago lança magia!");
    }

    @Override
    public void defender() {
        System.out.println("Mago cria barreira mágica!");
    }
}