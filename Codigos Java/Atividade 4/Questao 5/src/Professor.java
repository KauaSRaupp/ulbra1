public class Professor extends Funcionario {
    private String diciplina;

    public Professor(String nome, int matricula, float salario, String diciplina) {
        super(nome, matricula, salario);
        this.diciplina = diciplina;
    }
    public Professor(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Diciplina: " + diciplina);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "diciplina='" + diciplina + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}

