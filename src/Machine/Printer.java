package Machine;

public class Printer extends Functions{


    @Override
    public void turnOn() {
        System.out.println("Turn on the button");

    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the button");

    }

    @Override
    public boolean enableWiFi() {
        return false;
    }
}
