import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadiet veselu skaitli: ");
		int i = scanner.nextInt();
		
		System.out.print("Ievadiet decimâlskaitli: ");
		double d = scanner.nextDouble();
		
		System.out.println("Skaitïu " + i + " un " + d + " summa ir: " + (i+d));
		System.out.println("Skaitïu " + i + " un " + d + " starpîba ir: " + (i-d));
		System.out.println("Skaitïu " + i + " un " + d + " rezinâjums ir: " + i*d);
		System.out.println("Skaitïu " + i + " un " + d + " dalîjums ir: " + i/d);
		System.out.println("Skaitïu " + i + " un " + d + " summas kvadrâts ir: " + (i+d)*(i+d));
		
		scanner.close();
	}

}
