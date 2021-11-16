package lista_Exercicios5;

public class objetoCliente {
	public static void main(String[] args) 
	{
		// CRIACAO DO OBJETO CLIENTE
		classeCliente c1 = new classeCliente("Pedro","masculino","calmo","cliente legal");
		System.out.println(c1.getNome());
		System.out.println(c1.getSexo());
		System.out.println(c1.getEstado());
		System.out.println(c1.getPersonalidade());	
	}
}
