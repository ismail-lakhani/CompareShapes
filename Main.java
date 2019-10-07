//To keep all the required classes in the same package 
package compareShapes;

/* Author Ismail Lakhani */ 
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        

    	System.out.println ("This program claculates the area of the circle and the rectangle\nand displays the largest shape in the collection");
    	
    	ArrayList<Shape>shapeList = new ArrayList<>();

    	Shape circle1 = new Circle(2);

    	Shape circle2 = new Circle(5);

    	Shape circle3 = new Circle(7);

    	Shape rectangle1 = new Rectangle(4,3);

    	Shape rectangle2 = new Rectangle(7,7);

    	shapeList.add(circle1);

    	shapeList.add(circle2);

    	shapeList.add(circle3);

    	shapeList.add(rectangle1);

    	shapeList.add(rectangle2);

    	for (Shape i : shapeList)

    	{

    	i.calculateArea();

    	System.out.println(i.toString());

    	}

    	System.out.println("\nLargest shape in the collection \n" + largestShape(shapeList));

    	System.out.println("\n");

    	}

    	//static method which lies outside main function

    	public static Shape largestShape(ArrayList<Shape>shapeList)

    	{

    	Shape largestShape = shapeList.get(0);

    	for (int index=0; index < shapeList.size();index++)

    	{

    	if (shapeList.get(index).CompareShapes(largestShape)==1)

    	{

    	largestShape=shapeList.get(index);

    	}

    	}

    	return largestShape;  
    	}}
