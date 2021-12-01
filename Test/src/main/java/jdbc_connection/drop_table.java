package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class drop_table {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		Statement stmt = con.createStatement();
		
		String query="drop table emp";
		stmt.executeUpdate(query);
		System.out.println("Table is deleted");
		con.close();
		
	}

}
