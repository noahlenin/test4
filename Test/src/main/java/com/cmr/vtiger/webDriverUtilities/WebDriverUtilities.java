package com.cmr.vtiger.webDriverUtilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * In this class all the webdriver utilities are present
 * @author noahl
 *
 */
public class WebDriverUtilities {
	
	/**
	 * This method is used for implicit wait
	 * @param driver
	 */
	public void waitUntilPageLoads(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	/**
	 * This method is used for Explicit wait
	 * @param driver  
	 * @param element
	 */
	public void waitUntilElementSeen(WebDriver driver,WebElement element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	/**
	 *  This method is used for wait and click
	 * @param driver
	 * @param element
	 */
	public void waitandClick(WebDriver driver,WebElement element)
	{
	WebDriverWait wait = new WebDriverWait(driver, 1000);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	/**
	 * This method is used to select VisibleText in dropDown
	 * @param element
	 * @param ele
	 */
	
	public void selectDropdown(WebElement element,String ele)
	{
		Select s = new Select(element);
		s.selectByVisibleText(ele);
		
		
	}
	
	/**
	 * This method is used to select dropDown Using Indexvalue
	 * @param element
	 * @param ele   Index Value
	 */
	
	public void selectDropdown(WebElement element,int index)
	{
			Select s = new Select(element);
			s.selectByIndex(index);
	}
	
	
	/**
	 * This method is used to select dropDown Using Value
	 * @param element
	 * @param value
	 */
	
	public void selectDropdown(String value, WebElement element)
	{
		Select s = new Select(element);
		s.selectByValue(value);
		
		
	}
	
	/**
	 * This method is used to perform mouseHover actions
	 * @param driver
	 * @param element
	 */
	
	
	public void mouseHover(WebDriver driver,WebElement element )
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	/**
	 * This method is used to perform doubleClick actions
	 * @param driver
	 * @param element
	 */
	
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	
	/**
	 *  This method is used to perform rightClick actions
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	/**
	 * This Method is used to handle Switch Window
	 * @param driver
	 */
	
	public void switchToWindow(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String a:child)
		{
			driver.switchTo().window(a);
		}
	}
	
	/**
	 * This method is used to accept the popups
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		Alert popup = driver.switchTo().alert();
		popup.accept();
		
	}
	
	/**
	 * This method is used to dismiss the popups
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		Alert popup = driver.switchTo().alert();
		popup.dismiss();
	}
	
	/**
	 * This method is used to download file
	 * @param driver
	 * @param ele
	 */
	public void fileDownload(WebDriver driver,WebElement ele)
	{
		ele.click();

		
	}
	
	
	/**
	 * This is the method used to switchFrame by index value
	 * @param driver
	 * @param value
	 */
	public void switchframeIndex(WebDriver driver,int value)
	{
	driver.switchTo().frame(value);
		
	}
	/**
	 * This method is used to switch frame using value
	 * @param driver
	 * @param value
	 */
	
	public void switchframeIDorName(WebDriver driver,String value )
	{
		driver.switchTo().frame(value);
	}
	
	
}
