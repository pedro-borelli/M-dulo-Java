package laco_Repeticao;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		int num;
		Scanner leia= new Scanner(System.in);
		System.out.println("Escolha um número de 1000 a 1999 : ");
		num= leia.nextInt();
		
		for(num=1000; num<=1999; num++) {
				if(num%11==5) {
					System.out.println(num);
				}
		}
		
	}
}
