
public class Que_6 {

	

		public static void main(String[] args) {
			
			simpleInt();
			coumpoundInt();
			// p=given amount, t=total number of years, pA,tA=temp variables
			//r= rate of interest 
		}

		private static void coumpoundInt() {
			int p=8000, t=3,pA=0, tA=0;
			double r =0.05;
			for(int i=1 ;i<=t;i++) {
				pA=(int) ((pA+p)*r);
				tA=tA+pA;
			}
			System.out.println("the compound intrest for "+ p + " is " + tA);
			
		}

		public static void simpleInt() {
			int p = 100000, t = 3, pA = 0, tA = 0;
			double r = 0.1;
			for (int i = 1; i <= t; i++) {
				pA = (int) (p * r);
				tA = tA + pA;
			}
			System.out.println("simple intrest for "+ p +" is "+ tA);
			
		}

	}