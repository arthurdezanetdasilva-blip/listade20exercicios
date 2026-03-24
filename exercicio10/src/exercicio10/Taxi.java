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
public class Taxi extends Transporte {
    private double km;

    public Taxi(int cap, String emp, double tarifa, double km) {
        super(cap, emp, tarifa);
        this.km = km;
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() + (km * 2);
    }
}
