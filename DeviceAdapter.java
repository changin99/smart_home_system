public class DeviceAdapter implements Device {
    private AdvancedDevice advancedDevice;

    public DeviceAdapter(AdvancedDevice advancedDevice) {
        this.advancedDevice = advancedDevice;
    }

    @Override
    public void performAction() {
        advancedDevice.performComplexAction();
    }
}


