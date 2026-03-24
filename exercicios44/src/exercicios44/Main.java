/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios44;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Arthur", "123", "arthur@email.com");

        ContaBancaria conta1 = new ContaCorrente(1, c1, 500);
        ContaBancaria conta2 = new ContaPoupanca(2, c1);
        ContaBancaria conta3 = new ContaSalario(3, c1, "Empresa X");

        conta1.depositar(1000);
        conta1.sacar(200);

        conta2.depositar(2000);
        ((ContaPoupanca) conta2).renderJuros();

        conta3.depositar(1500);
        conta3.sacar(1200);

        ContaBancaria[] contas = {conta1, conta2, conta3};

        for (ContaBancaria c : contas) {
            System.out.println("Conta " + c.getNumero() +
                    " - Saldo: " + c.consultarSaldo());
        }
    }
}
