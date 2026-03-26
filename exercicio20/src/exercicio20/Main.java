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
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Leao("Leão", 5, 200, "Savana");
        Animal a2 = new Macaco("Macaco", 3, 50, "Chimpanzé");
        Animal a3 = new Elefante("Elefante", 10, 500, "África");
        Animal a4 = new Papagaio("Papagaio", 2, 2, "Verde");

        Animal[] animais = {a1, a2, a3, a4};

        for (Animal a : animais) {
            System.out.println("Animal: " + a.getNome());
            a.emitirSom();
            a.alimentar();
            a.movimentar();
            System.out.println("----------------------");
        }
    }
}