package lista1;

import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
		float a, b, c, d, i, f, x, y;
		Scanner leia= new Scanner(System.in);
		System.out.println("Entre com os valores de A, B, C, D, E e F: ");
		a= leia.nextFloat(); 
		b= leia.nextFloat(); 
		c= leia.nextFloat(); 
		d= leia.nextFloat();
		i= leia.nextFloat(); 
		f= leia.nextFloat();
		x = (c*i-b*f)/(a*i-b*d);
		y = (a*f-c*d)/(a*i-b*d);
		System.out.printf("Os valores de X é respectivamente: %f ", x );
		System.out.printf("\nOs valores de y é respectivamente: : %f ", y);
		
	}
}
