/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios44;

/**
 *
 * @author aluno.saolucas
 */
public class ContaSalario extends ContaBancaria {
    private double limiteSaque;
    private String empresa;
    private String tipo;

    public ContaSalario() {}

    public ContaSalario(int numero, Cliente titular, String empresa) {
        super(numero, titular);
        this.limiteSaque = 1000;
        this.empresa = empresa;
        this.tipo = "Salário";
    }

    @Override
    public void sacar(double valor) {
        if (valor <= limiteSaque) {
            super.sacar(valor);
        } else {
            System.out.println("Saque acima do permitido!");
        }
    }

    public String getEmpresa() { return empresa; }
}