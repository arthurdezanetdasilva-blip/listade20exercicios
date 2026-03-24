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
public class Pix extends Pagamento {
    private String chavePix;
    private String banco;
    private String tipoChave;

    public Pix() {}

    public Pix(double valor, String data, String desc, String chave) {
        super(valor, data, desc);
        this.chavePix = chave;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX - Valor: " + getValor());
    }
}
