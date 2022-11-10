
public class FileLog implements ILogger {
	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error messages are logging in file.\n" + msg);
	}
}
