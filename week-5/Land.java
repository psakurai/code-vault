import java.util.Scanner;
import javax.swing.*;
public class Land
{
 	public static void main(String[] args)
 	{
 	String input;
 	Double length,width;
 	input = JOptionPane.showInputDialog("Length (in hectar): ");
 	length = Double.parseDouble(input);
 	input = JOptionPane.showInputDialog("Width (in hectar): ");
 	width = Double.parseDouble(input);
	Double area=length*width;
	JOptionPane.showMessageDialog(null,String.format("Area : %.2f", area)+" hectar");
 	}
}
