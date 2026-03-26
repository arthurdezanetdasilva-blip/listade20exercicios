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
public class Curso {
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(){}

    public Curso(String n,int c,double v){
        nome=n; cargaHoraria=c; valor=v;
    }

    public double calcularMensalidade(){
        return valor;
    }

    public void exibirInformacoes(){
        System.out.println(nome + " - " + valor);
    }
}