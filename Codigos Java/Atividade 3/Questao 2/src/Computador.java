public class Computador {
    private int memoriaRam;
    private Processador processador;

    public Computador(int memoriaRam, Processador processador) {
        this.memoriaRam = memoriaRam;
        this.processador = processador;
    }
    public String detalhes(){
        return memoriaRam + "gb ram, processador: " + processador.toString();
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }

    public Processador getProcessador() {
        return processador;
    }



    @Override
    public String toString() {
        return "Computador{" +
                "memoriaRam=" + memoriaRam +
                ", processador=" + processador +
                '}';
    }



}
