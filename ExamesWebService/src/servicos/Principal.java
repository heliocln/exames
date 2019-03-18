package servicos;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import model.Usuario;
import servicos.Candidato;

@WebService(serviceName="Principal")
@Stateless()

public class Principal {
	
		
	@WebMethod(operationName= "inserir")
	public boolean inserir(@WebParam(name= "nome") String nome, @WebParam(name= "classificacao") int classificacao,@WebParam(name= "nota") float nota,@WebParam(name= "idade") int idade,@WebParam(name= "telefone") String telefone) {
		
		Usuario u = new Usuario();
		if(u.inserirRegistro(nome, classificacao, nota, idade, telefone)) {
			return true;
		}
		
		return false;
	}
	
	@WebMethod(operationName= "listar")
	public String listar() throws Exception {
		
		Usuario u = new Usuario();
		
		ArrayList<Candidato> resultados = new ArrayList<>();
		
		resultados = u.listarRegistro();
		
		
		
		 try
	        {
	            FileOutputStream fos = new FileOutputStream("listData");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(resultados);
	            oos.close();
	            fos.close();	            
	            
	            
	            return resultados.toString();
	        }
	        catch (IOException ioe)
	        {
	            ioe.printStackTrace();
	        }
		
		return resultados.toString();
	}

	@WebMethod(operationName= "editar")
	public boolean editar(@WebParam(name= "id") int id, @WebParam(name= "campo") String campo, @WebParam(name= "valor") String valor) {
		
		Usuario u = new Usuario();
		
		return u.editarRegistro(id, campo, valor);
	}
	
	@WebMethod(operationName= "deletar")
	public boolean deletar(@WebParam(name= "id") int id) {
		
		Usuario u = new Usuario();
		
		return u.deletarRegistro(id);
	}

}

