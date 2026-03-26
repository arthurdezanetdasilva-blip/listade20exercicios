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
public class Macaco extends Animal {
    private String especie;
    private boolean caudaLonga;
    private double agilidade;

    public Macaco() {}

    public Macaco(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso);
        this.especie = especie;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gritando!");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está pulando entre as árvores.");
    }
}