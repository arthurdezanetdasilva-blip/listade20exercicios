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
public class Coordenador extends Pessoa {
    private String setor;
    private double salario;
    private int anosExperiencia;

    public Coordenador() {}

    public Coordenador(String nome, int idade, String cpf, String setor) {
        super(nome, idade, cpf);
        this.setor = setor;
    }

    @Override
    public void trabalhar() {
        System.out.println("Coordenador gerenciando o setor " + setor);
    }

    // Getters e Setters
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anos) { this.anosExperiencia = anos; }
}
