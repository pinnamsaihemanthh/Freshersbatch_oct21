1)

interface Arithmetic{
	int operations(int a,int b);
}
public class lambdaExpression1{
	public static void main(String[] args) {
		//addition operation
		Arithmetic addition = (a,b)->(a+b);
		System.out.println("Addition = "+addition.operations(10, 20));
		
		//subtraction operation
		Arithmetic subtraction = (a , b)->(a - b);
		System.out.println("Subtraction = "+subtraction.operations(30, 20));
		
		//multiplication operation
		Arithmetic multiplication = ( a, b)->(a * b);
		System.out.println("multiplication = "+multiplication.operations(10, 20));
		
		//division operation
		Arithmetic division = (a,  b)-> (a / b);
		System.out.println("division = "+division.operations(10, 2));
		}
}

--------------------------------------------------------------------------------------------------------
2)

package lamada_assignment;
import java.util.Arrays;
import java.util.List;

public class assign_2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Orders> orders=Arrays.asList(new Orders(3455),
					new Orders(545666),
					new Orders(50000));
		orders.stream().filter(t->t.getPrice()>10000).forEach(t -> System.out.println("order is accepted:"+t));
			
		
		
		}
	}


public class Orders {
	double price;
	
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Orders(double price) {
		super();
		this.price = price;
	}


	@Override
	public String toString() {
		return "Orders [price=" + price + "]";
	}
	
	
	

}

--------------------------------------------------------------------------------------------------------

3)

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinMethods{
	public static void main(String[] args) {
		Consumer<Integer> c = i -> System.out.println(i);
		Predicate<Integer> gt = i ->(i>10);
		Supplier<Double> sp = ()->Math.random();
		Function<Integer,Double> f=(a)->a/2.0;
		System.out.println("Consumer");
		c.accept(30);
		System.out.println(gt.test(30));
		System.out.println("Supplier:"+ sp.get());
		System.out.println("Supply:"+f.apply(25));
	}
	
}

--------------------------------------------------------------------------------------------------------
4)

package Lambda;
import java.util.*;
public class ques4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<String> a = new ArrayList<>();
		a.add("Bhav");
		a.add("Keerth");
		a.add("Nikki");
		a.add("Ragi");		
		a.add("Mintu");
		a.add("Tinku");
		System.out.println("Before removing : "+a);
		a.removeIf(name->(name.length()%2!=0));
		System.out.println("After removing : "+a);
		
		
	}

}
-----------------------------------------------------------------------------------------------------------
5)

import java.util.ArrayList;
import java.util.List;

public class lamda {
  public static void main(String[] args) {
	  List<String> names = new ArrayList<>();
	  names.add("sahana");
	  names.add("amrutha");
	  names.add("geeth");
	  names.add("flowers");
	  
	  StringBuilder result = new StringBuilder();
	  names.forEach(s->result.append(s.charAt(0)));
	  System.out.println(result);
  }
  
}
-------------------------------------------------------------------------------------------------------

6)

package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
public class Replaceup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"bit coin","stock market","coin master","master"};
		List<String> arrayList=Arrays.asList(arr);
		arrayList.replaceAll(e->e.toUpperCase());
		System.out.println(arrayList);
		
	}

}

----------------------------------------------------------------------------------------------------------------


7)


--------------------------------------------------------------------------------------------------------------------

8)

import java.util.ArrayList;

import java.util.List; 
import java.util.function.Consumer;

public class Lambda_8 {

     public static void main(String[] args){

        Print t=new Print();

        t.start();
        }

}

class Print extends Thread{

         @Override
          public void run() {
               List<Integer> li=new ArrayList<>();

                 li.add(38);

                li.add(24);

                li.add(46);

                li.add(65);

             Consumer<Integer> c=(n)->{ 
                System.out.println(n);
                 };

    li.forEach(c);
 }
}