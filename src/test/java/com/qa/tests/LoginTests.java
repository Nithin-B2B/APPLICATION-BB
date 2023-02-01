package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.EmailPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PwdPage;

import qa.mobile.BaseTest;

public class LoginTests extends BaseTest {
	LoginPage loginPage;
	EmailPage emailPage;
	PwdPage pwdPage;
	
	
	/* @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }*/

	  @BeforeMethod
	  public void beforeMethod() {
		 loginPage=new LoginPage();
	  }

	  /*@AfterMethod
	  public void afterMethod() {
	  }*/
	
	@Test
  public void validusername() {
		
		loginPage.pressLoginBtn();
		emailPage.enterEmail("b2b.18@gmail.com");
		emailPage.pressClickBtn();
		
  }
 

 
}
