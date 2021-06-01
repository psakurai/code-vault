import java.util.ArrayList;

class Employee {
	String name;
	int idNumber;
	String department;
	String position;
	public Employee() {
	this.name=null;
	this.idNumber=0;
	this.department=null;
	this.position=null;	
	}
	public Employee(String name, int id, String dept, String position) {
	this.name=name;
	this.idNumber=idNumber;
	this.department=department;
	this.position=position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return idNumber;
	}
	public void setId(int idNumber) {
		this.idNumber=idNumber;
	}
	public String getDept() {
		return department;
	}
	public void setDept(String department) {
		this.department=department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}		
	
	
}
public class EmployeeTest {
	public static void main(String[] args) {
	
	Employee emp1 = new Employee("Dr. Nor Sabrina", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("En Ahmad", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Prof M Izzurdin", 66666, "Consultation", "Manager");
        Employee emp4 = new Employee("Dr N Izzati", 34521, "Elect&Etronic", "CEO");
        Employee emp5 = new Employee("Dr A Rahman", 12321, "PR", "Manager");
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	empList.add(emp5);

 for (Employee x : empList) {
            System.out.printf("[%d]: %s, %d, %s, %s%n", empList.indexOf(x), ((Employee) x).getName(), ((Employee)x).getId(), ((Employee) x).getDept(), ((Employee) x).getPosition());
        }
        if (empList.contains(emp1)) {
        	System.out.println("Dr. Nor Sabrina is inside the list!");
        }
        if (empList.isEmpty()) {
        	System.out.println("The array list is empty!");   
        }
        
        empList.set(4,new Employee("En Aizuddin",99123,"Management","Manager"));
        System.out.println("Array List : "+empList.size());
        empList.remove(emp1);  
 }
}
