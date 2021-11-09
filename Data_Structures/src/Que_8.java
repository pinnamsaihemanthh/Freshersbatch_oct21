
public class Que_8 {


		public static void main(String[] args) {
			int[] x = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			int temp;
			for(int i=0;i<x.length-1;i++) {
				for(int j=0;j<x.length-1-i;j++) {
					if(x[j]>x[j+1]) {
						temp = x[j];
						x[j]=x[j+1];
						x[j+1]=temp;
					}
				}
				
				
				
			}
			for(int i=0;i<x.length;i++) {
				System.out.print(x[i]+" ");
			}

		}

	}