import java.util.Scanner;


public class ConditionalMath {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadiet savu v�rdu: ");
		String str = scanner.next();
		
		System.out.print("Ievadiet pirmo veselo skaitli: ");
		int i = scanner.nextInt();
		System.out.print("Ievadiet otru veselo skaitli: ");
		int j = scanner.nextInt();
		
		if (i>j) {
			System.out.println("Skaitlis " + i + " ir liel�ks par skaitli " + j + ".");
		}
		else if (i<j) {
			System.out.println("Skaitlis " + j + " ir liel�ks par skaitli " + i + ".");
		}
		else {
			System.out.println("Skait�i " + j + " un " + i + " ir vien�di.");
		}
		
		if (i+j > str.length()) {
			System.out.println("Skait�u " + i + " un " + j + " summa ir " + (j+i) + ", kas ir vair�k nek� burtu Tav� v�rd�.");
		}
		else if (i+j < str.length()) {
			System.out.println("Skait�u " + i + " un " + j + " summa ir " + (j+i) + ", kas ir maz�k nek� burtu Tav� v�rd�.");
		}
		else {
			System.out.println("Skait�u " + i + " un " + j + " summa ir " + (j+i) + ", kas ir tikpat, cik burtu Tav� v�rd�.");
		}
		scanner.close();

	}

}
