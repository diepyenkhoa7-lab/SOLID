package lab_solid.isp_dip;

public class SmartSpeaker implements Switchable, VolumeAdjustable {
    @Override
    public void turnOn() {
        System.out.println("Loa: MO nguon.");
    }

    @Override
    public void turnOff() {
        System.out.println("Loa: TAT nguon.");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Loa: Am luong " + level);
    }
}
