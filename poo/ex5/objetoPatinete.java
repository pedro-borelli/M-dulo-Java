package lista_Exercicios5;

public class objetoPatinete {
	
	public static void main(String[] args) {
		
		// CRIACAO DO OBJETO CLIENTE
		classePatinete pat= new classePatinete("Hi-Happy",3,70.5);
		System.out.println(pat.getMarca());
		System.out.println(pat.getNumeroRodas());
		System.out.println(pat.getAltura());
	}
}
