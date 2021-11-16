package array_matriz_funcao;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		float [] vet = new float [4];
		int soma=0;
		double media=0.0, x;
		Scanner leia= new Scanner(System.in);
		for(x=0;x<4;x++) {
			System.out.println("Digite uma nota : ");
			vet[(int) x]= leia.nextFloat();
			soma= (int) (soma+vet[(int) x]);
		}
		media= soma/x;
		System.out.println("A média das notas é : " + media);		
	}
}
