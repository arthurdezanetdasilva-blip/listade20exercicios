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
public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String bandeira;
    private int parcelas;

    public CartaoCredito() {}

    public CartaoCredito(double valor, String data, String desc, String numero) {
        super(valor, data, desc);
        this.numeroCartao = numero;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão de Crédito - Valor: " + getValor());
    }
}