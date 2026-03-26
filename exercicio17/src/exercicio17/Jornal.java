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
public class Jornal extends ItemBiblioteca {
    private String data; private String cidade; private String tipo;
    public Jornal(){}

    public Jornal(String t,int c,boolean d){ super(t,c,d); }

    @Override
    public void emprestar(){ System.out.println("Jornal emprestado"); }
}