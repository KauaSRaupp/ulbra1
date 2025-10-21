package Atividade2;

public class PagamentoBoleto extends PagamentoBase implements Pagamento {
    @Override
    public void processar(Float valor) {
        System.out.println("Pagamento sera aprovado apos 1 dia util");
    }

    @Override
    public void estornar(String idTransacao) {
        super.estornar(idTransacao);
    }
}
