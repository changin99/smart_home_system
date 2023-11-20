// Thermostat 클래스
public class Thermostat implements Device { 
    private int temperature;
    private static final int MIN_TEMP = 10; // 최소 온도
    private static final int MAX_TEMP = 30; // 최대 온도

    public Thermostat() {
        this.temperature = 20; // 기본 온도 설정
    }

    public void setTemperature(int temperature) {
        if (temperature >= MIN_TEMP && temperature <= MAX_TEMP) {
            this.temperature = temperature;
        } else {
            System.out.println("Invalid temperature. Please set between " + MIN_TEMP + " and " + MAX_TEMP + ".");
        }
    }

    @Override
    public void performAction() {
        System.out.println("Thermostat is set to " + temperature + " degrees"); // 온도 조절기 관련 액션 구현
    }
}



