// 보안 시스템의 '비활성화' 상태 구현
public class InactiveState implements SecurityState {
    @Override
    public void handleAction() {
        System.out.println("Security System is inactive"); // 보안 시스템이 비활성화됨을 출력
    }
}

