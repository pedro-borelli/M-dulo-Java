package poo.ex4;

public class classeFuncionario {
	
	//ATRIBUTOS
	private String nomeFuncionario;
	private int idade;
	private String sexo;
	private String cargo;
	private double salario;
	
	//MÉTODOS
	public classeFuncionario(String nomeFuncionario,int idade,String sexo,String cargo,double salario) {
		this.nomeFuncionario=nomeFuncionario;
		this.idade=idade;
		this.sexo=sexo;
		this.cargo=cargo;
		this.salario=salario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void descricao() {
		System.out.println("O nome da funcionária é : " + nomeFuncionario);
		System.out.println("A idade da funcionária é : " + idade);
		System.out.println("O sexo da funcionária é : " + sexo);
		System.out.println("O cargo que a funcionária executa é o de : " + cargo);
		System.out.println("O salário da funcionária é : " + salario);		
	}
}
