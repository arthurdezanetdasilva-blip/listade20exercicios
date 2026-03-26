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
public class Main {
    public static void main(String[] args) {

        ItemBiblioteca[] itens = {
            new Livro("Java",1,true,"Autor"),
            new Revista("Tech",2,true),
            new Jornal("News",3,true),
            new DVD("Filme",4,true)
        };

        for(ItemBiblioteca i : itens){
            i.emprestar();
            i.devolver();
        }
    }
}