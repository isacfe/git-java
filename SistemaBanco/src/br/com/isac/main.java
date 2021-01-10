package br.com.isac;

import br.com.isac.classes.Conta;

public class main {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setTitularConta("Isac");
		conta1.setCpf(999);
		
		System.out.println("Titular1: " +conta1.getTitularConta()+ " / CPF: " +conta1.getCpf());
	}
}
