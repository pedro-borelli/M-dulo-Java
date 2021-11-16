package array_matriz_funcao;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int [][] mat1 = new int [3][4];
		int [][] mat2 = new int [3][4];
		int [][] mat3 = new int [3][4];
		int linha, coluna = 0;
		double media=0.0;
		Scanner leia = new Scanner(System.in);
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				System.out.println("Digite o valor da primeira nota: ");
				mat1[linha][coluna]= leia.nextInt();				
			}
		}
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				System.out.println("Digite o valor da segunda nota: ");
				mat2[linha][coluna]= leia.nextInt();				
			}
		}
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				System.out.println("Digite o valor da terceira nota: ");
				mat3[linha][coluna]= leia.nextInt();				
			}
		}
		media=mat1[linha][coluna]+mat2[linha][coluna]+mat3[linha][coluna]/3;
		System.out.println("A média das notas é : " + media);
	}
}
