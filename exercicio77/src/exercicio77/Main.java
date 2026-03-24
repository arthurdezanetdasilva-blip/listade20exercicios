/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio77;

/**
 *
 * @author aluno.saolucas
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado("Azul", 4));
        formas.add(new Retangulo("Vermelho", 5, 3));
        formas.add(new Circulo("Verde", 2.5));
        formas.add(new Triangulo("Amarelo", 6, 4));

        for (Forma f : formas) {
            System.out.println("Forma: " + f.getNome());
            System.out.println("Cor: " + f.getCor());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("----------------------");
        }
    }
}
