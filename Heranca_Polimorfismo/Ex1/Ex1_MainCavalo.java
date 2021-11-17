package Heranca_Polimorfismo.Ex1;

public class Ex1_MainCavalo {
	
	public static void main(String[] args) {
		Ex1_Cavalo horse= new Ex1_Cavalo();
		horse.setNome("Banzé");
		System.out.println(horse.getNome());
		horse.setIdade(8);
		System.out.println(horse.getIdade());
		horse.emiteSom();
		horse.corre();
	}
}
