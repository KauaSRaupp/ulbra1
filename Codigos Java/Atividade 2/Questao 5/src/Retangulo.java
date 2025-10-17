public class Retangulo {
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double CalularArea() {
        return largura * altura;
    }

    public double CalcularPerimetro() {
        return 2 * (largura + altura);

    }
    public void exibirResultado() {
        System.out.println("A Largura é " + largura + " e a altura é " + altura);
        System.out.println("A area é " + CalularArea() + " e o perimetro é " + CalcularPerimetro());
    }

}

