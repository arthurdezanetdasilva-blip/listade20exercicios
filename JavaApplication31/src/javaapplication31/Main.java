/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        // Usando construtor vazio + setters
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(5);
        cachorro.setPeso(20.5);

        // Usando construtor com parâmetros
        Gato gato = new Gato("Mimi", 3, 5.2);
        Vaca vaca = new Vaca("Mimosa", 7, 350.0);
        Cavalo cavalo = new Cavalo("Pé de Pano", 6, 400.0);

        // Polimorfismo
        Animal[] animais = {cachorro, gato, vaca, cavalo};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}