package file_Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	Connection con=null;

	public void connect_to_database() throws SQLException
	{
	
		Driver driveref=new Driver();
		DriverManager.registerDriver(driveref);
		 con = DriverManager.getConnection(IPathConstants.JDBCpath, IPathConstants.JDun, IPathConstants.JDpw);
		
			
	}
	
	public void to_execute_query(String query,int col,String expectedResult) throws SQLException
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actualResult = result.getString(col);
			if(actualResult.equalsIgnoreCase(expectedResult))
			{
				System.out.println("valid");
				flag=true;
				break;
			}
			
			else 
				System.out.println("invalid");
			
				
		}
	}
		
		public void closeconnection() throws SQLException {
			con.close();
			
		}
		
			
			
		
		
	
}
