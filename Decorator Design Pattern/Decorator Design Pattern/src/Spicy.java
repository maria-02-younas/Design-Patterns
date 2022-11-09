
public class Spicy extends PizzaDecorator {
	public Spicy(IPizza decorated_spicy_pizza) {
		// TODO Auto-generated constructor stub
		super(decorated_spicy_pizza);
	}
	
	private void addSpice() {
		System.out.println("Spice added!");
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		addSpice();
	}
}