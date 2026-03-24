/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios33;

/**
 *
 * @author aluno.saolucas
 */
public class Gerente extends Funcionario {

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario) {
        super(nome, salario, "Gerente");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }
}
