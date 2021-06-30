import javax.swing.JOptionPane;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String Name;
      String Hours;
      String Ans;
      double Salary;

for(int x=0; x<5;x++) {
	Name=JOptionPane.showInputDialog("Name: ");
 	Hours=JOptionPane.showInputDialog("Hours Worked");
	double temp=Double.parseDouble(Hours);
	Salary=(30.0*temp);
	System.out.println("Name : "+Name);
	System.out.println("Hours : "+Hours);
	System.out.println(String.format("Salary : RM %.2f",Salary));
	System.out.println("");

	 }
    }
}
