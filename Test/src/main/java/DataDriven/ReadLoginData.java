package DataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadLoginData {
	
	public void ReadData() throws IOException, ParseException {
		
	
	JsonUtility pf=new JsonUtility();
	String URL=pf.jsonfile("url");
	String UN=pf.jsonfile("username");
	String PWD=pf.jsonfile("password");
	
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	driver.get(URL);
	driver.findElement(By.id("email")).sendKeys(UN);
	driver.findElement(By.id("pass")).sendKeys(PWD);
	driver.findElement(By.name("login")).click();


	}
}
