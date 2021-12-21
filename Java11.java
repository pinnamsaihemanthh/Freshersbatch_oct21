1

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class HttpClientExample{
	public static void main(string[] args) throws Exception,
          interruptedException
	{
          HttpRequest request=HttpRequest.newBuilder()
		.GET()
		.uri(URI.create("https://httpbin.org/get"))
		.build();
	 HttpClient httpClient =HttpClient.newBuilder(0
		.version(HttpClient.version.HTTP_1_1)
		.connectTimeout(Duration.ofseconds(10))
		.build();
	HttpResponse<string>response =httpClient.send(request,HttResponse.BodyHandlers.ofsting());
	HttpHeaders headers=response.header();
	headers.map(0.forEach(k,v) -> system.out.println(k+':"+v));
	system.out.println(response.statusCode());
	system.out.println(resonse.body());
      }
}


2


public class Question_1 {
@FunctionalInterface
interface simpleinterest
{
	int operations(int p,int t,int r);
}
	public static void main(String[] args) {
		var p=20097;
		var t=2.8;
		var r=5;
		System.out.println("The simple interest is:"+(p*t*r)/100);

	}

}
 

3
import java.util.ArrayList;
import java.util.List;

public class Question_3{

	public static void main(String[] args) {
		String a="A quick brown fox jumps over the lazy dog";
		a.lines().forEach(System.out::println);
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");
		System.out.println(list);
		String [] s=list.stream().toArray(size ->new String [size]);
		System.out.println(s);

	}

}


4

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Question_4 {

	public static void main(String[] args) {
	      var path="C:\\Users\\KHARI\\Desktop\\StudentList.txt";
	      try {
	    	  String data=Files.readString(Path.of(path));
	    	  System.out.println(data);
	    	  List<String>str=data.lines()
	    			  .map(S->S.trim())
	    			  .filter(S->!S.isEmpty())
	    			  .collect(Collectors.toList());
	    	  for(String string : str) {
	    		  System.out.println(string);
	    	  }
	    	 
	    	   System.out.println("The number of students is:"+str.size());
	      
	      }
	      
	    	  catch(IOException e) {
	    		  e.printStackTrace();
	    	  }
	      
	      
	    	 
}
}


5


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question_5{
	static int count = 0;
	static Scanner sc = null;

	static int result = 0;

	public static void main (String[] args) throws IOException
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the option \n1.Insert New Price \n2.View Purchase Total \n3.Exit");

		int value = sc.nextInt();

		if (value == 1)
		{
			result = call(value);

			add (result+"");

			System.out.println("\n");

			main(null);
		}

		else if (value == 2)
		{
			System.out.println("Total Price of All Items"+ get() + "\n");

			main (null);
		}

		else if (value == 3)
		{
			System.out.println("Exit Program.........");
		}
	}

	public static int call(int value)
	{
		count++;

		System.out.println("Insert" + count + "st Price");
		value = sc.nextInt();
		
		result = result + value;

		System.out.println("Price has been saved to the file \n");

		System.out.println("Do you enter price for onne more value ? (yes/no)");

		String ans = sc.next();

		if (ans.equalsIgnoreCase("yes"))
		{
			call(value);
			return result;

		}
		else 
		{
			return result;
		}
	}

	public static void add (String value) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("E:\\Java11\\data.txt");

		byte [] b1 = value.getBytes();

		fout.write(b1);

		fout.close();	
	}

	public static int get() throws IOException
	{
		String res = "";
		
		FileInputStream fin = new FileInputStream ("E:\\Java11\\data.txt");

		int i = 0;

		while ((i = fin.read ()) != -1)
		{
			res = res+(char)i;
		}

		int output = Integer.parseInt(res);

		fin.close();

		return output;
	}

		
}
