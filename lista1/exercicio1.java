package lista1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		int idade, meses , dias , total_dias;
		Scanner leia= new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		idade= leia.nextInt();
		System.out.println("Informe quantos meses: ");
		meses= leia.nextInt();
		System.out.println("Informe quantos dias: ");
		dias= leia.nextInt();
		total_dias= idade*365 + meses*30 + dias;
		System.out.print(total_dias);
	}
}
