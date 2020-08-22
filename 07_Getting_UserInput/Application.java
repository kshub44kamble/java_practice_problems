import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		//create scanner object
		Scanner input = new Scanner(System.in);

		// Output prompt
		System.out.println("Enter a line of text: ");
		System.out.println("Enter a integer: ");
		System.out.println("Enter a Floating value: ");

		// Wait for the user to enter a line of text
		String line = input.nextLine();
		int value = input.nextInt();
		double value1 = input.nextDouble();

		// Tell them what you Entered
		System.out.println("You Entered line of text is: " + line);
		System.out.println("You Entered: " + value);
		System.out.println("You Entered: " + value1);
	}
}
