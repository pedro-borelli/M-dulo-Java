package lista1;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		float N1,N2,N3, media_ponderada;
		Scanner leia= new Scanner(System.in);
		System.out.println("Informe a primeira nota : ");
		N1= leia.nextFloat();
		System.out.println("Informe a segunda nota : ");
		N2= leia.nextFloat();
		System.out.println("Informe a terceira nota : ");
		N3= leia.nextFloat();
		media_ponderada = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / 10;
		System.out.printf("O resultado final da média é : %f ", media_ponderada);	
	}
}
