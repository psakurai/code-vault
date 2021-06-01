import java.util.Scanner;
public class Carpet {
   public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	String brandName;
	double length, width;
	double area;
 	System.out.print("Enter the carpet brand:");
 	brandName = input.nextLine();
	System.out.print("Enter the carpet length:");
	length = input.nextDouble();
	System.out.print("Enter the carpet width:");
	width = input.nextDouble();
	area = width * length;
	System.out.print("The area of carpet of "+String.format("%.0f",length) + " x " +String.format("%.0f",width));
 	System.out.print(" is RM"+String.format("%.2f",area));
 }
}
