package laco_Condicional;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		int x,y,z;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero : ");
		x = leia.nextInt();
		System.out.println("Digite o segundo n�mero : ");
		y = leia.nextInt();
		System.out.println("Digite o terceiro n�mero : ");
		z = leia.nextInt();
		
		if(x>y && x>z)
		{
			System.out.printf("O primeiro n�mero � o de maior valor");
		}
		else if(y>x && y>z)
		{
			System.out.printf("O segundo n�mero � o de maior valor");
		}
		else
		{
			System.out.printf("O terceiro n�mero � o de maior valor");
		}		
	}
}
