/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio16;

/**
 *
 * @author aluno.saolucas
 */
public class Medico extends Pessoa {
    private String especialidade;
    private double salario;
    private String crm;

    public Medico() {}

    public Medico(String nome, int idade, String cpf, String especialidade) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Médico atendendo paciente...");
    }

    public String getEspecialidade() { return especialidade; }
}