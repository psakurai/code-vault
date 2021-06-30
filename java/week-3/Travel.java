public class Travel
{
	private String destination;
	private String name;
	private String address;
	private double price;
    
	public Travel() {
		destination=""; 
		name="";
		address="";
		price=0.0;
	}
	public Travel(String destination,String name) {
		this.destination=destination; 
		this.name=name;
	} 
	public String getDestination() {
        	return  destination;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getPrice() {
        	return price;
        }
	public void setName(String name) {
        	this.name=name;
    	}
	public void setDestination(String destination) {
        	this.destination=destination;
        }
	public void setAddress(String address) {
        	this.address=address;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
	public void display() {
		System.out.println("Destination: "+ destination);
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Total Price: RM "+String.format("%.2f", price));
	}      
	public static void main(String [] args)	
	{
		Travel Obj1=new Travel();
		Obj1.setDestination("Japan");
		Obj1.setName("Danial");
		Obj1.setAddress("Room 1, Jalan Bangunan 1, Bandar 1");
		Obj1.setPrice(150.0);
		Obj1.display();
		System.out.println("");
		Travel Obj2=new Travel("France","Iskandar");
		Obj2.setAddress("Room 2, Jalan Bangunan 2, Bandar 2");
		Obj2.setPrice(160.0);
		Obj2.display();

       }
}


