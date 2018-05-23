import java.util.Scanner;


public class ConditionalMath {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadiet savu vârdu: ");
		String str = scanner.next();
		
		System.out.print("Ievadiet pirmo veselo skaitli: ");
		int i = scanner.nextInt();
		System.out.print("Ievadiet otru veselo skaitli: ");
		int j = scanner.nextInt();
		
		if (i>j) {
			System.out.println("Skaitlis " + i + " ir lielâks par skaitli " + j + ".");
		}
		else if (i<j) {
			System.out.println("Skaitlis " + j + " ir lielâks par skaitli " + i + ".");
		}
		else {
			System.out.println("Skaitïi " + j + " un " + i + " ir vienâdi.");
		}
		
		if (i+j > str.length()) {
			System.out.println("Skaitïu " + i + " un " + j + " summa ir " + (j+i) + ", kas ir vairâk nekâ burtu Tavâ vârdâ.");
		}
		else if (i+j < str.length()) {
			System.out.println("Skaitïu " + i + " un " + j + " summa ir " + (j+i) + ", kas ir mazâk nekâ burtu Tavâ vârdâ.");
		}
		else {
			System.out.println("Skaitïu " + i + " un " + j + " summa ir " + (j+i) + ", kas ir tikpat, cik burtu Tavâ vârdâ.");
		}
		scanner.close();

	}

}
