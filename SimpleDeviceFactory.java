public class SimpleDeviceFactory extends DeviceFactory {
    @Override
    public Device createDevice(String type) {
        switch (type) {
            case "light":
                return new Light();
            case "thermostat":
                return new Thermostat();
            case "speaker":
                return new DeviceAdapter(new SmartSpeaker());
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}


