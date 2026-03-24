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
public class Guerreiro extends Personagem {
    private int forca;
    private String arma;
    private int defesa;

    public Guerreiro() {}

    public Guerreiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro ataca com espada!");
    }

    @Override
    public void defender() {
        System.out.println("Guerreiro usa escudo!");
    }
}