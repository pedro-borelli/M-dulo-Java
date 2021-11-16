package lista1;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		int a,b,c;
		float R,S,D;
		Scanner leia= new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		a= leia.nextInt();
		System.out.println("Digite o segundo número: ");
		b= leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		c= leia.nextInt();
		R= (a+b)^2;
		S = (b + c)^2;
		D = (R + S)/2;
		System.out.printf("O resultado final da expressão é : %f ", D);			
	}
}
