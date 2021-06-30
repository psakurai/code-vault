import java.util.*;

enum Acidity
{
	RED("Acidic Substance"), BLUE("Basic Material"), Purple("Neutral");

	private String message;
	private Acidity(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}

public class Liquid
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Liquid Color: (Red, Blue, Purple) ");
		String inp = input.next().toUpperCase();
		Acidity color = Enum.valueOf(Acidity.class, inp);
		System.out.println("Acidity = " + color);
		System.out.println("Message = " + color.getMessage());
		System.gc();

	}
}
