package br.com.visuale.jdbc.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.visuale.jdbc.services.ConnectionFactory;
import br.com.visuale.main.model.Cliente;
import br.com.visuale.main.model.Compra;

public class ClienteDAO {

private Connection connection;
	
	public ClienteDAO(){
		this.connection =  new ConnectionFactory().getConnection();
		System.out.println("Connection estabileshed");
	}
	
	
	public void add(Cliente cliente){
		
	}
	
	public void remove(Cliente cliente){
		
	}
	
	public List<Cliente> list() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		return clientes;
	}
	//to implement
}
