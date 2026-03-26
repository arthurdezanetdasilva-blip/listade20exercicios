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
public class DVD extends ItemBiblioteca {
    private String genero; private int duracao; private String diretor;
    public DVD(){}

    public DVD(String t,int c,boolean d){ super(t,c,d); }

    @Override
    public void emprestar(){ System.out.println("DVD emprestado"); }
}