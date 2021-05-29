//NAME: ARIF AMIRUDDIN BIN SADIRAN
//MATRIC ID: A19EC0022
//SECTION: 05

//TestBaggage class is the main program class.
//private Passenger passenger denotes the composition relation from Passenger class,
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TestBaggage {
  private Passenger passenger;

  public static void main(String[] args) {
    //Try and catch is used for exception handling
    try {
      //1. Opening and read the input file into an arraylist
      File ifile = new File("input.txt");
      Scanner input = new Scanner(ifile);
      ArrayList<String> data = new ArrayList<String>();
      //2. Creating all object from different class
      Passenger[] passenger = new Passenger[14];
      Seat[] seat = new Seat[14];
      Carry_on_bag[] carry_on_bag = new Carry_on_bag[14];
      Baggage[] baggage = new Baggage[14];
      Excess_Baggage[] excess_baggage = new Excess_Baggage[14];
      MembershipTest[] membership = new MembershipTest[14];
      //3. Separating input by ,
      while (input.hasNextLine()) {
        for (String i: (input.nextLine()).split(", ")) {
          data.add(i);
        }
      }
      int y=0;
      //4. Inserting all data to its appropriate object
      for(int x=0;x<120;x=x+9){
        seat[y] = new Seat(data.get(x+2));
        membership[y] = new MembershipTest(data.get(x+5));
        passenger[y] = new Passenger(data.get(x),data.get(x+1),seat[y],membership[y]);
        carry_on_bag[y] = new Carry_on_bag(Integer.parseInt(data.get(x+3)),Double.parseDouble(data.get(x+4)));
        excess_baggage[y] = new Excess_Baggage(data.get(x+8));
        baggage[y] = new Baggage(Double.parseDouble(data.get(x+6)),Integer.parseInt(data.get(x+7)),carry_on_bag[y],excess_baggage[y]);
        y++;
      }
      //5. Printing the final output
      for(int x=0;x<14;x++){
          System.out.println("Passenger Name : " + passenger[x].getName());
          System.out.println("Destination : " + passenger[x].getDestination());
          System.out.println("Seat : " + seat[x].type);
          System.out.println("Carry-On Bag – " + carry_on_bag[x].getPieces() + " piece (s), " + carry_on_bag[x].getWeight()+ " kg");
          {
            //6. Checking the limit weight for carry on bag
            if ((seat[x].type).equals("Economy")) {
            if (carry_on_bag[x].getWeight() <= 7.0) {
              System.out.println("Sufficient for Carry-On");
            }
            else {
              System.out.println("CARRY_ON BAG EXCEED THE ALLOWED WEIGHT: 7.0 kg ONLY");
            }
          }
          else if ((seat[x].type).equals("First") || (seat[x].type).equals("Business")) {
            if (carry_on_bag[x].getWeight() <= 15.0) {
              System.out.println("Sufficient for Carry-On");
            }
            else {
              System.out.println("CARRY_ON BAG EXCEED THE ALLOWED WEIGHT: 15.0 kg ONLY");
            }
          }
          else {
            System.out.println("An error occurred.");
          }
          }
          //7. Checking passenger membership with enum
          switch (membership[x].membership) {
            case "SILVER":
              membership[x].setValue(5);
              System.out.println("Membership : " + Membership.SILVER);
              break;
            case "GOLD":
              membership[x].setValue(10);
              System.out.println("Membership : " + Membership.GOLD);
              break;
            case "PLATINUM":
              membership[x].setValue(15);
              System.out.println("Membership : " + Membership.PLATINUM);
              break;
            default:
              System.out.println("An error occurred.");
          }
          System.out.println("Baggage : "+ baggage[x].getWeight() + " kg, " +baggage[x].getPieces() + " piece (s)");
          {
          //8. Calculating the extra baggage weight depending on the type of seat and membership
          if ((passenger[x].getDestination()).equals("Doha") || (passenger[x].getDestination()).equals("Tokyo") || (passenger[x].getDestination()).equals("London") || (passenger[x].getDestination()).equals("Chicago")) {
              if ((seat[x].type).equals("Economy")) {
                if (baggage[x].getWeight() > (45.0 + membership[x].getValue())) {
                  if ((excess_baggage[x].getPayment()).equals("online")) {
                    excess_baggage[x].setCharge(40*((baggage[x].getWeight())-(45.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $$ " + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                  else {
                    excess_baggage[x].setCharge(50*((baggage[x].getWeight())-(45.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $$ " + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                }
                else {
                  System.out.println("No excess baggage charge");
                }
              }
              else if ((seat[x].type).equals("Business")) {
                if (baggage[x].getWeight() > (55.0 + membership[x].getValue())) {
                  if ((excess_baggage[x].getPayment()).equals("online")) {
                    excess_baggage[x].setCharge(40*((baggage[x].getWeight())-(55.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                  else {
                    excess_baggage[x].setCharge(50*((baggage[x].getWeight())-(55.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                }
                else {
                  System.out.println("No excess baggage charge");
                }
              }
              else {
                if (baggage[x].getWeight() > (60.0 + membership[x].getValue())) {
                  if ((excess_baggage[x].getPayment()).equals("online")) {
                    excess_baggage[x].setCharge(40*((baggage[x].getWeight())-(60.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                  else {
                    excess_baggage[x].setCharge(50*((baggage[x].getWeight())-(60.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                }
                else {
                  System.out.println("No excess baggage charge");
                }
              }
          }
          else {
              if ((seat[x].type).equals("Economy")) {
                if (baggage[x].getWeight() > (30.0 + membership[x].getValue())) {
                  if ((excess_baggage[x].getPayment()).equals("online")) {
                    excess_baggage[x].setCharge(20*((baggage[x].getWeight())-(30.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                  else {
                    excess_baggage[x].setCharge(30*((baggage[x].getWeight())-(30.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                }
                else {
                  System.out.println("No excess baggage charge");
                }
              }
              else if ((seat[x].type).equals("Business")) {
                if (baggage[x].getWeight() > (40.0 + membership[x].getValue())) {
                  if ((excess_baggage[x].getPayment()).equals("online")) {
                    excess_baggage[x].setCharge(20*((baggage[x].getWeight())-(40.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                  else {
                    excess_baggage[x].setCharge(30*((baggage[x].getWeight())-(40.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                }
                else {
                  System.out.println("No excess baggage charge");
                }
              }
              else {
                if (baggage[x].getWeight() > (50.0 + membership[x].getValue())) {
                  if ((excess_baggage[x].getPayment()).equals("online")) {
                    excess_baggage[x].setCharge(20*((baggage[x].getWeight())-(50.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $$" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                  else {
                    excess_baggage[x].setCharge(30*((baggage[x].getWeight())-(50.0 + membership[x].getValue())));
                    System.out.println("Excess baggage charge : $$" + excess_baggage[x].getCharge());
                    System.out.println("Payment : " + excess_baggage[x].getPayment());
                  }
                }
                else {
                  System.out.println("No excess baggage charge");
                }
              }
          }
          }
          System.out.println();
        }
      input.close();
    }
    //9. Catching an error if file is'nt able to be opened
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
