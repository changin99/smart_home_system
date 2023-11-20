public class SmartSpeaker implements AdvancedDevice {
    private boolean isOn = false;

    @Override
    public void performComplexAction() {
        if (isOn) {
            System.out.println("Smart Speaker is turned OFF");
            isOn = false;
        } else {
            System.out.println("Smart Speaker is turned ON");
            isOn = true;
        }
    }
}



