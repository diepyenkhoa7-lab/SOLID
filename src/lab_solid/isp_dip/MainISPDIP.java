package lab_solid.isp_dip;

public class MainISPDIP {
    public static void main(String[] args) {
        Switchable light = new SimpleLightBulb();
        Switchable speaker = new SmartSpeaker();

        SmartSwitchController controller = new SmartSwitchController(light);

        System.out.println("--- DIEU KHIEN DEN ---");
        controller.press();

        System.out.println("\n--- DIEU KHIEN LOA ---");
        controller.setDevice(speaker);
        controller.press();

        ((VolumeAdjustable) speaker).setVolume(75);
    }
}
