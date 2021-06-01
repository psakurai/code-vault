class Trial
{
private int a;
private String b;
Trial(int _a, String _b)
{
a=_a;
b=_b;
}
public void setA(int num)
{
a=num;
}
public void setB(String str)
{
b=str;
}
public void setAB(int num, String str)
{
a=num;
b=str;
}
public int getA()
{
return a;
}
public void show()
{
System.out.println("A: "+ getA());
System.out.println("B: "+ b);
}
}
public class TrialTest
{
public static void main(String[]a)
{
Trial ac=new Trial(5,"Five");
ac.setA(10);
ac.setB("Ten");
ac.setAB(6,"Six");
ac.getA();
ac.show();
ac.show();
ac.getA();
}
}