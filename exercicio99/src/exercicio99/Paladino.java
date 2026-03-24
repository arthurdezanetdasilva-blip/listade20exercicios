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
public class Paladino extends Personagem {
    private int fe;
    private String arma;
    private int resistencia;

    public Paladino() {}

    public Paladino(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Paladino usa ataque sagrado!");
    }

    @Override
    public void defender() {
        System.out.println("Paladino ativa proteção divina!");
    }
}