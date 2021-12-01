package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Execute_Update_Query {

	public static void main(String[] args) throws SQLException {
	
		
		
		//Step1a: Load the driver
		
		Driver driverRef=new Driver();
		
		//step1b: Register the driver
		
		DriverManager.registerDriver(driverRef);
		
		//Step2:Establish Connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		//Step3:Create a Statement
		
		Statement stmt = con.createStatement();
		
		//Step4:Execute the Statement
		
		//int result = stmt.executeUpdate("CREATE TABLE EMPLOYEE(EMP_ID int,EMP_NAME VARCHAR(25),EMP_AGE INT,EMP_EMAILID VARCHAR(25))");
		int result = stmt.executeUpdate("CREATE TABLE EMP(EMP_ID int,EMP_NAME VARCHAR(25),EMP_AGE INT,EMP_EMAILID VARCHAR(25),PRIMARY KEY(EMP_ID))");
		
		//Step5:
		
		if(result==1)
		{
			System.out.println("Table Created");
		}
		else
		{
			System.out.println("Table not created");
		}
		
		
		con.close();

	}

}
