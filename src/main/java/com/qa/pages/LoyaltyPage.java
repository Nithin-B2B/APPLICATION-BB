package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class LoyaltyPage extends BaseTest
{

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Details']") private MobileElement loydetails;
	
	public LoyaltyPage details()
	{
		click(loydetails);
		return this;
	}

	@AndroidFindBy(accessibility="Redeem") private MobileElement redeempoints;
	
	public LoyaltyPage pointsredeem()
	{
		click(redeempoints);
		return this;
	}

}
