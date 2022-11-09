import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		int choice = 0;
		boolean condition = false;

		do {
			System.out.println("What do you want to order?\n1. Beef Burger\n2.Veggie Burger\n");

			choice = get.nextInt();
			
			if (choice == 1) {
				Restaurant beef = new BeefBurgerRestaurant();
				beef.orderBurger();		
			} else if (choice == 2) {
				Restaurant veggie = new VeggieBurgerRestaurant();
				veggie.orderBurger();		
			} else {
				System.out.println("Invalid order choice!");
			} 
			
			System.out.println("Want to order(Yes/No)?\n");
			String order_choice = get.next();
			condition = (order_choice.equals("Yes") || order_choice.equals("yes")) ? true : false;
			
		} while (condition);
		
		System.out.println("*** Thank You! ----- See you soon! ----- Have a good day! :) ***");
	}

}
