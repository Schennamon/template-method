package template;

public class AnalogTransmitter extends Transmitter {
    @Override
    protected void modulation(){
        System.out.println("Модуляция аналового сигнала");
    }
}
