package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.RegisterPage;
import com.qa.pages.WhiteSpaceRegistration;

import io.appium.java_client.HidesKeyboard;
import qa.mobile.BaseTest;

public class WhiteSpaceTests  extends BaseTest
{

	@Test(priority=0)
	
	public void WhitespaceStep1()
	{
		WhiteSpaceRegistration whitespaceReg=new WhiteSpaceRegistration();
		whitespaceReg.NoButton();
		whitespaceReg.enterBuildingName("Manila");
		whitespaceReg.SelectLocation();
		RegisterPage registerpage=new RegisterPage();
		registerpage.Nst();
		
	}
	@Test(priority=1)
	
	public void WhitespaceStep2()
	{
		WhiteSpaceRegistration whitespaceReg=new WhiteSpaceRegistration();
		//whitespaceReg.SelectDocumentType();
		whitespaceReg.EnterDocNo("243244668");
		driver.hideKeyboard();
		//whitespaceReg.UploadDocument();
		RegisterPage registerpage=new RegisterPage();
		registerpage.Nst();
		
	}
	
	@Test(priority=2)
	public void WhitespaceStep3()
	{
		WhiteSpaceRegistration whitespaceReg=new WhiteSpaceRegistration();
		whitespaceReg.EnterOutlet("Outlet Name");
		whitespaceReg.EnterTaxNo("244668");
		whitespaceReg.TakeOutletPhoto();
		 String actualSuccTxte=whitespaceReg.getSuccTxt2();
		 String expectedSuccTxte="Enrolment Pending";
		 System.out.println("actual succ txt -"+actualSuccTxte +"\n" +"expected succ txt -" +expectedSuccTxte);
		 Assert.assertEquals(actualSuccTxte, expectedSuccTxte);
	}
}
