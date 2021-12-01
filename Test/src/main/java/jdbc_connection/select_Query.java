package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class select_Query {

	public static void main(String[] args) throws SQLException {
		
		
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		Statement stmt = con.createStatement();

		String query = "select * from employee5";
		ResultSet resultset = stmt.executeQuery(query);
		while(resultset.next())
		{
		//	System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
			System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
				
		}
		con.close();
	}

}
