public class Livro {
    private String titulo;
    private String autor;
    private Boolean disponivel = true;

    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("livro emprestado");
        } else {
            System.out.println("nao tem livro");
        }
    }
        public void devolver() {
            disponivel = true;
            System.out.println("Livro devolvido");
        }

        public void satuts(){
            System.out.println("titulo: " + titulo);
            System.out.println("Autor " + autor);
            System.out.println("Disponivel" + (disponivel ? "sim" : "nao"));

        }
    }
