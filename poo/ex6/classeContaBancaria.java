package lista_Exercicios5;

public class classeContaBancaria {
	 
	private String tipoConta;
	private String banco;
	private double saldoAtual;
	private double faturaMensal;
	private double saldoPoupanca;
	
	public classeContaBancaria(String tipoConta,String banco,double saldoAtual,double faturaMensal,double saldoPoupanca) {
		this.tipoConta=tipoConta;
		this.banco=banco;
		this.saldoAtual=saldoAtual;
		this.faturaMensal=faturaMensal;
		this.saldoPoupanca=saldoPoupanca;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public double getFaturaMensal() {
		return faturaMensal;
	}

	public void setFaturaMensal(double faturaMensal) {
		this.faturaMensal = faturaMensal;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public void descricao() {
		System.out.println("Tipo de conta :" + tipoConta);
		System.out.println("Banco :" + banco);
		System.out.println("Saldo atual :" + saldoAtual);
		System.out.println("Valor da fatura :" + faturaMensal);
		System.out.println("Saldo poupança :" + saldoPoupanca);	
	}
}
