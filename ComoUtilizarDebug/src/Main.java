import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("\nInforme a largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Informe o comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Informe o metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("\nAREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

}
