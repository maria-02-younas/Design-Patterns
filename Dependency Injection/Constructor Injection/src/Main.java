import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		int choice = -1;
		
		ILogger log = null;
		
		boolean flag = false;
		
		do {
			System.out.println("Choose your message log type:\n1. File\n2. DB\n");
			choice = get.nextInt();
			
			if (choice == 1) {
//				Logger logging = new Logger(new FileLog());
				log = new FileLog();
			} else if (choice == 2) {
//				Logger logging = new Logger(new DBLog());
				log = new DBLog();
			} else {
				System.out.println("Please enter correct log type.");
			}
			
			Logger logging = new Logger(log);
			
			logging.log_msg("Exception logged");
			
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
