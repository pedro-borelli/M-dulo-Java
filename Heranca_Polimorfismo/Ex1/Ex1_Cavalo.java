package Heranca_Polimorfismo.Ex1;

public class Ex1_Cavalo extends Ex1_Animais {
	
	 @Override
	  public void emiteSom() {
		  System.out.println("Relinchando...");
	  }
	  
	  @Override
	  public void corre() {
		  System.out.println("Correndo freneticamente...");
	  }
	
}
