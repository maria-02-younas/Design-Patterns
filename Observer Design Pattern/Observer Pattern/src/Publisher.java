import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {
	private Map<String, Subscriber> subscriber_names = new HashMap<String, Subscriber>();
	
	public void subscriber(String string, Subscriber subscriber) {
		subscriber_names.put(string, (Subscriber) subscriber);
		System.out.println(string + " subscribed");
	}
	
	public void unsubscribe(String string) {
		subscriber_names.remove(string);
		System.out.println(string + " unsubscribed");
	}
	
	public void notify_All() {
		System.out.println("======================================");
		subscriber_names.forEach((string, subscribers) -> ((Subscriber) subscribers).update(string));
	}
	
}