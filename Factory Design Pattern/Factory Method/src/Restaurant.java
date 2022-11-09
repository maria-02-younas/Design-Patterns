
public abstract class Restaurant {
	public void orderBurger() {
		System.out.println("Ordering Burger...");
		IBurger burger = createBurger();
		burger.prepare();
	}
	public abstract IBurger createBurger();
}
