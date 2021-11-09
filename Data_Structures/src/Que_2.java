
public class Que_2 {

		public static void main(String[] args) {
			
			for(int i=100;i<=999;i++) {
				int rem=0,arm=0,num=i;
				while(num>0) {
					rem=num%10;
					arm=arm+(rem*rem*rem);
					num=num/10;
				}
				if(i==arm)
				System.out.print(arm+" ");
			}

		}
}

	
