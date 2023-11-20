// 홈 자동화 시나리오를 위한 템플릿 메서드 패턴 적용
public abstract class HomeScenario {
    public final void performScenario() {
        turnOffLights();
        adjustThermostat();
        playMusic();
        customAction();
    }

    private void turnOffLights() {
        System.out.println("All lights are turned off"); // 모든 조명을 끔
    }

    private void adjustThermostat() {
        System.out.println("Thermostat is set for the night"); // 온도 조절기를 밤 모드로 설정
    }

    private void playMusic() {
        System.out.println("Soft music is playing"); // 부드러운 음악 재생
    }

    protected abstract void customAction(); // 서브클래스에서 구현할 맞춤형 동작
}

