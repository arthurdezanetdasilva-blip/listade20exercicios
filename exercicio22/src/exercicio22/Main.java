/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio22;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        // Construtor vazio + setters
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2022);

        // Construtor com parâmetros
        Moto moto = new Moto("Honda", "CB500", 2021);
        Bicicleta bike = new Bicicleta("Caloi", "Elite", 2020);
        Onibus onibus = new Onibus("Mercedes", "Urbano", 2018);

        // Polimorfismo
        Veiculo[] veiculos = {carro, moto, bike, onibus};

        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}
