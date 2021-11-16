package laco_Condicional;

import java.util.Scanner;

public class exercicio3 {
	 public static void main(String[] args)
	    {
		 int idade;
		 Scanner leia = new Scanner(System.in);
		 System.out.println("Digite sua idade");
		 idade= leia.nextInt();
		 
		 if(idade>=10 && idade<=14) {
			 System.out.printf("Classificação infantil");
		 }
		 
		 else if(idade>=15 && idade<=17) {
			 System.out.printf("Classificação juvenil");
		 }
		 
		 else if(idade>=18 && idade<=25) {
			 System.out.printf("Classificação adulta");
		 }
		 
		 else {
			 System.out.printf("Classificação de idade inválida");
		 }
		 
			 
	    }	        
}
