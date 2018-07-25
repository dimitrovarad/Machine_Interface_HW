package Machine;

public class MachineDemo {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Tractor tractor = new Tractor();

        printer.turnOn();
        printer.enableWiFi();
        printer.turnOff();

        tractor.turnOn();
        tractor.turnOff();
    }

}


