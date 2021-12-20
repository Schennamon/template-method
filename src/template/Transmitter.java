package template;

abstract class Transmitter {
    protected void voiceRecord() {
        System.out.println("Запись фрагмента речи");
    }

    protected void simpling() {

    }

    protected void digitization() {

    }

    protected void modulation() {

    }

    protected void transmission() {
        System.out.println("Передача сигнала по радиоканалу");
    }

    public void processStart() {
        voiceRecord();
        simpling();
        digitization();
        modulation();
        transmission();
    }
}
