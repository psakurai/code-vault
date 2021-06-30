import java.util.ArrayList;

public class Town {
  public static void main(String[] args) {
    ArrayList<String> townlist = new ArrayList<String>();
    townlist.add("Kangar");
    townlist.add("Penang");
    townlist.add("Kuala Lumpur");
    townlist.add("Johor Bahru");
    System.out.print("TownList : ");
    for (int i = 0; i < townlist.size(); i++){
    	System.out.print(townlist.get(i)+" ");
    }
    System.out.println(" ");
    if(townlist.contains("Shah Alam"))
    	System.out.println("Shah Alam Found");
    else 
    	System.out.println("Shah Alam Not Found ");
    	
    townlist.add(3,"Shah Alam");
    townlist.remove("Kuala Lumpur");
    townlist.remove(0);
    System.out.println("Shah Alam is located at Index : "+townlist.indexOf("Shah Alam"));
    townlist.set(0, "Muar");
    if(townlist.isEmpty())
    	System.out.println("Array List is Empty !");
    else 
    	System.out.println("Array List is Not Empty !");
  }
}
