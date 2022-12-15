
public class CurtainCommands implements ICommand {
	private Curtain curtain;
	public CurtainCommands(Curtain curtain) {
		// TODO Auto-generated constructor stub
		this.curtain = curtain;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		curtain.CurtainsOpen();
	}
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		curtain.CurtainsClosed();
	}
}
