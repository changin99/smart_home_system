import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeviceFactory factory = new SimpleDeviceFactory();
        Device light = factory.createDevice("light");
        Device thermostat = factory.createDevice("thermostat");
        AdvancedDevice smartSpeaker = new SmartSpeaker();
        Device speakerAdapter = new DeviceAdapter(smartSpeaker);
        SecuritySystem securitySystem = SecuritySystem.getInstance();
        

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Toggle light");
            System.out.println("2. Set thermostat temperature");
            System.out.println("3. Toggle speaker");
            System.out.println("4. Toggle security system state");
            System.out.println("5. Activate night mode scenario");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Toggle light
                    light.performAction();
                    break;
                case 2:
                    // Set thermostat temperature
                    System.out.print("Enter new temperature: ");
                    int temp = scanner.nextInt();
                    ((Thermostat)thermostat).setTemperature(temp);
                    thermostat.performAction();
                    break;
                case 3:
                    // Toggle speaker
                    speakerAdapter.performAction();
                    break;
                case 4:
                    // Toggle security system state
                    if (securitySystem.getState() instanceof InactiveState) {
                        securitySystem.setState(new ActiveState());
                    } else {
                        securitySystem.setState(new InactiveState());
                    }
                    securitySystem.handleAction();
                    break;
                case 5:
                    // Activate night mode scenario
                    HomeScenario nightMode = new NightMode();
                    nightMode.performScenario();
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}



