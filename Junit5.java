1

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		Bank_Account acc1=new Bank_Account(20000.00);
		
		assertThrows(InsufficientFundsException.class, ()->acc1.withDreaw(21000.0));

	}

}

2


import junit.framework.Test;

public class Bank_Account {
	
	double accBanlance;
	
	
	
	public Bank_Account(double accBanlance) {
		super();
		this.accBanlance = accBanlance;
	}

	
	void withDreaw(double withDrawAmt) throws InsufficientFundsException {
		
		if(withDrawAmt>accBanlance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		accBanlance=accBanlance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accBanlance);
	}
	
	public static void main(String[] args) {
		
		Bank_Account acc1=new Bank_Account(20000.00);

		try {
			acc1.withDreaw(20000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}

}


3

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}

}

4

import java.util.Arrays;

public class MinMaxFinder {

	public int[] findMinMax(int [] a1){
		

		int min=Integer.MAX_VALUE;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<min) {
				min=a1[i];
			}
			
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>max) {
				max=a1[i];
			}
		}
		int arr[]= {min,max};
		return arr;
		
	}
	
}

5

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Question_1 {
	MinMaxFinder minmax=new MinMaxFinder();
	@DisplayName("First Case")
	@Test
	void test1() {
		int[] arr1=new int[]{3,56};
		int []a= {56,34,7,3,54,3,34,34,53};
		assertArrayEquals(arr1,minmax.findMinMax(a));
	}
	@DisplayName("Second Case")
	@Test
	void test2() {
      int[] arr2=new int[]{5,5};	
      int []b= {5,5,5,5,5,5,5};
      assertArrayEquals(arr2,minmax.findMinMax(b));
	}
	
	@Test
	void test3() {
		int[] arr3=new int[]{-6,88};
		int[] c= {-1,-3,5,67,-6,88};
		assertArrayEquals(arr3,minmax.findMinMax(c));
	}

}

6

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCases {
	 Calculator cal;
	 
	 @BeforeAll
	 static void SetupAll(){
		 System.out.println("@BeforAll Method");
		 
	 }
	 @BeforeEach
	void setup() {
		cal=new Calculator();
		System.out.println("@BeforeEach Method");
	}
	
	@Test
	void test() {
		
		int expected=5;
		int actual=cal.add(2, 3);
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	@Test
	void test2() {
		int expected=8;
		int actual=cal.add(4, 4);
		assertEquals(expected, actual);
		System.out.println(actual);

	}
	
	@AfterEach
	void setup2() {
		System.out.println("@AfteEach Method");
	}
	 
	 @AfterAll
	 static void SetupAll2(){
		 System.out.println("@AfterAll Method");
		 
	 }
	

}


7

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCases {
	 Calculator cal;
	 
	 @BeforeAll
	 static void SetupAll(){
		 System.out.println("@BeforAll Method");
		 
	 }
	 @BeforeEach
	void setup() {
		cal=new Calculator();
		System.out.println("@BeforeEach Method");
	}
	
	@Test
	void test() {
		
		int expected=5;
		int actual=cal.add(2, 3);
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	@Test
	void test2() {
		int expected=8;
		int actual=cal.add(4, 4);
		assertEquals(expected, actual);
		System.out.println(actual);

	}
	
	@AfterEach
	void setup2() {
		System.out.println("@AfteEach Method");
	}
	 
	 @AfterAll
	 static void SetupAll2(){
		 System.out.println("@AfterAll Method");
		 
	 }
	

}


