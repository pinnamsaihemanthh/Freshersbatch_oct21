
public class Que_3 {
	
	
		public static void main(String[] args) {
			int sub1=1,sub2=70,sub3=51;
			if(sub1>60 && sub2>60 && sub3>60) {
				System.out.println("the student is passed");
			}
			else if((sub1>60 && sub2 >60) || (sub2>60 &&sub3>60) ||(sub1>60 &&sub3>60) ){ 
				System.out.println("the student is Promoted");
				
			}
			else if((sub1>60 || sub2>60 || sub3>60) || (sub1<60 && sub2<60 && sub3<60)) {
				System.out.println("the student is failed");
				
			}
		}

		
	}