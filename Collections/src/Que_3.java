import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

 class Employee
{
	
	int id;
	String name;
	String department;
	int salary;
		
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	


	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
		
}



public class Que_3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for ID:");
		System.out.println("Enter 2 for Name:");
		System.out.println("Enter 3 for Department:");
		System.out.println("Enter 4 for Salary:");
		int input=sc.nextInt();
		TreeSet<Employee> emp=null;
		switch(input)
		{
			case 1: emp=new TreeSet<>(new Id());
					break;
			case 2: emp=new TreeSet<>(new Name());
					break;
			case 3:	emp=new TreeSet<>(new Dept());
					break;
			case 4: emp=new TreeSet<>(new Sal());
					break;
			default:System.out.println("Invalid Option");
		}
		emp.add(new Employee(10,"MK","IT",5220));
		emp.add(new Employee(11,"HK","CS",3565));
		emp.add(new Employee(12,"Dk","EE",6582));
		emp.add(new Employee(13,"BK","ME",4896));
		emp.add(new Employee(14,"CK","CE",2568));
		emp.add(new Employee(16,"Dk","TE",8692));
		emp.add(new Employee(15,"KK","CS",7826));
		emp.add(new Employee(19,"Lk","IT",2698));
		emp.add(new Employee(17,"MK","IT",2576));
		emp.add(new Employee(18,"GK","IT",5000));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}

}

class Id implements Comparator<Employee> {
	@Override
	public int compare(Employee E1, Employee E2) {
		if(E1.getId()>E2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Name implements Comparator<Employee>{
	@Override
	public int compare(Employee E3, Employee E4) {
		
		return E3.getName().compareTo(E4.getName());
	}
}
class Dept implements Comparator<Employee>{
	@Override
	public int compare(Employee E1, Employee E2) {
		return E1.getDepartment().compareTo(E2.getDepartment());
	}
}
class Sal implements Comparator<Employee>{
	@Override
	public int compare(Employee E1, Employee E2) {
		if(E1.getSalary()>E2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}