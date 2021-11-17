package poo.ex2;

public class classeAviao {
	
	// ATRIBUTOS
	private String marca;
	private double peso;
	private int passageiros;
	private String destino;
	
	// MÉTODOS
	public classeAviao(String marca,double peso,int passageiros,String destino) {
		this.marca= marca;
		this.peso= peso;
		this.passageiros= passageiros;
		this.destino= destino;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
