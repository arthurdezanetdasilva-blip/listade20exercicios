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
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor vazio
    public Pessoa() {}

    // Construtor com parâmetros
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public void trabalhar() {
        System.out.println("Pessoa trabalhando...");
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}