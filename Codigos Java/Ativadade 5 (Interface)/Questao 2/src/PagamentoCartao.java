public class PagamentoCartao extends PagamentoBase implements Pagamento{
    private int taxa = 5;

    @Override
    public void processar(float valor) {
       float taxa = valor * (float)this.taxa / 100;
        super.processar(valor);
        valor = valor + taxa;
        System.out.println("Valor processador e a taxa do cartão ficou " + taxa);
        System.out.println("O porcentual de taxa foi de " + taxa + this.taxa);
        System.out.println("O valor total ficou " + valor );}

    @Override
    public void estornar(String idTransacao) {
        super.estornar(idTransacao);

    }}

