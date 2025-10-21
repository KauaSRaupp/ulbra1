package Atividade2;

public class PagamentoCartao extends PagamentoBase implements Pagamento {
    private int taxa = 10;

    @Override
    public void processar(Float valor) {
        double taxa = valor * (double)this.taxa / 100;
        double total = valor + taxa;
        System.out.println("A taxa é de " + this.taxa + "%");
        System.out.println("O acrescimo de taxa foi de " + taxa);
        System.out.println("O valor total é de " + total);


    }

    @Override
    public void estornar(String idTransacao) {
        super.estornar(idTransacao);
    }
}
