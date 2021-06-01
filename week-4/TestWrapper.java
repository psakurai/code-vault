public class TestWrapper {
   public static void main (String[] args) 
   {
       int year = 1957;
       Integer obj1;
       obj1 = year;

       System.out.println("\nObject 1- obj1 : " + obj1);

       Integer obj2 = new Integer(1956);
       int num2;
       num2 = obj2;
       System.out.println("Integer: ");
       System.out.println("Number, num2: " + num2);
       System.out.println("Object2 - ob2j: "+ obj2);
//-------------------------------------------------------
       double yeard = 19.57;
       Double obj1d;
       obj1d = yeard;

       System.out.println("\nObject 1- obj1 : " + obj1d);
       
       Double obj2d = new Double(19.57);
       double num2d;
       num2d = obj2d;
       System.out.println("Double: ");      
       System.out.println("Number, num2: " + num2d);
       System.out.println("Object2 - ob2j: "+ obj2d);
//-------------------------------------------------------
       long yearl = 2;
       Long obj1l;
       obj1l = yearl;

       System.out.println("\nObject 1- obj1 : " + obj1l);
       
       Long obj2l = new Long(2);
       long num2l;
       num2l = obj2l;
       System.out.println("Long: ");
       System.out.println("Number, num2: " + num2l);
       System.out.println("Object2 - ob2j: "+ obj2l);
//-------------------------------------------------------
       float yearf = 19.57F;
       Float obj1f;
       obj1f = yearf;

       System.out.println("\nObject 1- obj1 : " + obj1f);
       
       Float obj2f = new Float(19.57);
       float num2f;
       num2f = obj2f;
       System.out.println("Float: ");
       System.out.println("Number, num2: " + num2f);
       System.out.println("Object2 - ob2j: "+ obj2f);
//-------------------------------------------------------
       short years = 2;
       Short obj1s;
       obj1s = years;

       System.out.println("\nObject 1- obj1 : " + obj1s);
       
       short num2s= obj1s;
       System.out.println("Short: ");
       System.out.println("Number, num2: " + num2s);
       System.out.println("Object2 - ob2j: "+ obj1s);     
//-------------------------------------------------------
       Byte yearb = 2;
       byte obj1b;
       obj1b = yearb;

       System.out.println("\nObject 1- obj1 : " + obj1b);

       Byte num2b=obj1b;
       System.out.println("Byte: ");
       System.out.println("Number, num2: " + num2b);
       System.out.println("Object2 - ob2j: "+ obj1b);
//-------------------------------------------------------
       Character yearc = 'c';
       char obj1c;
       obj1c = yearc;

       System.out.println("\nObject 1- obj1 : " + obj1c);
       
       Character num2c = obj1c;
       System.out.println("Character: ");
       System.out.println("Number, num2: " + num2c);
       System.out.println("Object2 - ob2j: "+ obj1c);
   }
}
