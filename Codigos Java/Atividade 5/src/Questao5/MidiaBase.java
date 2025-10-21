package Atividade5;

public class MidiaBase implements Midia {
    @Override
    public void reproduzir() {
        System.out.println("Esta reproduzindo");
    }

    @Override
    public Integer duracao() {
        return 0;
    }
}
