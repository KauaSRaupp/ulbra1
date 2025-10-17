public class Diretor {
    private String nome;
    private int tempoDeServico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", tempoDeServico=" + tempoDeServico +
                '}';
    }

    public Diretor (String nome, int tempoDeServico){
        this.nome = nome;
        this.tempoDeServico = tempoDeServico;
    }
}
