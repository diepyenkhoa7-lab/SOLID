package lab_solid.isp_dip;

public class SimpleLightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Bong den: BAT.");
    }

    @Override
    public void turnOff() {
        System.out.println("Bong den: TAT.");
    }
}
