package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public void setLength(double inputLength) {
		length = inputLength;
	}
	public void setWidth(double inputWidth) {
		width = inputWidth;
	}
	
	public double returnArea(){
		return length * width;
	}
	public double returnPerimeter(){
		return (length + width)*2;
	}
	
	public boolean isSquare() {
		return (length == width);
	}
	public void printRectangle() {
		StdDraw.rectangle(0.5, 0.5, length, width);
	}
		
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(0.04);
		r.setWidth(0.05);
		r.printRectangle();
	}
}
