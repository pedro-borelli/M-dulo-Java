package laco_Condicional;

import java.util.Scanner;

public class exercicio4 {
	
	 public static void main(String[] args) {
		 int valor;
		 Scanner leia = new Scanner(System.in);
		 System.out.println("Digite um valor");
		 valor= leia.nextInt();
		 
		 if(valor%2==0) {
			 System.out.println("O valor digitado é par");
		 } else {
			 System.out.println("O valor digitado é impar");
		 }
		 if(valor%2==0) {
			 Math.sqrt(valor);
			 System.out.printf("E sua raiz quadrada é" + Math.sqrt(valor));
			 
		 } else {
			 Math.pow(valor, valor);
			 System.out.printf("E seu valor ao quadrado é \t" + Math.pow(valor, valor));
		 }
	 }
}
