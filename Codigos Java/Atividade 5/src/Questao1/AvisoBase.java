package Atividade1;

public class AvisoBase implements Avisos {
    @Override
    public void enviar(String mensagem, String destino) {
        System.out.println("A mensagem é: " + mensagem);
        System.out.println("O destino é " + destino);
    }

    @Override
    public String status() {
        return "";
    }
}

