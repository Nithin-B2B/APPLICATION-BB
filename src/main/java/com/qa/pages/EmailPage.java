package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class EmailPage extends BaseTest{
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email or mobile number']") private MobileElement EmailTxtField;
	
	public EmailPage enterEmail(String username) {
		sendKeys(EmailTxtField, username);
		return this;
	}
	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Next']") private MobileElement Nextbtn;
	
	public PwdPage pressClickBtn() {
		click(Nextbtn);
		return new PwdPage();
	}
	

}
