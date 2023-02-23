package serverconnection;
import java.sql.*;
import java.io.*;
public class ParameterisedQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			PreparedStatement pst= con.prepareStatement("insert into test values(?,?)");
			DataInputStream dis=new DataInputStream(System.in);
			do {
				System.out.println("Enter the id");
				String id=dis.readLine();
				System.out.println("Enter the name");
				String name=dis.readLine();
				pst.setString(1, id);
				pst.setString(2, name);
				pst.executeUpdate();
				System.out.println("Inserted");
				System.out.println("If you want to stop press % ");
				String s=dis.readLine();
				if(s.equals("%")) {
					break;
				}
			}while(true);
			
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
