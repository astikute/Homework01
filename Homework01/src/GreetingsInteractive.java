import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadiet savu vârdu: ");
		String str = scanner.nextLine();
		System.out.print("Ievadiet savu vecumu: ");
		int i = scanner.nextInt();
		System.out.println("Sveiki, mani sauc " + str + " esmu " + i + " gadus jauna!");
		
		scanner.close();
	}

}
