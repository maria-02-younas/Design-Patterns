
// Receiver
public class Curtain {
	private boolean curtain;
	public void CurtainsOpen() {
		curtain = !curtain;
		System.out.println("Curtains are open = " + curtain);
	}
	public void CurtainsClosed() {
		curtain = !curtain;
		System.out.println("Curtains are closed = " + curtain);
	}
}
