package Heranca_Polimorfismo.Ex1;

public class Ex1_Maincachorro  {
	
	public static void main(String[] args) {
		Ex1_Cachorro dog = new Ex1_Cachorro();
		dog.setNome("Tobi");
		System.out.println(dog.getNome());
		dog.setIdade(12);
		System.out.println(dog.getIdade());
		dog.emiteSom();
		dog.corre();		
     }
}

