package soap2;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import soap1.Class1;
import soap1.Class1ServiceLocator;

public class javaclass {
	
	public static void main (String args[])
	{
	
	Class1ServiceLocator c1sl=new Class1ServiceLocator();
	Scanner sc = new Scanner(System.in);  
try {
	Class1 getclass1 = c1sl.getclass1();
	System.out.println("Enter name ");
	String nm=sc.next();
	//String name=JOptionPane.showInputDialog("Enter name");
    String new_name = getclass1.method1(nm);
    //JOptionPane.showMessageDialog(null,"Name is"+new_name);
    System.out.println("name"+new_name);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println(e);
}
}
}