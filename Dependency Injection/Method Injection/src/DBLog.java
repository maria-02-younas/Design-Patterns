
public class DBLog implements ILogger {
	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error messages are logging in DB.\n" + msg);
	}
}
