package template;

public class Main {
    public static void main(String[] args) {
        Transmitter analogTransmitter = new AnalogTransmitter();
        analogTransmitter.processStart();

        System.out.println();

        Transmitter digitTransmitter = new DigitTransmitter();
        digitTransmitter.processStart();
    }
}
