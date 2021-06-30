public class TestA {
  public static void main(String[] args) {
    

   double d = 0;
   for ( d = 0; d < 2;) {
  

      int i = 10;
      int j = 100;
      int k = ++j + j * 5 + i++;


      System.out.println("i is " + i);

      System.out.println("j is " + j);

      System.out.println("k is " + k);

 

     d += 0.5; 
     System.out.println("D IS"+ d);
    }

  }
}