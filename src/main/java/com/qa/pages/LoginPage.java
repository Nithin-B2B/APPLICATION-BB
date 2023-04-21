package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class LoginPage  extends BaseTest {
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Login']") private MobileElement Loginbttn;
	
		public LoginPage pressLoginBtn() {
			click(Loginbttn);
			return this; 
		}
@AndroidFindBy(accessibility = "Skip") private MobileElement Skip;

	public LoginPage pressSkip()
	{
		click(Skip);
		return this;
		
	}
	
	@AndroidFindBy(id = "com.vxceed.xnapp.tindahanclub.uat2:id/collapse_button") private MobileElement Cookies;
	
	public LoginPage avoidCookies()
	{
		click(Cookies);
		return this;
	}

	
	@AndroidFindBy(className="android.widget.EditText") private MobileElement EmailTxtField;
	//public String getTitle() {
		//return getAttribute(EmailTxtField,"text");
		
	//}
	 
	public LoginPage enterClick()
	 {
		 click(EmailTxtField);
		 return  this;
		 
	 }
	@AndroidFindBy(className="android.widget.EditText") private MobileElement EmailTxtField1;
	
	public LoginPage enterEmail(String username) {
	
		sendKeys(EmailTxtField1, username);
		return this;
	}
	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Next']") private MobileElement Nextbtn;
	
	public PwdPage pressNxtBtn() {
		click(Nextbtn);
		return new PwdPage();
	}
}
