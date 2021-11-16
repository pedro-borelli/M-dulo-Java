package lista1;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
	int anos, meses, dias, total_dias;
	Scanner leia= new Scanner(System.in);
	System.out.println("Informe sua idade em dias: ");
	total_dias= leia.nextInt();
	anos= total_dias / 365;
	meses= (total_dias % 365) / 30;
	dias = (total_dias % 365) % 30;
	System.out.printf("A sua idade em anos é : %d", anos);
	System.out.printf("\nA sua idade em meses é : %d", meses);
	System.out.printf("\nA sua idade em dias é : %d", dias);
	
	}
}
