


	import java.util.Scanner;

	public class Que_5 {

		public static void main(String[] args) {
			int count=0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = scanner.nextInt();
			System.out.println("enter the size of array");
			int size = scanner.nextInt();
			int[] array = new int[size];
			for(int i=0;i<=array.length-1;i++) {
				System.out.println("enter the "+ (i+1 )+ "th element in array");
				array[i]=scanner.nextInt();
			}
			for(int i=0;i<=array.length-1;i++) {
				if(num==array[i]) {
					count++;
				}
			}
				if(count==1) {
					System.out.println("the given element is present in the array");
				}
				else {
					System.out.println("there is no such element");
				}
			
			

		}

	}
