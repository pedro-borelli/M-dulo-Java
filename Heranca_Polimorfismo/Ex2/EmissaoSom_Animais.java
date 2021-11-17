package Heranca_Polimorfismo.Ex2;

public class EmissaoSom_Animais implements Cachorro, Cavalo, BichoPreguiça {

	@Override
	public void escalar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		System.out.println("O CACHORRO COME RAÇÃO...");
		System.out.println("O CAVALO COME CAPIM ...");
		System.out.println("O BICHO PREGUIÇA COME FRUTOS...");
		
	}

	@Override
	public void galopar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void relinchar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coiçada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void latir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rosnar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void som() {
		System.out.println("AU AU AU AU...");
		System.out.println("RELINCHANDO ...");
		System.out.println("NHAIN NHAIN NHAIN...");
		
	}

	@Override
	public void correr() {
		System.out.println("O CACHORRO CORRE DEVAGAR...");
		System.out.println("O CAVALO CORRE RÁPIDO ...");
		System.out.println("O BICHO PREGUIÇA NÃO CORRE...");
		
	}

	@Override
	public void morder() {
		// TODO Auto-generated method stub
		
	}

}
