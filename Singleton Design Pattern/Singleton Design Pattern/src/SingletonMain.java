
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass object1 = SingletonClass.getInstance("Object1 created");
		System.out.println("Data = " + object1.getData());
		
		SingletonClass object2 = SingletonClass.getInstance("Object2 created");
		System.out.println("Data = " + object2.getData());
	}

}
