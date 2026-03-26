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
public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Paciente paciente = new Paciente("Carlos", 25, "123", "Gripe");
        Medico medico = new Medico("Dr João", 45, "456", "Clínico");
        Enfermeiro enfermeiro = new Enfermeiro("Maria", 30, "789", "Emergência");

        // Consulta
        Consulta consulta = new Consulta("25/03", "14:00", paciente);
        consulta.agendarConsulta();

        System.out.println("\n--- Dados ---");
        paciente.exibirDados();
        medico.exibirDados();
        enfermeiro.exibirDados();

        System.out.println("\n--- Atendimentos (Polimorfismo) ---");

        Pessoa[] pessoas = {paciente, medico, enfermeiro};

        for (Pessoa p : pessoas) {
            p.realizarAtendimento(); // POLIMORFISMO
        }
    }
}