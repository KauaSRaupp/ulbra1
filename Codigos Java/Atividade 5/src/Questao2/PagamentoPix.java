package Atividade2;

public class PagamentoPix extends PagamentoBase implements Pagamento {
    @Override
    public void processar(Float valor) {
        System.out.println("Pagamento no pix aprovado");
    }

    @Override
    public void estornar(String idTransacao) {
        super.estornar(idTransacao);
    }
}
