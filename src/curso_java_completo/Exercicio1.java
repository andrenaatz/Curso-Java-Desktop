package curso_java_completo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 3 numeros");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
	    if((numero1 >= numero2)&& (numero1 >= numero3)) {
	    	
	    	System.out.println("Higher ="+numero1);
	    
	    }else if(numero2 >= numero3) {
		
	    	System.out.println("Higher ="+numero2);
	    
	    }else {
	    	
	    	System.out.println("Higher ="+numero3);
	    }
	    
		sc.close();
			
	}

}
