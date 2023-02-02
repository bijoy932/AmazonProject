package upskill.amazon.page.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.amazon.pageElement.AmazonSearchResultLocators;
import upskill.utilities.SetupDrivers;

public class AmazonSearchResultActions {
	
	AmazonSearchResultLocators AmazonSearchResultLocatorsObj;
	
	public AmazonSearchResultActions(){
		AmazonSearchResultLocatorsObj=new AmazonSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultLocatorsObj);
		
	}
	
	public void verifyBlutothItems(){
		
		//Option 1
		Assert.assertTrue(AmazonSearchResultLocatorsObj.txtBlutoth.isDisplayed());
		
		//Option 2
		Assert.assertEquals("blutoth", AmazonSearchResultLocatorsObj.txtBlutoth.getText());
		
		//Option 3
		AmazonSearchResultLocatorsObj.txtBlutoth.isDisplayed();
	}
	
	public void verifyPhonesItems(){
		
		//Option 1
		Assert.assertTrue(AmazonSearchResultLocatorsObj.txtPhones.isDisplayed());
		
		//Option 2
		Assert.assertEquals("blutoth", AmazonSearchResultLocatorsObj.txtPhones.getText());
		
		//Option 3
		AmazonSearchResultLocatorsObj.txtPhones.isDisplayed();
		
	}

}
