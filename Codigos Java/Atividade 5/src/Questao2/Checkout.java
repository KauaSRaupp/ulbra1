package Atividade2;

public class Checkout {
    public void processarCompra(Pagamento formaPagamento, float valor, String idTransacao){
        formaPagamento.processar(valor);
    }

    public void processarEstorno(Pagamento formaPagamento, String idTransacao){
        formaPagamento.estornar(idTransacao);
    }
}
