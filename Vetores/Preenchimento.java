import java.util.Scanner;

public class Preenchimento {
	public static void main(String[] args) {
        int[] v = new int[10];

		Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        v[0] = x;

        for (int i = 1; i < 10; i++) {
            v[i] = v[i - 1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + v[i]);
        }
    }
}
