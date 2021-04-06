import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();

		while (x < 1 || x > 1000) {
			System.out.println("Verifique o valor de entrada. (1 < N < 1000)");
            x = scanner.nextInt();
        }

        for (int i = 1; i <= x; i++)
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
	}
}
