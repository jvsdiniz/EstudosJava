import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double raio, A;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		A = raio * raio * pi;
				
		System.out.printf("A = %.4f\n", A );
		
		sc.close();
	}

}
