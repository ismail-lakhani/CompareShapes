package compareShapes;

/* Author Ismail Lakhani */ 

//Importing packages to convert the decimal 
import java.text.DecimalFormat;
//To keep all the required classes in the same package 
public class Circle extends Shape{
	

	
	private double radius;
	//Predefined value of 'pi'
	private static final double pi = 3.14 ;
	//To convert the values into 2 decimal format (e.g: 4.5678 -> 4.57)
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	public Circle() {
			super();
			}

	public Circle(double radius) {
			super();
			this.radius=radius;
			}

	//Using getter to get the value of the radius of the circle
	public double getRadius() {
			return radius;
			}
	//Setting the radius value using setter
	public void setRadius(double radius) {
				this.radius = radius;
				}

	//Geometrical formula to calculate the area of the circle
	public void calculateArea() {
	area =getRadius()*getRadius()*pi;
	}

	@Override
	public String toString() {
	return  

	"\nLength of the circle is : " + getRadius() +

	"\npi value is : " + pi +

	"\nArea the circle is : " + df2.format(getArea()) +

	"\n------------------------------------------------";

	}
	
	
	}//End of circle class