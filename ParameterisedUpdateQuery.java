package serverconnection;
import java.sql.*;

public class ParameterisedUpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			PreparedStatement pst= con.prepareStatement("update test set tid=? where tid=?");
			pst.setString(1, "t10");
			pst.setString(2, "Arya");
			pst.executeUpdate();
			System.out.println("updated");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
