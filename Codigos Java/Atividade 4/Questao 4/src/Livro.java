public class Livro extends Publicacao {
    private int numeroPaginas;
    private String genero;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String genero) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public Livro(int numeroPaginas, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de paginas:" + numeroPaginas);
        System.out.println("Genero: " + genero);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroPaginas=" + numeroPaginas +
                ", genero='" + genero + '\'' +
                '}';
    }
}
