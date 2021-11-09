package oops_assignments;


class Singletone {
    
    private static Singletone single_instance = null;
    public String s;
    private Singletone()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    
    public static Singletone Singletone()
    {
        if (single_instance == null) {
            single_instance = new Singletone();
        }
        return single_instance;
    }
}
 

public class Que_1 {
	   
    public static void main(String args[])
    {
        Singletone x = Singletone.Singletone();
 
        Singletone y = Singletone.Singletone();
 
        Singletone z = Singletone.Singletone();
 
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        z.s = (z.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}