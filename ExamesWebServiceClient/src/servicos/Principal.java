/**
 * Principal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicos;

public interface Principal extends java.rmi.Remote {
    public boolean inserir(java.lang.String nome, int classificacao, float nota, int idade, java.lang.String telefone) throws java.rmi.RemoteException;
    public java.lang.String listar() throws java.rmi.RemoteException;
    public boolean deletar(int id) throws java.rmi.RemoteException;
    public boolean editar(int id, java.lang.String campo, java.lang.String valor) throws java.rmi.RemoteException;
}
