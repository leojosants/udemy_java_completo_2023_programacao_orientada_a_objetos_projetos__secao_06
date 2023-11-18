package Exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite a coordenada X: ");
		int x = scanner.nextInt();

		System.out.print("Digite a coordenada Y: ");
		int y = scanner.nextInt();

		while ((x != 0) && (y != 0)) {
			if ((x > 0) && (y > 0)) {
				System.out.println("Primeiro quadrante");

			} else if ((x < 0) && (y > 0)) {
				System.out.println("Segundo quadrante");

			} else if ((x < 0) && (y < 0)) {
				System.out.println("Terceiro quadrante");

			} else {
				System.out.println("Quarto quadrante");
			}

			System.out.print("\nDigite a coordenada X: ");
			x = scanner.nextInt();

			System.out.print("Digite a coordenada Y: ");
			y = scanner.nextInt();
		}

		System.out.println("-> fim do programa");
		scanner.close();
	}

}
