import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Method Injection\n");
		
		int choice = -1;
		boolean flag = false;
		
		Scanner get = new Scanner(System.in);
		
		Logger log = new Logger();
		
		do {
			System.out.println("Choose your message log type:\n1. File\n2. DB\n");
			choice = get.nextInt();
			
			if (choice == 1) {
//				Logger logging = new Logger(new FileLog());
				log.log_msg(new FileLog(), "Exception logged");
			} else if (choice == 2) {
//				Logger logging = new Logger(new DBLog());
				log.log_msg(new DBLog(), "Exception logged");
			} else {
				System.out.println("Please enter correct log type.");
			}
			
			System.out.println("\nDo you want to continue?\n1. Yes\n2. No");
			int c = get.nextInt();
			
			if (c == 1) {
				flag = true;
			} else {
				flag = false;
			}
			
		} while (flag);
		
		System.out.println("Thank You :)");
	}

}
