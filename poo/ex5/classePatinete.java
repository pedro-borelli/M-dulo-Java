package poo.ex5;

public class classePatinete {
	
	   //ATRIBUTOS
		private String marca;
		private int numeroRodas;
		private double altura;
		
		// MÉTODOS
		public classePatinete(String marca,int numeroRodas,double altura) {
			this.marca=marca;
			this.numeroRodas=numeroRodas;
			this.altura=altura;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getNumeroRodas() {
			return numeroRodas;
		}

		public void setNumeroRodas(int numeroRodas) {
			this.numeroRodas = numeroRodas;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
}
