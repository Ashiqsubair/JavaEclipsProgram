package serverconnection;
import java.sql.*;

public class TransactionCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			con.setAutoCommit(false);
			//create sql statement
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into test values('t08','jkjsbd')");

			System.out.println("inserted");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
