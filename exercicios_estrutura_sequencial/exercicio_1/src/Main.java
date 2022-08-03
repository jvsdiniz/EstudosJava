import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		System.out.println("SOMA = " + (valor1 + valor2));
		
		sc.close();
		
	}

}
