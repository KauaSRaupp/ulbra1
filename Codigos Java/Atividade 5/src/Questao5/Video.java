package Atividade5;

public class Video extends MidiaBase implements Midia {
    @Override
    public void reproduzir() {
        System.out.println("streaming 1080p");
    }

    @Override
    public Integer duracao() {
        return 300;
    }
}
