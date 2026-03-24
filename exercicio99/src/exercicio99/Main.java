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
public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Guerreiro("Thor", 100, 5);
        Personagem p2 = new Mago("Merlin", 80, 7);
        Personagem p3 = new Arqueiro("Legolas", 90, 6);
        Personagem p4 = new Paladino("Arthur", 120, 8);

        Personagem[] personagens = {p1, p2, p3, p4};

        for (Personagem p : personagens) {
            p.atacar();
            p.defender();
            System.out.println("----------------");
        }
    }
}