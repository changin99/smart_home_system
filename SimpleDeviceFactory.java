// SimpleDeviceFactory 클래스
public class SimpleDeviceFactory extends DeviceFactory {
    @Override
    public Device createDevice(String type) {
        switch (type) {      // 추가 장치 유형을 여기에 구현
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


