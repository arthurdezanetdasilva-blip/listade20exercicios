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
public class Televisao extends Dispositivo {
    public Televisao(String n, String m) { super(n, m); }

    @Override
    public void executarFuncao() {
        System.out.println("Exibindo canal");
    }
}
