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
public class Boleto extends Pagamento {
    private String codigoBarras;
    private String vencimento;
    private boolean pago;

    public Boleto() {}

    public Boleto(double valor, String data, String desc, String codigo) {
        super(valor, data, desc);
        this.codigoBarras = codigo;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto - Valor: " + getValor());
    }
}