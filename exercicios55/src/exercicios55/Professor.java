/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios55;

/**
 *
 * @author aluno.saolucas
 */
public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private String registro;

    public Professor() {}

    public Professor(String nome, int idade, String cpf, String disciplina) {
        super(nome, idade, cpf);
        this.disciplina = disciplina;
    }

    @Override
    public void trabalhar() {
        System.out.println("Professor ensinando " + disciplina);
    }

    // Getters e Setters
    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }
}
