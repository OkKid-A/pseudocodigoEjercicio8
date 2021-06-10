import java.util.*;

public class Ejercicio8{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String comando = "";
		do{
			int aleatorio = random.nextInt(101);
			System.out.println("\n" + aleatorio);
			aleatorio*=5;
			System.out.println("\n" + aleatorio);
			System.out.println("\nSi deseas salir ingresa 'S'");
			comando = scanner.nextLine();
		} while (!(comando.equals("S")));
	}
}