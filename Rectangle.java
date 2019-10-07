//To keep all the required classes in the same package 
package compareShapes;

/* Author Ismail Lakhani */ 
//Importing packages to convert the decimal 
import java.text.DecimalFormat;


public class Rectangle extends Shape{
	
	
	private double length;
	private double width;
	
	//To convert the values into 2 decimal format (e.g: 4.5678 -> 4.57)
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	
	public Rectangle() {
		super();
		}

	public Rectangle(double width,double length) {

	super();

	this.length=length;

	this.width=width;

	}

	//To get the length of the rectangle
	public double getLength() {

	return length;
	}
	
	//Using setter to set the length value of the rectangle
	public void setLength(double length) {

	this.length = length;

	}

	//Using getter to get the width of the rectangle
	public double getWidth() {

	return width;

	}

	void calculateArea() {

	//Geometrical formula to calculate area of rectangle
	area =getLength()*getWidth();
	}

	//Setting the width of the rectangle
	public void setWidth(double width) {
			this.width = width;
			}

	@Override
	public String toString() {
			return 

	"\nLength of the rectangle : " + getLength() +

	"\nWidth of the rectangle : " + getWidth() +

	"\nArea of the rectangle is : " + df2.format(getArea())  + 
	"\n------------------------------------------------";

	}
	
	
}//End of Rectangle class

