import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//variaveis
		String nome = "maria";
		int idade = 31;
		double renda = 4000.00;
		double x = 10.35784;
		
		//mostrar na tela
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f%n", x);
		
		System.out.printf ("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		//%f= ponto flutuante
		//%d= inteiro
		//%s= texto
		//%n= quebra de linha
		
	}

}