package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultiCart extends Openapp2
{
    @Test
	public void mcar() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.view.View[@index=3]")).click();
		
		Thread.sleep(5000);
	}
	
}
