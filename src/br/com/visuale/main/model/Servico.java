package br.com.visuale.main.model;

public class Servico {

	private int numServico;
	private String nomeServico;
	private double valor;
	
	public Servico() {

	}
	public Servico(String nomeServico, double valor) {
		this.nomeServico = nomeServico;
		this.valor = valor;
	}
	public int getNumServico() {
		return numServico;
	}
	public void setNumServico(int numServico) {
		this.numServico = numServico;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
