package curso_java_completo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppCadFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<CadFuncionarios> cadastro = new ArrayList<>();
		
		System.out.println("quantos elementos terá a Lista de funcionarios: ");
		int qtde_lista = sc.nextInt();
		
		
		for(int contador=1; contador<=qtde_lista;contador++) {
		
		System.out.println("Elemento nr "+contador+" : ");
			
		System.out.println("digite o id: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("digite o nome do func: ");
		String nome = sc.nextLine();
		
		System.out.println("digite o salario: ");
		double salario = sc.nextDouble();
		
		cadastro.add(new CadFuncionarios(id, nome, salario));
		
		}
		
		for(CadFuncionarios x : cadastro) {
		System.out.println(x);
		}
		
		//incrementando o salario
		
		System.out.println("Digite o id que deseja aumentar o salario: ");
		int id = sc.nextInt();
		
		CadFuncionarios filtro = cadastro.stream().filter(x-> x.getId()== id).findFirst().orElse(null);
		
		if(filtro == null) {
			
			System.out.println("nao existe este funcionario");
			
			for(CadFuncionarios x : cadastro) {
				
				System.out.println(x);
			}
		} else {
			
			System.out.println("Digite o % de aumento: ");
			Double aumento = sc.nextDouble();
			
			
			System.out.println("Salario antes do aumento: "+filtro.getSalario());
			
			filtro.setSalario((aumento / 100 +1)* filtro.getSalario());
			
			System.out.println(" após o aumento: " + filtro.getSalario());
			
			
			
		}
		
		System.out.println("-------------- Lista final --------------");
		for(CadFuncionarios x : cadastro) {
		System.out.println(x);
		}
		
		
		
		sc.close();

	}

}
