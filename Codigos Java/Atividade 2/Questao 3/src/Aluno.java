public class Aluno {
    private String nome;
    private float nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void aprovado() {
        if (nota >= 7) {
            System.out.println(nome + " aprovado");

        }else{
                System.out.println(nome + " reprovado");
            }
        }
    }
