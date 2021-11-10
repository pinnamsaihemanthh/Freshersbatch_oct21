
public class Employe {
	int id,salary;
    String emp_name,department;
	public Employe(int id, int salary, String emp_name, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.emp_name = emp_name;
		this.department = department;
	}
    public void display_details()
    {
  	  System.out.println(id);
  	  System.out.println(salary);
  	  System.out.println(emp_name);
  	  System.out.println(department);
    }    
}





