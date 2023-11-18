package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite um valor para descobrir seu fatorial: ");
		int n = scanner.nextInt();

		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		System.out.printf("\nFatorial de %d: %d", n, factorial);

		scanner.close();
	}

}
