
public class Director {
	public void NormalPC(Builder builder) {
		System.out.println("Building normal PC with the following configurations:-");
		builder.RAM("12GB").Processor("Core i5")
				.HardDisk("1TB").SSD(false)
				.Display("15\" Monitor");
	}
	
	public void GamingPC(Builder builder) {
		System.out.println("Building gaming PC with the following configurations:-");
		builder.RAM("16GB").Processor("Core i7")
				.HardDisk("2TB").SSD(true)
				.Display("24\" Monitor");
	}
}
