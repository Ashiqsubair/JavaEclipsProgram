package serverconnection;
import java.net.*;
import java.io.*;
public class URLDownloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL u=new URL("https://africau.edu/images/default/sample.pdf");
			InputStream is= u.openStream();
			FileOutputStream os=new FileOutputStream("priyasojan.pdf");
			int l;
			byte[] b=new byte[2048];
			while((l=is.read(b))!=-1) {
				os.write(b,0,1);//offset
			}
			System.out.println("file written");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
