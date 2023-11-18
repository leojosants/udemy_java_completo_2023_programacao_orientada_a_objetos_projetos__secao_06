package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double thirdNumber = 0.0;

		double weight_2 = 2.0;
		double weight_3 = 3.0;
		double weight_5 = 5.0;
		double totalWeight=10.0;

		double sumOfTheFirstTestCase = 0.0;
		double sumOfTheSecondTestCase = 0.0;
		double sumOfTheThirdTestCase = 0.0;

		double averageOfTheFirstTestCase = 0.0;
		double averageOfTheSecondTestCase = 0.0;
		double averageOfTheThirdTestCase = 0.0;

		System.out.print("\nInforme a quantidade de casos de teste que serão digitados na sequência: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%n%dº caso de teste%n", i);

			if (i == 1) {
				for (int j = 1; j <= 3; j++) {
					if (j == 1) {
						System.out.printf("Digite o %dº valor real: ", j);
						firstNumber = scanner.nextDouble();
						firstNumber = firstNumber * weight_2;

					} else if (j == 2) {
						System.out.printf("Digite o %dº valor real: ", j);
						secondNumber = scanner.nextDouble();
						secondNumber = secondNumber * weight_3;

					} else if (j == 3) {
						System.out.printf("Digite o %dº valor real: ", j);
						thirdNumber = scanner.nextDouble();
						thirdNumber = thirdNumber * weight_5;
					}
				}

				sumOfTheFirstTestCase += (firstNumber + secondNumber + thirdNumber);
				averageOfTheFirstTestCase = sumOfTheFirstTestCase / totalWeight;

			} else if (i == 2) {
				for (int j = 1; j <= 3; j++) {
					if (j == 1) {
						System.out.printf("Digite o %dº valor real: ", j);
						firstNumber = scanner.nextDouble();
						firstNumber = firstNumber * weight_2;

					} else if (j == 2) {
						System.out.printf("Digite o %dº valor real: ", j);
						secondNumber = scanner.nextDouble();
						secondNumber = secondNumber * weight_3;

					} else if (j == 3) {
						System.out.printf("Digite o %dº valor real: ", j);
						thirdNumber = scanner.nextDouble();
						thirdNumber = thirdNumber * weight_5;
					}
				}

				sumOfTheSecondTestCase += (firstNumber + secondNumber + thirdNumber);
				averageOfTheSecondTestCase = sumOfTheSecondTestCase / totalWeight;

			} else if (i == 3) {
				for (int j = 1; j <= 3; j++) {
					if (j == 1) {
						System.out.printf("Digite o %dº valor real: ", j);
						firstNumber = scanner.nextDouble();
						firstNumber = firstNumber * weight_2;

					} else if (j == 2) {
						System.out.printf("Digite o %dº valor real: ", j);
						secondNumber = scanner.nextDouble();
						secondNumber = secondNumber * weight_3;

					} else if (j == 3) {
						System.out.printf("Digite o %dº valor real: ", j);
						thirdNumber = scanner.nextDouble();
						thirdNumber = thirdNumber * weight_5;
					}
				}

				sumOfTheThirdTestCase += (firstNumber + secondNumber + thirdNumber);
				averageOfTheThirdTestCase = sumOfTheThirdTestCase / totalWeight;
			}
		}

		System.out.printf("%nMédia do primeiro caso de teste: %.1f%n", averageOfTheFirstTestCase);
		System.out.printf("Média do segundo  caso de teste: %.1f%n", averageOfTheSecondTestCase);
		System.out.printf("Média do terceito caso de teste: %.1f%n", averageOfTheThirdTestCase);

		System.out.println("\n-> fim do programa");
		scanner.close();

	}

}
