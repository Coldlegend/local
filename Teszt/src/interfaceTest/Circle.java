package interfaceTest;

import java.util.Observable;

public class Circle extends Observable{
	private Point center;
public void setCenter(Point center){
	this.center = center;
	setChanged();
	notifyObservers();
	
}	
private int radius;
public void setRadius(int radius){
	this.radius = radius;
	setChanged();
	notifyObservers();
}
public Circle (int x, int y, int r){
	center = new Point(x,y);
	radius = r;
}
public String toString(){
	return "center = " + center + " and radius = " + radius; 
}
}