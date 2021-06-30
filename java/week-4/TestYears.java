//Program 2.7
import java.util.Scanner;
public class TestYears {
 public static void main (String [] args) {
  int thisYear = 2020;
  int prevYear;
  int age, yearService, workYear;

  Scanner kb = new Scanner(System.in);
  System.out.print("Year born: ");
  prevYear = kb.nextInt();
  age = calcYears(thisYear, prevYear);
  System.out.println("Your age: " + age);
  System.out.print("Year started working: ");
  workYear = kb.nextInt();
  yearService = calcYears(thisYear, workYear);
  System.out.print("Year of Service: "+yearService);
}
 public static int calcYears(int current, int previous)
{
  return current-previous;
}
}