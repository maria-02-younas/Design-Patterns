
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		line.draw();
		
		System.out.println("==================================================");
		
		Picture picture = new Picture();
		picture.add(new Line());
		picture.add(new Text());
		picture.draw();
		
		System.out.println("==================================================");
		
		Shape shape = new Shape();
		shape.add(new Line());
		shape.add(new Text());
		shape.draw();
	}
}
