1.
public class OutputFileTest		
	{
    	private File output; 
    	@Before public void createOutputFile() 
 	 { 
       output = new File(...);
    	}
  
	@After public void deleteOutputFile() 
   		{
        output.delete(); 
   	} 
     
    @Test public void testFile1() 
    		{
       
   		} 
	@Test public void testFile2() 
   	 {
       
    		}
}
2.
package annotations;


import java.lang.annotation.*;

public class Annotation {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information i=new Information("extra info");
		Class c = i.getClass();
		java.lang.annotation.Annotation an=c.getAnnotation(info.class);
		info in=(info)an;
		System.out.println(in.Date());
		System.out.println(in.AuthorID());
		System.out.println(in.Time());
		System.out.println(in.version());
		
	}

}



@info(name="Mansi",version=6,AuthorID=567,Author="mansim",Date="1.12.2000",Time="12:30")
class Information{
	String extrainfo;

	public Information(String extrainfo) {
		super();
		this.extrainfo = extrainfo;
	}
	
	
}
3.

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute
{
	int sequence();
}
class Myclass
{
	@Execute(sequence=2)
	public void mymethod1()
	{
		System.out.print("order2");
	}
	@Execute(sequence=1)
	public void mymethod2()
	{
		System.out.print("order1");
	
	}
	@Execute(sequence=3)
	public void mymethod3()
	{
		System.out.print("order3");
	
	}
}

public class Anno3 {

	public static void main(String[] args) throws Exception {
		Myclass m=new Myclass();
		Method m1=m.getClass().getMethod("mymethod1");
		Method m2=m.getClass().getMethod("mymethod2");
		Method m3=m.getClass().getMethod("mymethod3");
		Execute e1=m1.getAnnotation(Execute.class);
		Execute e2=m2.getAnnotation(Execute.class);
		Execute e3=m3.getAnnotation(Execute.class);
      System.out.println(e1.sequence());

      System.out.println(e2.sequence());

      System.out.print(e3.sequence());

	}

}
