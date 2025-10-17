public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected float velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar(float incremento){
    if(incremento > 0) {
        velocidadeAtual += incremento;
        System.out.println("Acelerando para " + velocidadeAtual + "KM/H");
    }else{
        System.out.println("Aceleração tem que ser maior que 0");
    }
    }

    public void frear(float decremento) {
        if (decremento < 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                System.out.println("O carro ja esta parado");
                velocidadeAtual = 0;
                return;
            }
            System.out.println("Desacelerando para " + velocidadeAtual + "KM/H");
        }else{
                System.out.println("Desaceleração tem que ser maior que 0");
            }}

            public void exibirInformacoes() {
                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Ano: " + ano);
                System.out.println("Velocidade atual: " + velocidadeAtual);

            }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}





