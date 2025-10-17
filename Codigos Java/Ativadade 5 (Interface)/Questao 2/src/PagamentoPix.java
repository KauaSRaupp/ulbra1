public class PagamentoPix extends PagamentoBase implements Pagamento{
    @Override
    public void processar(float valor) {
        super.processar(valor);
        System.out.println("Pagamento ja processado");
    }

    @Override
    public void estornar(String idTransacao) {
        super.estornar(idTransacao);
    }
}
