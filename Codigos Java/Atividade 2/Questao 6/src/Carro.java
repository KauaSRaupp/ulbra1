public class Carro {
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro (String modelo, int ano, int velocidade) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }
    public void acelerar() {
            velocidade += 10;
        }
        public void frear (){
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }
        }
    public void status(){
            System.out.println("modelo " + modelo);
            System.out.println("ano: " + ano);
            System.out.println("Velocidade atual: " + velocidade + " km/h");


        }

    }



