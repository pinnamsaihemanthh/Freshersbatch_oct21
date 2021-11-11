
import java.util.HashSet;

class product
{
	public String pname;

	public product(String pname) {
		super();
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return "productName :"+pname;
	}
	
}
public class Que_2 {

	public static void main(String[] args)
	{
		product p1=new product("Bat");
		product p2=new product("Ball");
		product p3=new product("glaves");
		product p4=new product("helmet");
		product p5=new product("shoes");
		product p6=new product("Guard");
		product p7=new product("armband");
		product p8=new product("Stump");
		
		HashSet<product> h= new HashSet<product>();
		h.add(p1);
		h.add(p2);
		h.add(p3);
		h.add(p4);
		h.add(p5);
		h.add(p6);
		h.add(p7);
		h.add(p8);
		h.add(p4);
		
		System.out.println(h);
		
	}

}