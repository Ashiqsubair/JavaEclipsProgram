package serverconnection;
import java.net.*;
import java.io.*;
public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1234);
			System.out.print("Waiting for connection.");
			Socket as=	ss.accept();
			System.out.println("made connection");
			DataInputStream dis=new DataInputStream(as.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message is "+str);
			ss.close();
			as.close();
			}
		catch(Exception e) {
				System.out.print(e);
	
			}
	}
}
