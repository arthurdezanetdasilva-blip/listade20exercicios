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
public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private String matricula;

    public Aluno() {}

    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Getters e Setters
    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}