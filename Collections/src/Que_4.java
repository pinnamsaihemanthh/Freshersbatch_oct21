
import java.util.List;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;




public class Que_4{

	public static void main(String[] args) {
		List<LocalDate> ld=new LinkedList<>();
		ld.add(LocalDate.of(2002,Month.JUNE,13));
		ld.add(LocalDate.of(2005,Month.FEBRUARY,9));
		ld.add(LocalDate.of(2004,Month.MAY,12));
		ld.add(LocalDate.of(2009,Month.JULY,14));
		ld.add(LocalDate.of(2008,Month.JANUARY,25));
		ld.add(LocalDate.of(2001,Month.NOVEMBER,18));
		ld.add(LocalDate.of(2005,Month.FEBRUARY,9));
		ld.add(LocalDate.of(2008,Month.MARCH,16));
		ld.add(LocalDate.of(2004,Month.SEPTEMBER,5));
		ld.add(LocalDate.of(2007,Month.DECEMBER,18));
		
		for(LocalDate ld1: ld)
		{
			if(ld1.isLeapYear())
			{
				System.out.println("Your date of birth is "+ld1+" &  leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+ld1+" & not leap year");
			}
		}

	}

}
