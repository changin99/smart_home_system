public class SecuritySystem {
    private SecurityState state;
    private static SecuritySystem instance = new SecuritySystem();

    private SecuritySystem() {
        this.state = new InactiveState(); // 초기 상태 설정
    }

    public static SecuritySystem getInstance() {
        return instance;
    }

    public SecurityState getState() {
        return this.state; // 현재 상태 반환
    }

    public void setState(SecurityState state) {
        this.state = state;
    }

    public void handleAction() {
        state.handleAction();
    }
}




