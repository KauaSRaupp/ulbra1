public class Autor {
    private String nome;
    private String nacionalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "nome do autor: " + nome + '\'' +
                ", e a sua nacionalidade é " + nacionalidade + ")" + '\'' +
                '}';
    }

    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
}

