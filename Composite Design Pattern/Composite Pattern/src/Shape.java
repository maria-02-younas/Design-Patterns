import java.util.ArrayList;
import java.util.List;

public class Shape implements DrawingObjects {
	private List<DrawingObjects> objects = new ArrayList<DrawingObjects>();
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (DrawingObjects drawingObjects : objects) {
			drawingObjects.draw();
			System.out.println("Shape drawn");
		}
	}
	
	public void add(DrawingObjects object) {
		if (object.getClass() != new Text().getClass() && object.getClass() != new Picture().getClass()) {
			objects.add(object);
		} else {
			System.out.println("Could not add " + object.getClass() + " type of object");
		}
	}
}
