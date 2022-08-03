import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z,w;
		int resultado;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		w = sc.nextInt();
		
		resultado = (x * y) - (z * w);
		
		System.out.println("O RESULTADO É = " + resultado );
		
		sc.close();
		
	}

}
