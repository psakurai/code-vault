
import java.util.ArrayList;
class Circle
{
 private double radius;
 public Circle(double radius)
 {
 this.radius = radius;
 }
 public double getRadius()
 {
 return radius;
 }
 public void setRadius()
 {
 this.radius = radius;
 }
 public double getArea ()
 {
 return (Math.PI*radius*radius);
 }
}
class Rectangle
{
 private double length;
 private double width; 
 public Rectangle(double length, double width)
 {
 this.length = length;
 this.width = width;
 }
 public double getLength()
 {
 return length;
 }
 public void setLength()
 {
 this.length = length;
 }
 public double getWidth()
 {
 return width;
 }
 public void setWidth()
 {
 this.width = width;
 }
 public double getArea ()
 {
 return (length*width);
 }
}
public class TestCircle
{
 public static void main (String [] args)
 {
 ArrayList<Circle>circList = new ArrayList<Circle>();
 circList.add(new Circle(2.3));
 circList.add(new Circle(3.3));
 circList.add(new Circle(4.3));
 circList.add(new Circle(5.3));
 circList.add(new Circle(6.3));
 circList.remove(1);
 System.out.printf("The area of the circle : %2.2f",((Circle)circList.get(0)).getArea());
 System.out.println(" ");
 for(int i = 0; i < circList.size(); i++ ){
 	System.out.printf("The area of circle index "+i+" : %2.2f",((Circle)circList.get(i)).getArea());
 	System.out.println(" ");
  }
 System.out.println(" "); 
 ArrayList<Rectangle>rectList = new ArrayList<Rectangle>(); 
 rectList.add(new Rectangle(2.3,4.3));
 rectList.add(new Rectangle(3.3,5.3));
 rectList.add(new Rectangle(4.3,6.3));
 rectList.add(new Rectangle(5.3,7.3));
 for(int i = 0; i < circList.size(); i++ ){
 	System.out.printf("The area of rectangle index "+i+" : %2.2f",((Rectangle)rectList.get(i)).getArea());
 	System.out.println(" ");
  } 
 }
}
