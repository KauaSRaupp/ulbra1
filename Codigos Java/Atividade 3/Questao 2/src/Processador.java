public class Processador {
    private String marca;
    private double velocidadeGhz;

    public Processador(String marca, double velocidadeGhz) {
        this.marca = marca;
        this.velocidadeGhz = velocidadeGhz;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeGhz() {
        return velocidadeGhz;
    }

    public void setVelocidadeGhz(double velocidadeGhz) {
        this.velocidadeGhz = velocidadeGhz;
    }


    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", velocidadeGhz=" + velocidadeGhz +
                '}';
    }
}
