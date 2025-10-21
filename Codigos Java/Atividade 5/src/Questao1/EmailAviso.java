package Atividade1;

public class EmailAviso extends AvisoBase implements Avisos {
    @Override
    public void enviar(String mensagem, String destino) {
        super.enviar(mensagem, destino);
        System.out.println("Mensagem enviada por email");
    }

    @Override
    public String status() {
        return "";

}}

