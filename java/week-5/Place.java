import java.util.*;

enum Prize
{
	FIRST("1/2 Story Bungalow at Mount Calista"), SECOND("Holiday Package for 4 to Niagara Falls&Grand Canyon exclusive Airport Tax and Food"), THIRD("ESQ Course Package-Gratis"), CONSOLATION("Trishaw rid to office every Friday");

	private String detail;
	private Prize(String detail)
	{
		this.detail=detail;
	}
	public String getDetail()
	{
		return detail;
	}
}

public class Place
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Prize Place: (First, Second, Third, Consolation) ");
		String inp = input.next().toUpperCase();
		Prize place = Enum.valueOf(Prize.class, inp);
		System.out.println("Place = " + place);
		System.out.println("Prize = " + place.getDetail());
		System.gc();

	}
}
