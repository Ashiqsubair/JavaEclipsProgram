package serverconnection;
import java.sql.*;

public class createTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table test(tid varchar2(20),tname varchar2(10))");
			System.out.println("Table created");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
