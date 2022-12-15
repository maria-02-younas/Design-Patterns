
public class SwitchLightsCommands implements ICommand {
	private Light light;
	public SwitchLightsCommands(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.switchLightsOn();
	}
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		light.switchLightsOff();
	}
}
