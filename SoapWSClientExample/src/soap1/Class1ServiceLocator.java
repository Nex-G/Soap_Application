/**
 * Class1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap1;

public class Class1ServiceLocator extends org.apache.axis.client.Service implements soap1.Class1Service {

    public Class1ServiceLocator() {
    }


    public Class1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Class1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for class1
    private java.lang.String class1_address = "http://localhost:8080/CGI_WebProject/services/class1";

    public java.lang.String getclass1Address() {
        return class1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String class1WSDDServiceName = "class1";

    public java.lang.String getclass1WSDDServiceName() {
        return class1WSDDServiceName;
    }

    public void setclass1WSDDServiceName(java.lang.String name) {
        class1WSDDServiceName = name;
    }

    public soap1.Class1 getclass1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(class1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getclass1(endpoint);
    }

    public soap1.Class1 getclass1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap1.Class1SoapBindingStub _stub = new soap1.Class1SoapBindingStub(portAddress, this);
            _stub.setPortName(getclass1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setclass1EndpointAddress(java.lang.String address) {
        class1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap1.Class1.class.isAssignableFrom(serviceEndpointInterface)) {
                soap1.Class1SoapBindingStub _stub = new soap1.Class1SoapBindingStub(new java.net.URL(class1_address), this);
                _stub.setPortName(getclass1WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("class1".equals(inputPortName)) {
            return getclass1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap1", "class1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap1", "class1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("class1".equals(portName)) {
            setclass1EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
