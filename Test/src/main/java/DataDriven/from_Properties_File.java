package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.jdbc.Driver;

public class from_Properties_File {

	public static void main(String[] args) throws IOException   {
		
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\noahl\\eclipse-workspace\\Test\\common.properties.txt");
		Properties pobj=new Properties();
		pobj.load(fis);
		
	
		String ur = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pw = pobj.getProperty("password");
		String brow = pobj.getProperty("browser");
		WebDriver driver=null;
		if(brow.equals("Chrome")) {
		driver=new ChromeDriver();
		}
		else if(brow.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get(ur);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
			
		
	}

}
