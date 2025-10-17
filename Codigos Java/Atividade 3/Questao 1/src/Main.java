//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Autor autor = new Autor("Kaua","brasil");
    Livro livro = new Livro("chinelo", 1949, autor);

        System.out.println(livro.descricao());
    }
}