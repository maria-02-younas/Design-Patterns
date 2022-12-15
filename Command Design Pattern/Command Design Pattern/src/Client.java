
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room livingRoomLights = new Room(new SwitchLightsCommands(new Light()));
		Room livingRoomCurtains = new Room(new CurtainCommands(new Curtain()));
		
		System.out.println("--------------------- Living Room ---------------------");
		livingRoomLights.executeCommand();
		livingRoomCurtains.executeCommand();
		System.out.println("----------------------------------------");
		livingRoomLights.unexecuteCommand();
		livingRoomCurtains.unexecuteCommand();
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		Room bedRoomLights = new Room(new SwitchLightsCommands(new Light()));
		System.out.println("--------------------- Bed Room ---------------------");
		bedRoomLights.executeCommand();
		System.out.println("----------------------------------------");
		bedRoomLights.unexecuteCommand();
	}
}