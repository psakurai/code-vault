class HelloApp2
{
private String sem="4";
private String year1="2020";
private String year2="2021";
public String methodA() { return sem; }
public String methodB() { return year1; }
public String methodC() { return year2; } 

}
public class HelloApp
{
static void method1(String fName, String lName)
{
System.out.print("Hello, my name is "+fName+" "+lName);
}
static void method2(int age)
{
System.out.print(", I am "+age+" years old."); 
}
static void method3(String sem)
{
System.out.print("Current Semester: "+sem); 
}
static void method4(String year1, String year2)
{
System.out.print(year1+"/"+year2); 
}
public static void main(String args[])
{
String fName = args[0];
String lName = args[1];
method1(fName,lName);
String age = args[2];
int nAge=Integer.parseInt(age);  
method2(nAge);
HelloApp2 obj1 = new HelloApp2();
method3(obj1.methodA());
}
}