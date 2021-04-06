
import java.util.Scanner;

public class Troca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int tamanho = 20;
        int[] v = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int x = scanner.nextInt();
            v[i] = x;
        }

        for (int i = 0; i < tamanho / 2; i++) {
            int t = v[i];
            v[i] = v[tamanho - 1 - i];
            v[tamanho - 1 - i] = t;
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println("N[" + i + "] = " + v[i]);
        }
    }
}
