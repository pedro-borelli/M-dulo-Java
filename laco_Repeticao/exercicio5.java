package laco_Repeticao;

import java.util.Scanner;

public class exercicio5 {
	
	public  static  void  main ( String [] argss ) {
		int num, soma=0;
			
		do{			
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite um número :");
			num= leia.nextInt();
			soma+= num;
			
		  }while(num!=0);
		
		System.out.printf("A soma total dos valores digitados é de : " +soma);
	}
}
