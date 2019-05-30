package curso_java_completo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Uso_List {
	
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
				
		for(int acao = 1; acao > 0; ) {
			
			System.out.println("Digite um nome: ");
			lista.add(sc.nextLine());
			
			
			System.out.println("digite 0 para sair ou 1 para continuar: ");
			
			acao = sc.nextInt();
			sc.nextLine();
			
			
		}
			
			for ( String x : lista) {
				System.out.println(x);			
			
			}
			
			System.out.println("-----impr filtro antes --------------------");
			List<String> filtro = lista.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());	
				
			for (String x : filtro) {
				
				System.out.println(x);
			}
				
			filtro.remove(0);
			
			System.out.println("-------impr filtro pos remoção ------------------");
			
			for (String x : filtro) {
				
				System.out.println(x);
			}
			
			System.out.println("--------impr de lista -----------------");
			
			for ( String x : lista) {
				System.out.println(x);			
			
			}
			
			sc.close();
		
		
		
		
	}

}
