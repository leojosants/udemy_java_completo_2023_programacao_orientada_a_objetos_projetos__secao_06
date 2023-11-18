package Exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int validPpassword = 2002;
		String message = "";

		System.out.print("\nDigite a senha: ");
		int password = scanner.nextInt();

		while (password != validPpassword) {
			message = "Senha inválida";
			System.out.printf("-> %s, tente novamente: ", message);
			password = scanner.nextInt();
		}

		message = "Acesso permitido";
		System.out.printf("%s", message);
		System.out.println("-> fim do programa");

		scanner.close();
	}

}
