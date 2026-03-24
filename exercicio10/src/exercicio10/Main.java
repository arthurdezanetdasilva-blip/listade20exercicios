/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Transporte[] t = {
            new Taxi(4, "Local", 5, 10),
            new Uber(4, "Uber", 5, 10),
            new Onibus(50, "Cidade", 4),
            new Metro(200, "MetroSP", 4)
        };

        for (Transporte tr : t) {
            System.out.println("Tarifa: " + tr.calcularTarifa());
        }
    }
}
