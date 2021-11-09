package oops_assignments;

class Bank{
	String Bank_Name;
	int Cash;
	void bankdetail() {
		System.out.println("This  is "+Bank_Name+" Deatail");
	}
}
class Saving_account extends Bank{
	int Fixed_deposite =8000;
	void bankdetail() {
		
		System.out.println("This  is "+Bank_Name+" Deatail with Total Cash "+(Cash+Fixed_deposite));
	}
}
class Current_account extends Bank{
	int Cash_credit=600;
	void bankdetail() {
		
		System.out.println("This  is "+Bank_Name+" Deatail with Total Cash "+(Cash+Cash_credit));
	}
}

public class Que_3{
	public static void main(String[] args) {
		Bank sa= new Saving_account();
		sa.Bank_Name="hdfc";
		sa.Cash=3900;
		sa.bankdetail();
		
		Bank ca= new Current_account();
		ca.Bank_Name="sbi";
		ca.Cash=2000;
		ca.bankdetail();
		
		
		
	}

}