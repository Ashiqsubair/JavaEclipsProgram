package serverconnection;
import java.sql.*;

public class DeleteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate("delete from test where tid='1'");
			System.out.println("Deleted");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
