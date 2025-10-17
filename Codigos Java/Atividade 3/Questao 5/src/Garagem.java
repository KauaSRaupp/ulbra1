
public class Garagem {
    public static void main(String[] args) {
        Carro c1 = new Carro("chevrolet", "Astra", 2002, 100f, 2);
        Carro c2 = new Carro("Chevrolet", "Corsa", 2000, 40F, 2);
        Moto m1 = new Moto("Honda", "CG150", 2012, 100f, true);

    c1.acelerar(80f);
    m1.acelerar(20f);

    Veiculo[] veiculos = {c1,c2,m1};

    for(Veiculo v : veiculos){
        v.exibirInformacoes();
    }

    }

}
