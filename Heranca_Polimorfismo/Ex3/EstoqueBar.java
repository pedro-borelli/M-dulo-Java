package Heranca_Polimorfismo.Ex3;

import java.util.*;

public class EstoqueBar {
	
	public static void main(String[] args) {
		String bar1= "Bar Mutley";
		String bar2= "\tBar Lacasa";
		String bar3= "\tBar QuartodoSanto";
		String bar4= "\tBar PorcaMiséria";
		
		ArrayList<String> bares= new ArrayList<>();
		bares.add(bar4);
		bares.add(bar3);
		bares.add(bar1);
		bares.add(bar2);
		System.out.println(bares);
		
		bares.remove(bar1);
		System.out.println("O tamanho da lista é  : " + bares.size());
		
		Collections.sort(bares); 
		System.out.println(bares);
	}
}
