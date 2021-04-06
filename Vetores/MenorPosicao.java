import java.util.Scanner;

public class MenorPosicao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();

        while (tamanho < 0 || tamanho > 1000)
            tamanho = scanner.nextInt();

        int[] v = new int[tamanho];
        int menor = 0;
        int pos = 0;

        for (int i = 0; i < tamanho; i++) {
            int x = scanner.nextInt();
            if (i == 0)
                menor = x;

            if (x < menor) {
                menor = x;
                pos = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pos);
    }
}
