import java.util.Vector;

class Student {
	String Name;
	int Age;
	String Majoring;
	String Country;
	public Student() {
	}
	public Student(String Name, int Age, String Majoring) {
	this.Name=Name;
	this.Age=Age;
	this.Majoring=Majoring;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	public String getMajor() {
		return Majoring;
	}
	public void setMajor(String Majoring) {
		this.Majoring=Majoring;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String Country) {
		this.Country=Country;
	}
}
public class StudentTest {
	public static void main(String[] args) {
	
	Student stud1 = new Student("Eva", 19, "Accounting");
        Student stud2 = new Student("Mahboubeh", 24, "Cryptography");
        Student stud3 = new Student("Melvin", 23, "Vision");
        Student stud4 = new Student("Abdullah", 21, "Usuludin");
        Student stud5 = new Student("Bella", 22, "Business");
	
	Vector studList = new Vector();
	studList.addElement(stud1);
	studList.addElement(stud2);
	studList.addElement(stud3);
	studList.addElement(stud4);
	studList.addElement(stud5);
	
	stud1.setCountry("Poland");
	stud2.setCountry("Iran");
	stud3.setCountry("Tasmania");
	stud4.setCountry("Malaysia");
	stud5.setCountry("Ireland");

 for (Object x : studList) {
            System.out.printf("[%d]: %s, %d, %s, %s%n", studList.indexOf(x), ((Student) x).getName(), ((Student)x).getAge(), ((Student) x).getMajor(), ((Student) x).getCountry());
        }
        if (studList.contains(stud1)) {
        	System.out.println("Eva is inside the list!");
        }
        if (studList.isEmpty()) {
        	System.out.println("The array list is empty!");   
        }
        
        studList.set(4,new Employee("Aizuddin",22,"Management","Indonesia"));
        System.out.println("Vector Capacity : "+studList.capacity());
        studList.remove(stud1);  
 }
}
