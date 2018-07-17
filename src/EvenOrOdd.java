import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int userNumber;
		String begining = " Your number is ";

		System.out.println("Type your name");
		String name;
		name = scan.nextLine();

		System.out.println("Enter a number between 1 and 100");

		userNumber = scan.nextInt();

		if ((userNumber % 2 == 0) && (userNumber >= 2 && userNumber < 26)) {
			System.out.println(name + begining + "even and less than 25");
		}

		else if ((userNumber % 2 == 0) && (userNumber >= 26 && userNumber <= 60)) {
			System.out.println(name + begining + "even");

		} else if ((userNumber % 2 == 0) && (userNumber > 60)) {
			System.out.println(name + begining + "even");

		} else if ((userNumber % 2 != 0) && (userNumber > 60)) {
			System.out.println(name + begining + "odd and over 60");
		} else if ((userNumber % 2 != 0) && (userNumber >= 1 && userNumber <= 60)) {
			System.out.println(name + begining + "odd");
		}

	}
}
