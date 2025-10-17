import java.lang.ref.Cleaner;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(int numeroConta, float saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.cliente = cliente;
    }
    public void depositar(double valor){
        if(valor >0){
            saldo += valor;
            System.out.println("depositto de  " + valor + " realizado com sucesso");
        }else {
            System.out.println("Valor invalido");
        }}

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("sade de " + valor + " realizado");
        } else {
            System.out.println("Sem saldo");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }



}
