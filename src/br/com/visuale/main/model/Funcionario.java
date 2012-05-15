package br.com.visuale.main.model;

import com.sun.istack.internal.NotNull;

public class Funcionario {

	private int numFuncionario;
	@NotNull
	private String nomeFuncionario;
	private String especialidade;
	private double comissao;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nomeFuncionario, String especialidade,
			double comissao) {
		this.nomeFuncionario = nomeFuncionario;
		this.especialidade = especialidade;
		this.comissao = comissao;
	}
	
	public Funcionario(String nomeFuncionario, String especialidade) {
		this.comissao = 0.0;
		this.nomeFuncionario = nomeFuncionario;
		this.especialidade = especialidade;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}
	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
}
