import java.util.Scanner;

public class Selecao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        float[] v = new float[100];
        for (int i = 0; i < 100; i++) {
		    float x = scanner.nextFloat();
            v[i] = x;
        }

        for (int i = 0; i < 100; i++) {
            if (v[i] <= 10)
                System.out.println("A[" + i + "] = " + v[i]);
        }
    }
}
