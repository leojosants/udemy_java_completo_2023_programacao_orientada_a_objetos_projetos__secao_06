import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nInforme a largura: ");
		double width = scanner.nextDouble();
		
		System.out.print("Informe o comprimento: ");
		double length = scanner.nextDouble();
		
		System.out.print("Informe o metro quadrado: ");
		double squareMeter = scanner.nextDouble();
		
		double area = width * length;
		double price = area * squareMeter;

		System.out.printf("\nAREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", price);

		scanner.close();
	}

}
