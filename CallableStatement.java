package serverconnection;
import java.sql.*;
import java.io.*;
public class CallableStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			CallableStatement cst= con.prepareCall("{call instest(?,?)}");
			
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
