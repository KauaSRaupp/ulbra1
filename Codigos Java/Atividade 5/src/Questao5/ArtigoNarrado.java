package Atividade5;

public class ArtigoNarrado extends MidiaBase implements Midia {
    @Override
    public void reproduzir() {
        System.out.println("tts carregado");
    }

    @Override
    public Integer duracao() {
        return 400;
    }
}
