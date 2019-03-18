package servicos;

public class PrincipalProxy implements servicos.Principal {
  private String _endpoint = null;
  private servicos.Principal principal = null;
  
  public PrincipalProxy() {
    _initPrincipalProxy();
  }
  
  public PrincipalProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrincipalProxy();
  }
  
  private void _initPrincipalProxy() {
    try {
      principal = (new servicos.PrincipalServiceLocator()).getPrincipal();
      if (principal != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)principal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)principal)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (principal != null)
      ((javax.xml.rpc.Stub)principal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicos.Principal getPrincipal() {
    if (principal == null)
      _initPrincipalProxy();
    return principal;
  }
  
  public boolean inserir(java.lang.String nome, int classificacao, float nota, int idade, java.lang.String telefone) throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.inserir(nome, classificacao, nota, idade, telefone);
  }
  
  public java.lang.String listar() throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.listar();
  }
  
  public boolean deletar(int id) throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.deletar(id);
  }
  
  public boolean editar(int id, java.lang.String campo, java.lang.String valor) throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.editar(id, campo, valor);
  }
  
  
}