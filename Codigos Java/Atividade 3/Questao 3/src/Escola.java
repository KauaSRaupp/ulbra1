public class Escola {
    private String nome;
    private String endereco;
    private Diretor diretor;

    public Escola(String nome, String endereco, Diretor diretor){
        this.nome = nome;
        this.endereco = endereco;
        this.diretor = diretor;
    }

    public String apresentarEscola() {
        return nome + " - " + diretor.toString();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", diretor=" + diretor +
                '}';
    }

    }

