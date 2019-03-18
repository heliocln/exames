package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.ConexaoDB;
import servicos.Candidato;

public class Usuario extends ConexaoDB{
		
	public Usuario() {
		super();
	}
	
	public boolean inserirRegistro(String nome, int classificacao, float nota, int idade, String telefone) {
		
		try {
			
			Statement stmt = connection.createStatement();		
			String sql = "INSERT INTO usuarios (nome, classificacao, nota, idade, telefone) values ('"+nome+"',"+classificacao+","+nota+","+idade+",'"+telefone+"')"; 
			stmt.executeUpdate(sql);
			return true;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Candidato> listarRegistro() {	
		
		Candidato  registros = new Candidato();
		ArrayList<Candidato> candidato = new ArrayList<Candidato>();
		
		
		try {
			
			Statement stmt = connection.createStatement();		
			String sql = "SELECT * FROM usuarios"; 
			ResultSet resultados = stmt.executeQuery(sql);
					
			
			while(resultados.next()){
				
				registros.setNome(resultados.getString("nome"));
				registros.setClassificacao(resultados.getInt("classificacao"));
				registros.setNota(resultados.getFloat("nota"));
				registros.setIdade(resultados.getInt("idade"));				
				registros.setTelefone(resultados.getString("telefone"));
				
				candidato.add(registros);
				
			}			
			
			return candidato;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return candidato;
		}
		
	}
	
	public boolean editarRegistro(int id, String campo, String valor) {
				
		if(campo.equals("classificacao") || campo.equals("idade")) {
			Integer.parseInt(valor);
		}else if(campo.equals("nota")) {
			Float.parseFloat(valor);
		}else {
			valor = "'"+valor+"'";
		}
			
		try {
			
			Statement stmt = connection.createStatement();		
			String sql = "UPDATE usuarios SET "+campo+" = ("+ valor +") WHERE id =("+id+")"; 
			stmt.executeUpdate(sql);
			return true;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deletarRegistro(int id) {
		try {
			
			Statement stmt = connection.createStatement();		
			String sql = "DELETE FROM usuarios WHERE id = ("+id+")"; 
			stmt.executeUpdate(sql);
			return true;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
