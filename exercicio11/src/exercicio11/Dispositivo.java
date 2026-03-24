/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author aluno.saolucas
 */
public class Dispositivo {
    private String nome;
    private String marca;
    private boolean ligado;

    public Dispositivo() {}

    public Dispositivo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public void ligar() { System.out.println("Ligando..."); }
    public void desligar() { System.out.println("Desligando..."); }

    public void executarFuncao() {
        System.out.println("Função genérica");
    }
}