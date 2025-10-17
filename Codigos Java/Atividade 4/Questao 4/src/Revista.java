public class Revista extends Publicacao {
    private int edicao;
    private String mesPublicacao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao, String mesPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }
    public Revista(int edicao, String mesPublicacao){
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Edicao: " + edicao);
        System.out.println("Mes da publicação: " + mesPublicacao);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "edicao=" + edicao +
                ", mesPublicacao='" + mesPublicacao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
