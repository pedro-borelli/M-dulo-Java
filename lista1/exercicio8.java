package lista1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		float custfab, dist, imp, total;
		Scanner leia= new Scanner(System.in);
		System.out.println("Informe o custo de fábrica do carro ");
		custfab= leia.nextFloat();
		imp = (45 * custfab) / 100;
		dist = (28 * custfab) / 100;
		total = custfab + imp + dist;
		System.out.printf("O valor total do carro saíra por : %f ", total);
	}
}
