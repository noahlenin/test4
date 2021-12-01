package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Table_Operation {

	public static void main(String[] args) throws SQLException {
		
		
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		Statement stmt = con.createStatement();
		
		Scanner sc= new Scanner(System.in); 
	    System.out.println("Enter Opertion To Be Performed");
	    String operation=sc.nextLine();
	    String create_table;
	    String enter_values;
	    String delete_row;
	    String select_row;
	    String drop_table;
	    
	    if(operation.equals("create_table"))
	    {
	    	int result = stmt.executeUpdate("CREATE TABLE EMP1(EMP_ID int,EMP_NAME VARCHAR(25),EMP_AGE INT,EMP_EMAILID VARCHAR(25),PRIMARY KEY(EMP_ID))");
			System.out.println("Table created");
	    }
	    
	    else if(operation.equals("enter_values"))
	    {	
	    	
	    	
	    	int result = stmt.executeUpdate("insert into employee5(EMP_ID,EMP_NAME,EMP_AGE,EMP_EMAILID) values (12,'lenin',26,'noahlenin19@gmail.com')");
	    	System.out.println("Row Inserted");
	    }
	    
	    else if(operation.equals("drop_table"))
	    {
	    	
	    	String query="drop table emp1";
			stmt.executeUpdate(query);
			System.out.println("Table is deleted");
			
	    	
	    }
	    
	    else if(operation.equals("select_row"))
	    {
	    	String query = "select * from employee5";
			ResultSet resultset = stmt.executeQuery(query);
			while(resultset.next())
			{
			
				System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
					
			}
	    }
	    
	    else if (operation.equals("delete_row"))
	    {
	    	String query="delete from employee5 where emp_name='test'";
			stmt.executeUpdate(query);
			System.out.println("row deleted");
		
	    	}
	    else if(operation.equals("drop_table"))
	    {
	    	String query="drop table emp";
			stmt.executeUpdate(query);
			System.out.println("Table is deleted");
			
	    	
	    }
	    
	    
	    con.close();
	    
			}

}
