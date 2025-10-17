public class Administrador extends Funcionario {
    private String setor;

    public Administrador(String nome, int matricula, float salario, String setor) {
        super(nome, matricula, salario);
        this.setor = setor;
    }

    public Administrador(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor; " + setor);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "setor='" + setor + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
