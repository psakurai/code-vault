import java.util.*;

public class ComputerSales
{	
	public static void main(String[] args)
	{
	ComputerSales obj=new ComputerSales();
	Scanner input = new Scanner(System.in);
	int[] pcSold={0,0,0,0,0,0};
	String [] months={"Jan","Feb","Mac","April","May","Jun"};	
	int total=0;
	int highest=0;
	for(int x=0;x<6;x++)
	{
		System.out.println("Month: "+months[x]);
		System.out.print("Enter Number of computers sold: ");	
		pcSold[x] = input.nextInt();
		System.out.println("");
				
		total+=pcSold[x];
		if(pcSold[x]>highest)
			highest=pcSold[x];
	}

	System.out.println("---------------------------------");
	int m=1;
	for(int x:pcSold)
	{
		System.out.println("Month: "+m);	
		System.out.println("Number of computers sold: "+x);
		System.out.println("");
		m++;
	}
	System.out.println("Total sales for "+pcSold.length+" months: "+total);		
	for(int x=0;x<6;x++)
	{
		if(pcSold[x]==highest)
			System.out.println("Month with the highest sales: "+months[x]+" with "+highest+" sales.");
	}
	}
}

