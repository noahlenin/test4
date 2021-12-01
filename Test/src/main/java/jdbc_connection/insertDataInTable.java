package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class insertDataInTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Driver driverRef=new Driver();
		
		
		
		DriverManager.registerDriver(driverRef);
		
	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		
		
		Statement stmt = con.createStatement();
		
	int result = stmt.executeUpdate("insert into employee5(EMP_ID,EMP_NAME,EMP_AGE,EMP_EMAILID) values (01,'lenin',26,'noahlenin@gmail.com')");
		
		
	if(result==1)
	{
		System.out.println("Data Inserted");
	}
	else
	{
		System.out.println("Data Not Inserted");
	}
	
	
	con.close();


	}

}
