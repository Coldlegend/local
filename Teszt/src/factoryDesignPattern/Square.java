package factoryDesignPattern;

public class Square implements Shape {

	private int allSideSize;

	public Square(int allSideSize) {
		this.allSideSize = allSideSize;
		System.out.println("Square constructor");
	}

	@Override
	public void draw() {
		System.out.println("Square draw()");
	}

}
