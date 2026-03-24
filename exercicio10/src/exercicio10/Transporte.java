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
public class Transporte {
    private int capacidade;
    private String empresa;
    private double tarifaBase;

    public Transporte() {}

    public Transporte(int capacidade, String empresa, double tarifaBase) {
        this.capacidade = capacidade;
        this.empresa = empresa;
        this.tarifaBase = tarifaBase;
    }

    public double calcularTarifa() {
        return tarifaBase;
    }

    public int getCapacidade() { return capacidade; }
    public String getEmpresa() { return empresa; }
    public double getTarifaBase() { return tarifaBase; }
}
