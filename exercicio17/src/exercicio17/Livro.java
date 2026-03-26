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
public class Livro extends ItemBiblioteca {
    private String autor;
    private int paginas;
    private String editora;

    public Livro() {}

    public Livro(String t, int c, boolean d, String autor) {
        super(t,c,d);
        this.autor = autor;
    }

    @Override
    public void emprestar() {
        System.out.println("Livro emprestado");
    }
}