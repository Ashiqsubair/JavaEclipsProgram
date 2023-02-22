package serverconnection;
import java.sql.*;

public class InsertQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			Statement stmt=con.createStatement();
			String ti="t03";
			String tn="Reyvanth";
			
			stmt.executeUpdate("update test set tname='Amal' where tid='t03'");
			System.out.println("Updated");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
