package laco_Repeticao;

import java.util.Scanner;

public class exercicio3 {
	public  static  void  main ( String [] argss ) {
		int menos21=0, mais50=0, idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade : ");
		idade= leia.nextInt();
		
		while(idade!=-99) {
			
			if(idade<21) {
				menos21++;
			}
			
			if(idade>50) {
				mais50++;	
			}
			
			System.out.println("Digite sua idade : ");
			idade= leia.nextInt();
		}
		System.out.printf("\nO total de pessoas com menos de 21 anos é " + menos21);
		System.out.printf("\nO total de pessoas com mais de 50 anos é " + mais50); 
	}
}
