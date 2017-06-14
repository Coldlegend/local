package factoryDesignPattern;

public class Rectangle implements Shape {
	private int height;
	private int lenght;

	public Rectangle(int lenght, int height) {
		this.lenght = lenght;
		this.height = height;
		System.out.println("Rectangle construcor");

	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
	}

}