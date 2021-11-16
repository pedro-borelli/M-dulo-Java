package laco_Condicional;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		int x,y,z;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número : ");
		x = leia.nextInt();
		System.out.println("Digite o segundo número : ");
		y = leia.nextInt();
		System.out.println("Digite o terceiro número : ");
		z = leia.nextInt();
		
		if(x>y && x>z)
		{
			System.out.printf("O primeiro número é o de maior valor");
		}
		else if(y>x && y>z)
		{
			System.out.printf("O segundo número é o de maior valor");
		}
		else
		{
			System.out.printf("O terceiro número é o de maior valor");
		}		
	}
}
