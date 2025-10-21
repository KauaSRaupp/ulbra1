package Atividade2;

public interface Pagamento {
    void processar(Float valor);
    void estornar (String idTransacao);

}
