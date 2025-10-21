package Atividade2;

import javax.accessibility.AccessibleKeyBinding;

public class Principal {
    static void main() {

        PagamentoCartao cartao = new PagamentoCartao();
        PagamentoPix pix = new PagamentoPix();
        PagamentoBoleto boleto = new PagamentoBoleto();

        Checkout checkout = new Checkout();

        checkout.processarCompra(cartao, 200, "123abc");
        System.out.println("---------");
        checkout.processarCompra(pix, 200, "234efg");
        System.out.println("---------");
        checkout.processarCompra(boleto, 200, "567hij");
        System.out.println("---------");

        checkout.processarEstorno(boleto, "567hij");

    }
}
