import java.util.Scanner;

public class Chemical {
	private String name;
	private String symbol;
	private int atomicNumber;
	private double atomicWeight;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol=symbol;
	}
	public int getNumber() {
		return atomicNumber;
	}
	public void setNumber(int number) {
		this.atomicNumber=number;
	}
	public double getWeight() {
		return atomicWeight;
	}
	public void setWeight(double atom) {
		this.atomicWeight=atom;
	}	
	public void readInput() {
	Scanner myObj = new Scanner(System.in); 
	System.out.println("Please enter the requested information to create a new chemical");
	System.out.println("object.");
	System.out.println("Enter the chemical's name: ");
	name=myObj.nextLine();
	System.out.println("Enter the chemical's symbol: ");
	symbol=myObj.nextLine();
	System.out.println("Enter the chemical's atomic number: ");
	atomicNumber=myObj.nextInt();
	System.out.println("Enter the chemical's atomic weight: ");
	atomicWeight=myObj.nextDouble();
	System.out.println("You just entered information for "+getName()+".");
	}
        public static void main(String[] args) {
		Chemical obj1=new Chemical();
		obj1.readInput();
		Chemical obj2=new Chemical();
		obj2.setName("Sodium");
		obj2.setSymbol("Na");
		obj2.setNumber(11);
		obj2.setWeight(22.98977);
		System.out.println("And here are its details: "+obj1.getName()+" ["+obj1.getSymbol()+", "+obj1.getNumber()+
		", "+obj1.getWeight()+"]");
		System.out.println("Here is another chemical: "+obj2.getName()+" ["+obj2.getSymbol()+", "+obj2.getNumber()+
		", "+obj2.getWeight()+"]");
	}
}
