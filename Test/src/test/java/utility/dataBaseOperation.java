package utility;

import java.sql.SQLException;

import org.testng.annotations.Test;

import file_Utility.DataBaseUtility;

public class dataBaseOperation {
	@Test
	
	public void tc1() throws SQLException {
		DataBaseUtility db=new DataBaseUtility();
		db.connect_to_database();
		
		
		db.to_execute_query("select * from employee5 where emp_name='noah'", 2, "noah");
		
		db.closeconnection();
			
}
}