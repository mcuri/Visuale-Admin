package br.com.visuale.jdbc.dao.test;

import br.com.visuale.jdbc.dao.FuncionarioDAO;
import br.com.visuale.main.model.Funcionario;

public class FuncionarioDAOTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Danielle", "Manicure");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.add(f1);
		for(Funcionario f: dao.list()){
			System.out.println(f.getNumFuncionario() + " - " + f.getNomeFuncionario() +
					" - " + f.getEspecialidade() + " - " + f.getComissao());
		}
			
	}
}
