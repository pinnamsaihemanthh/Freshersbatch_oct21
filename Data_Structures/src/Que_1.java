
public class Que_1 {
		public static void main(String[] args) {
			int num=153 ,rem=0, arm=0,num1=153;
			while(num>0) {
				rem=num%10;
				arm=arm+(rem*rem*rem);
				num=num/10;
			}
			System.out.println(arm);
			if(num1==arm) {
				System.out.println(arm+" is a armstrong number");
			}
			else {
				System.out.println(arm+" is not a armstrong number");
			}

		}

	}

