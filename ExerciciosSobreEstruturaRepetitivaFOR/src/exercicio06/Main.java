package exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nInforme um número inteiro e descubra seu(s) divisor(s): ");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			if ((number % i) == 0) {
				System.out.printf("- %d%n",i);
			}
		}

		scanner.close();
	}

}
