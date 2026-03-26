/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

/**
 *
 * @author aluno.saolucas
 */
public class SalaComercial extends Imovel {
    public SalaComercial(String e,double p,double m){ super(e,p,m); }

    @Override
    public double calcularImposto(){ return getPreco()*0.015; }

    private double getPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}