/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Imovel[] imoveis = {
            new Casa("Rua A",200000,100),
            new Apartamento("Rua B",300000,80),
            new Terreno("Rua C",150000,200),
            new SalaComercial("Rua D",400000,120)
        };

        for(Imovel i : imoveis){
            System.out.println(i.calcularImposto());
        }
    }
}