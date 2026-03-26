/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17;

/**
 *
 * @author aluno.saolucas
 */
public class ItemBiblioteca {
    private String titulo;
    private int codigo;
    private boolean disponivel;

    public ItemBiblioteca() {}

    public ItemBiblioteca(String titulo, int codigo, boolean disponivel) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Item emprestado");
        } else {
            System.out.println("Indisponível");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Item devolvido");
    }

    // getters/setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}