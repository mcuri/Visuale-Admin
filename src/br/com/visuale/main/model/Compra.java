package br.com.visuale.main.model;

public class Compra {

	private int numCompra;
	private Funcionario funcionario;
	private Servico servico;
	private String valorTotal;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getNumCompra() {
		return numCompra;
	}
	public void setNumCompra(int numCompra) {
		this.numCompra = numCompra;
	}


}
