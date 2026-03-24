/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio88;

/**
 *
 * @author aluno.saolucas
 */
public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito(100, "24/03", "Compra", "1234");
        Pagamento p2 = new Pix(50, "24/03", "Pagamento", "email@email.com");
        Pagamento p3 = new Boleto(200, "24/03", "Conta", "9999");
        Pagamento p4 = new Dinheiro(80, "24/03", "Compra");

        Pagamento[] pagamentos = {p1, p2, p3, p4};

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
    }
}
