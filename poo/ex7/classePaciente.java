package poo.ex7;

public class classePaciente {
	 
	String nome;
	int idade;
	String sexo;
	double altura;
	double peso;
	
	public classePaciente(String nome,int idade,String sexo,double altura,double peso) {
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
		this.altura=altura;
		this.peso=peso;
	}
	public void descricao() {
		System.out.println("O nome do paciente � : " + nome);
		System.out.println("A idade do paciente � : " + idade);
		System.out.println("O sexo do paciente � : " + sexo);
		System.out.println("A altura do paciente � : " + altura);
		System.out.println("O peso do paciente � : " + peso);	
	}
}
