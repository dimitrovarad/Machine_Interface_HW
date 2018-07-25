package Machine;

public class Tractor extends Functions {
    @Override
    public void turnOn() {

        System.out.println("Turning ON our TRACTOR key TKZS");
    }

    @Override
    public void turnOff() {

        System.out.println("Turning OFF our TRACTOR key TKZS");
    }

    @Override
    public boolean enableWiFi() {
        return false;
    }
}
