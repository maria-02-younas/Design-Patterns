
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPizza normal = new NormalPizza();
		normal.prepare();
		
		System.out.println("===================================================");
		
		IPizza extra_cheese = new ExtraCheese(new NormalPizza());
		extra_cheese.prepare();
		
		System.out.println("===================================================");
		
		IPizza spicy = new Spicy(new NormalPizza());
		spicy.prepare();

	}

}