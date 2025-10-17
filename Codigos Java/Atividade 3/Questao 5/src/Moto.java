public class Moto extends Veiculo{
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, float velocidadeAtual, boolean partidaEletrica) {
        super(marca, modelo, ano, velocidadeAtual);
        this.partidaEletrica = partidaEletrica;
    }

    public Moto(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "partidaEletrica=" + partidaEletrica +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Partida Eletrica: " + partidaEletrica);
    }
}
