
public class Que_9 {

		public static void main(String[] args) {
			int[] s1 = { 1, 2, 3 };
			int[] s2 = { 1, 2, 3 };
			int[] s3 = { 1, 2, 3 };
			//total(s1, s2, s3);
			eachSubject(s1, s2, s3);
		}

		public static void eachSubject(int[] s1, int[] s2, int[] s3) {
			float total = 0, temp = 0;
			for(int i=0;i<s1.length;i++) {
				total=s1[i]+s2[i]+s3[i];
				System.out.println("Total of the "+i+"thsubject is "+ total);
				System.out.println("average of the "+i+"thsubject is "+ total/3);
				
			}
		}

		public static void total(int[] s1, int[] s2, int[] s3) {
			int total = 0, temp = 0;
			total=s1[0]+s1[1]+s1[2]+s2[0]+s2[1]+s2[2]+s3[0]+s3[1]+s3[2];
			System.out.println("the total of all subject"+total);
			System.out.println("the avg of all subject"+total/3);
		}

	}