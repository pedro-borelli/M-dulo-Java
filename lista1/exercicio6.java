package lista1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		float x1, x2, y1, y2, d;
		Scanner leia= new Scanner(System.in);
		System.out.println("Entre com a coordenada do ponto de partida x1:  ");
		x1 = leia.nextFloat();
		System.out.println("Entre com a coordenada do ponto de partida y1:  ");
		y1 = leia.nextFloat();
		System.out.println("Entre com a coordenada do ponto de partida x2:  ");
		x2 = leia.nextFloat();
		System.out.println("Entre com a coordenada do ponto de partida y2:  ");
		y2 = leia.nextFloat();
		d= (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("A distância entre os dois pontos  é de : %f ", d);		
	}
}
