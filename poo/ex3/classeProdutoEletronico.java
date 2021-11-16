package lista_Exercicios5;

public class classeProdutoEletronico {
	
	//ATRIBUTOS
	private String nomeProduto;
	private double peso;
	private int voltagem;
	private String marca;
	
	//MÉTODOS
	public classeProdutoEletronico(String nomeProduto,double peso,int voltagem,String marca) {
		this.nomeProduto= nomeProduto;
		this.peso= peso;
		this.voltagem= voltagem;
		this.marca= marca;		
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void descriçao() {
		System.out.println("Nome do produto : " + this.nomeProduto);
		System.out.println("Peso do produto : " + this.peso);
		System.out.println("Voltagem do produto : " + this.voltagem);
		System.out.println("Marca do produto : " + this.marca);
	}

	
}
