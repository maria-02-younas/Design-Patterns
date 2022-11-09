
public class Restaurant {
	public IBurger orderBurger(String request) {
		BurgerFactory b_factory = new BurgerFactory();
		IBurger burger = b_factory.createBurger(request);
		burger.prepare();
		return burger;
	}
}
