package br.com.visuale.jdbc.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.visuale.jdbc.services.ConnectionFactory;
import br.com.visuale.main.model.Compra;

public class CompraDAO {
	
	private Connection connection;
	
	public CompraDAO(){
		this.connection =  new ConnectionFactory().getConnection();
		System.out.println("Connection estabileshed");
	}
	
	public void add(Compra compra){
		
	}
	
	public void remove(Compra compra){
		
	}
	
	public List<Compra> list() {
		List<Compra> compras = new ArrayList<Compra>();
		
		return compras;
	}
	
	
	
	//to implement
}
