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
public class Paciente extends Pessoa {
    private String doenca;
    private String historico;
    private String planoSaude;

    public Paciente() {}

    public Paciente(String nome, int idade, String cpf, String doenca) {
        super(nome, idade, cpf);
        this.doenca = doenca;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Paciente aguardando atendimento...");
    }

    public String getDoenca() { return doenca; }
    public void setDoenca(String d) { this.doenca = d; }
}