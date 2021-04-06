import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd_num = scanner.nextInt();

		for (int i = 0; i < qtd_num; i++) {
			int x = scanner.nextInt();
            Boolean primo = true;
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    primo = false;
                }
			}

            if (primo)
                System.out.println(x + " é um primo.");
            else
                System.out.println(x + " não é um primo.");
		}
	}
}
