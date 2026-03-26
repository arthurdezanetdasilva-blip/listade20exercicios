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
public class CursoPresencial extends Curso {
    public CursoPresencial(String n,int c,double v){ super(n,c,v); }

    /**
     *
     * @return
     */
    @Override
    public double calcularMensalidade(){ return getValor()+100; }

    private int getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}