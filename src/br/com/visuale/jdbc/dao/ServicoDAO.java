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

public class ServicoDAO {

	private Connection connection;

	public ServicoDAO(){
		this.connection =  new ConnectionFactory().getConnection();
		System.out.println("Connection estabileshed");
	}

	public void add(Servico servico){

		String sql = "INSERT INTO Servico (nome_servico, valor) VALUES (?, ?)";

		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, servico.getNomeServico());
			stmt.setDouble(2, servico.getValor());

			stmt.execute();
			stmt.close();

			System.out.println("Servico" + servico.getNomeServico() + " inserted successfully");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Servico serv){
		String sql = "DELETE FROM servico WHERE id_servico = '?'";
		//String sql = "DELETE FROM Funcionario WHERE nome_funcionario = ?";
		
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setInt(1, serv.getNumServico());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Funcionario: " + serv.getNomeServico() +  " deleted successfully");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Servico> list(){
		String sql = "SELECT * FROM SERVICO";
		Servico serv = null;
	
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Servico> servicos = new ArrayList<Servico>();
			
			while(rs.next()){
				serv = new Servico();
				serv.setNumServico(rs.getInt("id_servico"));
				serv.setNomeServico(rs.getString("nome_funcionario"));
				serv.setValor(rs.getDouble("comissao"));							
				servicos.add(serv);
			}
			
			stmt.close();
			rs.close();
			
			return servicos;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public int getNumServico(Servico servico){
		String sql = "SELECT id_servico FROM Servico WHERE nome_servico = '" + servico.getNomeServico() + "'";

		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				servico.setNumServico(rs.getInt("id_servico"));
			}
			stmt.execute();
			stmt.close();

		}catch (SQLException e){
			throw new RuntimeException(e);
		}

		return servico.getNumServico();
	}

	public void editServico(Servico servico){
		String sql = "UPDATE Servico SET nome_servico = ?, valor= ? WHERE id_servico = " + getNumServico(servico);

		//System.out.println(sql);
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, servico.getNomeServico());
			stmt.setDouble(2, servico.getValor());

			stmt.execute();
			stmt.close();

		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void associaFuncionario(Funcionario func, Servico serv){
		String sql = "INSERT INTO funcionario_servico (id_funcionario, id_servico) " +
				" VALUES (" + func.getNumFuncionario() + "," + serv.getNumServico() + ")";
	
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}

}
//to implement

