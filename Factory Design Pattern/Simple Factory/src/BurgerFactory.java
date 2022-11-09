
public class BurgerFactory {
	public IBurger createBurger(String request) {
		IBurger iburger = null;
		
		if ("BEEF".equals(request)) {
			iburger = new BeefBurger();
		} else if ("VEGGIE".equals(request)) {
			iburger = new VeggieBurger();
		}
		
		return iburger;
	}
}
