import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadiet veselu skaitli: ");
		int i = scanner.nextInt();
		
		System.out.print("Ievadiet decim�lskaitli: ");
		double d = scanner.nextDouble();
		
		System.out.println("Skait�u " + i + " un " + d + " summa ir: " + (i+d));
		System.out.println("Skait�u " + i + " un " + d + " starp�ba ir: " + (i-d));
		System.out.println("Skait�u " + i + " un " + d + " rezin�jums ir: " + i*d);
		System.out.println("Skait�u " + i + " un " + d + " dal�jums ir: " + i/d);
		System.out.println("Skait�u " + i + " un " + d + " summas kvadr�ts ir: " + (i+d)*(i+d));
		
		scanner.close();
	}

}
