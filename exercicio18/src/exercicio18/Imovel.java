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
public class Imovel {
    private String endereco;
    private double preco;
    private double metragem;

    public Imovel(){}

    public Imovel(String e,double p,double m){
        endereco=e; preco=p; metragem=m;
    }

    public double calcularImposto(){
        return preco * 0.01;
    }
}