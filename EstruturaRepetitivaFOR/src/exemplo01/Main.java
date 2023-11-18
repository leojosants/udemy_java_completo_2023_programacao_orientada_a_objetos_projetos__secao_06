package exemplo01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		System.out.print("\nInforme a quantidade de valores inteiros que serão informados: ");
		int quantidadeDeValores = scanner.nextInt();

		for (int i = 1; i <= quantidadeDeValores; i++) {
			System.out.printf("Digite o %dº valor inteiro: ", i);
			int number = scanner.nextInt();
			sum += number;
		}

		System.out.printf("\nSoma dos valores digitados: %d%n", sum);

		scanner.close();
	}

}
