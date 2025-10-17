public class Produto {
        private String nome;
        private float preco;
        private int quantidade;

        public Produto (String nome, float preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;

        }
    public void calcular() {
        System.out.println("A " + nome + " vale " + preco + " e tem " + quantidade + " em estoque");
    }
        }

