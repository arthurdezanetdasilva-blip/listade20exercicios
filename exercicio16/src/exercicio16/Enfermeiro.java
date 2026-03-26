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
public class Enfermeiro extends Pessoa {
    private String setor;
    private double salario;
    private String coren;

    public Enfermeiro() {}

    public Enfermeiro(String nome, int idade, String cpf, String setor) {
        super(nome, idade, cpf);
        this.setor = setor;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Enfermeiro auxiliando atendimento...");
    }

    public String getSetor() { return setor; }
}