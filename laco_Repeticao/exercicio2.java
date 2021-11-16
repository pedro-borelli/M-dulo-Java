package laco_Repeticao;

import java.util.Scanner;

public class exercicio2 {
	 public  static  void  main ( String [] argss ) {
		 Scanner leia = new Scanner(System.in);
	        int num, contPar =  0 , contImpar =  0 ;
	        
	        for ( int i =  1 ; i <=  10 ; i ++ ) {
	        	System.out.println( " Digite o "  + i +  " º número ");
	        	num=leia.nextInt();;
	            
	            if (num %  2  ==  0 ) {
	                contPar ++ ;
	            }

	            if (num% 2 == 1) {
	                contImpar ++;
	            }
	            
	        }
	        
	        System.out.println("\n A quantia de números pares digitados é de: "  + contPar );
	        System.out.println("\n A quantia de números impares digitados é de: "  + contImpar );
	        
	    }
}
