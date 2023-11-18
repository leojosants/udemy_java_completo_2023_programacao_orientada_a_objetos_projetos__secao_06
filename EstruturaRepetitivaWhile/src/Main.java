import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = 1;
		int counter = 1;
		int sum = 0;

		System.out.println("\nInforme números inteiros aleatórios");

		while (number != 0) {
			System.out.printf("Digite o %dº número: ", counter);
			number = scanner.nextInt();
			sum += number;
			counter++;
		}

		System.out.printf("Soma de todos os valores informados: %d%n", sum);

		scanner.close();
	}

}
