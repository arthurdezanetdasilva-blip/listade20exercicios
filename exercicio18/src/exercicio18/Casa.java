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
public class Casa extends Imovel {
    public Casa(String e,double p,double m){ super(e,p,m); }

    @Override
    public double calcularImposto(){ return super.calcularImposto(); }
}