package lab_solid.isp_dip;

public class SmartSwitchController {
    private Switchable device;

    public SmartSwitchController(Switchable device) {
        this.device = device;
    }

    public void setDevice(Switchable device) {
        this.device = device;
    }

    public void press() {
        device.turnOn();
    }
}
