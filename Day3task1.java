package day3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class Day3task1 extends Day3task
{
	

	private static void ScreenshotTutorial(String fileName)
	{
	    try {
	    	   File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE); 
	    	   String timeStamp = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss").format(Calendar.getInstance().getTime());
	           FileUtils.copyFile(src, new File("A://Screenshots//"+timeStamp+".png")); 
	         } 
	       catch(IOException e)
	    { 
	            e.printStackTrace(); 
	    }
  }
	 
	@Test
	public static void screenShotExample()
	{
		try 
		{
			getDriver().findElement(By.id("facebook1234")).click();
		   } 
		
		catch (Exception e)
		{
			ScreenshotTutorial("error");
		
			}
	   }

}
