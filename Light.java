public class Light implements Device {
    private boolean isOn = false;

    @Override
    public void performAction() {
        if (isOn) {
            System.out.println("Light is turned OFF");
            isOn = false;
        } else {
            System.out.println("Light is turned ON");
            isOn = true;
        }
    }
}


