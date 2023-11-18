package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int in = 0;
		int out = 0;

		System.out.print("\nInforme a quantidade de valores que serão informados na sequência: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite o %dº valor: ", i);
			int number = scanner.nextInt();

			if ((number >= 10) && (number <= 20)) {
				in++;

			} else {
				out++;
			}
		}

		System.out.printf("%nTotal de valores dentro do intervalo [10, 20]: %d in%n", in);
		System.out.printf("Total de valores fora   do intervalo [10, 20]: %d out%n", out);
		System.out.println("\n-> fim do programa");
		scanner.close();
	}

}
