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
public class Onibus extends Transporte {
    public Onibus(int cap, String emp, double tarifa) {
        super(cap, emp, tarifa);
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase(); // valor fixo
    }
}