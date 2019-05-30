package curso_java_completo;
import java.util.Scanner;

public class ExerciciosMatriz {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.println("numero de linha: ");
		int rows = sc.nextInt();

		System.out.println("numero de colunas: ");
		int columns = sc.nextInt();

		int[][] matriz = new int[rows][columns];

		for (int x=0; x < matriz.length; x++) {

			for(int y=0; y < matriz[x].length;y++) {

				System.out.println("digite o valor da posição ["+x+"] ["+y+"] :");
				matriz[x][y] = sc.nextInt();
			}
		}

		for(int[] x : matriz) {
			
			for(int y : x) {
				System.out.println(y);
			}
		}	

	}	
}
	
