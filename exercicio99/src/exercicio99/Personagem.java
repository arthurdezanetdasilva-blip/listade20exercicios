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
public class Personagem {
    private String nome;
    private int vida;
    private int nivel;

    public Personagem() {}

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println("Ataque básico");
    }

    public void defender() {
        System.out.println("Defesa básica");
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getNivel() { return nivel; }
}
