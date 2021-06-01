class ClassA {
private int yearborn=2000;
public String methodA() { return "Aim High"; }
public int getYearBorn() { return yearborn; }
}

public class ClassB {
public static void main (String[] args) {
ClassA obj1 = new ClassA();
System.out.println ("Your age: " + (2021 - obj1.getYearBorn()));
System.out.println ("My message: " + obj1.methodA());
}
}