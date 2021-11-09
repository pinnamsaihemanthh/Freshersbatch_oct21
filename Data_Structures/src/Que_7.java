
	import java.util.Scanner;

	public class Que_7 {
		static int count = 0;

		public static void main(String[] args) {

			credentials();

		}

		public static void credentials() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your user id");
			String userID = scanner.next();
			System.out.println("Enter your Password");
			String password = scanner.next();
			login(userID, password);

		}

		public static void login(String userID, String password) {
			String userId = "Nireekshan";
			String password1 = "123456";
			if (userId.equals(userID) && password1.equals(password)) {
				System.out.println(userID + " your login is successful");
			} else {
				count++;
				if (count < 3) {
					credentials();
				} else {
					System.out.println("contact your Admin");
				}

			}

		}

	}
