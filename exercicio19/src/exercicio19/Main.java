/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Curso[] cursos = {
            new CursoPresencial("Java",100,500),
            new CursoOnline("Python",80,300),
            new CursoTecnico("TI",200,800),
            new CursoLivre("Design",50,200)
        };

        for(Curso c : cursos){
            c.exibirInformacoes();
            System.out.println(c.calcularMensalidade());
        }
    }
}
