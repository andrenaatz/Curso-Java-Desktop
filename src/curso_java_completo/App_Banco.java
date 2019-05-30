package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;



public class App_Banco {
	
	

	public static void main(String[] args) {
		
		Conta c1;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite numero da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do usuario: ");
		String usuario = sc.nextLine();
		
		System.out.println("Deseja fazer deposito inicial? (y/n):");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			
			System.out.println("Digite o valor de deposito: ");
			double depositando = sc.nextDouble();
			
			c1 = new Conta(usuario, conta, depositando);
			
		}
		else {
			
			c1 = new Conta(usuario, conta);
			
			
		}
		System.out.println();
		System.out.println("Dados da minha conta: ");
		System.out.println(c1);
		
		System.out.println("Deseja fazer um deposito? (y/n):");
		resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			
			System.out.println("Digite o valor: ");
			double depositando = sc.nextDouble();
			c1.deposito(depositando);
			
	
		}
			
		System.out.println("Deseja fazer um saque? (y/n):");
		resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			
			System.out.println("Digite o valor: ");
			double sacando = sc.nextDouble();
			c1.sacar(sacando);
			
	
		}
		
		
		System.out.println();
		System.out.println("Dados da minha conta: ");
		System.out.println(c1);
		
		sc.close();
	}

}
