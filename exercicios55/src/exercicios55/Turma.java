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
public class Turma {
    private String nome;
    private int quantidadeAlunos;
    private String turno;

    public Turma() {}

    public Turma(String nome, int quantidadeAlunos, String turno) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.turno = turno;
    }

    public void mostrarTurma() {
        System.out.println("Turma: " + nome + " - Turno: " + turno);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidadeAlunos() { return quantidadeAlunos; }
    public void setQuantidadeAlunos(int quantidade) { this.quantidadeAlunos = quantidade; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}
