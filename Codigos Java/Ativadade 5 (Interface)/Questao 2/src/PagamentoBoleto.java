public class PagamentoBoleto extends PagamentoBase implements Pagamento {
    @Override
    public void processar(float valor) {
        super.processar(valor);
        System.out.println("Pagamento pago, espera o dia");
    }

    @Override
    public void estornar(String idTransacao) {
        super.estornar(idTransacao);
    }
}
