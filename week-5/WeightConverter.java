import java.util.*;

enum Gravity
{
	EARTH(9.81), MOON(0.167);

	private Double Weight;
	private Double Mass;
	private Gravity(Double w)
	{
		
		this.Weight=w;
	}
	public void setMass(Double m)
	{
		this.Mass=m;
	}
	public Double getWeight()
	{
		return Mass*Weight;
	}
}

public class WeightConverter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Mass(in kg): ");
		Double mass = input.nextDouble();
		System.out.print("Enter (Earth, Moon) Gravity : ");
		String inp = input.next().toUpperCase();
		Gravity pl = Enum.valueOf(Gravity.class, inp);
		System.out.println("Gravity = " + pl);
		pl.setMass(mass);
		System.out.println("Weight = " + String.format("%.3f",pl.getWeight( ))+"N");
		System.gc();

	}
}
