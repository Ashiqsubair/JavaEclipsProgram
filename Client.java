package serverconnection;
import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Socket s=new Socket("localhost",1234);//address,port number
		System.out.println("Sending request to server");
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello, how are you");
	}
	catch(Exception e) {
		System.out.print(e);
	}
	}
}
