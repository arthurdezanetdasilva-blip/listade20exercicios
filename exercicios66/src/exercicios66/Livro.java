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
public class Livro extends Produto {
    private String autor;
    private String editora;
    private int paginas;

    public Livro() {}

    public Livro(String nome, double preco, int quantidade, String autor) {
        super(nome, preco, quantidade);
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.90; // 10% desconto
    }

    // Getters e Setters
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public int getPaginas() { return paginas; }
    public void setPaginas(int paginas) { this.paginas = paginas; }
}