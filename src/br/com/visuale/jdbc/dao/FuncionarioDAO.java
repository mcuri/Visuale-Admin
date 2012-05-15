package br.com.visuale.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.visuale.jdbc.services.ConnectionFactory;
import br.com.visuale.main.model.Funcionario;
import br.com.visuale.main.model.Servico;

public class FuncionarioDAO {

	private Connection connection;

	public FuncionarioDAO(){
		this.connection =  new ConnectionFactory().getConnection();
		System.out.println("Connection estabileshed");
	}

	//to implement
	public void add(Funcionario funcionario){
		String sql = "INSERT INTO Funcionario (nome_funcionario, especialidade, comissao) VALUES (?, ?, ?)";
		//String sqlNumFunc = "SELECT id_funcionario FROM Funcionario WHERE nome_funcionario = '?'";

		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNomeFuncionario());
			stmt.setString(2, funcionario.getEspecialidade());
			stmt.setDouble(3, funcionario.getComissao());

			stmt.execute();

			//stmt = (PreparedStatement) connection.prepareStatement(sqlNumFunc);
			//stmt.execute();
			
			//ResultSet rs = stmt.executeQuery();
			//funcionario.setNumFuncionario(rs.);
			
			stmt.close();

			System.out.println("Funcionario Inserted Successfully");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Funcionario funcionario){
		String sql = "DELETE FROM Funcionario WHERE id_funcionario = '?'";
		//String sql = "DELETE FROM Funcionario WHERE nome_funcionario = ?";
		
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNomeFuncionario());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Funcionario: " + funcionario.getNomeFuncionario() +  " deleted successfully");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Funcionario> list(){
		String sql = "SELECT * FROM FUNCIONARIO";
		Funcionario funcionario = null;
	
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			
			while(rs.next()){
				funcionario = new Funcionario();
				funcionario.setNumFuncionario(rs.getInt("id_funcionario"));
				funcionario.setNomeFuncionario(rs.getString("nome_funcionario"));
				funcionario.setComissao(rs.getDouble("comissao"));
				funcionario.setEspecialidade(rs.getString("especialidade"));
							
				funcionarios.add(funcionario);
			}
			
			stmt.close();
			rs.close();
			
			return funcionarios;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void associaServico(Funcionario func, Servico serv){
		
	}
	
	

}

