public class ContaBancaria {
    private int numero;
    private String titular;
    private float saldo;

    public ContaBancaria(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        if (saldo < 0){
        System.out.println("ta duro");

    }else{
            System.out.println("o " + titular + " do numero " + numero + " tem seu saldo de " + saldo + "reais");
        }
        }
}




