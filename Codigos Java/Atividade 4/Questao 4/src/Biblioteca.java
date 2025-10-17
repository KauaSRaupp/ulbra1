import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Publicacao> publicacoes = new ArrayList<>();
        publicacoes.add(new Livro("O senhor dos Aneis", "Tolkien", 1985, 548, "Fantasia" ));
        publicacoes.add(new Livro("1984", "George Orwell", 1914, 447, "Ficção"));
        publicacoes.add(new Revista("Os vingadores", "Marvel", 1785, 1, "Março"));

        for (Publicacao p : publicacoes) {
            p.exibirInformacoes();
        }

        System.out.println("Digite o nome do autor que voce deseja encontrar: ");
        String acharAutor = input.nextLine();

        boolean encontrado = false;
        for(Publicacao p : publicacoes){
            if(p.getAutor().equalsIgnoreCase(acharAutor)){
                p.exibirInformacoes();
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Nenhum livro encontrado");
        }
    }
}