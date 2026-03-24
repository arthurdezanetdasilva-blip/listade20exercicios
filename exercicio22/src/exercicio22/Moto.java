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
public class Moto extends Veiculo {

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está acelerando rapidamente.");
    }
}