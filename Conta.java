package banco;

import java.util.Scanner;

public class Conta {
	//Atributos
	private int numConta;
	private String nome;
	private double saldo;
	private double limite;
	
	
	public String getNome() { //get sai os atributos devolve o atributo
		return nome;
	}
	public void setNome(String NomeRecebido) { //set é o que receber os atributos e pegar o atributo 
		
		if (NomeRecebido == "Sergio R dos Santos") {
			this.nome = (NomeRecebido + " " + "Cadastro rejeitado");
		}
		else {
			this.nome = NomeRecebido;
			
		}
		
			
			
		}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double SaldoRecebido) {
		//Scanner.sc
		this.saldo = SaldoRecebido;
		System.out.println("Seu Saldo é: " + SaldoRecebido);
		
		
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int NumeroConta) {
		this.numConta = NumeroConta;
		System.out.println("O numero da sua Conta é : " + NumeroConta);
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double LimiteConta) {
		this.limite = LimiteConta;
		System.out.println("Seu Limite é: " + LimiteConta);
	}
}
		
		
		
	
	
		
	
	

