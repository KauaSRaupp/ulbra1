package Atividade2;

public class PagamentoBase implements Pagamento {
    @Override
    public void processar(Float valor) {
        System.out.println("Pagamento efetuado" + valor);

    }

    @Override
    public void estornar(String idTransacao) {
        System.out.println("Id da transação: " + idTransacao);

    }
}
