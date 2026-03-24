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
public class Designer extends Funcionario {

    public Designer() {
        super();
    }

    public Designer(String nome, double salario) {
        super(nome, salario, "Designer");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está criando designs.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.12;
    }
}
