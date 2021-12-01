package utility;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import file_Utility.JsonUtility;



public class using_json_utility {
	@Test
	public void loginUsingJson() throws IOException, ParseException {
		
		JsonUtility js=new JsonUtility();
		String ur = js.readDataFromJson("url");
		String un = js.readDataFromJson("username");
		String pw = js.readDataFromJson("password");
		
		WebDriver driver=new ChromeDriver();
		driver.get(ur);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		
			
	}

}
