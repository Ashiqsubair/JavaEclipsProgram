package serverconnection;
import java.sql.*;

public class sqlconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			ResultSetMetaData rsmd=rs.getMetaData();
//			String id=rsmd.getColumnName(0);
			String id=rsmd.getColumnName(1);
			String name=rsmd.getColumnName(2);
			System.out.println(id+" "+name);
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
