import java.util.Scanner;

public class Fruit {
	private String name;
	private String country;
	private boolean edible;
	private double price;
	
	public Fruit() {
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String newCountry) {
		this.country=newCountry;
	}
	public boolean getEdible() {
		return edible;
	}
	public void setEdible(boolean newEdible) {
		this.edible=newEdible;
	}	
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice) {
		if(edible==false)
			this.price=newPrice;
	}		
	public void readInput() {
	Scanner myObj = new Scanner(System.in); 
	System.out.println("");
	System.out.println("Please enter the requested information.");
	System.out.print("Enter the fruit's name: ");
	name=myObj.nextLine();
	System.out.print("Enter the fruit's country origin: ");
	country=myObj.nextLine();
	System.out.println("Enter the fruit's edibility: True/False");
	edible=myObj.nextBoolean();
	System.out.print("Enter the fruit's price: RM ");
	price=myObj.nextDouble();
	System.out.println("You just entered information for "+getName()+".");
	}
        public static void main(String[] args) {
		Fruit obj1=new Fruit();
		Fruit obj2=new Fruit();
		Fruit obj3=new Fruit();
		obj1.readInput();
		obj1.setPrice(0);
		obj2.readInput();
		obj2.setPrice(0);
		obj3.readInput();
		obj3.setPrice(0);
		System.out.println("And here are its details: \n"+"Name: "+obj1.getName()+
		"\n Country: "+obj1.getCountry()+"\n Edible: "+obj1.getEdible()+"\n Price/kg(RM): "+String.format("%.2f", obj1.getPrice()));
		System.out.println("");
		System.out.println("\nName: "+obj2.getName()+
		"\n Country: "+obj2.getCountry()+"\n Edible: "+obj2.getEdible()+"\n Price/kg(RM): "+String.format("%.2f", obj2.getPrice()));
		System.out.println("");		
		System.out.println("\n Name: "+obj3.getName()+
		"\n Country: "+obj3.getCountry()+"\n Edible: "+obj3.getEdible()+"\n Price/kg(RM): "+String.format("%.2f", obj3.getPrice()));
	}
}
