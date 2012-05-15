package br.com.visuale.jdbc.dao.test;

import br.com.visuale.jdbc.dao.ServicoDAO;
import br.com.visuale.main.model.Servico;

public class ServicoDAOTeste {

	public static void main(String[] args) {
		
		Servico s1 = new Servico("Luzes", 75.90);
		
		ServicoDAO dao = new ServicoDAO();
		
		//dao.addServico(s1);
		
		s1.setValor(86.30);
		s1.setNomeServico("Balaiagem");
		dao.editServico(s1);
	}
}
