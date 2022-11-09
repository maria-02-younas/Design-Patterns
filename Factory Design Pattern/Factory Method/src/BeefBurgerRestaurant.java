
public class BeefBurgerRestaurant extends Restaurant {
	@Override
	public IBurger createBurger() {
		// TODO Auto-generated method stub
		System.out.println("Creating Beef Burger");
		return new BeefBurger();
	}
}
