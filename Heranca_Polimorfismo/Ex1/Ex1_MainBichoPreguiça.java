package Heranca_Polimorfismo.Ex1;

public class Ex1_MainBichoPreguiça {
	
	public static void main(String[] args) {
		Ex1_BichoPreguiça preguicinha= new Ex1_BichoPreguiça();
		preguicinha.setNome("Madruguinha");
		System.out.println(preguicinha.getNome());
		preguicinha.setIdade(30);
		System.out.println(preguicinha.getIdade());
		preguicinha.emiteSom();
		preguicinha.escalarArvore();
	}
}
