package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3task4 extends Day3task
{
	 @Test
	public static void hoverProducts() throws InterruptedException
	{
		 Actions action=new Actions(getDriver());
		WebElement element= getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a") );
		
		action.moveToElement(element).build().perform();
		WebElement element1=getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
		action.moveToElement(element1).build().perform();
		WebElement ele2=getDriver().findElement(By.xpath("html/body/div[1]/header/div/div/div/div/div/nav/ul/li[1]/ul/li[3]/ul/li[6]/ul[2]/li[2]/a"));
		action.moveToElement(ele2).click(ele2).build().perform();
		WebElement ele3=getDriver().findElement(By.xpath("html/body/div[4]/header/div[1]/div/div/div/div/nav/ul/li[4]/a"));
	    action.moveToElement(ele3).build().perform();
		WebElement element4=getDriver().findElement(By.cssSelector(".dropdown-content_link.m-menu__a"));
        action.moveToElement(element4).build().perform();
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", element4); 
		
		//getDriver().findElement(By.xpath(" html/body/div[4]/header/div[1]/div/div/div/div/nav/ul/li[4]/ul/li[3]/a")).click();
		getDriver().findElement(By.id("email")).sendKeys("ankammarao@gmail.com");
		getDriver().findElement(By.id("license")).sendKeys("123456");
		getDriver().findElement(By.className("btn-thin-blue")).click();
		String actual=getDriver().findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div/div")).getText();
		String expected="ERROR: Invalid e-mail or license number";
		Assert.assertEquals(actual,expected);
		
		
		
		 
		
	}

}
