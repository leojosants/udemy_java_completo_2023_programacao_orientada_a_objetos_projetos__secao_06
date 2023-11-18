package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite um número inteiro positivo: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			double doubleOf_n = Math.pow(i, 2);
			double cubeOf_n = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f%n", i, doubleOf_n, cubeOf_n);
		}

		scanner.close();
	}

}
