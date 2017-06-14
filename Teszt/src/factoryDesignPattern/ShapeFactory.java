package factoryDesignPattern;

public class ShapeFactory {
	public static Shape getShape(String inputType) {
		switch (inputType) {
		case "Circle":
			return new Circle(10, 10, 20);
		case "Rectangle":
			return new Rectangle(10, 20);
		case "Square":
			return new Square(10);
		}
		return null;
	}
}