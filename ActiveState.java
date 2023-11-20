// 보안 시스템의 '활성화' 상태 구현
public class ActiveState implements SecurityState {
    @Override
    public void handleAction() {
        System.out.println("Security System is active and monitoring"); // 보안 시스템이 활성화되어 감시 중임을 출력
    }
}

