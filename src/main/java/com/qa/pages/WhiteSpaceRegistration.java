package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class WhiteSpaceRegistration extends BaseTest
{
	
	@AndroidFindBy(accessibility="No") private MobileElement noBtn;
	
	public WhiteSpaceRegistration NoButton()
	{
		click(noBtn);
		return this;
	}

	@AndroidFindBy(xpath="//android.widget.EditText[@index=0]") private MobileElement BuildingName;
	
	public WhiteSpaceRegistration enterBuildingName(String Bname)
	{
		click(BuildingName);
		sendKeys(BuildingName, Bname);
		
		return this;
	}
	@AndroidFindBy(xpath="(//*[contains(@content-desc,'Manila')])[1]") private MobileElement selectLoc;
	
	public WhiteSpaceRegistration SelectLocation()
	{
		click(selectLoc);
		return this;
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText") private MobileElement docNum;
	
	public WhiteSpaceRegistration EnterDocNo(String number)
	{
		click(docNum);
		sendKeys(docNum, number);
		return this;
		
	}
	
	@AndroidFindBy(accessibility = "Select Document DTI/Business Permit") private MobileElement SelDoctype;
	@AndroidFindBy(accessibility = "Voter ID") private MobileElement selectDoc;
	public WhiteSpaceRegistration SelectDocumentType()
	{
		click(SelDoctype);
		click(selectDoc);
		return this;
	}
	
	@AndroidFindBy(accessibility = "Upload Document") private MobileElement uploadDoc;
	
	@AndroidFindBy(accessibility = "Upload from Library") private MobileElement docFromLib;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@index=0])[7]") private MobileElement slectPic;
	
	public WhiteSpaceRegistration UploadDocument()
	{
		click(uploadDoc);
		click(docFromLib);
		click(slectPic);
		
		return this;
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index=3]") private MobileElement Outletname;
	public WhiteSpaceRegistration EnterOutlet(String name)
	{
		click(Outletname);
		sendKeys(Outletname, name);
		return this;
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@index=4]") private MobileElement TaxNo;
	
	public WhiteSpaceRegistration EnterTaxNo(String no)
	{
		click(TaxNo);
		sendKeys(TaxNo, no);
		return this;
	}
	@AndroidFindBy(accessibility = "Take a Photo") private MobileElement outletPhoto;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='WHILE USING THE APP']") private MobileElement allowaccess;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index=3]") private MobileElement capture;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='Done']") private MobileElement Done4;
	
	@AndroidFindBy(accessibility = "Submit") private MobileElement Submit;
	public WhiteSpaceRegistration TakeOutletPhoto()
	{
		click(outletPhoto);
		click(allowaccess);
		click(capture);
		click(Done4);
		click(Submit);
		return this;
	}
	
	@AndroidFindBy(accessibility = "Enrolment Pending") private MobileElement succmsg4;
	
	public String getSuccTxt2()
	{
		return getAttribute(succmsg4, "content-desc");
	}
}
