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
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Arthur", 17, "123", "A001");
        aluno.setNota1(8);
        aluno.setNota2(7);

        Professor professor = new Professor("Carlos", 40, "456", "Matemática");
        Coordenador coord = new Coordenador("Ana", 45, "789", "Pedagógico");

        Turma turma = new Turma("3º Ano", 30, "Manhã");

        // Testes
        aluno.apresentar();
        System.out.println("Média: " + aluno.calcularMedia());

        professor.apresentar();
        professor.trabalhar();

        coord.apresentar();
        coord.trabalhar();

        turma.mostrarTurma();

        // Polimorfismo
        Pessoa[] pessoas = {aluno, professor, coord};

        for (Pessoa p : pessoas) {
            p.trabalhar();
        }
    }
}