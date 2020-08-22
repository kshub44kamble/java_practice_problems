import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the coomand: 1] start 2] stop: ");

		String text = scanner.nextLine();

		switch(text) {
			case "start":
				System.out.println("Machine is started...");
				break;

			case "stop":
				System.out.println("Machine is stoped...");
				break;

			default:
				System.out.println("Machine not recognized command, Please try again !");
		}
	}
}
