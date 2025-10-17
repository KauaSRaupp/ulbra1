//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Diretor diretor = new Diretor("Kaua", 5);
    Escola escola = new Escola("Felipe", "Adasdas", diretor);
        System.out.println(escola.toString());
    }
}