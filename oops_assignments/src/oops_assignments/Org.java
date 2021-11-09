package oops_assignments;


	class Employee{
		int id;
		String name;
		int salary;
		public void Calculate() {
			System.out.println(name +"salary"+salary);
			
		}
		
	}
	class Manager extends Employee{
		int isalary=1600;
		public void Calculate() {
			System.out.println(name+" Salary with incentive "+ (salary+isalary)  );
		}
			
	}
	class Labour extends Employee{
		int overtime=600;
		public void Calculate() {
			System.out.println(name+" Salary with overtime "+ (salary+overtime)  );
		}
		
	}

	public class Org {

		public static void main(String[] args) {
			Manager M=new Manager();
			M.id=50;
			M.salary=5000;
			M.name="dont";
			M.Calculate();
			
			Employee E= new Labour();
			E.id=22;
			E.name="hemanth";
			E.salary=1000;
			E.Calculate();
			

		}

	}


