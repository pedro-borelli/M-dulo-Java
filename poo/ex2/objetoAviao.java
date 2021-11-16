package lista_Exercicios5;

public class objetoAviao {
	
	public static void main(String[] args) 
	{
		// CRIACAO DO OBJETO CLIENTE
		classeAviao Av = new classeAviao("TAM",300,80,"Havaí");
		System.out.println(Av.getMarca());
		System.out.println(Av.getPeso());
		System.out.println(Av.getPassageiros());
		System.out.println(Av.getDestino());
	}
}
