import java.util.ArrayList;
import java.util.List;

public class Picture implements DrawingObjects {
	private List<DrawingObjects> objects = new ArrayList<DrawingObjects>();
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (DrawingObjects drawingObjects : objects) {
			drawingObjects.draw();
		}
		System.out.println("Draw Pictures");
	}
	
	public void add(DrawingObjects object) {
		objects.add(object);
	}
}
