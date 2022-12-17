import java.util.ArrayList;
import java.util.List;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SmartPhones> phones = List.of(
				new Samsung("Galaxy Note 5", 23500.3, 4.3, 5.4, 5.1),
				new Apple("iPhone6", 120000, 4.5, 5.7, 6.1),
				new Samsung("Galaxy Note 3", 22700.3, 5.3, 5.7, 6.0),
				new Apple("iPhone12", 240000, 5.5, 6.7, 9.1),
				new Apple("iPhone12", 240000, 5.5, 6.7, 9.1)
		);
		
		List<SmartPhones> copyPhones = new ArrayList<>();
		for (SmartPhones phone : phones) {
			copyPhones.add(phone.clone());
		}
		
		copyPhones.forEach(System.out::println);
	}

}
