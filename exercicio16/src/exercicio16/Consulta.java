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
public class Consulta {
    private String data;
    private String horario;
    private Paciente paciente;

    public Consulta() {}

    public Consulta(String data, String horario, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para " + paciente.getNome() +
                " no dia " + data + " às " + horario);
    }
}