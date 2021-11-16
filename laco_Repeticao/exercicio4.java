package laco_Repeticao;

import java.util.Scanner;

public class exercicio4 {
	public  static  void  main ( String [] argss ) {
		int idade,sexo,sentimento, cont_menos18=0, cont_mais40=0, contoutros_calmos=0,cont_mulheres=0,cont_homens=0,contpessoas_calmas=0,contador=0;
		Scanner leia = new Scanner(System.in);
		
		while(contador<150) {
			System.out.println("Digite sua idade :");
			idade= leia.nextInt();
			
			System.out.println("Digite o numero referente ao seu sexo : [1]feminino, [2] masculino, [3] outros : ");
			sexo= leia.nextInt();
			
			System.out.println("Digite o numero referente ao seu sentimento : [1] calmo, [2] nervoso, [3] agressivo : ");
			sentimento= leia.nextInt();
			
			if(sentimento==1) {
				contpessoas_calmas++;
			}
			if(sexo==1 && sentimento==2) {
				cont_mulheres++;
			}
			if(sexo==2 && sentimento==3) {
				cont_homens++;
			}
			if(sexo==3 && sentimento==1) {
				contoutros_calmos++;
			}
			if(idade>40 && sentimento==2) {
				cont_mais40++;
			}
			if(idade<18 && sentimento==1) {
				cont_menos18++;
			}
			contador++;
		}
		System.out.println("o número de pessoas calmas é :" +contpessoas_calmas);
		System.out.println("o número de mulheres nervosas é : " +cont_mulheres);
		System.out.println("o número de homens agressivos é : "+ cont_homens);
		System.out.println("o número de outros calmos é : "+contoutros_calmos);
		System.out.println("o número de pessoas nervosas com mais de 40 anos é : " +cont_mais40);
		System.out.println("o número de pessoas calmas com menos de 18 anos é : "+cont_menos18);
	}
}
