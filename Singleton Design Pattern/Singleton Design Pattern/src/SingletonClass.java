
public class SingletonClass {
	private static SingletonClass instance;
	private String data;
	
	private SingletonClass(String data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	public static SingletonClass getInstance(String data) {
		if (instance == null) {
			instance = new SingletonClass(data);
		}
		return instance;
	}
	public String getData() {
		return data;
	}
}
