package Heranca_Polimorfismo.Ex1;

public class Ex1_MainBichoPregui�a {
	
	public static void main(String[] args) {
		Ex1_BichoPregui�a preguicinha= new Ex1_BichoPregui�a();
		preguicinha.setNome("Madruguinha");
		System.out.println(preguicinha.getNome());
		preguicinha.setIdade(30);
		System.out.println(preguicinha.getIdade());
		preguicinha.emiteSom();
		preguicinha.escalarArvore();
	}
}
