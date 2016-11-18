package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3task5 extends Day3task
{
	 @Test
		public static void hoverProduct() throws InterruptedException
		{
			 Actions action=new Actions(getDriver());
			WebElement element= getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a") );
			
			action.moveToElement(element).build().perform();
			WebElement element1=getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
			action.moveToElement(element1).build().perform();
			WebElement ele2=getDriver().findElement(By.xpath("html/body/div[1]/header/div/div/div/div/div/nav/ul/li[1]/ul/li[3]/ul/li[6]/ul[2]/li[2]/a"));
			action.moveToElement(ele2).click(ele2).build().perform();
			JavascriptExecutor ja=(JavascriptExecutor)getDriver();
			ja.executeScript("scroll(0, 10000)");
			//WebElement element3=
					//getDriver().findElement(By.className("footer-col__link")).click();
			//action.moveToElement(element3).build().perform();
			WebElement footer=getDriver().findElement(By.xpath(".//footer[@class='dhx-footer']"));
			List<WebElement> actual=footer.findElements(By.tagName("a"));
			List<WebElement> expected=footer.findElements(By.tagName("a"));
			
			
			for(WebElement ele : actual)
			{
				for(WebElement ele1: expected)
				{
					if(ele.getText()==ele1.getText()){
						
						System.out.println("Links are verified");
						//flag = true;
						if(ele.getText()!=ele1.getText()){
							Assert.fail("Links are missing ");
						break;
					}
				}
			
				}
			}
		}
         
			
}