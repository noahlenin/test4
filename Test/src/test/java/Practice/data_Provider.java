package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_Provider {
	
	
	@Test(dataProvider="data_Provider")
	public void ticketbooking(String src,String Dest)
	{
		System.out.println("From\t"  +src+  "\tTo\t"  +Dest);
	}
	
	
	@DataProvider Object[][] data_Provider()
	{
		Object[][] Obj = new Object[5][2];
		
		
		Obj[0][0]="Bangalore";
		Obj[0][1]="Chennai";
		
		Obj[1][0]="Bangalore";
		Obj[1][1]="egmore";
	
		Obj[2][0]="Bangalore";
		Obj[2][1]="central";
	
		Obj[3][0]="Bangalore";
		Obj[3][1]="Chennai";
	
		Obj[4][0]="Bangalore";
		Obj[4][1]="Chennai";
	
			return Obj;
	
	}
	

}
