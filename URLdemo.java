package serverconnection;
import java.net.*;
public class URLdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL u= new URL("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");
			System.out.println("String " +u.toString());
			System.out.println("Protocol :"+u.getProtocol());
			System.out.println("Port :"+u.getPort());
			System.out.println("Hostname :"+u.getHost());
			System.out.println("File :"+u.getFile());
			System.out.println("Query :"+u.getQuery());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
