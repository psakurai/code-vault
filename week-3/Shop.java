import java.util.Scanner;
public class Shop {
   public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	String itemName;
	int quantity;
	double price;
	double disc=0;
	double afterPrice;

 	System.out.print("Enter Item Name:");
 	itemName = input.nextLine();
 	System.out.print("Enter Item Price:");
 	price = input.nextDouble();
	System.out.print("Enter Quantity of Item:");
	quantity = input.nextInt();
	
	if(quantity>=10 && quantity<=49)
		disc=1.1;
	else if(quantity>=50 && quantity<=99)
		disc=1.2;
	else if(quantity>=100 && quantity<=149)
		disc=1.3;
	else if(quantity>=150)
		disc=1.4;
	System.out.println("-----"+itemName+"-----");
	if(disc==0)	
		System.out.println("Amount of Discount: No Discount!");
	else	
		System.out.println("Amount of Discount: "+String.format("%.2f",((disc-1.0)*100))+"%");
	afterPrice=(quantity*price)*(1-(disc-1));	
	System.out.println("Amount After Discount: RM"+String.format("%.2f",afterPrice));
 }
}