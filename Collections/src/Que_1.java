
import java.util.Map;
import java.util.TreeMap;



public class Que_1 {

	public static void main(String[] args) {
		Long l1=Long.valueOf(854636443);
		Long l2=Long.valueOf(859562138);
		Long l3=Long.valueOf(986215861);
		
		contact c1= new contact(l1,"GK1@gmail.com","GK",Gender.Male);
		contact c2= new contact(l2,"GL1@gmail.com","GL",Gender.Female);
		contact c3= new contact(l3,"GM1@gmail.com","GM",Gender.Male);
		
		TreeMap<Long,contact> Tm=new TreeMap<Long,contact>();
		Tm.put(l1, c1);
		Tm.put(l2, c2);
		Tm.put(l3, c3);
		
		System.out.println("Keys:");
		for(Map.Entry<Long, contact>entry:Tm.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		System.out.println("==================================");
		
		
		System.out.println("Values:");
		for(Map.Entry<Long, contact>entry:Tm.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		System.out.println("==================================");
		
		System.out.println("Keys:Value");
		for(Map.Entry<Long, contact>entry:Tm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
