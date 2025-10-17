//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Escola {
    public static void main(String[] args) {

        Professor p1 = new Professor("Kaua", 51233123, 2600f, "Matematica");
        Administrador a1 = new Administrador("Eduardo", 1231232, 3000f, "Diretor");

        p1.aumentarSalario(10);
        Funcionario[] funcionarios = {p1, a1};

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}