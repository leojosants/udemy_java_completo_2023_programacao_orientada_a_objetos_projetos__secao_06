package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		double firstValue = 0;
		double secondValue = 0;

		double divisionResult = 0;

		System.out.print("\nInforme a quantidade de casos que ser�o informados na sequ�ncia: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%nInforme o %d� caso%n", i);

			for (int j = 1; j <= 2; j++) {
				if (j == 1) {
					System.out.printf("Digite o %d� valor: ", j);
					firstValue = scanner.nextDouble();

				} else if (j == 2) {
					System.out.printf("Digite o %d� valor: ", j);
					secondValue = scanner.nextDouble();
				}
			}

			if (secondValue != 0) {
				divisionResult = firstValue / secondValue;
				System.out.printf("Resultado da divis�o: %.1f%n", divisionResult);

			} else {
				System.out.println("Divis�o imposs�vel");
			}
		}

		scanner.close();
	}

}
