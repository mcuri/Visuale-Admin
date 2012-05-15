package br.com.visuale.controller;

import br.com.visuale.jdbc.dao.FuncionarioDAO;
import br.com.visuale.main.model.Funcionario;

@Controller
public class FuncionarioController {

	@RequestMapping("novoFuncionario")
	public String form() {
		return "funcionario/form";
	}
	
	@RequestMapping("cadastrarFuncionario")
	public String add(@Valid Funcionario f, BindingResult result){   // usar as anotações @NotNull @Size(min=5) nos atributos do java beans
		if(result.hadFieldErrors("descricao")){ //validando entrada
			return "funcionario/form";
		}	
		//OU USANDO UMA FORMA MAIS GENERICA
		//if(result.hasError())
		//	return "funcionario/form";
			
		FuncionarioDAO dao = new FuncionarioDAO()
		dao.add(f);
		return "funcionario/adicionado"; // redirecionada para adicionado.jsp
	}	
	
	@RequestMapping("listaFuncionarios")
	public String list(Model model) {
		FuncionarioDAO dao = new FuncionarioDAO();
		model.addAttribute("funcionarios", dao.list());
		return "funcionario/list";
	}
	
	@RequestMapping("removeFuncionario")
	public String remove(Funcionario func) {
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.remove(func);
		return "forward:listaFuncionarios"; // REDIRECIONAMENTO DO LADO SERVIDOR
	}
		
}