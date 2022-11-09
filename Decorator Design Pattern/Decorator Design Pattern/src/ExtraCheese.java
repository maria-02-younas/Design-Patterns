
public class ExtraCheese extends PizzaDecorator {
	public ExtraCheese(IPizza decorated_extra_cheese_pizza) {
		// TODO Auto-generated constructor stub
		super(decorated_extra_cheese_pizza);
	}
	
	private void addExtraCheese() {
		System.out.println("Extra cheese added!");
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		addExtraCheese();
	}
}