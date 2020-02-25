package soap1;

public class Class1Proxy implements soap1.Class1 {
  private String _endpoint = null;
  private soap1.Class1 class1 = null;
  
  public Class1Proxy() {
    _initClass1Proxy();
  }
  
  public Class1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initClass1Proxy();
  }
  
  private void _initClass1Proxy() {
    try {
      class1 = (new soap1.Class1ServiceLocator()).getclass1();
      if (class1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)class1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)class1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (class1 != null)
      ((javax.xml.rpc.Stub)class1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap1.Class1 getClass1() {
    if (class1 == null)
      _initClass1Proxy();
    return class1;
  }
  
  public java.lang.String method1(java.lang.String name) throws java.rmi.RemoteException{
    if (class1 == null)
      _initClass1Proxy();
    return class1.method1(name);
  }
  
  
}