package br.com.isac.classes;

public class Conta {
	private String titularConta;
	private int cpf;
	
	/*
	 * Constructors
	 * */
	public Conta() {
	}	
	public Conta(String titularConta, int cpf) {
		super();
		this.titularConta = titularConta;
		this.cpf = cpf;
	}
	
	/*
	 * Getters and Setters
	 * */
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
