public interface Pagamento {
    void processar(float valor);

    void estornar(String idTransacao);
}
