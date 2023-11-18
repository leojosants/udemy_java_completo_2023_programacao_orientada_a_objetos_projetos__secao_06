package Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String message = "";
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;

		System.out.println("\nMenu de op��es");
		System.out.println("[1] - �lcool");
		System.out.println("[2] - Gasolina");
		System.out.println("[3] - Diesel");
		System.out.println("[4] - Fim");

		System.out.print("Digite sua op��o: ");
		int option = scanner.nextInt();

		while (option != 4) {

			if (option == 1) {
				alcohol++;

			} else if (option == 2) {
				gasoline++;

			} else if (option == 3) {
				diesel++;

			} else if ((option != 1) && (option != 2) && (option != 3) && (option != 4)) {
				message = "MUITO OBRIGADO";
			}

			if (message != "") {
				System.out.printf("%n%s%n", message);
				System.out.printf("�lcool:   %d%n", alcohol);
				System.out.printf("Gasolina: %d%n", gasoline);
				System.out.printf("Diesel:   %d%n", diesel);

			} else {
				System.out.printf("\n�lcool:   %d%n", alcohol);
				System.out.printf("Gasolina: %d%n", gasoline);
				System.out.printf("Diesel:   %d%n", diesel);
			}

			System.out.println("\nMenu de op��es");
			System.out.println("[1] - �lcool");
			System.out.println("[2] - Gasolina");
			System.out.println("[3] - Diesel");
			System.out.println("[4] - Fim");

			System.out.print("Digite sua op��o: ");
			option = scanner.nextInt();
		}

		System.out.println("\n-> fim do programa");
		scanner.close();
	}

}
