// Light 클래스
public class Light implements Device {
    private boolean isOn = false;

    @Override
    public void performAction() {   // 조명 관련 액션 구현
        if (isOn) {
            System.out.println("Light is turned OFF");
            isOn = false;
        } else {
            System.out.println("Light is turned ON");
            isOn = true;
        }
    }
}


