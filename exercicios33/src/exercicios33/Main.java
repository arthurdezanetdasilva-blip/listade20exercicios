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
public class Main {
    public static void main(String[] args) {

        // Construtor vazio + setters
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setSalario(8000);

        // Construtor com parâmetros
        Vendedor vendedor = new Vendedor("Ana", 3000);
        Programador programador = new Programador("Lucas", 5000);
        Designer designer = new Designer("Marina", 4000);

        // Polimorfismo
        Funcionario[] funcionarios = {gerente, vendedor, programador, designer};

        for (Funcionario f : funcionarios) {
            f.trabalhar();
            System.out.println("Bônus: R$ " + f.calcularBonus());
            System.out.println("-----------------------");
        }
    }
}