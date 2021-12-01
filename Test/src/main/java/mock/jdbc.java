package mock;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class jdbc {

	public static void main(String[] args) throws SQLException {
		
		Driver driveref=new Driver();
		DriverManager.registerDriver(driveref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		Statement stmt = con.createStatement();
		
		String query = "insert into employee5(emp_id,emp_name,emp_age,emp_emailid) values (106,'ninn',25,'mofofjod');";
			int result = stmt.executeUpdate(query);
		if(result==1)
		{
			System.out.println("created");
		}
		else
		{
			System.out.println("not created");
		}
		
		String query1="select * from employee5";
		ResultSet result1 = stmt.executeQuery(query1);
		while(result1.next())
		{
			System.out.println(result1.getString(1)+"\t"+result1.getString(2)+"\t"+result1.getString(3)+"\t"+result1.getString(4));
		}
		
		con.close();
	}

}
