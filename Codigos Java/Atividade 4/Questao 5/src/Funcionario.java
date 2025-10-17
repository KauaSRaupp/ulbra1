public class Funcionario {
    protected String nome;
    protected int matricula;
    protected float salario;

    public Funcionario(String nome, int matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void aumentarSalario(float percentual) {
        if (percentual > 0) {
            percentual = percentual / 100;
            salario += (salario * percentual);
            System.out.println("salario aumentado para: " + salario);
        } else {
            System.out.println("O aumento deve ser maior que 0");
        }}

        public void exibirDados(){
            System.out.println("Nome: " + nome);
            System.out.println("Matricula: " + matricula);
            System.out.println("Salario: " + salario);
        }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
