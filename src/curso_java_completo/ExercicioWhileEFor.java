package curso_java_completo;

import java.util.Scanner;

public class ExercicioWhileEFor {

	public static void main(String[] args) {

		System.out.println("Digite um numero positivo: ");
		Scanner sc = new Scanner(System.in);
		int qtde = sc.nextInt();
		int valorMaior = 0;

		while (qtde <= 0) {

			System.out.println("Não é positivo");
			System.out.println("Digite um numero positivo: ");
			sc = new Scanner(System.in);
			qtde = sc.nextInt();
		}
		
		System.out.println("saiu");
		
		for(int contagem=1;contagem<=qtde;++contagem) {
			
			System.out.println("Digite o #"+contagem+" :");
			int valor = sc.nextInt();
		
			
			if (valor > valorMaior) {
				
				valorMaior = valor;
			}
			
			
			
		}
		
		System.out.println("o maior numero digitado é :"+valorMaior);
		
		sc.close();
		System.out.println("terminou");
		
	}

}
