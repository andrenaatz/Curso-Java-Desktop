package exemplos_internet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura_Arquivo {
	
	 
	  public static void lerTexto(String nomeArquivo){
	    try {
	      File arquivo = new File(nomeArquivo);
	      Scanner sc = new Scanner(arquivo);
	      while(sc.hasNext()){
	        System.out.print(sc.nextLine());
	      }
	       
	      sc.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	  }
	  public static void main(String[] args) {
	    lerTexto("C:\\Users\\Deko1\\Desktop\\Desenvolvimento Java\\teste.txt"); //trocar pelo caminho do arquivo desejado.
	  }
	

}
