package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int start = 1;

		System.out.print("\nInforme um valor inteiro de [1 a 1000]: ");
		int end = scanner.nextInt();

		while ((end < 1) || (end > 1000)) {
			System.out.print("\nInforme somente valores inteiros dentro do intervalo de [1 a 1000]: ");
			end = scanner.nextInt();
		}

		System.out.printf("\nNúmeros ímpares entre %d e %d%n", start, end);

		for (int i = start; i <= end; i++) {
			if ((i % 2) == 1) {
				System.out.printf("- %d%n", i);
			}
		}

		System.out.println("\n-> fim do programa");
		scanner.close();
	}

}
