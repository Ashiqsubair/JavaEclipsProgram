
package serverconnection;
import java.sql.*;

public class ReferencialIntegrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			//create sql statement
			Statement stmt=con.createStatement();
//			String q1="create table one(oid varchar2(10) primary key,oname varchar2(10))";
//			String q2="create table two(tid varchar2(10) primary key references one,tname varchar2(10))";
			stmt.executeQuery("insert into one values('o3','Ashiq')");
			stmt.executeQuery("insert into two values('o3','Ashin')");
			System.out.println("Values inserted");
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}

