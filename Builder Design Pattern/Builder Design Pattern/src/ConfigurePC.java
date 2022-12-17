
public class ConfigurePC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		
		PCBuilder normalPC = new PCBuilder();
		director.NormalPC(normalPC);
		System.out.println(normalPC.build());
		
		PCBuilder gamingPC = new PCBuilder();
		director.GamingPC(gamingPC);
		System.out.println(gamingPC.build());
	}

}
