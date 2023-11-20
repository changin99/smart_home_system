public class SetThermostatCommand implements Command {
    private Thermostat thermostat;

    public SetThermostatCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.performAction();
    }
}


