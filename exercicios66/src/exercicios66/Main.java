/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios66;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Produto p1 = new Livro("Java Básico", 100, 10, "Autor X");
        Produto p2 = new Eletronico("Celular", 2000, 5, "Samsung");
        Produto p3 = new Roupa("Camiseta", 50, 20, "M");
        Produto p4 = new Alimento("Arroz", 30, 50, "10/12/2026");

        Produto[] produtos = {p1, p2, p3, p4};

        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome());
            System.out.println("Preço final: " + p.calcularPrecoFinal());
            System.out.println("----------------------");
        }
    }
}