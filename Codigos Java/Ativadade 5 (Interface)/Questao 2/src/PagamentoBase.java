public class PagamentoBase implements Pagamento {
    @Override
    public void processar(float valor) {
        System.out.println("processando o pagamento");
    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("processando estorno");

    }
}
