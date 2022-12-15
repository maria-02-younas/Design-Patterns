
// Invoker
public class Room {
	ICommand command;
	public Room(ICommand command) {
		// TODO Auto-generated constructor stub
		this.command = command;
	}
	public void executeCommand() {
		command.execute();
	}
	public void unexecuteCommand() {
		command.unexecute();
	}
}