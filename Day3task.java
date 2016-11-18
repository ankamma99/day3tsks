package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Day3task
{
	private static WebDriver driver=null;
	private static final String URL="https://www.facebook.com/";
	private static final String dhtxl="https://dhtmlx.com/";
	private static final String expedia="https://www.expedia.com/";
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Day3task.driver = driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get(dhtxl);
		//driver.get(URL);
		//driver.get(expedia);
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void switchToNewWindow(int index)
	{
		List <String> listOfWindows=new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(listOfWindows.get(index));
	}
	
	public static void switchToRootCloseCurrentWindow() 
	{
		List<String> list = new ArrayList<String>(getDriver().getWindowHandles());
		for (int i = 1; i < list.size(); i++)
		{
			getDriver().switchTo().window(list.get(i));
			getDriver().close();
		}
		getDriver().switchTo().window(list.get(0));
	
	
	
	

	}
}
