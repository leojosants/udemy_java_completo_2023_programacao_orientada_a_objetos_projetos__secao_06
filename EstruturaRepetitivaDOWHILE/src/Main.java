import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		char option;
		double conversionFormulaForFahrenheit = 0.0;

		do {
			System.out.printf("\nInforme um temperatura em °C para ser convertida para °F: ");
			double temperatureInDegreesCelsius = scanner.nextDouble();

			conversionFormulaForFahrenheit = (9.0 * temperatureInDegreesCelsius) / 5.0 + 32;

			System.out.printf("Equivalente em Fahrenheit: %.1f%n", conversionFormulaForFahrenheit);

			System.out.print("\nQuer continuar [S / N]: ");
			option = scanner.next().toUpperCase().charAt(0);

			while ((option != 'S') && (option != 'N')) {
				System.out.print("-> informe somente [S / N]: ");
				option = scanner.next().toUpperCase().charAt(0);
			}
		} while (option != 'N');

		System.out.println("\n-> fim do programa");
		scanner.close();
	}

}
