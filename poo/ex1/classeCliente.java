package lista_Exercicios5;

public class classeCliente {
	
	// ATRIBUTOS
	private String nome;
	private String sexo;
	private String estado;
	private String personalidade;

	// MÉTODOS
	
	public classeCliente(String nome, String sexo,String estado, String personalidade) {
		this.nome= nome;
		this.sexo= sexo;
		this.estado= estado;
		this.personalidade= personalidade;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}	
	
}
	

