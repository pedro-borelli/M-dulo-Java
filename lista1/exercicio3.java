package lista1;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		int horas, minutos, segundos, total_segundos;
		Scanner leia= new Scanner(System.in);
		System.out.println("Digite a quantidade de segundos de dura��o do evento: ");
		total_segundos= leia.nextInt();
		horas = total_segundos / 3600;
		minutos = (total_segundos% 3600) / 60;
		segundos = (total_segundos% 3600)% 60;
		System.out.printf("A dura��o do evento foi de : %d", horas , "horas");
		System.out.printf("\nA dura��o do evento em minutos foi de : %d" , minutos , "minutos");
		System.out.printf("\nA dura��o do evento em segundos foi de : %d", segundos , "segundos");		
	}
}
