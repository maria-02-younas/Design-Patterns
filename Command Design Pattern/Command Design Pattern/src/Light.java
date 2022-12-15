
// Receiver
public class Light {
	private boolean light;
	public void switchLightsOn() {
		light = !light;
		System.out.println("Lights are switched on = " + light);
	}
	public void switchLightsOff() {
		light = !light;
		System.out.println("Lights are switched off = " + light);
	}
}