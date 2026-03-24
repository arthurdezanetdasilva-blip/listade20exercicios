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
public class Arqueiro extends Personagem {
    private int precisao;
    private String arco;
    private int agilidade;

    public Arqueiro() {}

    public Arqueiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro dispara flecha!");
    }

    @Override
    public void defender() {
        System.out.println("Arqueiro desvia rapidamente!");
    }
}