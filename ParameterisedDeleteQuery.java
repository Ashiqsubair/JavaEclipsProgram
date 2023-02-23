package serverconnection;
import java.sql.*;

public class ParameterisedDeleteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			PreparedStatement pst= con.prepareStatement("delete from test where tid=?");
			pst.setString(1, "t03");
			pst.executeUpdate();
			System.out.println("Deleted");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
