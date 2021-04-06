import java.util.Scanner;

public class SomaImparesConsecutivos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		int resultado = 0;
		for (int i = Math.min(x, y) + 1; i < Math.max(x, y); i++)
            if (i % 2 != 0)
			    resultado += i;

		System.out.println(resultado);
	}
}
