package laco_Repeticao;

import java.util.Scanner;

public class exercicio6 {
	
	public  static  void  main ( String [] argss ) {
		int num, soma=0;
		float contador=0, media=0;
		
		do {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite um número inteiro :");
			num= leia.nextInt();
			
			if (num %3 ==0 && num!=0) {
				soma= soma+num;
				contador++;
			}
			
		}while(num!=0);
		
		media=soma/contador;
		System.out.printf("\nA soma total dos valores inteiros digitados é de : " +media);
	}
}
