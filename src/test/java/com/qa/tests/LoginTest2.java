package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.AvailableDistributor;
import com.qa.pages.LoginPage;
import com.qa.pages.PwdPage;

import qa.mobile.BaseTest;

public class LoginTest2 extends BaseTest
{
@Test
public void Login2()
{
	LoginPage loginpage=new LoginPage();
	loginpage.pressLoginBtn();
	loginpage.enterClick();
	loginpage.enterEmail("bmnh@6.com");
	PwdPage pwdpage=loginpage.pressNxtBtn();
	pwdpage.enterpwd("Test1234");
	AvailableDistributor awd=pwdpage.login();
	//awd.select();//Already enrolled HPC 
	awd.select1();//For new HPC enrollment
	//awd.select2();//For New IC enrollment
}
	
}
