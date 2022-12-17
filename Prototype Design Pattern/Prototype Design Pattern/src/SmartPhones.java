
public abstract class SmartPhones {
	private String model;
	private double price;
	private double width;
	private double height;
	
	protected SmartPhones(SmartPhones phone) {
		// TODO Auto-generated constructor stub
		this.model = phone.model;
		this.price = phone.price;
		this.width = phone.width;
		this.height = phone.height;
	}
	
	public SmartPhones(String model, double price, double width, double height) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.price = price;
		this.width = width;
		this.height = height;
	}

	public abstract SmartPhones clone();
}
