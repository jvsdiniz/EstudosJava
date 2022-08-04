import java.util.Locale;
import java.util.Scanner;


//a += b; ----- a = a+b;
//a -= b; ----- a = a - b;
//a *= b; ----- a = a * b;
//a /= b; ----- a = a/b;
//a %= b; ----- a = a % b;

public class Main {
	
	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();		
		
		// definindo a conta como 50 
		// caso passe de 100 minutos calculamos o excedente
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("O valor da conta será R$ %.2f\n", conta);
		
		sc.close();
	}

}
