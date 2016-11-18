package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3task3 extends Day3task
{
	
	@Test
	public void flightBooking() throws InterruptedException
	{
		getDriver().findElement(By.xpath(".//*[contains(@class,'tab-label') and contains(text(),'Flights')]")).click();
		getDriver().findElement(By.id("flight-origin")).sendKeys("New York");
		Thread.sleep(4000);
		List<WebElement> list=getDriver().findElements(By.className("child-suggestion"));
		for(WebElement element:list)
		{
			if(element.getText().contains("LGA - LaGuardia"));
			{
				element.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-destination")).sendKeys("las");
		Thread.sleep(2000);
		List<WebElement> list1=getDriver().findElements(By.className("main-suggestion"));
		for(WebElement element:list1)
		{
			if(element.getText().contains("Las Vegas"))
			{
				element.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-departing")).click();
		Thread.sleep(2000);
		List<WebElement> list2=getDriver().findElements(By.className("datepicker-cal-date"));
		for(WebElement element:list2)
		{
			if(element.getText().contains("18"))
			{
				element.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-returning")).click();
		Thread.sleep(2000);
		List<WebElement> list3=getDriver().findElements(By.className("datepicker-cal-date"));
		for(WebElement element:list3)
		{
			if(element.getText().contains("20"))
			{
				element.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-adults")).click();
		Thread.sleep(2000);
		Select dropdown = new Select(getDriver().findElement(By.id("flight-adults")));
		List<WebElement> list4=dropdown.getOptions();
		for(WebElement element:list4)
		{
			if(element.getText().contains("4"))
			{
				element.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-children")).click();
		Thread.sleep(2000);
		Select dropdown1 = new Select(getDriver().findElement(By.id("flight-children")));
		List<WebElement> list5=dropdown1.getOptions();
		for(WebElement element:list5)
		{
			if(element.getText().contains("1"))
			{
				element.click();
				break;
			}
		}
		getDriver().findElement(By.id("flight-age-select-1")).click();
		Select dropdown2 = new Select(getDriver().findElement(By.id("flight-age-select-1")));
		List<WebElement> list6=dropdown2.getOptions();
		for(WebElement element:list6)
		{
			if(element.getText().contains("3"))
			{
				element.click();
				break;
			}
		}
		getDriver().findElement(By.id("search-button")).click();
		String actual = getDriver().findElement(By.className("title-city-text")).getText();
		String expected = "Select your departure to Las Vegas";
		Assert.assertEquals(actual, expected);

		
		
		
		
		
		
	}

}
