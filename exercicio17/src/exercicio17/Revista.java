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
public class Revista extends ItemBiblioteca {
    private String categoria; private int edicao; private String mes;
    public Revista(){}

    public Revista(String t,int c,boolean d){ super(t,c,d); }

    @Override
    public void emprestar(){ System.out.println("Revista emprestada"); }
}