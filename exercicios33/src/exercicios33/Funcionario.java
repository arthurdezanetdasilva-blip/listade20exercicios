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
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    // Construtor vazio
    public Funcionario() {
    }

    // Construtor com parâmetros
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}