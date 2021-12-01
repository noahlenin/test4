package jdbc_connection;

import static org.testng.Assert.assertEquals;import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;

import com.mysql.jdbc.Driver;

public class employee_match {

	public static void main(String[] args) throws SQLException {
		Driver driveref=new Driver();
		DriverManager.registerDriver(driveref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		Statement stmt = con.createStatement();
		String query = "select * from employee5 where emp_name='noah'";
		 ResultSet resultset = stmt.executeQuery(query);
		 
		String expectedResult ="noah";
		 
			while(resultset.next())
			{
			
				String actualResult = resultset.getString(2);
				 System.out.println(actualResult);
				 
			  assertEquals(actualResult, expectedResult);
					 
				
				 
				
		/*if(actualResult.equals(expectedResult))
					{
						System.out.println("valid");
					}
					else
					{
						System.out.println("invalid");
					}
				*/
				//Assert.assertEquals(actualResult,expectedResult);
			
			}	
			 con.close();

	}

}
