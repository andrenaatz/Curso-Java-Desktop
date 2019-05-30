package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
	
	
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("digite um numero: ");
		double n = sc.nextDouble();
		
		double dobro = calcular.dobrar(n);
		
		double metade = calcular.dividir(n);
				
		System.out.println(dobro);
		
		System.out.println(metade);

		sc.close();
	}

	
	
}
