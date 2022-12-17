
public class Apple extends SmartPhones {
	private double iOSVersion;
	
	private Apple(Apple applePhone) {
		// TODO Auto-generated constructor stub
		super(applePhone);
		this.iOSVersion = applePhone.iOSVersion;
	}
	
	public Apple(String model, double price, double width, double height, double iOSVersion) {
		// TODO Auto-generated constructor stub
		super(model, price, width, height);
		this.iOSVersion = iOSVersion;
	}
	
	@Override
	public SmartPhones clone() {
		// TODO Auto-generated method stub
		return new Apple(this);
	}
}
