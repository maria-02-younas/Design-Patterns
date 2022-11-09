
public class VeggieBurgerRestaurant extends Restaurant {
	@Override
	public IBurger createBurger() {
		// TODO Auto-generated method stub
		System.out.println("Creating Veggie Burger");
		return new VeggieBurger();
	}
}
