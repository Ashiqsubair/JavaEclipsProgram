package serverconnection;
import java.sql.*;

public class ResultSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from test");
			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.print(rsmd.getColumnName(i)+" ");
			}
			System.out.println("");
			System.out.println("---------------------");
			while(rs.next()) {
				
				for(int j=1;j<=rsmd.getColumnCount();j++) {
					System.out.print(rs.getString(j)+" ");
				}
				System.out.println();
				
			}
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}

