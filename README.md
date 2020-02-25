# Soap_Application


SOAP means that the URL is the same for all invocations, and only the parameters to the Java method differs. 

REST means that the URL plus the HTTP method invoked on it reflects the operation to be done.

Bottom-up means you start with a Java method, and generate the WSDL from it.

Top-down means you start with a WSDL and then create all the necessary scaffolding in Java all the way down.


Bottom-up approach to web services example:-

The basic steps following in the SOAP web services bottom-up approach example in Java using Eclipse video were as follows:

1. Create a Java Project
2. Create a Java file that will provide methods to be invoked over the web
3. Open the Eclipse web services wizard and choose the bottom-up web service approach
4. Choose the Java file whose methods are to be invoked over the web
5. Click Finish on the Eclipse web services wizard and allow the bottom-up web services mapping to happen
6. Deploy the SOAP web service to a Java EE application server that supports the Java EE web profile. Tomcat or the WebSphere Liberty profile are possible options
7. Test the SOAP web service using Eclipse’s web services explorer


Top-down approach to web services example:-

The basic steps in creating a Java web service using a top-down approach in Eclipse is:

1. Create a dynamic web project in Eclipse
2. Copy the WSDL file of interest into the WebContent\wsdl folder of the top-down(SoapWSClientExample) project from bottom-up(SoapWSExample) project
3. Open the web services creation wizard and specify Top down Java bean Web Service as the type. In the Service definition field, provide the relative path to the WSDL file in the top-down(SoapWSClientExample) project
4. Click Finish to close the wizard and inspect the Class1ServiceLocator.java file. Edit the methods defined in this class to implement the web service generated using a top-down approach
5. Deploy the project that contains the SOAP web service created with the top-down approach to a Tomcat or Wildfly server
6. Right-click on the WSDL file in your top-down(SoapWSClientExample) project and select Web Services –> Test with Web Services Explorer
7. Invoke the various methods on your top-down generated web service and test to ensure that the Java component is working



