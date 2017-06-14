package factoryDesignPattern;

public class Test {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.createNewShape("Circle");
		canvas.createNewShape("Rectangle");
		canvas.createNewShape("Square");
		canvas.redraw();
	}
}