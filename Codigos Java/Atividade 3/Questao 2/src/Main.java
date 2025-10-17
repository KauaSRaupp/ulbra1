//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Processador processador = new Processador("intel", 2.1);
        Computador computador = new Computador(16, processador);

        System.out.println(computador.detalhes());
    }
}