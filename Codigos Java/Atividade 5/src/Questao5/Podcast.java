package Atividade5;

public class Podcast extends MidiaBase implements Midia {
    @Override
    public void reproduzir() {
        System.out.println("buffer de audio");
    }

    @Override
    public Integer duracao() {
        return 600;
    }
}
