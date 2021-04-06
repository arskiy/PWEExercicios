import java.util.Scanner;

public class PostoCombustivel {
	public static void main(String[] args) {
		int clientes_alcool = 0, clientes_gas = 0, clientes_diesel = 0;
		int x = 0;
		Scanner scanner = new Scanner(System.in);

        loop: while (true) {
            x = scanner.nextInt();

            switch (x) {
                case 1: clientes_alcool++; break;
                case 2: clientes_gas++; break;
                case 3: clientes_diesel++; break;
                case 4: break loop;
            }
        }

		System.out.println("MUITO OBRIGADO\nÁlcool: " + clientes_alcool + "\nGasolina: " + clientes_gas + "\nDiesel: " + clientes_diesel);
	}
}
