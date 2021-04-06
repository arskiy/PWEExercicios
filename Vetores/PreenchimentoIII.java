import java.util.Scanner;

public class PreenchimentoIII {
	public static void main(String[] args) {
        float[] v = new float[100];

		Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();

        v[0] = x;

        for (int i = 1; i < 100; i++) {
            v[i] = v[i - 1] / 2;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f\n", i, v[i]);
        }
    }
}
