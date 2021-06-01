// ARIF AMIRUDDIN BIN SADIRAN
// A19EC0022
// SECTION 5
import java.util.*;

class Person {
	private String name;
	private String address;
	private Cat[] myCat;
	private int count=0;
	public Person(String n,String m){
		name=n;
		address=m;
		myCat = new Cat[10];
	}
	public void adopt(Cat x) {
		myCat[count]=x;
		count++;
	}
	public void print() {
		System.out.println("NAME :"+name);
		System.out.println("Address :" +address);
		System.out.println("Cat(s) Information:");
	
	for(int i=0;i<myCat.length;i++) {
		Cat c=(Cat)myCat[i];
		System.out.println((i+1) + ". " + c.getName()+" "+c.getAge()+" years old, adopted for "+c.calcnumofYears()+" year(s).");
	}
	System.out.println("");
 }
}

class Cat {
	private String name;
	private int age;
	private int yearAdopt;
	
	public Cat(String n,int a,int y){
		name = n;
		age = a;
		yearAdopt = y;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int calcnumofYears() {
		return 2021-yearAdopt;
	}
}

public class AdoptionTest{
	public static void main(String args[]){
		Person p1 = new Person("Amiruddin","Kolej Rahman Putra G30");
		Cat c1 = new Cat ("Sir apip",4,2019);
		Cat c2 = new Cat ("Sir rin",3,2019);
		Cat c3 = new Cat ("Cik fikri",3,2019);
		
		p1.adopt(c1);
		p1.adopt(c2);
		p1.adopt(c3);
		p1.print();
 }
}

