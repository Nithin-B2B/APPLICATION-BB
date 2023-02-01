package com.qa1.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Mainpage {
	
	
	AndroidDriver driver;
	
	public Mainpage(AndroidDriver driver)
	{
			this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}
	 //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	
	
	/*@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Login']")
	private static WebElement Login;
	
	public static void loginField(String login)
	{
	Login.click();	
	System.out.println("Login passed");
	}*/
  @AndroidFindBy(xpath="//android.widget.EditText[@text='Email or mobile number']")
   private static WebElement email;
  
  public static void emailField(String mailid)
  {
	  email.click();
	  email.sendKeys(mailid);
	  System.out.println("Enter email id passed");
	  
  }
  
  @AndroidFindBy(xpath="//android.widget.Button[@content-desc='Next']")
  private static WebElement next;
  
  public static void nextButton(String nextt)
  {
	  next.click();
  }
  
  @AndroidFindBy(xpath="//android.widget.EditText[@text='Password *']")
  private static WebElement password;
  
  public static void passField(String pass)
  {
	  password.click();
	  password.sendKeys("Manila123");
  }
  
  @AndroidFindBy(xpath="//android.widget.Button[@content-desc='Login']")
  private static WebElement login1;
  
  public static void loginclick(String log)
  {
	  login1.click();
	  System.out.println("Login successfully passed");
  }
  
  @AndroidFindBy(xpath="//android.widget.ImageView[@index=0]")
  private static WebElement provider;
   
  public static void providerclick(String select)
  {
	  provider.click();
	  System.out.println("provider selected : pass");
  }
  
}
