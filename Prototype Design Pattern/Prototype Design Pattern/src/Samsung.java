
public class Samsung extends SmartPhones {
	private double androidVersion;
	
	private Samsung(Samsung samsungPhone) {
		// TODO Auto-generated constructor stub
		super(samsungPhone);
		this.androidVersion = samsungPhone.androidVersion;
	}
	
	public Samsung(String model, double price, double width, double height, double androidVersion) {
		// TODO Auto-generated constructor stub
		super(model, price, width, height);
		this.androidVersion = androidVersion;
	}
	
	@Override
	public SmartPhones clone() {
		// TODO Auto-generated method stub
		return new Samsung(this);
	}
}
