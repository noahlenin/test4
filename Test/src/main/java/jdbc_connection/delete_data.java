package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class delete_data {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Driver driveref=new Driver();
		DriverManager.registerDriver(driveref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		Statement stmt=con.createStatement();
		String query="delete from employee5 where emp_name='test'";
		stmt.executeUpdate(query);
		System.out.println("row deleted");
		
		String query1 = "select * from employee5";
		 ResultSet resultset = stmt.executeQuery(query1);
			while(resultset.next())
			{
				System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
					
			}
		
		 con.close();

	}

}
