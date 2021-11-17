package Heranca_Polimorfismo.Ex1;

public abstract class Ex1_Animais {
	
		private String nome;
		private int idade;
		
		
		public abstract void emiteSom();
		
		public void corre() {
			System.out.println("Correndo....");
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
				
}
		

