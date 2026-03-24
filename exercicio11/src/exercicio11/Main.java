/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Dispositivo[] dispositivos = {
            new Computador("PC", "Dell"),
            new Smartphone("Celular", "Samsung"),
            new Tablet("Tablet", "Apple"),
            new Televisao("TV", "LG")
        };

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.executarFuncao();
            d.desligar();
            System.out.println("------");
        }
    }
}