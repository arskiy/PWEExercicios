import java.util.Scanner;

public class SomaConsecutivos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = 1;
		int y = 1;

		while(x != 0 && y != 0) {
			x = scan.nextInt();
			y = scan.nextInt();

			int soma = 0;
			for(int i = Math.min(x, y); i <= Math.max(x, y); i++) {
				System.out.print(i + " ");
				soma += i;
			}

			System.out.println("Sum=" + soma);
		}
	}
}
