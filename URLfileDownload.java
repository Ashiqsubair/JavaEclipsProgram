package serverconnection;
import java.net.*;
import java.io.*;
public class URLfileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL u=new URL("https://africau.edu/images/default/sample.pdf");
			BufferedReader in=new BufferedReader(new InputStreamReader(u.openStream()));
			String s;
			while((s=in.readLine())!=null) {
				System.out.println(s);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
