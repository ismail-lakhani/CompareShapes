//To keep all the required classes in the same package 
package compareShapes;

/* Author Ismail Lakhani */ 
public abstract class Shape implements ShapesRelate {
	
	//Declaring data types and values
	private int value =0;
	protected double area;

	public Shape() {
			area =0.00;
		}

	
	public double getArea() {
			return area ;
		}

	
	abstract void calculateArea();

	public int CompareShapes(ShapesRelate shape)

	{

	if (getArea() > ((Shape) shape).getArea()){

	value = 1;

	}

	else

	if (getArea() < ((Shape) shape).getArea()){

	value = -1;

	}

	else {

	value = 0;

	}

	return value;

	}//End of 'if-else block
	
   
}//ENd of Circle class
