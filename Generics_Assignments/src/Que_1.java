import java.util.HashSet;

public class Que_1 {
	public static void main(String[] args) 
	{
		HashSet<Employe> set = new HashSet<Employe>();
		Employe e1 = new Employe(123,4000,"hemanth","development");
		set.add(e1);
		for(Employe e:set){  
		    e.display_details();
		    }  
	}
}

